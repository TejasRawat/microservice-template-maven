package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiPaginationRequest {

    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalCount;


}
