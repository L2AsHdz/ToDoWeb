package com.ipc2.todoweb.model;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class Usuario {
    private int id;
    private String nombre;
    private String username;
    private String password;
}
