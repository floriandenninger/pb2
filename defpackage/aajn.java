package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aajn implements aais, aftf, aftc, ypd {
    public final Context a;
    public final amea b;
    private final aair c;
    private final shf d;
    private final afsy e;
    private final azrw f;
    private final amrz g;
    private final Executor h;
    private final Executor i;
    private final azrw j;
    private final aals k;
    private final azrw l;
    private afsx m;
    private boolean n;
    private aajv o;
    private final aaip p;

    public aajn(Context context, shf shfVar, ypa ypaVar, afsy afsyVar, Map map, azrw azrwVar, Executor executor, Executor executor2, amea ameaVar, azrw azrwVar2, aals aalsVar, aaip aaipVar, azrw azrwVar3, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.d = shfVar;
        map.getClass();
        this.g = amrz.j(map);
        this.h = anaf.E(executor);
        this.i = executor2;
        this.b = ameaVar;
        this.j = azrwVar2;
        this.k = aalsVar;
        this.p = aaipVar;
        this.e = afsyVar;
        this.f = azrwVar;
        this.l = azrwVar3;
        this.m = null;
        this.o = null;
        this.n = false;
        this.c = new aaji();
        ypaVar.g(this);
    }

    private final synchronized aajv e() {
        aajv aajvVar;
        d();
        aajvVar = this.o;
        aajvVar.getClass();
        return aajvVar;
    }

    @Override // defpackage.aais
    public final synchronized aair a(afsx afsxVar) {
        aajv e = e();
        afsx afsxVar2 = this.m;
        afsxVar2.getClass();
        if (whu.ac(afsxVar2, afsxVar)) {
            return e;
        }
        return this.c;
    }

    @Override // defpackage.aftc
    public final void b(final afsx afsxVar) {
        this.i.execute(new Runnable() { // from class: aajm
            @Override // java.lang.Runnable
            public final void run() {
                aajn aajnVar = aajn.this;
                aajnVar.b.c(aajnVar.a, afsxVar);
            }
        });
    }

    @Override // defpackage.aais
    public final aair c() {
        return e();
    }

    public final synchronized void d() {
        afsx c = this.e.c();
        boolean g = c.g();
        afsx afsxVar = this.m;
        if (afsxVar != null && whu.ac(c, afsxVar) && this.n == g) {
            return;
        }
        aajv aajvVar = this.o;
        if (aajvVar != null) {
            if (this.n) {
                final Context context = this.a;
                try {
                    final aakl aaklVar = aajvVar.c;
                    try {
                        ((vhj) aaklVar.c.get()).a(new vip() { // from class: aakf
                            @Override // defpackage.vip
                            public final Object a(viq viqVar) {
                                aakl aaklVar2 = aakl.this;
                                Context context2 = context;
                                amkq.N(aaklVar2.b.z());
                                aaklVar2.e.c(context2, aaklVar2.b);
                                return true;
                            }
                        }).get();
                    } catch (InterruptedException | ExecutionException e) {
                        if (e instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        throw aaiq.a(e, 5);
                    }
                } catch (aaiq e2) {
                    aajvVar.p(e2);
                }
            }
            aajv aajvVar2 = this.o;
            aajvVar2.f = true;
            Iterator it = aajvVar2.a.values().iterator();
            while (it.hasNext()) {
                ((aali) it.next()).sh();
            }
            aajvVar2.a.clear();
            Iterator it2 = aajvVar2.b.values().iterator();
            while (it2.hasNext()) {
                ((aali) it2.next()).sh();
            }
            aajvVar2.b.clear();
        }
        this.m = c;
        this.n = g;
        afsx afsxVar2 = this.m;
        afsxVar2.getClass();
        this.o = new aajv(afsxVar2, this.h, this.d, this.g, this.b, this.j, this.k, this.p, this.l, null, null);
    }

    @Override // defpackage.aakw
    public final void g() {
        ((afte) this.f.get()).i(this);
    }

    @Override // defpackage.aftf
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.aftf
    public final void k() {
        d();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftf
    public final /* synthetic */ void l() {
    }
}
