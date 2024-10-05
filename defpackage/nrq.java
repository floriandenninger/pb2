package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrq implements zch, nry {
    public final nql a;
    public final LinkedList b = new LinkedList();
    private final banw c;
    private nrb d;
    private final aadw e;

    public nrq(nql nqlVar, ntv ntvVar, aadw aadwVar) {
        this.a = nqlVar;
        this.c = ntvVar.a;
        this.e = aadwVar;
    }

    public final int b() {
        return this.b.size();
    }

    public final nrb c() {
        return (nrb) this.b.peekLast();
    }

    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nrb) it.next()).a(5);
        }
        this.b.clear();
        this.c.c(amlr.a);
    }

    @Override // defpackage.nry
    public final boolean e() {
        return this.b.size() > 1 && evr.aq(this.e);
    }

    public final void f(nrb nrbVar, boolean z) {
        this.a.c();
        nrb nrbVar2 = (nrb) this.b.peekLast();
        this.b.addLast(nrbVar);
        if (!z || nrbVar2 == null) {
            this.a.h(nrbVar);
            if (nrbVar2 != null) {
                nrbVar2.a(3);
            }
        } else {
            this.a.k(nrbVar2, nrbVar, 3);
        }
        nrb nrbVar3 = (nrb) this.b.peekFirst();
        if (nrbVar3 != null) {
            this.c.c(ammv.i(nrbVar3.b));
        } else {
            this.c.c(amlr.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((nrb) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(boolean z) {
        if (this.b.size() <= 1) {
            return false;
        }
        this.a.c();
        nrb nrbVar = (nrb) this.b.removeLast();
        nrb nrbVar2 = (nrb) this.b.getLast();
        if (z) {
            this.a.j(nrbVar, nrbVar2, 3);
            this.d = nrbVar;
        } else {
            this.a.h(nrbVar2);
            nrbVar.a(5);
        }
        return true;
    }

    @Override // defpackage.zch
    public final void nE(int i, yzr yzrVar) {
        if (i != 0) {
            if (i == 2 && this.b.size() > 1) {
                ((nrb) this.b.get(r1.size() - 2)).a(3);
                return;
            }
            return;
        }
        nrb nrbVar = this.d;
        if (nrbVar != null) {
            nrbVar.a(5);
        }
        this.d = null;
    }
}
