package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgo extends ecq implements IInterface {
    private final qgx a;
    private final Class b;

    public qgo() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    public qgo(qgx qgxVar, Class cls) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
        this.a = qgxVar;
        this.b = cls;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qgx qgxVar;
        qgx qgxVar2;
        qgx qgxVar3;
        qgx qgxVar4;
        qgx qgxVar5;
        qgx qgxVar6;
        qgx qgxVar7;
        qgx qgxVar8;
        qgx qgxVar9;
        qvf qvfVar = null;
        switch (i) {
            case 1:
                qvf a = qve.a(this.a);
                parcel2.writeNoException();
                ecr.i(parcel2, a);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface;
                    } else {
                        qvfVar = new qvd(readStrongBinder);
                    }
                }
                qgv qgvVar = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar) && (qgxVar = this.a) != null) {
                    qgxVar.h((qgv) this.b.cast(qgvVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface2;
                    } else {
                        qvfVar = new qvd(readStrongBinder2);
                    }
                }
                String readString = parcel.readString();
                qgv qgvVar2 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar2) && (qgxVar2 = this.a) != null) {
                    qgxVar2.g((qgv) this.b.cast(qgvVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface3;
                    } else {
                        qvfVar = new qvd(readStrongBinder3);
                    }
                }
                int readInt = parcel.readInt();
                qgv qgvVar3 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar3) && (qgxVar3 = this.a) != null) {
                    qgxVar3.f((qgv) this.b.cast(qgvVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface4 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface4;
                    } else {
                        qvfVar = new qvd(readStrongBinder4);
                    }
                }
                qgv qgvVar4 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar4) && (qgxVar4 = this.a) != null) {
                    qgxVar4.b((qgv) this.b.cast(qgvVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface5;
                    } else {
                        qvfVar = new qvd(readStrongBinder5);
                    }
                }
                int readInt2 = parcel.readInt();
                qgv qgvVar5 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar5) && (qgxVar5 = this.a) != null) {
                    qgxVar5.a((qgv) this.b.cast(qgvVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface6 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface6;
                    } else {
                        qvfVar = new qvd(readStrongBinder6);
                    }
                }
                String readString2 = parcel.readString();
                qgv qgvVar6 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar6) && (qgxVar6 = this.a) != null) {
                    qgxVar6.e((qgv) this.b.cast(qgvVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface7;
                    } else {
                        qvfVar = new qvd(readStrongBinder7);
                    }
                }
                boolean j = ecr.j(parcel);
                qgv qgvVar7 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar7) && (qgxVar7 = this.a) != null) {
                    qgxVar7.d((qgv) this.b.cast(qgvVar7), j);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface8 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface8;
                    } else {
                        qvfVar = new qvd(readStrongBinder8);
                    }
                }
                int readInt3 = parcel.readInt();
                qgv qgvVar8 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar8) && (qgxVar8 = this.a) != null) {
                    qgxVar8.c((qgv) this.b.cast(qgvVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface9 instanceof qvf) {
                        qvfVar = (qvf) queryLocalInterface9;
                    } else {
                        qvfVar = new qvd(readStrongBinder9);
                    }
                }
                int readInt4 = parcel.readInt();
                qgv qgvVar9 = (qgv) qve.b(qvfVar);
                if (this.b.isInstance(qgvVar9) && (qgxVar9 = this.a) != null) {
                    qgxVar9.i((qgv) this.b.cast(qgvVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(213880000);
                return true;
            default:
                return false;
        }
    }
}
