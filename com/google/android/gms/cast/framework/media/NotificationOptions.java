package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qic;
import defpackage.qid;
import defpackage.qip;
import defpackage.qiq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationOptions extends AbstractSafeParcelable {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final qid G;
    private final int[] H;
    public final List c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;
    public static final List a = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] b = {0, 1};
    public static final Parcelable.Creator CREATOR = new qiq();

    public NotificationOptions(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        qid qicVar;
        this.c = new ArrayList(list);
        this.H = Arrays.copyOf(iArr, iArr.length);
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        if (iBinder == null) {
            this.G = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof qid) {
            qicVar = (qid) queryLocalInterface;
        } else {
            qicVar = new qic(iBinder);
        }
        this.G = qicVar;
    }

    public final int[] a() {
        int[] iArr = this.H;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.H(parcel, 2, this.c);
        qip.z(parcel, 3, a());
        qip.t(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.s(parcel, 6, this.f);
        qip.s(parcel, 7, this.g);
        qip.s(parcel, 8, this.h);
        qip.s(parcel, 9, this.i);
        qip.s(parcel, 10, this.j);
        qip.s(parcel, 11, this.k);
        qip.s(parcel, 12, this.l);
        qip.s(parcel, 13, this.m);
        qip.s(parcel, 14, this.n);
        qip.s(parcel, 15, this.o);
        qip.s(parcel, 16, this.p);
        qip.s(parcel, 17, this.q);
        qip.s(parcel, 18, this.r);
        qip.s(parcel, 19, this.s);
        qip.s(parcel, 20, this.t);
        qip.s(parcel, 21, this.u);
        qip.s(parcel, 22, this.v);
        qip.s(parcel, 23, this.w);
        qip.s(parcel, 24, this.x);
        qip.s(parcel, 25, this.y);
        qip.s(parcel, 26, this.z);
        qip.s(parcel, 27, this.A);
        qip.s(parcel, 28, this.B);
        qip.s(parcel, 29, this.C);
        qip.s(parcel, 30, this.D);
        qip.s(parcel, 31, this.E);
        qip.s(parcel, 32, this.F);
        qid qidVar = this.G;
        qip.y(parcel, 33, qidVar == null ? null : qidVar.asBinder());
        qip.n(parcel, m);
    }
}
