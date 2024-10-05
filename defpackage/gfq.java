package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfq {
    public static final gfq a = new gfq(null, gol.a);
    public final gof b;
    private final WeakReference c;

    public gfq(ggr ggrVar, gof gofVar) {
        this.c = new WeakReference(ggrVar);
        this.b = gofVar;
    }

    public final View a() {
        ggr ggrVar = (ggr) this.c.get();
        if (ggrVar == null) {
            return null;
        }
        return ggrVar.g();
    }

    public final ggr b() {
        return (ggr) this.c.get();
    }

    public final void c(boolean z) {
        ggr ggrVar = (ggr) this.c.get();
        if (ggrVar == null) {
            return;
        }
        ggrVar.i(z);
    }
}
