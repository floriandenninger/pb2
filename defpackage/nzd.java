package defpackage;

import android.util.SparseArray;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nzd implements nzc {
    public final SparseArray a = new SparseArray();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public nzc d;

    @Override // defpackage.nzc
    public final nzo f(int i) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            return nzcVar.f(i);
        }
        nzo nzoVar = (nzo) this.a.get(i);
        if (nzoVar != null) {
            this.a.remove(i);
        }
        return nzoVar;
    }

    @Override // defpackage.nzc
    public final void g(int i, boolean z) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            nzcVar.g(0, false);
        }
    }

    @Override // defpackage.nzc
    public final void h(nzo nzoVar) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            nzcVar.h(nzoVar);
        } else {
            this.a.put(((nyv) nzoVar).a, nzoVar);
        }
    }

    @Override // defpackage.nzc
    public final void i(nza nzaVar) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            nzcVar.i(nzaVar);
        } else {
            this.b.add(nzaVar);
        }
    }

    @Override // defpackage.nzc
    public final void j(nzb nzbVar) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            nzcVar.j(nzbVar);
        } else {
            this.c.add(nzbVar);
        }
    }

    @Override // defpackage.nzc
    public final void k(nza nzaVar) {
        nzc nzcVar = this.d;
        if (nzcVar != null) {
            nzcVar.k(nzaVar);
        } else {
            this.b.remove(nzaVar);
        }
    }
}
