package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aedt implements ywr {
    public volatile ammv a;
    private final ywr b;
    private final aypn c;
    private final aooy d;
    private final Object e = new Object();
    private final azqw f;
    private final anhy g;

    public aedt(ywr ywrVar, aooy aooyVar) {
        this.b = ywrVar;
        azqw av = azqv.ap().av();
        this.f = av;
        this.c = av.G().y().n();
        this.a = amlr.a;
        this.d = aooyVar;
        this.g = g();
    }

    private final anhy g() {
        return anaf.P(h(anfq.i(this.b.a(), new anfz() { // from class: aedr
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                aedt aedtVar = aedt.this;
                aedtVar.f((aooy) obj);
                return anaf.O((aooy) aedtVar.a.c());
            }
        }, angq.a), anaf.O(this.d)));
    }

    private static anhy h(anhy anhyVar, anhy anhyVar2) {
        return aney.i(anhyVar, Exception.class, new aeds(anhyVar2, 0), angq.a);
    }

    @Override // defpackage.ywr
    public final anhy a() {
        if (this.a.h()) {
            return anaf.O((aooy) this.a.c());
        }
        return this.g.isDone() ? g() : this.g;
    }

    @Override // defpackage.ywr
    public final anhy b(final amml ammlVar) {
        synchronized (this.e) {
            if (!this.a.h()) {
                return h(this.b.b(new amml() { // from class: aedq
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        aedt aedtVar = aedt.this;
                        aooy aooyVar = (aooy) ammlVar.apply((aooy) obj);
                        aedtVar.e(aooyVar);
                        return aooyVar;
                    }
                }), anhv.a);
            }
            aooy aooyVar = (aooy) ammlVar.apply((aooy) this.a.c());
            e(aooyVar);
            return h(this.b.b(new afxv(aooyVar, 1)), anhv.a);
        }
    }

    @Override // defpackage.ywr
    public final aooy c() {
        if (this.a.h()) {
            return (aooy) this.a.c();
        }
        if (this.g.isDone()) {
            f(this.b.c());
            return (aooy) this.a.c();
        }
        try {
            return (aooy) this.g.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this.d;
        } catch (ExecutionException unused2) {
            return this.d;
        }
    }

    @Override // defpackage.ywr
    public final aypn d() {
        return this.c;
    }

    public final void e(aooy aooyVar) {
        synchronized (this.e) {
            this.f.c(aooyVar);
            this.a = ammv.j(aooyVar);
        }
    }

    public final void f(aooy aooyVar) {
        if (this.a.h()) {
            return;
        }
        synchronized (this.e) {
            if (!this.a.h()) {
                e(aooyVar);
            }
        }
    }
}
