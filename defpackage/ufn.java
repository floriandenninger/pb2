package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufn implements ufo, ufh {
    public boolean d;
    public udz f;
    public uhs g;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Object b = new Object();
    public final Map c = new HashMap();
    public amru e = amru.q();

    public static Object e(udz udzVar) {
        if (udzVar != null) {
            return udzVar.a;
        }
        return null;
    }

    private final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tyo) it.next()).af(e(this.f));
        }
    }

    @Override // defpackage.ufh
    public final Object a() {
        return e(this.f);
    }

    @Override // defpackage.ufh
    public final void b(tyo tyoVar) {
        this.a.add(tyoVar);
    }

    @Override // defpackage.ufh
    public final void c(tyo tyoVar) {
        this.a.remove(tyoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final amru d() {
        amru g;
        amrp amrpVar = new amrp();
        synchronized (this.b) {
            amxe it = this.e.iterator();
            while (it.hasNext()) {
                amrpVar.h(((udz) it.next()).a);
            }
            g = amrpVar.g();
        }
        return g;
    }

    public final void f() {
        if (this.d) {
            return;
        }
        this.d = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tyo) it.next()).ae();
        }
    }

    public final void g(Object obj) {
        udz udzVar;
        if (obj == null) {
            if (this.f != null) {
                this.f = null;
                h();
                return;
            }
            return;
        }
        udz udzVar2 = this.f;
        String X = tyo.X(obj);
        synchronized (this.b) {
            udzVar = (udz) this.c.get(X);
        }
        amkq.F(udzVar != null, "Selected account must be an available account");
        this.f = udzVar;
        if (udzVar.equals(udzVar2)) {
            return;
        }
        h();
    }
}
