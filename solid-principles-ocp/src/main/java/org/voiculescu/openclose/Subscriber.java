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
    protected Long phoneNumber;
    protected String address;
    protected int baseRate;

    public abstract double calculateBill();
}
