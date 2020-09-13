package guru.springframework.converters;

import guru.springframework.commands.PatientForm;
import guru.springframework.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductToPatientForm implements Converter<Product, PatientForm> {
    @Override
    public PatientForm convert(Product product) {
        PatientForm productForm = new PatientForm();
        productForm.setId(product.getId().toHexString());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
