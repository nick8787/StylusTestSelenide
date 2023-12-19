package dto;

import enums.PaymentType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddPersonData {
    private String phoneNumber;
    private String lastName;
    private PaymentType paymentType;
}
