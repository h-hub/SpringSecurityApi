package com.hhub.security.service;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
