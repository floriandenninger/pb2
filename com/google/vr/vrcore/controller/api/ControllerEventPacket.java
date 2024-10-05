package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;
import java.util.ArrayDeque;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ControllerEventPacket implements Parcelable {
    public int l;
    public int n;
    public int p;
    public int r;
    public int t;
    public static ArrayDeque j = new ArrayDeque();
    public static Object k = new Object();
    public static final Parcelable.Creator CREATOR = new alsz(19);
    public ControllerAccelEvent[] m = new ControllerAccelEvent[16];
    public ControllerButtonEvent[] o = new ControllerButtonEvent[16];
    public ControllerGyroEvent[] q = new ControllerGyroEvent[16];
    public ControllerOrientationEvent[] s = new ControllerOrientationEvent[16];
    public ControllerTouchEvent[] u = new ControllerTouchEvent[16];

    public ControllerEventPacket() {
        for (int i = 0; i < 16; i++) {
            this.m[i] = new ControllerAccelEvent();
            this.o[i] = new ControllerButtonEvent();
            this.q[i] = new ControllerGyroEvent();
            this.s[i] = new ControllerOrientationEvent();
            this.u[i] = new ControllerTouchEvent();
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(int i, int i2, ControllerEvent[] controllerEventArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            controllerEventArr[i3].e = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void h(int i) {
        if (i < 0 || i >= 16) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid event count: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void b() {
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.t = 0;
    }

    public void c(Parcel parcel) {
        parcel.readInt();
        int readInt = parcel.readInt();
        this.l = readInt;
        h(readInt);
        for (int i = 0; i < this.l; i++) {
            this.m[i].b(parcel);
        }
        int readInt2 = parcel.readInt();
        this.n = readInt2;
        h(readInt2);
        for (int i2 = 0; i2 < this.n; i2++) {
            this.o[i2].b(parcel);
        }
        int readInt3 = parcel.readInt();
        this.p = readInt3;
        h(readInt3);
        for (int i3 = 0; i3 < this.p; i3++) {
            this.q[i3].b(parcel);
        }
        int readInt4 = parcel.readInt();
        this.r = readInt4;
        h(readInt4);
        for (int i4 = 0; i4 < this.r; i4++) {
            this.s[i4].b(parcel);
        }
        int readInt5 = parcel.readInt();
        this.t = readInt5;
        h(readInt5);
        for (int i5 = 0; i5 < this.t; i5++) {
            this.u[i5].b(parcel);
        }
    }

    public void d() {
        b();
        synchronized (k) {
            if (!j.contains(this)) {
                j.add(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i) {
        g(i, this.l, this.m);
        g(i, this.n, this.o);
        g(i, this.p, this.q);
        g(i, this.r, this.s);
        g(i, this.t, this.u);
    }

    public final ControllerButtonEvent f(int i) {
        if (i < 0 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        return this.o[i];
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.l);
        for (int i2 = 0; i2 < this.l; i2++) {
            this.m[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.n);
        for (int i3 = 0; i3 < this.n; i3++) {
            this.o[i3].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.p);
        for (int i4 = 0; i4 < this.p; i4++) {
            this.q[i4].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.r);
        for (int i5 = 0; i5 < this.r; i5++) {
            this.s[i5].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.t);
        for (int i6 = 0; i6 < this.t; i6++) {
            this.u[i6].writeToParcel(parcel, i);
        }
    }
}
