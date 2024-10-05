package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bbc extends bar {
    private final HashMap d = new HashMap();
    private Handler e;
    private att f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bar
    public void k() {
        for (bbb bbbVar : this.d.values()) {
            bbbVar.a.j(bbbVar.b);
            bbbVar.a.ry(bbbVar.c);
            bbbVar.a.rx(bbbVar.c);
        }
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bar
    public void rq(att attVar) {
        this.f = attVar;
        this.e = pts.x();
    }

    @Override // defpackage.bar
    protected final void rs() {
        for (bbb bbbVar : this.d.values()) {
            bbbVar.a.rr(bbbVar.b);
        }
    }

    @Override // defpackage.bar
    protected final void ru() {
        for (bbb bbbVar : this.d.values()) {
            bbbVar.a.rt(bbbVar.b);
        }
    }

    @Override // defpackage.bbr
    public void s() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((bbb) it.next()).a.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void t(Object obj, bbr bbrVar, pou pouVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(Object obj, int i) {
        return i;
    }

    public final void x(final Object obj, bbr bbrVar) {
        pse.e(!this.d.containsKey(obj));
        bbq bbqVar = new bbq() { // from class: baz
            @Override // defpackage.bbq
            public final void a(bbr bbrVar2, pou pouVar) {
                bbc.this.t(obj, bbrVar2, pouVar);
            }
        };
        bba bbaVar = new bba(this, obj);
        this.d.put(obj, new bbb(bbrVar, bbqVar, bbaVar));
        Handler handler = this.e;
        pse.c(handler);
        bbrVar.b(handler, bbaVar);
        Handler handler2 = this.e;
        pse.c(handler2);
        bbrVar.jI(handler2, bbaVar);
        bbrVar.rv(bbqVar, this.f);
        if (this.a.isEmpty()) {
            bbrVar.rr(bbqVar);
        }
    }

    public final void y(Object obj) {
        bbb bbbVar = (bbb) this.d.remove(obj);
        pse.c(bbbVar);
        bbbVar.a.j(bbbVar.b);
        bbbVar.a.ry(bbbVar.c);
        bbbVar.a.rx(bbbVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ash z(Object obj, ash ashVar) {
        return ashVar;
    }
}
