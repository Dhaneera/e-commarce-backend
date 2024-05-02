package edu.clothify.dto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import edu.clothify.entity.Stock;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CartDto {

    @Valid
    private Long id;
    private Stock stock;
    @NotBlank(message = "Quantity  is can't be null")
    private int qty;
    private Double productTot;
    private boolean isCompleted;
}