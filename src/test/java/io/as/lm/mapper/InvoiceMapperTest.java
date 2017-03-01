package io.as.lm.mapper;

import io.as.lm.api.ApiInvoice;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class InvoiceMapperTest
{
    @Test
    public void testToApiInvoice()
    {
        ApiInvoice apiInvoice = InvoiceMapper.MAPPER.toApiInvoice(null);
        assertNull(apiInvoice);
    }
}