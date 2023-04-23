package com.scienta.cs.nowpayments.replenishment.services;

import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.models.response.NPReplenishmentInvoiceCreateResponse;

import java.util.TreeMap;

public interface ReplenishmentService {

    NPReplenishmentInvoiceCreateResponse createInvoice(NPReplenishmentInvoiceCreateRequest invoiceCreateRequest);

}
