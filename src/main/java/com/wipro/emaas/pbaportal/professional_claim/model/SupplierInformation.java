package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SupplierInformation {
	private String supplierBillingName;
	private String taxIdentificationNumber;
	private String streetAddress;
	private String cityName;
	private String stateCode;
	private Integer postalCode;

}
