package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivs {
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final azrw e;
    private final azrw f;
    private final aifk g;
    private final int h;
    private ykl i;
    private ykl j;

    public aivs(Context context, azrw azrwVar, azrw azrwVar2, aifk aifkVar, Executor executor, Executor executor2) {
        this.a = context;
        this.e = azrwVar;
        this.f = azrwVar2;
        this.g = aifkVar;
        this.c = executor;
        this.d = executor2;
        this.h = Math.min(1024, Math.max(yjk.L(context), yjk.N(context)));
    }

    public final ykl a() {
        if (this.j == null) {
            this.j = yko.c(this.d, new aivr(this, 0));
        }
        return this.j;
    }

    public final void b(aami aamiVar) {
        int i = this.h;
        aamh b = aamiVar.b(i, (i * 9) / 16);
        Uri a = b == null ? null : b.a();
        if (a == null || aifk.e(this.g.a).X) {
            c(null, null);
            return;
        }
        this.b = a;
        ajjz ajjzVar = (ajjz) this.f.get();
        if (this.i == null) {
            this.i = yko.c(this.c, new aivr(this, 1));
        }
        ajjzVar.l(a, this.i);
    }

    public final void c(Bitmap bitmap, Bitmap bitmap2) {
        yjk.f();
        ((aivq) this.e.get()).k(bitmap, bitmap2);
    }
}
