package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music;

import android.net.Uri;
import defpackage.ammv;
import defpackage.apxf;
import defpackage.autf;
import defpackage.avgg;
import defpackage.hmx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_ShortsCreationSelectedTrack extends ShortsCreationSelectedTrack {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final apxf e;
    public final avgg f;
    public final autf g;
    public final String h;
    public final Uri i;
    public final ammv j;
    public final ammv k;

    public AutoValue_ShortsCreationSelectedTrack(String str, long j, boolean z, String str2, apxf apxfVar, avgg avggVar, autf autfVar, String str3, Uri uri, ammv ammvVar, ammv ammvVar2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = apxfVar;
        this.f = avggVar;
        this.g = autfVar;
        this.h = str3;
        this.i = uri;
        this.j = ammvVar;
        this.k = ammvVar2;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final Uri b() {
        return this.i;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final hmx c() {
        return new hmx(this);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final ammv d() {
        return this.j;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final ammv e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        String str;
        apxf apxfVar;
        avgg avggVar;
        autf autfVar;
        String str2;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShortsCreationSelectedTrack) {
            ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) obj;
            if (this.a.equals(shortsCreationSelectedTrack.k()) && this.b == shortsCreationSelectedTrack.a() && this.c == shortsCreationSelectedTrack.l() && ((str = this.d) != null ? str.equals(shortsCreationSelectedTrack.i()) : shortsCreationSelectedTrack.i() == null) && ((apxfVar = this.e) != null ? apxfVar.equals(shortsCreationSelectedTrack.f()) : shortsCreationSelectedTrack.f() == null) && ((avggVar = this.f) != null ? avggVar.equals(shortsCreationSelectedTrack.h()) : shortsCreationSelectedTrack.h() == null) && ((autfVar = this.g) != null ? autfVar.equals(shortsCreationSelectedTrack.g()) : shortsCreationSelectedTrack.g() == null) && ((str2 = this.h) != null ? str2.equals(shortsCreationSelectedTrack.j()) : shortsCreationSelectedTrack.j() == null) && ((uri = this.i) != null ? uri.equals(shortsCreationSelectedTrack.b()) : shortsCreationSelectedTrack.b() == null) && this.j.equals(shortsCreationSelectedTrack.d()) && this.k.equals(shortsCreationSelectedTrack.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final apxf f() {
        return this.e;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final autf g() {
        return this.g;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final avgg h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i = (((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        String str = this.d;
        int hashCode2 = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        apxf apxfVar = this.e;
        int hashCode3 = (hashCode2 ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        avgg avggVar = this.f;
        int hashCode4 = (hashCode3 ^ (avggVar == null ? 0 : avggVar.hashCode())) * 1000003;
        autf autfVar = this.g;
        int hashCode5 = (hashCode4 ^ (autfVar == null ? 0 : autfVar.hashCode())) * 1000003;
        String str2 = this.h;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Uri uri = this.i;
        return ((((hashCode6 ^ (uri != null ? uri.hashCode() : 0)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final String i() {
        return this.d;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final String j() {
        return this.h;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final String k() {
        return this.a;
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack
    public final boolean l() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        boolean z = this.c;
        String str2 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String str3 = this.h;
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 192 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ShortsCreationSelectedTrack{videoId=");
        sb.append(str);
        sb.append(", startTimeMs=");
        sb.append(j);
        sb.append(", isSameVideo=");
        sb.append(z);
        sb.append(", playerParams=");
        sb.append(str2);
        sb.append(", shortsSourceVideo=");
        sb.append(valueOf);
        sb.append(", thumbnail=");
        sb.append(valueOf2);
        sb.append(", dsps=");
        sb.append(valueOf3);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", uri=");
        sb.append(valueOf4);
        sb.append(", audioDurationMs=");
        sb.append(valueOf5);
        sb.append(", waveformBytes=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
