package com.accounting.invoice_manager;

import org.springframework.boot.SpringApplication;

public class TestInvoiceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvoiceManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
