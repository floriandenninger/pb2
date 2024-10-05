package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ResourceMetadata {
    final ArrayList dependencies;
    final String resourceIdentifier;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;

    public ResourceMetadata(String str, ResourceType resourceType, Long l, ArrayList arrayList, String str2) {
        this.resourceIdentifier = str;
        this.resourceType = resourceType;
        this.resourceTag = l;
        this.dependencies = arrayList;
        this.securityVerifier = str2;
    }

    public ArrayList getDependencies() {
        return this.dependencies;
    }

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public Long getResourceTag() {
        return this.resourceTag;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public String getSecurityVerifier() {
        return this.securityVerifier;
    }

    public String toString() {
        String str = this.resourceIdentifier;
        String valueOf = String.valueOf(this.resourceType);
        String valueOf2 = String.valueOf(this.resourceTag);
        String valueOf3 = String.valueOf(this.dependencies);
        String str2 = this.securityVerifier;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 96 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(str2).length());
        sb.append("ResourceMetadata{resourceIdentifier=");
        sb.append(str);
        sb.append(",resourceType=");
        sb.append(valueOf);
        sb.append(",resourceTag=");
        sb.append(valueOf2);
        sb.append(",dependencies=");
        sb.append(valueOf3);
        sb.append(",securityVerifier=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
