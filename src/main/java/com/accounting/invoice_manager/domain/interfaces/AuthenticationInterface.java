package com.accounting.invoice_manager.domain.interfaces;

import com.accounting.invoice_manager.domain.model.UserCredentials;

public interface AuthenticationInterface {
    String getAccessToken(UserCredentials user);
    String validateToken(String token);
}
