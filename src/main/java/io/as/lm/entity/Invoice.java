package io.as.lm.entity;

import lombok.Builder;
import lombok.Value;

@Builder(builderClassName = "Builder", builderMethodName = "newBuilder", toBuilder = true)
@Value
public class Invoice
{
    String name;

}
