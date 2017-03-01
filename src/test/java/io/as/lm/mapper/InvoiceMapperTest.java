package io.as.lm.mapper;

import io.as.lm.api.ApiInvoice;
import io.as.lm.entity.Invoice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InvoiceMapperTest
{
    @Test
    public void testToApiInvoice()
    {
        Invoice invoice = Invoice.newBuilder().id("1").name("2").build();

        ApiInvoice apiInvoice = InvoiceMapper.MAPPER.toApiInvoice(invoice);
        assertNotNull(apiInvoice);

        assertEquals(invoice.getId(), apiInvoice.getId());
        assertEquals(invoice.getName(), apiInvoice.getName());
    }
}