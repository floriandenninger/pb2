package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiak extends ynt {
    public final aiaf c;
    public final apxf d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final aiaj h;
    public final ammv i;
    public final aioc j;
    public ayqx k;
    final ahzw l;
    public volatile boolean m;
    private final ypa n;

    public aiak(Executor executor, amsx amsxVar, ynu ynuVar, aiaf aiafVar, apxf apxfVar, atxo atxoVar, ahzw ahzwVar, ypa ypaVar, ammv ammvVar, aioc aiocVar) {
        super(executor, amsxVar, ynuVar);
        aiafVar.getClass();
        this.c = aiafVar;
        apxfVar.getClass();
        this.d = apxfVar;
        this.n = ypaVar;
        boolean d = aiaq.d(atxoVar);
        boolean z = true;
        if (!atxoVar.f && !d) {
            z = false;
        }
        this.f = z;
        this.g = d;
        this.e = aiaq.d(atxoVar) ? Math.max(Math.abs(atxoVar.d), Math.abs(atxoVar.e)) : -1;
        this.l = ahzwVar;
        this.i = ammvVar;
        this.j = aiocVar;
        this.h = new aiaj(this);
    }

    @Override // defpackage.ynt
    protected final Runnable b() {
        return new aiai(this);
    }

    @Override // defpackage.ynt, defpackage.ynv
    public final void c() {
        aeem aeemVar;
        this.b = true;
        amxd listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            yns ynsVar = (yns) listIterator.next();
            ynsVar.b = true;
            ynsVar.b();
        }
        ahzw ahzwVar = this.l;
        if (ahzwVar != null && (aeemVar = ahzwVar.e) != null) {
            aeemVar.a();
            ahzwVar.e = null;
            ahzwVar.c.d(new aiat());
        }
        if (!this.m) {
            this.n.d(new aiau());
        }
        Object obj = this.k;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
    }
}
