package com.rusinek.api.v1.model;

import com.rusinek.domain.Vendor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorListDTO {

    List<VendorDTO> vendors;
}
