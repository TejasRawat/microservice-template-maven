package org.ms.api.wrappers;

import org.ms.api.exception.ApiError;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiResponse<T> {

    private T payload;
    private List<ApiError> errors;

}
