package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyh implements vym, vyl {
    public vym a;
    private final List b = new CopyOnWriteArrayList();

    @Override // defpackage.vyl
    public final void G(Exception exc) {
        Iterator it;
        synchronized (this.b) {
            it = this.b.iterator();
        }
        while (it.hasNext()) {
            ((vyl) it.next()).G(exc);
        }
    }

    @Override // defpackage.vyl
    public final void I(vya vyaVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((vyl) it.next()).I(vyaVar);
        }
    }

    public final vym a(vym vymVar) {
        vym vymVar2 = this.a;
        if (vymVar2 != null) {
            vymVar2.l(this);
        }
        this.a = vymVar;
        if (vymVar != null) {
            vymVar.k(this);
        }
        return vymVar2;
    }

    @Override // defpackage.vym
    public final vya g(long j, boolean z) {
        vym vymVar = this.a;
        if (vymVar != null) {
            return vymVar.g(j, z);
        }
        return null;
    }

    @Override // defpackage.vym
    public final vya i(long j) {
        vym vymVar = this.a;
        if (vymVar != null) {
            return vymVar.i(j);
        }
        return null;
    }

    @Override // defpackage.vym
    public final void j() {
    }

    @Override // defpackage.vym
    public final void k(vyl vylVar) {
        boolean m;
        synchronized (this.b) {
            this.b.add(vylVar);
            m = m();
        }
        if (m) {
            vylVar.q(this);
        }
    }

    @Override // defpackage.vym
    public final void l(vyl vylVar) {
        this.b.remove(vylVar);
    }

    @Override // defpackage.vym
    public final boolean m() {
        vym vymVar = this.a;
        if (vymVar != null) {
            return vymVar.m();
        }
        return false;
    }

    @Override // defpackage.vyl
    public final void q(vym vymVar) {
        Iterator it;
        synchronized (this.b) {
            it = this.b.iterator();
        }
        while (it.hasNext()) {
            ((vyl) it.next()).q(this);
        }
    }
}
