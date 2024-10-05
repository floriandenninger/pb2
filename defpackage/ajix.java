package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajix implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public ajix(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static ajiw a(aaea aaeaVar) {
        return new ajiw(aaeaVar);
    }

    public static ajix b(azrw azrwVar) {
        return new ajix(azrwVar, 0);
    }

    public static ajiv c(aadw aadwVar) {
        return new ajiv(aadwVar);
    }

    public static ajiy d(acpl acplVar) {
        return new ajiy(acplVar);
    }

    public static ywr e(vgz vgzVar) {
        return new ywp(agcm.e(vgzVar), awur.a);
    }

    public static amcc f(Looper looper) {
        return new amcc(looper);
    }

    public static ajix g(azrw azrwVar) {
        return new ajix(azrwVar, 1);
    }

    public static ajix h(azrw azrwVar) {
        return new ajix(azrwVar, 2);
    }

    public static ajix i(azrw azrwVar) {
        return new ajix(azrwVar, 3);
    }

    public static ajix j(azrw azrwVar) {
        return new ajix(azrwVar, 4);
    }

    public static ajix k(azrw azrwVar) {
        return new ajix(azrwVar, 5);
    }

    public static ajix l(azrw azrwVar) {
        return new ajix(azrwVar, 15);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        String string;
        switch (this.b) {
            case 0:
                return a((aaea) this.a.get());
            case 1:
                return c((aadw) this.a.get());
            case 2:
                return d((acpl) this.a.get());
            case 3:
                return e((vgz) this.a.get());
            case 4:
                return ajje.a;
            case 5:
                return new aksn((acpl) this.a.get());
            case 6:
                return new aloe(((aloi) this.a).get());
            case 7:
                alog alogVar = (alog) this.a.get();
                ayaw.k(alogVar);
                return alogVar;
            case 8:
                return new aloh(((aloi) this.a).get());
            case 9:
                return new alqm(((alqs) this.a).get());
            case 10:
                File file = (File) this.a.get();
                if (file == null) {
                    return null;
                }
                return alrr.a(file);
            case 11:
                Context context = ((alqs) this.a).get();
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                        return new File(context.getExternalFilesDir(null), string);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
            case 12:
                alqg alqgVar = (alqg) this.a.get();
                ayaw.k(alqgVar);
                return alqgVar;
            case 13:
                return new alqy(((alqs) this.a).get());
            case 14:
                return new alra(((alqs) this.a).get());
            default:
                return f((Looper) this.a.get());
        }
    }
}
