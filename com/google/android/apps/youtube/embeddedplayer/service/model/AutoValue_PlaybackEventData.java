package com.google.android.apps.youtube.embeddedplayer.service.model;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_PlaybackEventData extends PlaybackEventData {
    public final int a;
    public final String b;
    private final long c;
    private final long d;
    private final float e;

    public AutoValue_PlaybackEventData(int i, String str, long j, long j2, float f) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = f;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData
    public final float a() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackEventData) {
            PlaybackEventData playbackEventData = (PlaybackEventData) obj;
            if (this.a == playbackEventData.b() && ((str = this.b) != null ? str.equals(playbackEventData.f()) : playbackEventData.f() == null) && this.c == playbackEventData.e() && this.d == playbackEventData.c() && Float.floatToIntBits(this.e) == Float.floatToIntBits(playbackEventData.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData
    public final String f() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        float f = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 154);
        sb.append("PlaybackEventData{eventType=");
        sb.append(i);
        sb.append(", videoId=");
        sb.append(str);
        sb.append(", timestampMillis=");
        sb.append(j);
        sb.append(", durationMillis=");
        sb.append(j2);
        sb.append(", aspectRatio=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ Float.floatToIntBits(this.e);
    }
}
