package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ResourceLoaderConfig {
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Boolean enforceDependencyOrdering;
    final Integer maxBuildLabels;
    final Integer maxTags;
    final String metadataPath;

    public ResourceLoaderConfig(Integer num, Integer num2, String str, String str2, Long l, Long l2, Boolean bool) {
        this.maxTags = num;
        this.maxBuildLabels = num2;
        this.bytesPath = str;
        this.metadataPath = str2;
        this.cacheCap = l;
        this.cacheExpirationBuffer = l2;
        this.enforceDependencyOrdering = bool;
    }

    public String getBytesPath() {
        return this.bytesPath;
    }

    public Long getCacheCap() {
        return this.cacheCap;
    }

    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }

    public Boolean getEnforceDependencyOrdering() {
        return this.enforceDependencyOrdering;
    }

    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }

    public Integer getMaxTags() {
        return this.maxTags;
    }

    public String getMetadataPath() {
        return this.metadataPath;
    }

    public String toString() {
        String valueOf = String.valueOf(this.maxTags);
        String valueOf2 = String.valueOf(this.maxBuildLabels);
        String str = this.bytesPath;
        String str2 = this.metadataPath;
        String valueOf3 = String.valueOf(this.cacheCap);
        String valueOf4 = String.valueOf(this.cacheExpirationBuffer);
        String valueOf5 = String.valueOf(this.enforceDependencyOrdering);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceLoaderConfig{maxTags=");
        sb.append(valueOf);
        sb.append(",maxBuildLabels=");
        sb.append(valueOf2);
        sb.append(",bytesPath=");
        sb.append(str);
        sb.append(",metadataPath=");
        sb.append(str2);
        sb.append(",cacheCap=");
        sb.append(valueOf3);
        sb.append(",cacheExpirationBuffer=");
        sb.append(valueOf4);
        sb.append(",enforceDependencyOrdering=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
