package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class JsPerformanceEventInfo {
    final Integer bindingExtensionId;
    final String functionName;
    final long identifier;
    final boolean isSynchronous;
    final String moduleIdentifier;
    final int statusCode;
    final String statusMessage;

    public JsPerformanceEventInfo(long j, int i, String str, String str2, String str3, boolean z, Integer num) {
        this.identifier = j;
        this.statusCode = i;
        this.statusMessage = str;
        this.moduleIdentifier = str2;
        this.functionName = str3;
        this.isSynchronous = z;
        this.bindingExtensionId = num;
    }

    public Integer getBindingExtensionId() {
        return this.bindingExtensionId;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public long getIdentifier() {
        return this.identifier;
    }

    public boolean getIsSynchronous() {
        return this.isSynchronous;
    }

    public String getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String toString() {
        long j = this.identifier;
        int i = this.statusCode;
        String str = this.statusMessage;
        String str2 = this.moduleIdentifier;
        String str3 = this.functionName;
        boolean z = this.isSynchronous;
        String valueOf = String.valueOf(this.bindingExtensionId);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append("JsPerformanceEventInfo{identifier=");
        sb.append(j);
        sb.append(",statusCode=");
        sb.append(i);
        sb.append(",statusMessage=");
        sb.append(str);
        sb.append(",moduleIdentifier=");
        sb.append(str2);
        sb.append(",functionName=");
        sb.append(str3);
        sb.append(",isSynchronous=");
        sb.append(z);
        sb.append(",bindingExtensionId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
