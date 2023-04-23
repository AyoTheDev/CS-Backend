package com.scienta.cs.core.configs;

import com.netflix.graphql.dgs.DgsScalar;
import graphql.language.IntValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;

@DgsScalar(name="Long")
public class LongScalar implements Coercing<Long, String> {
    @Override
    public String serialize(Object dataFetcherResult) throws CoercingSerializeException {
        if (dataFetcherResult instanceof Long) {
            return ((Long) dataFetcherResult).toString();
        } else {
            throw new CoercingSerializeException("Not a valid Long value");
        }
    }

    @Override
    public Long parseValue(Object input) throws CoercingParseValueException {
        return Long.valueOf(input.toString());
    }

    @Override
    public Long parseLiteral(Object input) throws CoercingParseLiteralException {
        if (input instanceof IntValue) {
            return ((IntValue) input).getValue().longValue();
        }

        throw new CoercingParseLiteralException("Value is not a valid Long");
    }

}