package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xtb {
    public final Set a = Collections.synchronizedSet(new HashSet());
    public final Context b;
    public final xsp c;
    public xuh d;
    private final Executor e;
    private final Executor f;

    public xtb(Context context, xsp xspVar, Executor executor, Executor executor2) {
        this.b = context;
        this.c = xspVar;
        this.e = executor;
        this.f = executor2;
    }

    public final void a(final xuh xuhVar) {
        this.d = xuhVar;
        this.f.execute(new Runnable() { // from class: xsx
            @Override // java.lang.Runnable
            public final void run() {
                xtb xtbVar = xtb.this;
                xuh xuhVar2 = xuhVar;
                Iterator it = xtbVar.a.iterator();
                while (it.hasNext()) {
                    ((xta) it.next()).qI(xuhVar2);
                }
            }
        });
    }

    public final void b(final xuh xuhVar, final apmg apmgVar) {
        this.f.execute(new Runnable() { // from class: xsz
            @Override // java.lang.Runnable
            public final void run() {
                xtb xtbVar = xtb.this;
                xuh xuhVar2 = xuhVar;
                apmg apmgVar2 = apmgVar;
                Iterator it = xtbVar.a.iterator();
                while (it.hasNext()) {
                    ((xta) it.next()).g(xuhVar2, apmgVar2);
                }
            }
        });
    }

    public final void c(xta xtaVar) {
        this.a.add(xtaVar);
    }

    public final void d() {
        this.d = null;
    }

    public final void e(final xuh xuhVar) {
        if (xuhVar == null) {
            return;
        }
        if (xuhVar.c == null && xuhVar.a != null) {
            final xso xsoVar = new xso() { // from class: xsw
                @Override // defpackage.xso
                public final void a(Drawable drawable) {
                    xtb xtbVar = xtb.this;
                    xuh xuhVar2 = xuhVar;
                    xug b = xuhVar2.b();
                    b.a = wcy.o(xtbVar.b, drawable, xuhVar2.b);
                    xtbVar.a(b.a());
                }
            };
            this.e.execute(new Runnable() { // from class: xsy
                @Override // java.lang.Runnable
                public final void run() {
                    xtb xtbVar = xtb.this;
                    xuh xuhVar2 = xuhVar;
                    xtbVar.c.a(xuhVar2.a, xsoVar);
                }
            });
        }
        if (xuhVar.c != null) {
            a(xuhVar);
        }
    }

    public final void f(xta xtaVar) {
        this.a.remove(xtaVar);
    }
}
