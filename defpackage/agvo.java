package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvo implements agui {
    public final agui a;
    public Executor b;

    public agvo(agui aguiVar, Executor executor) {
        this.a = aguiVar;
        this.b = executor;
    }

    @Override // defpackage.agui
    public final void c(final boolean z) {
        this.b.execute(new Runnable() { // from class: agvj
            @Override // java.lang.Runnable
            public final void run() {
                agvo agvoVar = agvo.this;
                agvoVar.a.c(z);
            }
        });
    }

    @Override // defpackage.agui
    public final void d(final Map map) {
        this.b.execute(new Runnable() { // from class: agvn
            @Override // java.lang.Runnable
            public final void run() {
                agvo agvoVar = agvo.this;
                agvoVar.a.d(map);
            }
        });
    }

    @Override // defpackage.agui
    public final void e(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 1));
    }

    @Override // defpackage.agui
    public final void f(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 0));
    }

    @Override // defpackage.agui
    public final void g(final agnz agnzVar, final boolean z) {
        this.b.execute(new Runnable() { // from class: agvm
            @Override // java.lang.Runnable
            public final void run() {
                agvo agvoVar = agvo.this;
                agvoVar.a.g(agnzVar, z);
            }
        });
    }

    @Override // defpackage.agui
    public final void h(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 2));
    }

    @Override // defpackage.agui
    public final void i(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 3));
    }

    @Override // defpackage.agui
    public final void j(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 4));
    }

    @Override // defpackage.agui
    public final void k(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 5));
    }

    @Override // defpackage.agui
    public final void l(final agnz agnzVar, final atqs atqsVar, final agnf agnfVar) {
        this.b.execute(new Runnable() { // from class: agvl
            @Override // java.lang.Runnable
            public final void run() {
                agvo agvoVar = agvo.this;
                agvoVar.a.l(agnzVar, atqsVar, agnfVar);
            }
        });
    }

    @Override // defpackage.agui
    public final void m(agnz agnzVar) {
        this.b.execute(new agvk(this, agnzVar, 6));
    }
}
