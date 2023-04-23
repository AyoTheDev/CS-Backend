package com.scienta.cs.easypost.address;

import com.scienta.cs.easypost.address.exception.AddressValidationException;
import com.scienta.cs.easypost.address.models.AddressCreateRequest;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.easypost.core.clients.EasyPostApiClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RequiredArgsConstructor
@Slf4j
public class EPAddressServiceImpl implements EPAddressService {

    private final EasyPostApiClient easyPostApiClient;

    @Override
    public AddressDto createAndVerify(AddressCreateRequest request) {
        log.info("VERIFY AND CREATE ADDRESS REQUEST: {}", request);
        AddressDto result = null;
        try {
            result = easyPostApiClient.createAddressAndVerify(request).getAddress();
        } catch (Exception e) {
            log.info(e.getMessage());
            log.error("CANNOT VERIFY ADDRESS WILL CREATE WITHOUT IT");
            result = easyPostApiClient.create(request);
        }

        log.info("VERIFY AND CREATE ADDRESS RESULT: {}" , result);

        if(result.getVerifications() != null && result.getVerifications().getZip4() != null && !CollectionUtils.isEmpty(result.getVerifications().getZip4().getErrors())){
            throw new AddressValidationException(result.getVerifications().getZip4().getErrors());
        }

        if(result.getVerifications() != null && result.getVerifications().getDelivery() != null && !CollectionUtils.isEmpty(result.getVerifications().getDelivery().getErrors())){
            throw new AddressValidationException(result.getVerifications().getDelivery().getErrors());
        }

        return result;
    }
}
