package com.google.android.apps.youtube.embeddedplayer.service.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_AdEventData extends AdEventData {
    private final int a;
    private final int b;
    private final String c;

    public AutoValue_AdEventData(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdEventData) {
            AdEventData adEventData = (AdEventData) obj;
            if (this.a == adEventData.b() && this.b == adEventData.a() && ((str = this.c) != null ? str.equals(adEventData.e()) : adEventData.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
        sb.append("AdEventData{adEventType=");
        sb.append(i);
        sb.append(", adBreakType=");
        sb.append(i2);
        sb.append(", originalVideoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
