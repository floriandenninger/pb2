package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aom extends aof {
    private final WeakReference c;
    public final aat a = new aat();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private final ArrayList g = new ArrayList();
    public aoe b = aoe.INITIALIZED;

    public aom(aok aokVar) {
        this.c = new WeakReference(aokVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoe d(aoe aoeVar, aoe aoeVar2) {
        return (aoeVar2 == null || aoeVar2.compareTo(aoeVar) >= 0) ? aoeVar : aoeVar2;
    }

    public static final void g(String str) {
        if (aar.B().C()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final aoe h(aoj aojVar) {
        aat aatVar = this.a;
        aoe aoeVar = null;
        aaw aawVar = aatVar.d(aojVar) ? ((aaw) aatVar.a.get(aojVar)).d : null;
        aoe aoeVar2 = aawVar != null ? ((aol) aawVar.b).a : null;
        if (!this.g.isEmpty()) {
            aoeVar = (aoe) this.g.get(r0.size() - 1);
        }
        return d(d(this.b, aoeVar2), aoeVar);
    }

    private final void i(aoe aoeVar) {
        if (this.b == aoeVar) {
            return;
        }
        this.b = aoeVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        l();
        this.e = false;
    }

    private final void j() {
        this.g.remove(r0.size() - 1);
    }

    private final void k(aoe aoeVar) {
        this.g.add(aoeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r6.f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aom.l():void");
    }

    @Override // defpackage.aof
    public final aoe a() {
        return this.b;
    }

    @Override // defpackage.aof
    public final void b(aoj aojVar) {
        aok aokVar;
        g("addObserver");
        aol aolVar = new aol(aojVar, this.b == aoe.DESTROYED ? aoe.DESTROYED : aoe.INITIALIZED);
        if (((aol) this.a.b(aojVar, aolVar)) == null && (aokVar = (aok) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            aoe h = h(aojVar);
            this.d++;
            while (aolVar.a.compareTo(h) < 0 && this.a.d(aojVar)) {
                k(aolVar.a);
                aod b = aod.b(aolVar.a);
                if (b != null) {
                    aolVar.a(aokVar, b);
                    j();
                    h = h(aojVar);
                } else {
                    throw new IllegalStateException("no event up from " + aolVar.a);
                }
            }
            if (!z) {
                l();
            }
            this.d--;
        }
    }

    @Override // defpackage.aof
    public final void c(aoj aojVar) {
        g("removeObserver");
        this.a.c(aojVar);
    }

    public void e(aod aodVar) {
        g("handleLifecycleEvent");
        i(aodVar.c());
    }

    public final void f(aoe aoeVar) {
        g("setCurrentState");
        i(aoeVar);
    }
}
