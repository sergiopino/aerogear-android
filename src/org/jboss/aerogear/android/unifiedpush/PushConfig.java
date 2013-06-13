package org.jboss.aerogear.android.unifiedpush;

import com.google.common.collect.ImmutableSet;
import java.io.Serializable;

public class PushConfig implements Serializable {
    
    private String deviceToken;
    private String mobileVariantId;
    private String deviceType = "ANDROID";
    private String mobileOperatingSystem = "android";
    private String osVersion = android.os.Build.VERSION.RELEASE;
    private String alias;
    private String category;
    public final ImmutableSet<String> senderIds;
    
    public PushConfig(String... senderId) {
        senderIds = ImmutableSet.copyOf(senderId);
    }
    
    /**
     * The device token Identifies the device within its Push Network.
     * It is the value = GoogleCloudMessaging.getInstance(context).register(SENDER_ID);
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * The device token Identifies the device within its Push Network.
     * It is the value = GoogleCloudMessaging.getInstance(context).register(SENDER_ID);
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /**
     * Mobile variant id is the id of the application in Aerogear Push service.
     */ 
    public String getMobileVariantId() {
        return mobileVariantId;
    }

    /**
     * Mobile variant id is the id of the application in Aerogear Push service.
     */ 
    public void setMobileVariantId(String mobileVariantId) {
        this.mobileVariantId = mobileVariantId;
    }

    /**
     * Device type determines which cloud messaging system will be used by the 
     * AeroGear Unified Push Server
     *
     * Defaults to ANDROID
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Device type determines which cloud messaging system will be used by the 
     * AeroGear Unified Push Server.
     * 
     * Defaults to ANDROID
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * The name of the operating system.
     * Defaults to Android
     */
    public String getMobileOperatingSystem() {
        return mobileOperatingSystem;
    }

    /**
     * The name of the operating system.
     * Defaults to Android
     */
    public void setMobileOperatingSystem(String mobileOperatingSystem) {
        this.mobileOperatingSystem = mobileOperatingSystem;
    }

    /**
     * The version of the operating system running. 
     * 
     * Defaults to the value provided by android.os.Build.VERSION.RELEASE
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * The version of the operating system running. 
     * 
     * Defaults to the value provided by android.os.Build.VERSION.RELEASE
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * The Alias is an identifier of the user of the system.
     * 
     * Examples are an email address or a username
     * 
     */
    public String getAlias() {
        return alias;
    }

    /**
     * The Alias is an identifier of the user of the system.
     * 
     * Examples are an email address or a username
     * 
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * The category specifies a channel which may be used to send messages
     */
    public String getCategory() {
        return category;
    }

    /**
     * The category specifies a channel which may be used to send messages
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
}