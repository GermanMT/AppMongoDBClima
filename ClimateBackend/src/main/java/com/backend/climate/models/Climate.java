package com.backend.climate.models;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Climate")
public class Climate implements Serializable{
    @Id
    @NotNull
    private String id;

    @NotNull
    private String type;
}
