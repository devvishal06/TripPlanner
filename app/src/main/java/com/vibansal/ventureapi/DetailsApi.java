public class DetailsApi{

@SerializedName("address")
@Expose
private String address;
@SerializedName("categoryNames")
@Expose
private List<String> categoryNames = null;
@SerializedName("cityName")
@Expose
private String cityName;
@SerializedName("countryName")
@Expose
private String countryName;
@SerializedName("description")
@Expose
private String description;
@SerializedName("howToReach")
@Expose
private String howToReach;
@SerializedName("cityId")
@Expose
private String cityId;
@SerializedName("xid")
@Expose
private Integer xid;
@SerializedName("keyImageUrl")
@Expose
private String keyImageUrl;
@SerializedName("whyToVisit")
@Expose
private String whyToVisit;
@SerializedName("latitude")
@Expose
private Double latitude;
@SerializedName("longitude")
@Expose
private Double longitude;
@SerializedName("minimumPrice")
@Expose
private Integer minimumPrice;
@SerializedName("name")
@Expose
private String name;
@SerializedName("url")
@Expose
private String url;
@SerializedName("stateName")
@Expose
private String stateName;
@SerializedName("shortDescription")
@Expose
private String shortDescription;
@SerializedName("id")
@Expose
private String id;

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public List<String> getCategoryNames() {
return categoryNames;
}

public void setCategoryNames(List<String> categoryNames) {
this.categoryNames = categoryNames;
}

public String getCityName() {
return cityName;
}

public void setCityName(String cityName) {
this.cityName = cityName;
}

public String getCountryName() {
return countryName;
}

public void setCountryName(String countryName) {
this.countryName = countryName;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getHowToReach() {
return howToReach;
}

public void setHowToReach(String howToReach) {
this.howToReach = howToReach;
}

public String getCityId() {
return cityId;
}

public void setCityId(String cityId) {
this.cityId = cityId;
}

public Integer getXid() {
return xid;
}

public void setXid(Integer xid) {
this.xid = xid;
}

public String getKeyImageUrl() {
return keyImageUrl;
}

public void setKeyImageUrl(String keyImageUrl) {
this.keyImageUrl = keyImageUrl;
}

public String getWhyToVisit() {
return whyToVisit;
}

public void setWhyToVisit(String whyToVisit) {
this.whyToVisit = whyToVisit;
}

public Double getLatitude() {
return latitude;
}

public void setLatitude(Double latitude) {
this.latitude = latitude;
}

public Double getLongitude() {
return longitude;
}

public void setLongitude(Double longitude) {
this.longitude = longitude;
}

public Integer getMinimumPrice() {
return minimumPrice;
}

public void setMinimumPrice(Integer minimumPrice) {
this.minimumPrice = minimumPrice;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getStateName() {
return stateName;
}

public void setStateName(String stateName) {
this.stateName = stateName;
}

public String getShortDescription() {
return shortDescription;
}

public void setShortDescription(String shortDescription) {
this.shortDescription = shortDescription;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

}
-----------------------------------com.example.Example.java-----------------------------------

package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

@SerializedName("data")
@Expose
private DetailsApi data;

public DetailsApi getData() {
return data;
}

public void setDataDetailsApi data) {
this.data = data;
}

}

