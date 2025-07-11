package com.accounting.invoice_manager.application.service;

import com.accounting.invoice_manager.domain.model.InvoiceModel;
import com.accounting.invoice_manager.infrastructure.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InvoiceServices {
    private final InvoiceRepository invoiceRepository;

    public InvoiceServices(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<InvoiceModel> findByUserId(UUID userId){
        return invoiceRepository.findByUserId(userId);
    }

    public Optional<InvoiceModel> findById(UUID id){
        return invoiceRepository.findById(id);
    }
}


