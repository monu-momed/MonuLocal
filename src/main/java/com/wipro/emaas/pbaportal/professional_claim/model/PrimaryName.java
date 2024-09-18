package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PrimaryName {
    private String lastName;
    private String firstName;
    private String middleName;
    private String namePrefix;
    private String nameSuffix;
}