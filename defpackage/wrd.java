package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wrd {
    public final wqy a;
    public final xgh b;
    public boolean c;
    public wrb d;

    public wrd(wqy wqyVar, xgh xghVar) {
        this.a = wqyVar;
        this.b = xghVar;
    }

    private final void d() {
        if (this.c) {
            throw new IllegalStateException("Tried to fulfill more than one thing by an adapter");
        }
        this.c = true;
    }

    public final void a(amml ammlVar, Executor executor, Executor executor2) {
        b(ammlVar, executor, executor2, null);
    }

    public final void b(amml ammlVar, Executor executor, Executor executor2, wrc wrcVar) {
        d();
        if (this.d != null) {
            whu.l(this.b, "Already had ongoing fulfillment task");
            return;
        }
        final wrb wrbVar = new wrb(this, anfq.h(anaf.O(this.b), ammlVar, executor), wrcVar);
        this.d = wrbVar;
        wrbVar.a.d(new Runnable() { // from class: wra
            @Override // java.lang.Runnable
            public final void run() {
                wrb wrbVar2 = wrb.this;
                if (!wrbVar2.c) {
                    try {
                        xev xevVar = (xev) wrbVar2.a.get();
                        wrc wrcVar2 = wrbVar2.b;
                        if (wrcVar2 != null) {
                            xevVar = wrcVar2.a(wrbVar2.d.b, xevVar);
                        }
                        wrd wrdVar = wrbVar2.d;
                        wrdVar.a.n(wrdVar.b, xevVar);
                        return;
                    } catch (InterruptedException | RuntimeException | ExecutionException e) {
                        wrd wrdVar2 = wrbVar2.d;
                        wqy wqyVar = wrdVar2.a;
                        xgh xghVar = wrdVar2.b;
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                        sb.append("Fulfillment error: ");
                        sb.append(valueOf);
                        wqyVar.k(xghVar, new wxf(sb.toString()));
                        return;
                    }
                }
                wrd wrdVar3 = wrbVar2.d;
                wrdVar3.a.o(wrdVar3.b);
            }
        }, executor2);
    }

    public final void c(amml ammlVar) {
        d();
        try {
            this.a.n(this.b, (xev) ammlVar.apply(this.b));
        } catch (RuntimeException e) {
            this.a.k(this.b, new wxf(e.getMessage()));
        }
    }
}
