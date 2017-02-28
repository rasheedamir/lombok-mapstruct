package io.as.lm.entity;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class InvoiceTest
{
    @Test
    public void verifyEquality()
    {
        EqualsVerifier.forClass(Invoice.class).verify();
    }
}