package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiExchange {

    private ApiContext apiContext = new ApiContext();
    private Map<String, String> headers = new HashMap<>();

}
