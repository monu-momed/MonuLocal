package com.wipro.emaas.pbaportal.professional_claim.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ProfessionalClaim {
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date receiptDate;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date entryDate;
	
	private SubscriberInformation subscriberInformation;;
	private MemberInformation memberInformation;
	private MemberAuthorization memberAuthorization;
	private ReferringPractitionerInformation referringPractitionerInformation;
	

	private SupplierInformations supplierInformationList;
	
	private DiagnosisCodes diagnosisCodes;
	
	private ServiceLineItems serviceLineItems;


}
