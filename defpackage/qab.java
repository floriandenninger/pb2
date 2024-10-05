package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qab extends ecq implements qac {
    private final qby a;

    public qab() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public qab(qby qbyVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.a = qbyVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qvf qvdVar;
        qvf qvdVar2;
        qvf qvdVar3;
        pys pysVar = null;
        qvf qvfVar = null;
        qvf qvfVar2 = null;
        switch (i) {
            case 2:
                String str = this.a.a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List<puz> list = this.a.b;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (puz puzVar : list) {
                        arrayList.add(new pys(puzVar.d(), puzVar.e(), puzVar.a(), puzVar.c(), puzVar.b()));
                    }
                }
                parcel2.writeNoException();
                parcel2.writeList(arrayList);
                return true;
            case 4:
                String str2 = this.a.c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                puz puzVar2 = this.a.d;
                if (puzVar2 != null) {
                    pyu pyuVar = (pyu) puzVar2;
                    pysVar = new pys(pyuVar.a, pyuVar.b, pyuVar.c, pyuVar.d, pyuVar.e);
                }
                parcel2.writeNoException();
                ecr.i(parcel2, pysVar);
                return true;
            case 6:
                String str3 = this.a.e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.a.f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                Double d = this.a.g;
                double doubleValue = d != null ? d.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(doubleValue);
                return true;
            case 9:
                String str5 = this.a.h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.a.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                pup pupVar = this.a.j;
                pxn a = pupVar != null ? pupVar.a() : null;
                parcel2.writeNoException();
                ecr.i(parcel2, a);
                return true;
            case 12:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 13:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 14:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 15:
                Object obj = this.a.k;
                qvf a2 = obj != null ? qve.a(obj) : null;
                parcel2.writeNoException();
                ecr.i(parcel2, a2);
                return true;
            case 16:
                Bundle bundle = this.a.l;
                parcel2.writeNoException();
                ecr.h(parcel2, bundle);
                return true;
            case 17:
                boolean z = this.a.m;
                parcel2.writeNoException();
                ecr.e(parcel2, z);
                return true;
            case 18:
                boolean z2 = this.a.n;
                parcel2.writeNoException();
                ecr.e(parcel2, z2);
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof qvf) {
                        qvfVar2 = (qvf) queryLocalInterface;
                    } else {
                        qvfVar2 = new qvd(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    qvdVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof qvf) {
                        qvdVar = (qvf) queryLocalInterface2;
                    } else {
                        qvdVar = new qvd(readStrongBinder2);
                    }
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    qvdVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof qvf) {
                        qvdVar2 = (qvf) queryLocalInterface3;
                    } else {
                        qvdVar2 = new qvd(readStrongBinder3);
                    }
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    qvdVar3 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof qvf) {
                        qvdVar3 = (qvf) queryLocalInterface4;
                    } else {
                        qvdVar3 = new qvd(readStrongBinder4);
                    }
                }
                qby qbyVar = this.a;
                View view = (View) qve.b(qvdVar);
                if (view instanceof pvd) {
                    qtn qtnVar = qbyVar.o;
                    throw null;
                }
                if (((pvc) pvc.a.get(view)) == null) {
                    parcel2.writeNoException();
                    return true;
                }
                qtn qtnVar2 = qbyVar.o;
                throw null;
            case 22:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface5;
                    } else {
                        qvfVar = new qvd(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
