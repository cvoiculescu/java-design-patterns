package org.voiculescu.openclose;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Subscriber {

    protected Long subscriberId;
    private Long phoneNumber;
    private String address;

    public abstract double calculateBill();
}
