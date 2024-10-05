package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;
import defpackage.qvd;
import defpackage.qve;
import defpackage.qvf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(3);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final Context e;

    /* JADX WARN: Type inference failed for: r0v4, types: [qvf, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.o(parcel, 2, this.b);
        qip.o(parcel, 3, this.c);
        qip.y(parcel, 4, qve.a(this.e));
        qip.o(parcel, 5, this.d);
        qip.n(parcel, m);
    }

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        qvf qvdVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            qvdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof qvf) {
                qvdVar = (qvf) queryLocalInterface;
            } else {
                qvdVar = new qvd(iBinder);
            }
        }
        this.e = (Context) qve.b(qvdVar);
        this.d = z3;
    }
}
