package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class ProductGroupGenerator {
    @SuppressWarnings("ConstantConditions")
    String productGroup = null;
    public String productGroupGenerator() {
        double randomValue = Math.random();
        if (randomValue < 0.2)
        {productGroup = "PROTEIN_PREP_ANALYSIS_KITS";
        }
        if (randomValue > 0.2 && randomValue < 0.4 )
        {productGroup = "SUPERDEX_MEDIA";
        }
        if (randomValue > 0.4 && randomValue < 0.6)
        {productGroup = "CLEANUP";
        }
        if (randomValue > 0.6 && randomValue < 0.8)
        {productGroup = "COLUMN_ACCESSORIES";
        }
        if (randomValue > 0.8)
        {productGroup = "AKTAXPRESS";
        }
        return productGroup;
    }
    public String getProductGroupId(){
        String productGroupId = null;
        if (productGroup == "PROTEIN_PREP_ANALYSIS_KITS") {
            productGroupId = "147";
        }
        if (productGroup == "SUPERDEX_MEDIA"){
            productGroupId = "266";
        }
        if (productGroup == "CLEANUP") {
            productGroupId = "74";
        }
        if (productGroup == "COLUMN_ACCESSORIES"){
            productGroupId = "883";
        }
        if (productGroup == "AKTAXPRESS") {
            productGroupId = "93";
        }
            return productGroupId;
    }
}
