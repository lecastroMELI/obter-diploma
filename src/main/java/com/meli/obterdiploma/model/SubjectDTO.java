package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;

    @NotBlank(message = "A nota não pode estar vazia.")
    @Min(value = 0, message = "A nota mínima é 0.0")
    @Max(value = 10, message = "A nota máxima é 10.0")
    Double score;
}
