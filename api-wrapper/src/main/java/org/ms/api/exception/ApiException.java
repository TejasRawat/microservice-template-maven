package org.ms.api.exception;

import lombok.Data;

@Data
public class ApiException extends Exception {

    private Integer httpStatusCode;

    private String errorCode;
    private String errorMessage;

    private String serviceName;
    private String operationName;

    private String errorSource;
    private String outBoundApiPath;

    private String correlationId;
    private String consumerId;

    private ApiErrorSeverity errorSeverity;
    private ApiErrorType errorType;

}
