package com.wipro.emaas.pbaportal.professional_claim.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClaimException {

	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
	Date creationDate;
	String exceptionType;
	ExceptionMessageCode exceptionMessageCode;
}
