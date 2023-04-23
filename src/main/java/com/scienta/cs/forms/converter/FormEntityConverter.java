package com.scienta.cs.forms.converter;

import com.scienta.cs.easypost.form.models.FormDto;
import com.scienta.cs.forms.models.entity.Form;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FormEntityConverter implements Converter<FormDto, Form> {
    @Override
    public Form convert(FormDto source) {

        if(source == null) {
            return null;
        }

        return Form.builder()
                .id(source.getId())
                .formType(source.getFormType())
                .formUrl(source.getFormUrl())
                .submittedElectronically(source.getSubmittedElectronically())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .build();
    }
}
