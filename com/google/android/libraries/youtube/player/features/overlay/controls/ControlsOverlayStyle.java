package com.google.android.libraries.youtube.player.features.overlay.controls;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.ahvn;
import defpackage.amkq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControlsOverlayStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ControlsOverlayStyle a;
    public static final ControlsOverlayStyle b;
    public static final ControlsOverlayStyle c;
    public static final ControlsOverlayStyle d;
    public static final ControlsOverlayStyle e;
    public static final ControlsOverlayStyle f;
    public static final ControlsOverlayStyle g;
    public static final ControlsOverlayStyle h;
    public static final ControlsOverlayStyle i;
    public static final ControlsOverlayStyle j;
    public static final ControlsOverlayStyle k;
    public static final ControlsOverlayStyle l;
    public static final ControlsOverlayStyle m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ahvn ahvnVar = new ahvn();
        ahvnVar.a = "YOUTUBE";
        ahvnVar.b = false;
        ahvnVar.c = true;
        ahvnVar.d = -65536;
        ahvnVar.e = true;
        ahvnVar.f = true;
        ahvnVar.g = true;
        ahvnVar.h = true;
        ahvnVar.i = false;
        ahvnVar.j = true;
        ahvnVar.k = true;
        ahvnVar.l = true;
        ahvnVar.m = false;
        a = ahvnVar.a();
        ahvn ahvnVar2 = new ahvn();
        ahvnVar2.a = "PREROLL";
        ahvnVar2.b = false;
        ahvnVar2.c = true;
        ahvnVar2.d = -14183450;
        ahvnVar2.e = true;
        ahvnVar2.f = true;
        ahvnVar2.g = true;
        ahvnVar2.h = false;
        ahvnVar2.i = false;
        ahvnVar2.j = true;
        ahvnVar2.k = true;
        ahvnVar2.l = false;
        ahvnVar2.m = false;
        b = ahvnVar2.a();
        ahvn ahvnVar3 = new ahvn();
        ahvnVar3.a = "POSTROLL";
        ahvnVar3.b = false;
        ahvnVar3.c = true;
        ahvnVar3.d = -14183450;
        ahvnVar3.e = true;
        ahvnVar3.f = true;
        ahvnVar3.g = true;
        ahvnVar3.h = true;
        ahvnVar3.i = false;
        ahvnVar3.j = true;
        ahvnVar3.k = true;
        ahvnVar3.l = false;
        ahvnVar3.m = false;
        c = ahvnVar3.a();
        ahvn ahvnVar4 = new ahvn();
        ahvnVar4.a = "TRAILER";
        ahvnVar4.b = false;
        ahvnVar4.c = true;
        ahvnVar4.d = -14183450;
        ahvnVar4.e = true;
        ahvnVar4.f = true;
        ahvnVar4.g = true;
        ahvnVar4.h = true;
        ahvnVar4.i = false;
        ahvnVar4.j = true;
        ahvnVar4.k = true;
        ahvnVar4.l = false;
        ahvnVar4.m = false;
        d = ahvnVar4.a();
        ahvn ahvnVar5 = new ahvn();
        ahvnVar5.a = "REMOTE_TRAILER";
        ahvnVar5.b = false;
        ahvnVar5.c = true;
        ahvnVar5.d = -14183450;
        ahvnVar5.e = false;
        ahvnVar5.f = true;
        ahvnVar5.g = true;
        ahvnVar5.h = true;
        ahvnVar5.i = false;
        ahvnVar5.j = true;
        ahvnVar5.k = true;
        ahvnVar5.l = false;
        ahvnVar5.m = false;
        e = ahvnVar5.a();
        ahvn ahvnVar6 = new ahvn();
        ahvnVar6.a = "REMOTE";
        ahvnVar6.b = false;
        ahvnVar6.c = true;
        ahvnVar6.d = -65536;
        ahvnVar6.e = false;
        ahvnVar6.f = true;
        ahvnVar6.g = true;
        ahvnVar6.h = true;
        ahvnVar6.i = false;
        ahvnVar6.j = true;
        ahvnVar6.k = true;
        ahvnVar6.l = false;
        ahvnVar6.m = false;
        f = ahvnVar6.a();
        ahvn ahvnVar7 = new ahvn();
        ahvnVar7.a = "REMOTE_LIVE";
        ahvnVar7.b = false;
        ahvnVar7.c = false;
        ahvnVar7.d = -65536;
        ahvnVar7.e = false;
        ahvnVar7.f = false;
        ahvnVar7.g = true;
        ahvnVar7.h = true;
        ahvnVar7.i = false;
        ahvnVar7.j = false;
        ahvnVar7.k = true;
        ahvnVar7.l = false;
        ahvnVar7.m = false;
        g = ahvnVar7.a();
        ahvn ahvnVar8 = new ahvn();
        ahvnVar8.a = "REMOTE_LIVE_DVR";
        ahvnVar8.b = false;
        ahvnVar8.c = true;
        ahvnVar8.d = -65536;
        ahvnVar8.e = false;
        ahvnVar8.f = true;
        ahvnVar8.g = true;
        ahvnVar8.h = true;
        ahvnVar8.i = false;
        ahvnVar8.j = true;
        ahvnVar8.k = true;
        ahvnVar8.l = false;
        ahvnVar8.m = true;
        h = ahvnVar8.a();
        ahvn ahvnVar9 = new ahvn();
        ahvnVar9.a = "AD";
        ahvnVar9.b = false;
        ahvnVar9.c = true;
        ahvnVar9.d = -1524949;
        ahvnVar9.e = false;
        ahvnVar9.f = false;
        ahvnVar9.g = true;
        ahvnVar9.h = false;
        ahvnVar9.i = true;
        ahvnVar9.j = false;
        ahvnVar9.k = false;
        ahvnVar9.l = false;
        ahvnVar9.m = false;
        i = ahvnVar9.a();
        ahvn ahvnVar10 = new ahvn();
        ahvnVar10.a = "AD_REMOTE";
        ahvnVar10.b = false;
        ahvnVar10.c = true;
        ahvnVar10.d = -1524949;
        ahvnVar10.e = false;
        ahvnVar10.f = false;
        ahvnVar10.g = true;
        ahvnVar10.h = false;
        ahvnVar10.i = true;
        ahvnVar10.j = false;
        ahvnVar10.k = false;
        ahvnVar10.l = false;
        ahvnVar10.m = false;
        j = ahvnVar10.a();
        ahvn ahvnVar11 = new ahvn();
        ahvnVar11.a = "LIVE";
        ahvnVar11.b = false;
        ahvnVar11.c = false;
        ahvnVar11.d = -65536;
        ahvnVar11.e = false;
        ahvnVar11.f = false;
        ahvnVar11.g = true;
        ahvnVar11.h = true;
        ahvnVar11.i = false;
        ahvnVar11.j = false;
        ahvnVar11.k = true;
        ahvnVar11.l = false;
        ahvnVar11.m = false;
        k = ahvnVar11.a();
        ahvn ahvnVar12 = new ahvn();
        ahvnVar12.a = "LIVE_DVR";
        ahvnVar12.b = false;
        ahvnVar12.c = true;
        ahvnVar12.d = -65536;
        ahvnVar12.e = false;
        ahvnVar12.f = true;
        ahvnVar12.g = true;
        ahvnVar12.h = true;
        ahvnVar12.i = false;
        ahvnVar12.j = true;
        ahvnVar12.k = true;
        ahvnVar12.l = false;
        ahvnVar12.m = true;
        l = ahvnVar12.a();
        ahvn ahvnVar13 = new ahvn();
        ahvnVar13.a = "HIDDEN";
        ahvnVar13.b = true;
        ahvnVar13.c = false;
        ahvnVar13.d = -65536;
        ahvnVar13.e = false;
        ahvnVar13.f = false;
        ahvnVar13.g = false;
        ahvnVar13.h = false;
        ahvnVar13.i = false;
        ahvnVar13.j = false;
        ahvnVar13.k = false;
        ahvnVar13.l = false;
        ahvnVar13.m = false;
        m = ahvnVar13.a();
        CREATOR = new aapi(17);
    }

    public ControlsOverlayStyle(ahvn ahvnVar) {
        this.n = ahvnVar.a;
        this.o = ahvnVar.b;
        this.p = ahvnVar.c;
        this.q = ahvnVar.d;
        this.r = ahvnVar.e;
        this.s = ahvnVar.f;
        this.t = ahvnVar.g;
        this.u = ahvnVar.h;
        this.v = ahvnVar.i;
        this.w = ahvnVar.j;
        this.x = ahvnVar.k;
        this.y = ahvnVar.l;
        this.z = ahvnVar.m;
    }

    public ControlsOverlayStyle(Parcel parcel) {
        this.n = parcel.readString();
        this.o = parcel.readByte() != 0;
        this.p = parcel.readByte() != 0;
        this.q = parcel.readInt();
        this.r = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readByte() != 0;
        this.y = parcel.readByte() != 0;
        this.z = parcel.readByte() != 0;
    }

    public static boolean a(ControlsOverlayStyle controlsOverlayStyle) {
        return amkq.b(controlsOverlayStyle.n, i.n) || amkq.b(controlsOverlayStyle.n, j.n);
    }

    public static boolean b(ControlsOverlayStyle controlsOverlayStyle) {
        return amkq.b(controlsOverlayStyle.n, k.n) || amkq.b(controlsOverlayStyle.n, l.n) || amkq.b(controlsOverlayStyle.n, g.n) || amkq.b(controlsOverlayStyle.n, h.n);
    }

    public static boolean c(ControlsOverlayStyle controlsOverlayStyle) {
        return amkq.b(controlsOverlayStyle.n, k.n) || amkq.b(controlsOverlayStyle.n, g.n);
    }

    public static boolean d(ControlsOverlayStyle controlsOverlayStyle) {
        return amkq.b(controlsOverlayStyle.n, f.n) || amkq.b(controlsOverlayStyle.n, g.n) || amkq.b(controlsOverlayStyle.n, e.n) || amkq.b(controlsOverlayStyle.n, h.n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
    }
}
