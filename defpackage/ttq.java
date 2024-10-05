package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttq implements vem, tvv, ttr {
    private final HashMap a = new HashMap();

    public ttq(Executor executor) {
        anaf.E(executor);
    }

    @Override // defpackage.vem
    public final vel a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vem
    public final vel b(Uri uri) {
        synchronized (ttq.class) {
            if (this.a.get(uri) == null) {
                return null;
            }
            return (vel) this.a.get(uri);
        }
    }

    @Override // defpackage.tvv
    public final void c() {
    }

    @Override // defpackage.tvv
    public final void d() {
    }

    @Override // defpackage.tvv
    public final void e() {
        synchronized (ttq.class) {
            Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    @Override // defpackage.vem
    public final void f() {
    }
}
