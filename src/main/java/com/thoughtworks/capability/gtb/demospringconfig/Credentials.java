package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credentials {
    private String username;
    private String password;
    private String authMethod;

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", authMethod='" + authMethod + '\'' +
                '}';
    }
}
