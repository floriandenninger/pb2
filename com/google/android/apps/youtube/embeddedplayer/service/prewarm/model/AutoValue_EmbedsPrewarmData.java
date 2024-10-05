package com.google.android.apps.youtube.embeddedplayer.service.prewarm.model;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_EmbedsPrewarmData extends EmbedsPrewarmData {
    private final int a;
    private final String b;

    public AutoValue_EmbedsPrewarmData(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EmbedsPrewarmData) {
            EmbedsPrewarmData embedsPrewarmData = (EmbedsPrewarmData) obj;
            if (this.a == embedsPrewarmData.a() && this.b.equals(embedsPrewarmData.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
        sb.append("EmbedsPrewarmData{playbackType=");
        sb.append(i);
        sb.append(", videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
