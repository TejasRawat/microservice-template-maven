package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
public class ApiQueryRequest<FilterType> {

    private ApiPaginationRequest paginationInfo;
    private FilterType filters;
    private List<SortCriteria> sortCriteriaList;

}
