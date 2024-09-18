package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClaimStatusLookup {

    private String status;
    private ClaimStatusInfo claimStatusInfo;
}
