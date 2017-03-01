package io.as.lm.entity;

import io.as.lm.common.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(force = true, access = AccessLevel.PACKAGE)
public class Invoice extends BaseEntity
{
    private final String name;

    @lombok.Builder(builderClassName = "Builder", builderMethodName = "newBuilder", toBuilder = true)
    private Invoice(String id, String name)
    {
        super(id);
        this.name = name;
    }
}
