package br.com.estudy.SpringSecurity.data.dto;

import br.com.estudy.SpringSecurity.data.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
