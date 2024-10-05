package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nju implements amnv {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ nju(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.amnv
    public final Object get() {
        switch (this.b) {
            case 0:
                return new njw(this.a);
            case 1:
                return new njw(this.a);
            case 2:
                return new njw(this.a);
            case 3:
                return new njw(this.a);
            case 4:
                Context context = this.a;
                pyc pycVar = pyi.a;
                pyh b = pwa.b();
                if (b.c) {
                    return null;
                }
                synchronized (b.a) {
                    if (b.c) {
                        return null;
                    }
                    if (!b.d) {
                        b.d = true;
                    }
                    b.g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        b.f = qtu.b(b.g).c(b.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context c = qnm.c(context);
                        if (c != null || context == null || (c = context.getApplicationContext()) != null) {
                            context = c;
                        }
                        if (context == null) {
                            return null;
                        }
                        prh prhVar = pwa.a.b;
                        b.e = context.getSharedPreferences("google_ads_flags", 0);
                        SharedPreferences sharedPreferences = b.e;
                        if (sharedPreferences != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(b);
                        }
                        pyp.a.set(new pyg(b));
                        b.a();
                        b.c = true;
                        return null;
                    } finally {
                        b.d = false;
                        b.b.open();
                    }
                }
            case 5:
                return this.a.getSharedPreferences("primes", 0);
            case 6:
                Context context2 = this.a;
                if (uqw.a == 0) {
                    synchronized (uqw.class) {
                        if (uqw.a == 0) {
                            int a = uqw.a(context2);
                            if (a <= 0) {
                                a = 60;
                            }
                            double d = a;
                            Double.isNaN(d);
                            uqw.a = (int) Math.ceil(1000.0d / d);
                        }
                    }
                }
                return Integer.valueOf(uqw.a);
            case 7:
                return new uvy(rnu.b(this.a));
            case 8:
                Context context3 = this.a;
                int i = uvr.d;
                return uqw.c(context3);
            case 9:
                return zgx.c(this.a);
            case 10:
                String packageName = this.a.getPackageName();
                return packageName != null ? packageName : "";
            case 11:
                return yny.e(this.a);
            case 12:
                Pair S = yjk.S(this.a);
                return new afkm(((Integer) S.first).intValue(), ((Integer) S.second).intValue(), true);
            default:
                Pair S2 = yjk.S(this.a);
                return new afkm(Math.min(((Integer) S2.first).intValue(), ((Integer) S2.second).intValue()), Math.max(((Integer) S2.first).intValue(), ((Integer) S2.second).intValue()), true);
        }
    }
}
