package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class actz implements actg {
    final List a;
    final List b;
    private final afsy c;
    private final amnv d;
    private final azrw e;
    private final ypa f;
    private final Map g;
    private boolean h;

    public actz(ypa ypaVar, afsy afsyVar, amnv amnvVar, azrw azrwVar) {
        ypaVar.getClass();
        this.f = ypaVar;
        this.c = afsyVar;
        this.d = amnvVar;
        this.e = azrwVar;
        this.g = new HashMap();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final actb n(Class cls) {
        for (actb actbVar : this.a) {
            if (actbVar.getClass().equals(cls)) {
                return actbVar;
            }
        }
        return null;
    }

    private final acte o(Class cls, Class cls2, actc actcVar, ammy ammyVar, boolean z) {
        actw actwVar = new actw(this, actcVar, cls2, ammyVar, z);
        p(cls).a.add(actwVar);
        return actwVar;
    }

    private final actr p(Class cls) {
        actr actrVar = (actr) this.g.get(cls);
        if (actrVar != null) {
            return actrVar;
        }
        actr actrVar2 = new actr(this);
        this.f.a(this, cls, actrVar2);
        this.g.put(cls, actrVar2);
        return actrVar2;
    }

    @Override // defpackage.actg
    public final ysy a() {
        return (ysy) this.e.get();
    }

    @Override // defpackage.actg
    public final acte b(Class cls, actc actcVar) {
        return d(cls, actcVar, null);
    }

    @Override // defpackage.actg
    public final acte c(Class cls, Class cls2, actc actcVar, boolean z) {
        return o(cls, cls2, actcVar, null, z);
    }

    @Override // defpackage.actg
    public final acte d(Class cls, actc actcVar, ammy ammyVar) {
        return o(cls, null, actcVar, ammyVar, false);
    }

    @Override // defpackage.actg
    public final afsy e() {
        return this.c;
    }

    @Override // defpackage.actg
    public final synchronized void f() {
        this.h = true;
        m();
    }

    @Override // defpackage.actg
    public final void g(Class cls, actd actdVar) {
        p(cls).e.add(new acts(this, actdVar));
    }

    @Override // defpackage.actg
    public final void h(Class cls, String str) {
        p(cls).c.add(new actx(this, str));
    }

    @Override // defpackage.actg
    public final void i(Class cls, actf actfVar) {
        p(cls).d.add(new acty(this, actfVar));
    }

    @Override // defpackage.actg
    public final boolean j(Class cls) {
        return n(cls) != null;
    }

    @Override // defpackage.actg
    public final void k(Class cls, Class cls2, actc actcVar) {
        p(cls).b.add(new actv(this, actcVar, cls, cls2));
    }

    public final void l(actb actbVar, Class cls, boolean z) {
        actb n;
        if (cls == null || (n = n(cls)) == null) {
            return;
        }
        actbVar.d(n);
        if (z) {
            n.e();
            this.a.remove(n);
            this.b.remove(n);
        }
    }

    public final synchronized void m() {
        if (this.h) {
            for (actb actbVar : this.b) {
                if (!actbVar.a) {
                    ((ecw) this.d.get()).b(actbVar.b());
                }
            }
            this.b.clear();
        }
    }
}
