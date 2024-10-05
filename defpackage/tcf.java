package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class tcf {
    public final sqq a;
    public final sxk b;
    public final boolean c;
    public final dpj d;
    public final amru i;
    public final ajds j;
    private final dhe k;
    public dha f = null;
    public ComponentTree g = null;
    public int h = -1;
    private dlr l = null;
    private boolean m = false;
    public final ayqw e = new ayqw();

    public tcf(sqq sqqVar, sxk sxkVar, swt swtVar, boolean z, dhe dheVar, dpj dpjVar, ajds ajdsVar) {
        this.a = sqqVar;
        this.b = sxkVar;
        this.c = z;
        this.k = dheVar;
        this.d = dpjVar;
        this.j = ajdsVar;
        this.i = amru.r(swtVar);
    }

    public final ComponentTree a() {
        if (this.g == null) {
            dhe dheVar = this.k;
            if (this.f == null) {
                tce tceVar = new tce(this);
                dpj dpjVar = this.d;
                tcb tcbVar = new tcb();
                tcb.d(tcbVar, dpjVar, new tcd());
                tcbVar.a.a = tceVar;
                tcbVar.d.set(0);
                this.f = tcbVar.a();
            }
            dho c = ComponentTree.c(dheVar, this.f);
            c.h = this.l;
            c.i = this.m;
            c.d = this.c;
            this.g = c.a();
        }
        return this.g;
    }

    public final void b() {
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            this.l = componentTree.d();
            this.m = this.g.p;
            this.e.c();
            this.g.o();
            this.g = null;
            this.h = -1;
        }
    }
}
