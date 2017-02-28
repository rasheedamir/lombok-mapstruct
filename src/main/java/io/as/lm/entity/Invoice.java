package io.as.lm.entity;

import io.as.lm.common.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class Invoice extends BaseEntity
{
    String name;

    /**
     * just for dehydration purposes!
     */
    Invoice()
    {
        super(null);
        name = null;
    }

    @lombok.Builder(builderClassName = "Builder", builderMethodName = "newBuilder", toBuilder = true)
    private Invoice(String id, String name)
    {
        super(id);
        this.name = name;
    }
}
