package org.ms.api.wrappers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class SortCriteria {

    private Integer index;
    private String fieldName;
    private Boolean isAscending;

}
