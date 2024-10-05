package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PerformanceSpan {
    final Long begin;
    final int beginThreadIdentifier;
    final Long end;
    final int endThreadIdentifier;
    final PerformanceEventInfo info;
    final boolean isMainThread;
    final int nonce;
    final Integer parentNonce;
    final PerformanceSpanType type;

    public PerformanceSpan(PerformanceSpanType performanceSpanType, int i, PerformanceEventInfo performanceEventInfo, Long l, Long l2, int i2, int i3, boolean z, Integer num) {
        this.type = performanceSpanType;
        this.nonce = i;
        this.info = performanceEventInfo;
        this.begin = l;
        this.end = l2;
        this.beginThreadIdentifier = i2;
        this.endThreadIdentifier = i3;
        this.isMainThread = z;
        this.parentNonce = num;
    }

    public Long getBegin() {
        return this.begin;
    }

    public int getBeginThreadIdentifier() {
        return this.beginThreadIdentifier;
    }

    public Long getEnd() {
        return this.end;
    }

    public int getEndThreadIdentifier() {
        return this.endThreadIdentifier;
    }

    public PerformanceEventInfo getInfo() {
        return this.info;
    }

    public boolean getIsMainThread() {
        return this.isMainThread;
    }

    public int getNonce() {
        return this.nonce;
    }

    public Integer getParentNonce() {
        return this.parentNonce;
    }

    public PerformanceSpanType getType() {
        return this.type;
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        int i = this.nonce;
        String valueOf2 = String.valueOf(this.info);
        String valueOf3 = String.valueOf(this.begin);
        String valueOf4 = String.valueOf(this.end);
        int i2 = this.beginThreadIdentifier;
        int i3 = this.endThreadIdentifier;
        boolean z = this.isMainThread;
        String valueOf5 = String.valueOf(this.parentNonce);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 156 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PerformanceSpan{type=");
        sb.append(valueOf);
        sb.append(",nonce=");
        sb.append(i);
        sb.append(",info=");
        sb.append(valueOf2);
        sb.append(",begin=");
        sb.append(valueOf3);
        sb.append(",end=");
        sb.append(valueOf4);
        sb.append(",beginThreadIdentifier=");
        sb.append(i2);
        sb.append(",endThreadIdentifier=");
        sb.append(i3);
        sb.append(",isMainThread=");
        sb.append(z);
        sb.append(",parentNonce=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
