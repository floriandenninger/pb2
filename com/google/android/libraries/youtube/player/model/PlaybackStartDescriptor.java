package com.google.android.libraries.youtube.player.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aifz;
import defpackage.aigo;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.anaf;
import defpackage.aone;
import defpackage.apxf;
import defpackage.atsl;
import defpackage.owi;
import defpackage.zgj;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackStartDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(1);
    public owi a;
    public apxf b;
    public String c;
    public int d;

    @Deprecated
    public boolean e;
    public final int f;

    public PlaybackStartDescriptor(owi owiVar, int i, apxf apxfVar) {
        this.a = owiVar;
        this.f = i;
        this.b = apxfVar;
    }

    public static aifz d() {
        return new aifz();
    }

    public final int A() {
        int bS = anaf.bS(this.a.y);
        if (bS == 0) {
            return 1;
        }
        return bS;
    }

    public final int a() {
        return this.a.f;
    }

    public final int b() {
        return Math.max(0, a());
    }

    public final long c() {
        return this.a.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aifz e() {
        aifz aifzVar = new aifz();
        aifzVar.m = this.a;
        aifzVar.a = this.b;
        aifzVar.p = this.f;
        return aifzVar;
    }

    public final ammv f() {
        owi owiVar = this.a;
        if ((owiVar.b & 262144) == 0) {
            return amlr.a;
        }
        atsl atslVar = owiVar.s;
        if (atslVar == null) {
            atslVar = atsl.a;
        }
        return ammv.j(atslVar);
    }

    public final String g(zgj zgjVar) {
        String h = h(zgjVar);
        this.c = null;
        return h;
    }

    public final String h(zgj zgjVar) {
        if (this.c == null) {
            this.c = zgjVar.a();
        }
        return this.c;
    }

    public final String i() {
        return this.a.g;
    }

    public final String j() {
        return this.a.m;
    }

    public final String k() {
        return this.a.e;
    }

    public final String l() {
        return this.a.c;
    }

    public final List m() {
        if (this.a.d.size() > 0) {
            return this.a.d;
        }
        return null;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.a.x);
    }

    public final void o(PlaybackStartDescriptor playbackStartDescriptor) {
        if (playbackStartDescriptor == null || playbackStartDescriptor == this) {
            return;
        }
        this.c = playbackStartDescriptor.c;
        playbackStartDescriptor.c = null;
    }

    public final void p(boolean z) {
        aone builder = this.a.toBuilder();
        builder.copyOnWrite();
        owi owiVar = (owi) builder.instance;
        owiVar.b |= 1024;
        owiVar.n = z;
        this.a = (owi) builder.build();
    }

    public final void q(long j) {
        aone builder = this.a.toBuilder();
        builder.copyOnWrite();
        owi owiVar = (owi) builder.instance;
        owiVar.b |= 256;
        owiVar.l = j;
        this.a = (owi) builder.build();
    }

    public final boolean r() {
        return this.a.v;
    }

    public final boolean s() {
        return this.a.u;
    }

    public final boolean t() {
        return this.a.i;
    }

    public final String toString() {
        List m = m();
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = l();
        objArr[1] = k();
        objArr[2] = Integer.valueOf(a());
        objArr[3] = m != null ? m.toString() : "";
        return String.format(locale, "PlaybackStartDescriptor:\n  VideoId:%s\n  PlaylistId:%s\n  Index:%d\n  VideoIds:%s", objArr);
    }

    public final boolean u() {
        return this.a.p;
    }

    public final boolean v() {
        return this.a.j;
    }

    public final boolean w() {
        return !this.a.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeString(this.c);
    }

    public final boolean x() {
        return this.a.n;
    }

    public final byte[] y() {
        return this.a.h.I();
    }

    public final byte[] z() {
        return this.a.B.I();
    }
}
