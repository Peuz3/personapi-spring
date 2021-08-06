package com.digitalinnovation.personapi.utils;

import com.digitalinnovation.personapi.dto.request.PhoneDTO;
import com.digitalinnovation.personapi.entities.Phone;
import com.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {
    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .phoneType(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .phoneType(PHONE_TYPE)
                .build();
    }
}
