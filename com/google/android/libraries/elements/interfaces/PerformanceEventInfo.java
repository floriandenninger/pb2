package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PerformanceEventInfo {
    final Long commandExtensionId;
    final JsPerformanceEventInfo jsPerformanceEventInfo;
    final Integer materializationCount;
    final Integer measurementCount;
    final String nodeIdentifier;
    final String templateUri;

    public PerformanceEventInfo(String str, String str2, Integer num, Integer num2, Long l, JsPerformanceEventInfo jsPerformanceEventInfo) {
        this.templateUri = str;
        this.nodeIdentifier = str2;
        this.materializationCount = num;
        this.measurementCount = num2;
        this.commandExtensionId = l;
        this.jsPerformanceEventInfo = jsPerformanceEventInfo;
    }

    public Long getCommandExtensionId() {
        return this.commandExtensionId;
    }

    public JsPerformanceEventInfo getJsPerformanceEventInfo() {
        return this.jsPerformanceEventInfo;
    }

    public Integer getMaterializationCount() {
        return this.materializationCount;
    }

    public Integer getMeasurementCount() {
        return this.measurementCount;
    }

    public String getNodeIdentifier() {
        return this.nodeIdentifier;
    }

    public String getTemplateUri() {
        return this.templateUri;
    }

    public String toString() {
        String str = this.templateUri;
        String str2 = this.nodeIdentifier;
        String valueOf = String.valueOf(this.materializationCount);
        String valueOf2 = String.valueOf(this.measurementCount);
        String valueOf3 = String.valueOf(this.commandExtensionId);
        String valueOf4 = String.valueOf(this.jsPerformanceEventInfo);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 134 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PerformanceEventInfo{templateUri=");
        sb.append(str);
        sb.append(",nodeIdentifier=");
        sb.append(str2);
        sb.append(",materializationCount=");
        sb.append(valueOf);
        sb.append(",measurementCount=");
        sb.append(valueOf2);
        sb.append(",commandExtensionId=");
        sb.append(valueOf3);
        sb.append(",jsPerformanceEventInfo=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
