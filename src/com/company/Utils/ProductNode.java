package com.company.Utils;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class ProductNode {
    private int productCode;
    private String buyable;
    private String available;
    private String status;
    private String businessArea;
    private String businessAreaId;
    private String productCenter;
    private String productCenterId;
    private String productGroup;
    private String productGroupId;
    private String productType;

    public void setProductNode(int productCode, String buyable, String available, String status,  String businessAreaId, String businessArea, String productCenterId, String productCenter, String productGroupId, String productGroup, String productType){
        this.productCode = productCode;
        this.buyable = buyable;
        this.available = available;
        this.status = status;
        this.businessArea = businessArea;
        this.productCenter = productCenter;
        this.productCenterId = productCenterId;
        this.productGroup = productGroup;
        this.productGroupId = productGroupId;
        this.productType = productType;
        this.businessAreaId = businessAreaId;
    }

    public String getProductNode(){
        String node = " <hybris:lsproduct productCode=\"" + productCode + "\" catalogCode=\"" + productCode + "\"  buyable=\"" + buyable + "\"\n" +
                "   available=\"" + available + "\" status=\"" + status + "\">\n" +
                "       <hybris:productName>test product " + productCode + "</hybris:productName>\n" +
                "       <hybris:businessAreaID>" + businessAreaId + "</hybris:businessAreaID>\n" +
                "       <hybris:businessAreaName>" + businessArea + "</hybris:businessAreaName>\n" +
                "       <hybris:productCenterID>" + productCenterId + "</hybris:productCenterID>\n" +
                "       <hybris:productCenterName>" + productCenter + "</hybris:productCenterName>\n" +
                "       <hybris:productGroupID>" + productGroupId + "</hybris:productGroupID>\n" +
                "       <hybris:productGroupName>" + productGroup + "</hybris:productGroupName>\n" +
                "       <hybris:productType>" + productType + "</hybris:productType>\n" +
                "       <hybris:countryList>\n" +
                "           <hybris:country>US</hybris:country>\n" +
                "           <hybris:country>CA</hybris:country>\n" +
                "          </hybris:countryList>\n" +
                "       <hybris:replacedByProduct></hybris:replacedByProduct>\n" +
                "   </hybris:lsproduct>\n";
        return node;
    }
}
