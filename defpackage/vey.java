package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vey implements vfo {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final anfz c;
    public final String d;
    public final Handler e;
    public final amnv f;
    public final TimeUnit g;
    public final amtt h = amuu.a().b().b();
    public final Object i = new Object();

    public vey(vev vevVar) {
        this.b = vevVar.a;
        this.c = vevVar.b;
        this.d = vevVar.c;
        this.e = vevVar.d;
        this.f = vevVar.e;
        this.g = vevVar.f;
    }

    public static vev a() {
        return new vev();
    }

    public final void b(Uri uri) {
        amrp f = amru.f();
        synchronized (this.i) {
            f.j(this.h.e(uri));
        }
        amru g = f.g();
        int i = ((amvj) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Runnable) g.get(i2)).run();
        }
    }
}
