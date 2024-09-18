package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExceptionInfo {
    private String creationDate;
    private String exceptionType;
    private ExceptionMessageCode exceptionMessageCode;
}