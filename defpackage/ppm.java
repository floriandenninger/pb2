package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppm {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    private ppm(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = Collections.unmodifiableList(list);
        this.e = j2;
        this.g = z4;
        this.h = j3;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ppm d(Parcel parcel) {
        return new ppm(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ppm e(pth pthVar) {
        ArrayList arrayList;
        boolean z;
        long j;
        boolean z2;
        long j2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        long j3;
        long p = pthVar.p();
        boolean z5 = (pthVar.i() & 128) != 0;
        ArrayList arrayList2 = new ArrayList();
        if (z5) {
            arrayList = arrayList2;
            z = false;
            j = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z3 = false;
        } else {
            int i4 = pthVar.i();
            boolean z6 = (i4 & 128) != 0;
            boolean z7 = (i4 & 64) != 0;
            int i5 = i4 & 32;
            long p2 = z7 ? pthVar.p() : -9223372036854775807L;
            if (!z7) {
                int i6 = pthVar.i();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList3.add(new aeqp(pthVar.i(), pthVar.p(), (byte[]) null));
                }
                arrayList2 = arrayList3;
            }
            if (i5 != 0) {
                long i8 = pthVar.i();
                boolean z8 = (128 & i8) != 0;
                j3 = ((((i8 & 1) << 32) | pthVar.p()) * 1000) / 90;
                z4 = z8;
            } else {
                z4 = false;
                j3 = -9223372036854775807L;
            }
            int m = pthVar.m();
            int i9 = pthVar.i();
            z3 = z7;
            i3 = pthVar.i();
            j2 = j3;
            arrayList = arrayList2;
            long j4 = p2;
            i = m;
            i2 = i9;
            j = j4;
            boolean z9 = z6;
            z2 = z4;
            z = z9;
        }
        return new ppm(p, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Parcel parcel) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        int size = this.f.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            aeqp aeqpVar = (aeqp) this.f.get(i);
            parcel.writeInt(aeqpVar.b);
            parcel.writeLong(aeqpVar.a);
        }
        parcel.writeLong(this.e);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }

    private ppm(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new aeqp(parcel.readInt(), parcel.readLong(), (byte[]) null));
        }
        this.f = Collections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
