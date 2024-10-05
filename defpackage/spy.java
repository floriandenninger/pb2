package defpackage;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spy implements ayqx {
    public final syd a;
    public final sxt b;
    public volatile sxc c;
    public final sxk d;
    public final ayqw e;
    public spx f;
    public volatile aypy g;
    private azrs h = azrh.e();

    public spy(syd sydVar, sxt sxtVar, sxc sxcVar, sxk sxkVar, ayqw ayqwVar) {
        this.a = sydVar;
        this.b = sxtVar;
        this.c = sxcVar;
        this.d = sxkVar;
        this.e = ayqwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dha a() {
        spx spxVar;
        dha dhaVar;
        if (e() || (spxVar = this.f) == null) {
            return null;
        }
        synchronized (spxVar.b) {
            dhaVar = spxVar.c;
        }
        return dhaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        spx spxVar;
        if (e() || (spxVar = this.f) == null) {
            return;
        }
        synchronized (spxVar.b) {
            spxVar.d = true;
        }
    }

    public final synchronized void d(dhe dheVar) {
        if (e()) {
            return;
        }
        if (dheVar == null) {
            this.a.c(28, "Null componentContext from setContext()", this.c);
        } else {
            this.h.c(dheVar);
        }
    }

    @Override // defpackage.ayqx
    public final synchronized boolean e() {
        boolean z;
        spx spxVar = this.f;
        if (spxVar != null) {
            z = spxVar.e();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(aypy aypyVar, aypy aypyVar2, sxc sxcVar, dhe dheVar, sow sowVar) {
        if (azqm.g(((azrh) this.h).c.get())) {
            this.h = azrh.e();
        }
        this.h.c(dheVar);
        this.c = sxcVar;
        this.g = aypyVar;
        spx spxVar = new spx(sowVar);
        this.f = spxVar;
        aypyVar2.ao(this.h, new ayro() { // from class: spw
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                dha dhaVar;
                spy spyVar = spy.this;
                sqr sqrVar = (sqr) obj;
                dhe dheVar2 = (dhe) obj2;
                if (sqrVar == null) {
                    spyVar.a.c(29, "Template produced null Element", spyVar.c);
                    dhaVar = drd.a(dheVar2).a;
                } else {
                    dha b = spyVar.b.b(dheVar2, spyVar.c, sqrVar.b, spyVar.d, spyVar.e);
                    if (sqrVar.a != null) {
                        dnc a = dnd.a(dheVar2);
                        a.e(b);
                        a.F(sqrVar.a);
                        dhaVar = a.a();
                    } else {
                        dhaVar = b;
                    }
                }
                return Pair.create(dhaVar, dheVar2);
            }
        }).aE(spxVar);
    }

    @Override // defpackage.ayqx
    public final synchronized void qc() {
        spx spxVar = this.f;
        if (spxVar != null) {
            spxVar.qc();
        }
        this.g = null;
        this.f = null;
        this.h.sh();
        Map map = this.c.i;
        if (map != null) {
            map.clear();
        }
    }
}
