package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MemberInfo {
    private String hccIdentifier;
    private String taxIdentificationNumber;
    private PrimaryName primaryName;
}