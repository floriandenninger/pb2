package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qmu;
import defpackage.qnf;
import defpackage.qsr;
import defpackage.qss;
import defpackage.qst;
import defpackage.qve;
import defpackage.qvf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(5);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final qss d;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        qst qsrVar;
        this.a = str;
        qnf qnfVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof qst) {
                    qsrVar = (qst) queryLocalInterface;
                } else {
                    qsrVar = new qsr(iBinder);
                }
                qvf f = qsrVar.f();
                byte[] bArr = f == null ? null : (byte[]) qve.b(f);
                if (bArr != null) {
                    qnfVar = new qnf(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = qnfVar;
        this.b = z;
        this.c = z2;
    }

    public GoogleCertificatesQuery(String str, qss qssVar, boolean z, boolean z2) {
        this.a = str;
        this.d = qssVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qss qssVar = this.d;
        if (qssVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qssVar = null;
        }
        qip.y(parcel, 2, qssVar);
        qip.o(parcel, 3, this.b);
        qip.o(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
