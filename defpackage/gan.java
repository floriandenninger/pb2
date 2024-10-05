package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class gan implements akbl {
    private final gbh c;
    private final Handler d;
    private final gam e;
    private final azrw f;
    private final Set g = new CopyOnWriteArraySet();
    private akbn h;
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    static final long a = TimeUnit.SECONDS.toMillis(4);

    public gan(gbh gbhVar, Handler handler, azrw azrwVar, gam gamVar) {
        this.c = gbhVar;
        this.d = handler;
        this.e = gamVar;
        this.f = azrwVar;
    }

    protected abstract gbj c(BottomUiContainer bottomUiContainer);

    public final akbm d() {
        return (akbm) this.f.get();
    }

    public final void e(akbl akblVar) {
        this.g.add(akblVar);
        akbn akbnVar = this.h;
        if (akbnVar != null) {
            akblVar.lj(akbnVar);
        }
    }

    public final void f(akbn akbnVar) {
        g(akbnVar, 3);
    }

    public final void g(akbn akbnVar, int i) {
        BottomUiContainer a2 = this.c.a();
        if (a2 == null || akbnVar == null || !akbnVar.equals(this.h)) {
            return;
        }
        a2.i(i);
    }

    @Override // defpackage.akbl
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void li(akbn akbnVar, int i) {
        this.h = null;
        this.c.f();
        akbl g = akbnVar.g();
        if (g != null) {
            g.li(akbnVar, i);
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((akbl) it.next()).li(akbnVar, i);
        }
    }

    public final void i(akbl akblVar) {
        this.g.remove(akblVar);
    }

    public final void j(akbn akbnVar) {
        gbi a2;
        akn aknVar;
        BottomUiContainer a3 = this.c.a();
        if (a3 == null || akbnVar == null || !k(akbnVar) || (a2 = this.e.a(akbnVar)) == null || !this.c.j(a2)) {
            return;
        }
        gav m = BottomUiContainer.m(this, akbnVar);
        if (akbnVar.i()) {
            m.b();
            m.a(3);
            return;
        }
        this.c.e(a2);
        a3.o(a2, c(a3), m);
        boolean l = l(akbnVar);
        a3.k = l;
        if (l || (aknVar = a3.h) == null) {
            return;
        }
        aknVar.d();
    }

    protected boolean k(akbn akbnVar) {
        return true;
    }

    protected boolean l(akbn akbnVar) {
        return false;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        long j;
        final akbn akbnVar = (akbn) obj;
        this.h = akbnVar;
        this.c.g(this.e.a(akbnVar));
        int e = akbnVar.e();
        if (e != -2) {
            if (e == -1) {
                j = a;
            } else if (e != 0) {
                j = akbnVar.e();
            } else {
                j = b;
            }
            this.d.postDelayed(new Runnable() { // from class: gal
                @Override // java.lang.Runnable
                public final void run() {
                    gan.this.g(akbnVar, 2);
                }
            }, j);
        }
        akbl g = akbnVar.g();
        if (g != null) {
            g.lj(akbnVar);
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((akbl) it.next()).lj(akbnVar);
        }
    }
}
