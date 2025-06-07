package com.accounting.invoice_manager.domain.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class InvoiceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID ID;
    private UUID userId;
    private Double amount;
    private LocalDateTime dueDate;

}
