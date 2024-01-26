package com.example.fakeapi.apiv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {
    @JsonProperty(value = "id")
    private Long id ;
    @JsonProperty(value = "title")
    private String nome;

    @JsonProperty(value = "price")
    private String preco;

    @JsonProperty(value = "category")
    private String categoria;

    @JsonProperty(value = "description")
    private String descricao;

    @JsonProperty(value = "image")
    private String imagem;


}