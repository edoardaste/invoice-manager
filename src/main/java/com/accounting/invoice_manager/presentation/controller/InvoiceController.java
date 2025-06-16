package com.accounting.invoice_manager.presentation.controller;

import com.accounting.invoice_manager.application.service.InvoiceServices;
import com.accounting.invoice_manager.domain.model.InvoiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("invoice/v1/")
public class InvoiceController {
    @Autowired
    InvoiceServices invoiceServices;

    @GetMapping("user/{id}")
    public ResponseEntity<List<InvoiceModel>> getByUserId(@PathVariable(required = true, value = "id") UUID id){
        List<InvoiceModel> invoiceReturn = invoiceServices.findByUserId(id);
        if(invoiceReturn.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(invoiceReturn);
    }


}
