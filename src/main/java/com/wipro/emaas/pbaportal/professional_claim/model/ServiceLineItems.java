package com.wipro.emaas.pbaportal.professional_claim.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ServiceLineItems {

    private List<ServiceLineItem> serviceLineItem;

}
