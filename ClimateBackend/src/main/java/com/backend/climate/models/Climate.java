package com.backend.climate.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Climate{
    @Id
    @NotNull
    private String id;

    @NotNull
    private String type;

    public Climate(String type) {
        this.type = type;
    }
}
