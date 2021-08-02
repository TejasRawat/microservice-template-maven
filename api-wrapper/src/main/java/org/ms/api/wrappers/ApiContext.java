package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Api context holds the client metadata information which can be leveraged for monitoring metrics population
 */
@SuperBuilder
@Data
@NoArgsConstructor
public class ApiContext {

    private String correlationId;
    private String consumerId;
    private String serviceName;
    private String operationName;

}
