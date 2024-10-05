package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.$AutoValue_ShortsVideoMetadata, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C$AutoValue_ShortsVideoMetadata extends ShortsVideoMetadata {
    public final Uri a;
    public final int b;
    public final int c;
    public final long d;

    public C$AutoValue_ShortsVideoMetadata(Uri uri, int i, int i2, long j) {
        if (uri == null) {
            throw new NullPointerException("Null path");
        }
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata
    public final Uri d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShortsVideoMetadata) {
            ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata) obj;
            if (this.a.equals(shortsVideoMetadata.d()) && this.b == shortsVideoMetadata.b() && this.c == shortsVideoMetadata.a() && this.d == shortsVideoMetadata.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 103);
        sb.append("ShortsVideoMetadata{path=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", videoDurationMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
