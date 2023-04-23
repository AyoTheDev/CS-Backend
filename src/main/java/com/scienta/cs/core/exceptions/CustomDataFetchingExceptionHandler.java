package com.scienta.cs.core.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.types.errors.ErrorDetail;
import com.netflix.graphql.types.errors.TypedGraphQLError;
import com.scienta.cs.easypost.core.error.EasyPostErrorException;
import com.scienta.cs.easypost.core.error.EasyPostErrorWrapper;
import graphql.GraphQLError;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomDataFetchingExceptionHandler implements DataFetcherExceptionHandler {

   private final ObjectMapper objectMapper;


   @Override
   public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
      log.info("EXCEPTION",handlerParameters.getException());

      if (handlerParameters.getException() instanceof EasyPostErrorException) {
         EasyPostErrorException exception = (EasyPostErrorException) handlerParameters.getException();
         log.info("EXCEPTION",exception);
         GraphQLError graphqlError = TypedGraphQLError.newInternalErrorBuilder()
                 .message(exception.getEasyPostError().getError().getMessage())
                 .errorDetail(ErrorDetail.Common.INVALID_ARGUMENT)
                 .debugInfo(objectMapper.convertValue(exception,Map.class))
                 .path(handlerParameters.getPath()).build();

         DataFetcherExceptionHandlerResult result = DataFetcherExceptionHandlerResult.newResult()
                 .error(graphqlError)
                 .build();

         return result;
      }

      GraphQLError graphqlError = TypedGraphQLError.newInternalErrorBuilder()
              .message("Something went wrong")
              .errorDetail(ErrorDetail.Common.SERVICE_ERROR)
              .path(handlerParameters.getPath()).build();

      return DataFetcherExceptionHandlerResult.newResult()
              .error(graphqlError)
              .build();
   }

}
