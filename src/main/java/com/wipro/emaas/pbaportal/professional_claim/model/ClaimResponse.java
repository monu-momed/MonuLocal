package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClaimResponse {

	private ClaimStatusLookup claimStatusLookup;
}
