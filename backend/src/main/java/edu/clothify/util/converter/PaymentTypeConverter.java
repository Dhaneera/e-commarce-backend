package edu.clothify.util.converter;


import edu.clothify.util.enums.PaymentType;
import jakarta.persistence.AttributeConverter;

public class PaymentTypeConverter implements AttributeConverter<PaymentType,Integer> {
    @Override
    public Integer convertToDatabaseColumn(PaymentType paymentType) {
        return switch (paymentType){
            case CASH -> 1;
            case CARD -> 2;
        };
    }

    @Override
    public PaymentType convertToEntityAttribute(Integer integer) {
        return switch (integer){
            case  1 ->  PaymentType.CASH;
            case  2 ->  PaymentType.CARD;
            default -> null;
        };
    }
}