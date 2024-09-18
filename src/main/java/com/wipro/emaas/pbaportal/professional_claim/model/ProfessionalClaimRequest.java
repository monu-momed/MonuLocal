package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class ProfessionalClaimRequest {

	@Builder.Default
	private ProfessionalClaim professionalClaim = new ProfessionalClaim();
	
}
