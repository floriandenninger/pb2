package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttw implements vem {
    public final Context a;
    public ammv b = amlr.a;
    public final HashMap c = new HashMap();
    private final HashMap e = new HashMap();
    private final shf d = new zhr(1);

    public ttw(Context context) {
        this.a = context;
    }

    public static String c(String str, String str2, int i) {
        return str + "|" + str2 + "|" + i;
    }

    public static String d(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.vem
    public final vel a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vem
    public final vel b(Uri uri) {
        synchronized (ttw.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return null;
            }
            if (this.e.get(str) == null) {
                this.e.put(str, new veb(new ttv(this, str), this.d, 10000L, TimeUnit.MILLISECONDS));
            }
            return (vel) this.e.get(str);
        }
    }

    @Override // defpackage.vem
    public final void f() {
    }
}
