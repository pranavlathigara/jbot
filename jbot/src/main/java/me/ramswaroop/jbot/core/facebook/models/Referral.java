package me.ramswaroop.jbot.core.facebook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ramswaroop
 * @version 26/09/2016
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Referral {
    
    private String ref;
    private String source;
    private String type;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
