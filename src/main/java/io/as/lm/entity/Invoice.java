package io.as.lm.entity;

import io.as.lm.common.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class Invoice extends BaseEntity
{
    private final String name;  // private final doesn't need to be added though; just adding for readability purposes

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
