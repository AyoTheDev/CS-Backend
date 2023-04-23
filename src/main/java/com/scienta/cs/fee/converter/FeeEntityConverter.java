package com.scienta.cs.fee.converter;

import com.scienta.cs.easypost.fee.models.FeeDto;
import com.scienta.cs.fee.model.entity.Fee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FeeEntityConverter implements Converter<FeeDto,Fee> {


    @Override
    public Fee convert(FeeDto source) {

        if(source == null) {
            return null;
        }

        return Fee.builder()
                .amount(source.getAmount())
                .charged(source.getCharged())
                .refunded(source.getRefunded())
                .type(source.getType())
                .build();
    }
}
