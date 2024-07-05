package org.example;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Resultado (
        @JsonAlias("conversion_result") Double resultado
){
    @Override
    public String toString() {
        return "La cantidad ingresada es equivalente a " + resultado;
    }
}
