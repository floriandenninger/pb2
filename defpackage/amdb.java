package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdb implements axqr {
    private final azrw a;

    public amdb(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static ConnectivityManager b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        ayaw.k(connectivityManager);
        return connectivityManager;
    }

    public static amdb c(azrw azrwVar) {
        return new amdb(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ConnectivityManager get() {
        return b((Context) ((axqs) this.a).a);
    }
}
