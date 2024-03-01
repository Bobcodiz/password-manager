package com.bootcamp.application.passwordmanager.models;

import jakarta.persistence.*;
import lombok.Data;

import javax.crypto.SealedObject;
import java.io.Serializable;

@Data
@Entity
public class Password implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long managedId;
    private String password;
    private String website;
    private String username;


}
