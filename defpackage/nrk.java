package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrk implements nry {
    public final ArrayDeque a = new ArrayDeque();
    public final nql b;
    public final banw c;
    private final aadw d;

    public nrk(nql nqlVar, ntv ntvVar, aadw aadwVar) {
        this.b = nqlVar;
        this.c = ntvVar.a;
        this.d = aadwVar;
    }

    public static int g(nrb nrbVar) {
        if (nrbVar.b.l() == null || (nrbVar.b.l().c & 64) == 0) {
            return 1;
        }
        aqtp aqtpVar = nrbVar.b.l().i;
        if (aqtpVar == null) {
            aqtpVar = aqtp.a;
        }
        int bi = aocz.bi(aqtpVar.c);
        if (bi == 0) {
            bi = 1;
        }
        return bi + (-1) != 2 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((nrj) it.next()).a();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv b() {
        return ammv.i((nrj) this.a.peek()).b(mjy.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv c() {
        ammv d = d();
        return d.h() ? ammv.j((nrj) d.c()).b(mjy.h) : amlr.a;
    }

    public final ammv d() {
        if (this.a.isEmpty()) {
            return amlr.a;
        }
        nrj nrjVar = (nrj) this.a.pop();
        nrj nrjVar2 = (nrj) this.a.peek();
        this.a.push(nrjVar);
        return ammv.i(nrjVar2);
    }

    @Override // defpackage.nry
    public final boolean e() {
        nrj nrjVar = (nrj) this.a.peek();
        return nrjVar != null && nrjVar.a() > 1 && evr.aq(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        nrj nrjVar = (nrj) this.a.peek();
        return nrjVar != null && nrjVar.a() > 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(int i) {
        nqg nqgVar;
        if (this.a.size() <= 1) {
            return false;
        }
        nrj nrjVar = (nrj) this.a.pop();
        nrj nrjVar2 = (nrj) this.a.peek();
        if (nrjVar2 != null) {
            this.b.c();
            if (i == 1) {
                this.b.j(nrjVar.b(), nrjVar2.b(), g(nrjVar.c));
            } else {
                nql nqlVar = this.b;
                nrb b = nrjVar2.b();
                nqlVar.i();
                if (((FrameLayout) nqlVar.p.b).indexOfChild(b.b.oO()) >= 0) {
                    nqlVar.d(false);
                } else if (((FrameLayout) nqlVar.n.b).indexOfChild(b.b.oO()) >= 0) {
                    nqlVar.g(false);
                } else {
                    nqlVar.h(b);
                }
            }
            nrb nrbVar = (nrb) nrjVar2.b.peek();
            if (nrbVar != null) {
                nrbVar.a(2);
            }
            nrjVar.d();
            nqgVar = nrjVar2.c.b;
        } else {
            nqgVar = null;
        }
        this.c.c(ammv.i(nqgVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        nrj nrjVar = (nrj) this.a.peek();
        if (nrjVar == null) {
            return false;
        }
        if (this.a.size() == 1 && nrjVar.a() <= 1) {
            return false;
        }
        if (nrjVar.a() == 0) {
            this.a.pop();
            return i();
        }
        if (nrjVar.a() == 1) {
            return h(1);
        }
        ammv c = nrjVar.c();
        nrb b = nrjVar.b();
        this.b.c();
        if (!c.h()) {
            this.b.h(b);
        } else {
            this.b.j((nrb) c.c(), b, 3);
        }
        b.a(2);
        return true;
    }
}
