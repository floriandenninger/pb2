package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjv implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public yjv(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static yjv a(azrw azrwVar) {
        return new yjv(azrwVar, 0);
    }

    public static String c(String str) {
        return str != null ? str : "youtube";
    }

    public static String d(ammv ammvVar) {
        String d = sve.d(ammvVar);
        ayaw.k(d);
        return d;
    }

    public static String e(Context context) {
        String k = yjj.k(context);
        ayaw.k(k);
        return k;
    }

    public static yjv f(azrw azrwVar) {
        return new yjv(azrwVar, 1);
    }

    public static yjv g(azrw azrwVar) {
        return new yjv(azrwVar, 2);
    }

    public final String b() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? e((Context) ((axqs) this.a).a) : d((ammv) this.a.get());
        }
        return c((String) ((axqs) this.a).a);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? b() : b();
        }
        return b();
    }
}
