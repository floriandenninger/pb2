package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class actq implements actg {
    final List a;
    final List b;
    public final ecw c;
    private final afsy d;
    private final ysy e;
    private final ypa f;
    private final Map g;

    public actq(ypa ypaVar, afsy afsyVar, ecw ecwVar, ysy ysyVar) {
        ypaVar.getClass();
        this.f = ypaVar;
        this.d = afsyVar;
        ecwVar.getClass();
        this.c = ecwVar;
        this.e = ysyVar;
        this.g = new HashMap();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final actb m(Class cls) {
        for (actb actbVar : this.a) {
            if (actbVar.getClass().equals(cls)) {
                return actbVar;
            }
        }
        return null;
    }

    private final acte n(Class cls, Class cls2, actc actcVar, ammy ammyVar, boolean z) {
        actn actnVar = new actn(this, actcVar, cls2, ammyVar, z);
        o(cls).a.add(actnVar);
        return actnVar;
    }

    private final actj o(Class cls) {
        actj actjVar = (actj) this.g.get(cls);
        if (actjVar != null) {
            return actjVar;
        }
        actj actjVar2 = new actj(this);
        this.f.a(this, cls, actjVar2);
        this.g.put(cls, actjVar2);
        return actjVar2;
    }

    @Override // defpackage.actg
    public final ysy a() {
        return this.e;
    }

    @Override // defpackage.actg
    public final acte b(Class cls, actc actcVar) {
        return d(cls, actcVar, null);
    }

    @Override // defpackage.actg
    public final acte c(Class cls, Class cls2, actc actcVar, boolean z) {
        return n(cls, cls2, actcVar, null, z);
    }

    @Override // defpackage.actg
    public final acte d(Class cls, actc actcVar, ammy ammyVar) {
        return n(cls, null, actcVar, ammyVar, false);
    }

    @Override // defpackage.actg
    public final afsy e() {
        return this.d;
    }

    @Override // defpackage.actg
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.actg
    public final void g(Class cls, actd actdVar) {
        o(cls).e.add(new actk(this, actdVar));
    }

    @Override // defpackage.actg
    public final void h(Class cls, String str) {
        o(cls).c.add(new acto(this, str));
    }

    @Override // defpackage.actg
    public final void i(Class cls, actf actfVar) {
        o(cls).d.add(new actp(this, actfVar));
    }

    @Override // defpackage.actg
    public final boolean j(Class cls) {
        return m(cls) != null;
    }

    @Override // defpackage.actg
    public final void k(Class cls, Class cls2, actc actcVar) {
        o(cls).b.add(new actm(this, actcVar, cls, cls2));
    }

    public final void l(actb actbVar, Class cls, boolean z) {
        actb m;
        if (cls == null || (m = m(cls)) == null) {
            return;
        }
        actbVar.d(m);
        if (z) {
            m.e();
            this.a.remove(m);
            this.b.remove(m);
        }
    }
}
