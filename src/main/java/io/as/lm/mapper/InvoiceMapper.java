package io.as.lm.mapper;

import io.as.lm.api.ApiInvoice;
import io.as.lm.entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InvoiceMapper
{
    InvoiceMapper MAPPER = Mappers.getMapper( InvoiceMapper.class );

    ApiInvoice toApiInvoice(Invoice invoice);
}
