package com.auth.projectauth.entities.user;

public record RegisterDTO(String login, String password, UserRole role) {
  
}
