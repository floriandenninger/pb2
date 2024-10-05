package defpackage;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhh {
    static {
        new qkw("CastDynamiteModule");
    }

    public static qgf a(Context context, CastOptions castOptions, qvf qvfVar, qgb qgbVar) {
        if (qvfVar == null) {
            return null;
        }
        try {
            return c(context).f(castOptions, qvfVar, qgbVar);
        } catch (RemoteException | qgr unused) {
            return null;
        }
    }

    public static qgj b(Service service, qvf qvfVar, qvf qvfVar2) {
        if (qvfVar != null && qvfVar2 != null) {
            try {
                return c(service.getApplicationContext()).g(qve.a(service), qvfVar, qvfVar2);
            } catch (RemoteException | qgr unused) {
            }
        }
        return null;
    }

    public static qhj c(Context context) {
        try {
            IBinder d = qvu.e(context, qvu.a, "com.google.android.gms.cast.framework.dynamite").d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (d == null) {
                return null;
            }
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof qhj) {
                return (qhj) queryLocalInterface;
            }
            return new qhi(d);
        } catch (qvq e) {
            throw new qgr(e);
        }
    }

    public static qgl d(Context context, String str, String str2, qgq qgqVar) {
        try {
            return c(context).h(str, str2, qgqVar);
        } catch (RemoteException | qgr unused) {
            return null;
        }
    }

    public static qjp e(Context context, AsyncTask asyncTask, qjq qjqVar, int i, int i2) {
        try {
            return c(context.getApplicationContext()).i(qve.a(asyncTask), qjqVar, i, i2);
        } catch (RemoteException | qgr unused) {
            return null;
        }
    }
}
