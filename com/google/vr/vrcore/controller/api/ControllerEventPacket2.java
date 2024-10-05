package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerEventPacket2 extends ControllerEventPacket {
    public int c;
    public boolean e;
    public long g;
    public int h;
    public static ArrayDeque a = new ArrayDeque();
    public static Object b = new Object();
    public static final Parcelable.Creator CREATOR = new alsz(20);
    public ControllerPositionEvent[] d = new ControllerPositionEvent[16];
    public ControllerBatteryEvent f = new ControllerBatteryEvent();
    public final ControllerTrackingStatusEvent[] i = new ControllerTrackingStatusEvent[16];

    public ControllerEventPacket2() {
        for (int i = 0; i < 16; i++) {
            this.d[i] = new ControllerPositionEvent();
            this.i[i] = new ControllerTrackingStatusEvent();
        }
        b();
    }

    public static long a() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void b() {
        super.b();
        this.c = 0;
        this.h = 0;
        this.e = false;
        this.g = 0L;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void c(Parcel parcel) {
        int dataPosition = parcel.dataPosition() + parcel.readInt();
        super.c(parcel);
        if (parcel.dataPosition() < dataPosition) {
            int readInt = parcel.readInt();
            this.c = readInt;
            h(readInt);
            for (int i = 0; i < this.c; i++) {
                this.d[i].b(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            boolean z = parcel.readInt() != 0;
            this.e = z;
            if (z) {
                this.f.b(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            this.g = parcel.readLong();
        }
        if (parcel.dataPosition() < dataPosition) {
            int readInt2 = parcel.readInt();
            this.h = readInt2;
            h(readInt2);
            for (int i2 = 0; i2 < this.h; i2++) {
                this.i[i2].b(parcel);
            }
        }
        parcel.setDataPosition(dataPosition);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void d() {
        b();
        synchronized (b) {
            if (!a.contains(this)) {
                a.add(this);
            }
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void e(int i) {
        super.e(i);
        g(i, this.c, this.d);
        this.f.e = i;
        g(i, this.h, this.i);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = 24;
        for (int i3 = 0; i3 < this.l; i3++) {
            this.m[i3].a();
            i2 += 24;
        }
        for (int i4 = 0; i4 < this.n; i4++) {
            this.o[i4].a();
            i2 += 20;
        }
        for (int i5 = 0; i5 < this.p; i5++) {
            this.q[i5].a();
            i2 += 24;
        }
        for (int i6 = 0; i6 < this.r; i6++) {
            this.s[i6].a();
            i2 += 28;
        }
        for (int i7 = 0; i7 < this.t; i7++) {
            this.u[i7].a();
            i2 += 28;
        }
        int i8 = i2 + 8;
        for (int i9 = 0; i9 < this.c; i9++) {
            this.d[i9].a();
            i8 += 24;
        }
        int i10 = i8 + 4;
        if (this.e) {
            this.f.a();
            i10 += 20;
        }
        int i11 = i10 + 12;
        for (int i12 = 0; i12 < this.h; i12++) {
            this.i[i12].a();
            i11 += 20;
        }
        parcel.writeInt(i11);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        for (int i13 = 0; i13 < this.c; i13++) {
            this.d[i13].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        if (this.e) {
            this.f.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        for (int i14 = 0; i14 < this.h; i14++) {
            this.i[i14].writeToParcel(parcel, i);
        }
        if (parcel.dataPosition() - dataPosition != i11) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }
}
