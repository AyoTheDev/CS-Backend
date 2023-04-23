package com.scienta.cs.utils;

import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturer;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;

public class MockDataUtil {

    // Simplest scenario. Will delegate to Podam all decisions
    public static PodamFactory factory = new PodamFactoryImpl();

    static  {
        factory.getStrategy().addOrReplaceTypeManufacturer(LocalDateTime.class,
                (strategy, attributeMetadata, genericTypesArgumentsMap) -> LocalDateTime.now());
    }

    public static <T> T generateMockData(Class<T> clazz) {
        return factory.manufacturePojoWithFullData(clazz);
    }

}
