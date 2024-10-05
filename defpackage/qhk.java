package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhk extends ecq implements qhl {
    public final Map a;
    public qhy b;
    private final bpw c;

    public qhk() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    public final void a(bph bphVar, int i) {
        Iterator it = ((Set) this.a.get(bphVar)).iterator();
        while (it.hasNext()) {
            this.c.q(bphVar, (ji) it.next(), i);
        }
    }

    public final void b(bph bphVar) {
        Iterator it = ((Set) this.a.get(bphVar)).iterator();
        while (it.hasNext()) {
            this.c.r((ji) it.next());
        }
    }

    public qhk(bpw bpwVar, CastOptions castOptions) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
        this.a = new HashMap();
        this.c = bpwVar;
        if (Build.VERSION.SDK_INT > 30) {
            boolean z = castOptions.i;
            boolean z2 = castOptions.j;
            bqe bqeVar = new bqe();
            if (Build.VERSION.SDK_INT >= 30) {
                bqeVar.a = z;
            }
            bqeVar.b(z2);
            bpw.n(bqeVar.a());
            if (z) {
                qhg.d(andg.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (z2) {
                this.b = new qhy();
                qhq qhqVar = new qhq(this.b);
                bpw.c();
                bpw.a().z = qhqVar;
                qhg.d(andg.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        qhn qhnVar = null;
        Bundle bundle = null;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof qhn) {
                        qhnVar = (qhn) queryLocalInterface;
                    } else {
                        qhnVar = new qhm(readStrongBinder);
                    }
                }
                bph a = bph.a(bundle2);
                if (!this.a.containsKey(a)) {
                    this.a.put(a, new HashSet());
                }
                ((Set) this.a.get(a)).add(new qho(qhnVar));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                final int readInt = parcel.readInt();
                final bph a2 = bph.a(bundle3);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    a(a2, readInt);
                } else {
                    new amcc(Looper.getMainLooper(), (byte[]) null).post(new Runnable() { // from class: qhs
                        @Override // java.lang.Runnable
                        public final void run() {
                            qhk qhkVar = qhk.this;
                            bph bphVar = a2;
                            int i3 = readInt;
                            synchronized (qhkVar.a) {
                                qhkVar.a(bphVar, i3);
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                return true;
            case 3:
                final bph a3 = bph.a((Bundle) ecr.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b(a3);
                } else {
                    new amcc(Looper.getMainLooper(), (byte[]) null).post(new Runnable() { // from class: qhr
                        @Override // java.lang.Runnable
                        public final void run() {
                            qhk.this.b(a3);
                        }
                    });
                }
                parcel2.writeNoException();
                return true;
            case 4:
                boolean k = bpw.k(bph.a((Bundle) ecr.a(parcel, Bundle.CREATOR)), parcel.readInt());
                parcel2.writeNoException();
                ecr.e(parcel2, k);
                return true;
            case 5:
                String readString = parcel.readString();
                Iterator it = bpw.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        bpv bpvVar = (bpv) it.next();
                        if (bpvVar.c.equals(readString)) {
                            bpw.l(bpvVar);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                bpw.l(bpw.g());
                parcel2.writeNoException();
                return true;
            case 7:
                boolean equals = bpw.j().c.equals(bpw.g().c);
                parcel2.writeNoException();
                ecr.e(parcel2, equals);
                return true;
            case 8:
                String readString2 = parcel.readString();
                Iterator it2 = bpw.i().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        bpv bpvVar2 = (bpv) it2.next();
                        if (bpvVar2.c.equals(readString2)) {
                            bundle = bpvVar2.q;
                        }
                    }
                }
                parcel2.writeNoException();
                ecr.h(parcel2, bundle);
                return true;
            case 9:
                String str = bpw.j().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(213880000);
                return true;
            case 11:
                Iterator it3 = this.a.values().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Set) it3.next()).iterator();
                    while (it4.hasNext()) {
                        this.c.r((ji) it4.next());
                    }
                }
                this.a.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                bpw.c();
                bpp a4 = bpw.a();
                bpv bpvVar3 = a4 != null ? a4.r : null;
                if (bpvVar3 != null && bpw.j().c.equals(bpvVar3.c)) {
                    z = true;
                }
                parcel2.writeNoException();
                ecr.e(parcel2, z);
                return true;
            case 13:
                bpw.o(parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
