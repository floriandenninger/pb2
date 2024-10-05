package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ResourceStatus {
    final String identifier;
    final StatusInResponse status;

    public ResourceStatus(String str, StatusInResponse statusInResponse) {
        this.identifier = str;
        this.status = statusInResponse;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public StatusInResponse getStatus() {
        return this.status;
    }

    public String toString() {
        String str = this.identifier;
        String valueOf = String.valueOf(this.status);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(valueOf).length());
        sb.append("ResourceStatus{identifier=");
        sb.append(str);
        sb.append(",status=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
