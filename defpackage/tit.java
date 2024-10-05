package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tit implements tgt {
    private final tgb a;
    private tgb b;
    private List c;
    private boolean d = false;
    private int e = 1;
    private final aoae f;

    public tit(tgb tgbVar) {
        this.a = tgbVar;
        this.f = tgbVar.e;
    }

    private final void a(tgb tgbVar) {
        tgt tgtVar = tgbVar.a;
        if (this.d) {
            amkq.E(tgtVar.m());
            tgtVar.h();
        }
        tgtVar.e();
    }

    @Override // defpackage.tgt
    public final /* synthetic */ Object c() {
        return this.b;
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        tgt tgtVar = ((tgb) obj).a;
        tgtVar.j(this.a);
        amkq.E(this.c.add(obj));
        if (this.d) {
            tgtVar.g();
        }
    }

    @Override // defpackage.tgt
    public final void e() {
        amkq.O(this.b != null, "No parent override to unset");
        this.b = null;
    }

    @Override // defpackage.tgt
    public final void f() {
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((tgb) it.next());
            }
            this.c.clear();
            this.c = null;
        }
        tgb tgbVar = this.b;
        if (tgbVar != null) {
            tgbVar.a.i(this.a);
        }
    }

    @Override // defpackage.tgt
    public final void g() {
        amkq.N(!this.d);
        this.d = true;
        this.f.w(this.a);
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((tgb) it.next()).a.g();
            }
        }
    }

    @Override // defpackage.tgt
    public final void h() {
        amkq.N(this.d);
        this.d = false;
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((tgb) it.next()).a.h();
            }
        }
        this.f.x(this.a);
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        amkq.E(this.c.remove(obj));
        a((tgb) obj);
    }

    @Override // defpackage.tgt
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        obj.getClass();
        amkq.O(this.b == null, "Already has a parent override");
        this.b = (tgb) obj;
    }

    @Override // defpackage.tgt
    public final void l(tgs tgsVar) {
        List list = this.c;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                tgsVar.b((tgb) this.c.get(size));
            }
        }
    }

    @Override // defpackage.tgt
    public final boolean m() {
        return this.d;
    }

    @Override // defpackage.tgt
    public final boolean n() {
        return this.b == null;
    }

    @Override // defpackage.tgt
    public final int r() {
        return this.e;
    }

    @Override // defpackage.tgt
    public final void s(int i) {
        int i2 = this.e;
        this.e = i;
        if (!this.d || i2 == i) {
            return;
        }
        this.f.A(this.a, i);
    }
}
