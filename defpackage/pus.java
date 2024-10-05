package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pus extends qvh {
    private static final pus a = new pus();

    private pus() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static puv a(Context context, Executor executor, dve dveVar) {
        puv puvVar = null;
        if (dveVar.g && g(context)) {
            puvVar = a.e(context, executor, dveVar);
        }
        return puvVar == null ? new puu(context, executor, dveVar) : puvVar;
    }

    @Deprecated
    public static puv b(String str, Context context, boolean z, boolean z2) {
        puv puvVar = null;
        if (z2 && g(context)) {
            puvVar = a.f(str, context, z);
        }
        return puvVar == null ? new puu(str, context, z) : puvVar;
    }

    private final puv e(Context context, Executor executor, dve dveVar) {
        puv putVar;
        qvf a2 = qve.a(context);
        qvf a3 = qve.a(executor);
        byte[] byteArray = dveVar.toByteArray();
        try {
            puw puwVar = (puw) d(context);
            Parcel pn = puwVar.pn();
            ecr.i(pn, a2);
            ecr.i(pn, a3);
            pn.writeByteArray(byteArray);
            Parcel po = puwVar.po(3, pn);
            IBinder readStrongBinder = po.readStrongBinder();
            po.recycle();
            if (readStrongBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (queryLocalInterface instanceof puv) {
                putVar = (puv) queryLocalInterface;
            } else {
                putVar = new put(readStrongBinder);
            }
            return putVar;
        } catch (RemoteException | IllegalArgumentException | LinkageError | qvg unused) {
            return null;
        }
    }

    private final puv f(String str, Context context, boolean z) {
        IBinder readStrongBinder;
        puv putVar;
        qvf a2 = qve.a(context);
        try {
            puw puwVar = (puw) d(context);
            if (!z) {
                Parcel pn = puwVar.pn();
                pn.writeString(str);
                ecr.i(pn, a2);
                Parcel po = puwVar.po(2, pn);
                readStrongBinder = po.readStrongBinder();
                po.recycle();
            } else {
                Parcel pn2 = puwVar.pn();
                pn2.writeString(str);
                ecr.i(pn2, a2);
                Parcel po2 = puwVar.po(1, pn2);
                readStrongBinder = po2.readStrongBinder();
                po2.recycle();
            }
            if (readStrongBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (queryLocalInterface instanceof puv) {
                putVar = (puv) queryLocalInterface;
            } else {
                putVar = new put(readStrongBinder);
            }
            return putVar;
        } catch (RemoteException | LinkageError | qvg unused) {
            return null;
        }
    }

    private static boolean g(Context context) {
        return qmz.d.h(context, 12800000) == 0;
    }

    @Override // defpackage.qvh
    protected final /* synthetic */ Object c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof puw) {
            return (puw) queryLocalInterface;
        }
        return new puw(iBinder);
    }
}
