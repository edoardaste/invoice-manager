package com.accounting.invoice_manager.infrastructure.repository;

import com.accounting.invoice_manager.domain.model.InvoiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceModel, Long> {

    // Buscar fatura por ID
    Optional<InvoiceModel> findById(UUID id);

    // Buscar faturas por ID do usuário
    List<InvoiceModel> findByUserId(UUID userId);

    // Buscar faturas por status
    List<InvoiceModel> findByStatus(String status);

    // Buscar por mês/ano (se você tiver essas colunas)
    List<InvoiceModel> findByMonthAndYear(int month, int year);
}
