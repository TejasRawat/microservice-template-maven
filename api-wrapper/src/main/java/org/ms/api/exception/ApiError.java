package org.ms.api.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiError {

    private String errorCode;
    private String field;
    private String errorMessage;

    private Map<String, String> extendedAttributes = new HashMap<>();


    public Boolean addExtendedAttributes(String key, String value) {
        extendedAttributes.put(key, value);
        return true;
    }


}
