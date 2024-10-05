package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class fwo {
    private static final Comparator b = new uo(10);
    final Runnable a;
    private final Handler c;
    private final List d;
    private final fwl e;
    private final Runnable f;
    private fwn g;

    public fwo(Handler handler, fwl fwlVar) {
        ArrayList arrayList = new ArrayList();
        this.c = handler;
        this.e = fwlVar;
        this.d = arrayList;
        this.f = new fwm(this, 1);
        this.a = new fwm(this, 0);
    }

    private final void h(boolean z) {
        if (z) {
            this.c.post(this.f);
            return;
        }
        this.c.post(this.a);
        this.c.removeCallbacks(this.f);
        this.c.postDelayed(this.f, 500L);
    }

    public final synchronized void a() {
        this.e.getClass();
        fwn fwnVar = this.g;
        if (fwnVar == null || fwnVar.f()) {
            return;
        }
        this.e.a(this.g);
        this.g = null;
    }

    public final synchronized void b(fwn fwnVar) {
        if (!g(fwnVar.getClass())) {
            this.d.add(fwnVar);
            List list = this.d;
            Comparator comparator = b;
            Collections.sort(list, comparator);
            fwn fwnVar2 = this.g;
            if (fwnVar2 == null || comparator.compare(fwnVar2, fwnVar) > 0) {
                h(true);
            }
        }
    }

    public final void c() {
        h(false);
    }

    public final void d() {
        h(true);
    }

    public final synchronized void e() {
        a();
        this.e.getClass();
        for (fwn fwnVar : this.d) {
            if (fwnVar.f()) {
                fwn fwnVar2 = this.g;
                if (fwnVar2 != null && fwnVar2 != fwnVar) {
                    this.e.a(fwnVar2);
                }
                this.g = fwnVar;
                fwl fwlVar = this.e;
                fwk fwkVar = fwlVar.a;
                if (fwkVar == null) {
                    fwlVar.a(null);
                    fwnVar.e();
                    fwlVar.a = fwnVar;
                    return;
                } else {
                    if (fwnVar.c() >= fwkVar.c()) {
                        if (fwnVar == fwkVar) {
                            fwkVar = null;
                        }
                        fwlVar.a(fwkVar);
                        fwnVar.e();
                        fwlVar.a = fwnVar;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final synchronized void f(fwn fwnVar) {
        if (this.d.remove(fwnVar) && this.g == fwnVar) {
            this.e.a(fwnVar);
            this.g = null;
            h(true);
        }
    }

    public final synchronized boolean g(Class cls) {
        boolean z;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (cls.isInstance((fwn) it.next())) {
                z = true;
                break;
            }
        }
        return z;
    }
}
