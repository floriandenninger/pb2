package defpackage;

import android.view.View;
import android.view.ViewStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fxk implements fya {
    public fxz a;
    public Object b;
    public ViewStub c;
    private boolean d;
    private int e;
    private yzr f;

    private final void a() {
        if (this.f == null || this.d) {
            return;
        }
        n();
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View g() {
        yzr yzrVar = this.f;
        if (yzrVar != null) {
            return yzrVar.b;
        }
        return null;
    }

    @Override // defpackage.fya
    public final void h(ViewStub viewStub, int i) {
        viewStub.getClass();
        this.c = viewStub;
        this.e = i;
        p();
    }

    protected abstract void i();

    @Override // defpackage.fya
    public final void j(fxz fxzVar) {
        this.a = fxzVar;
    }

    public final void k(Object obj) {
        if (amkq.b(this.b, obj)) {
            return;
        }
        this.b = obj;
        this.d = false;
        fxz fxzVar = this.a;
        if (fxzVar != null) {
            fxzVar.a(obj != null);
        }
        if (o()) {
            a();
        }
    }

    @Override // defpackage.fya
    public void l(boolean z, boolean z2) {
        ViewStub viewStub;
        if (z) {
            if (this.f == null && (viewStub = this.c) != null) {
                View inflate = viewStub.inflate();
                this.c = null;
                yzr yzrVar = new yzr(inflate);
                this.f = yzrVar;
                long j = this.e;
                yzrVar.d = j;
                yzrVar.e = j;
                i();
            }
            a();
        }
        yzr yzrVar2 = this.f;
        if (yzrVar2 == null) {
            return;
        }
        yzrVar2.a(z, z2);
    }

    @Override // defpackage.fya
    public final void m(int i) {
        yzr yzrVar = this.f;
        if (yzrVar == null) {
            return;
        }
        yzrVar.d = i;
    }

    protected abstract void n();

    @Override // defpackage.fya
    public final boolean o() {
        yzr yzrVar = this.f;
        return yzrVar != null && yzrVar.e();
    }

    protected abstract void p();
}
