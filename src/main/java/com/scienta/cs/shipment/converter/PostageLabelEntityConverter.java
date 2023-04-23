package com.scienta.cs.shipment.converter;

import com.scienta.cs.easypost.postagelabel.models.PostageLabelDto;
import com.scienta.cs.postagelabel.model.entity.PostageLabel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PostageLabelEntityConverter implements Converter<PostageLabelDto, PostageLabel> {
    @Override
    public PostageLabel convert(PostageLabelDto source) {

        if(source == null) {
            return null;
        }

        return PostageLabel.builder()
                .id(source.getId())
                .labelDate(source.getLabelDate())
                .labelEpl2Url(source.getLabelEpl2Url())
                .labelFileType(source.getLabelFileType())
                .labelPdfUrl(source.getLabelPdfUrl())
                .labelResolution(source.getLabelResolution())
                .labelSize(source.getLabelSize())
                .labelType(source.getLabelType())
                .labelUrl(source.getLabelUrl())
                .labelZplUrl(source.getLabelZplUrl())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .build();
    }
}
