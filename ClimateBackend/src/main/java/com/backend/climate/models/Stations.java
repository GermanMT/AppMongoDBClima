
package com.backend.climate.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Stations {

    private Egwu egwu;
    private Eglc eglc;
    private Egll egll;
    private D5621 d5621;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Egwu getEgwu() {
        return egwu;
    }

    public void setEgwu(Egwu egwu) {
        this.egwu = egwu;
    }

    public Eglc getEglc() {
        return eglc;
    }

    public void setEglc(Eglc eglc) {
        this.eglc = eglc;
    }

    public Egll getEgll() {
        return egll;
    }

    public void setEgll(Egll egll) {
        this.egll = egll;
    }

    public D5621 getD5621() {
        return d5621;
    }

    public void setD5621(D5621 d5621) {
        this.d5621 = d5621;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
