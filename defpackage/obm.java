package defpackage;

import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obm extends obb implements obo {
    public final obp a;
    public final obp b;
    public boolean c;
    private final aypn d;
    private ayqx e;

    public obm(obp obpVar, obp obpVar2, aypn aypnVar) {
        this.a = obpVar;
        this.b = obpVar2;
        this.d = aypnVar;
    }

    @Override // defpackage.obb, defpackage.obp
    public final ammv I() {
        return (this.c ? this.b : this.a).I();
    }

    @Override // defpackage.obp
    public final float l() {
        return (this.c ? this.b : this.a).l();
    }

    @Override // defpackage.obp
    public final float m() {
        return (this.c ? this.b : this.a).m();
    }

    @Override // defpackage.obp
    public final float n() {
        return (this.c ? this.b : this.a).n();
    }

    @Override // defpackage.obp
    public final float o() {
        return (this.c ? this.b : this.a).o();
    }

    @Override // defpackage.obp
    public final float p() {
        return (this.c ? this.b : this.a).p();
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        if ((obpVar != this.a || this.c) && !(obpVar == this.b && this.c)) {
            return;
        }
        J();
    }

    @Override // defpackage.obp
    public final float q() {
        return this.c ? this.b.q() : this.a.q();
    }

    @Override // defpackage.obp
    public final Rect r() {
        return (this.c ? this.b : this.a).r();
    }

    @Override // defpackage.obp
    public final Rect s() {
        return (this.c ? this.b : this.a).s();
    }

    @Override // defpackage.obp
    public final Rect t() {
        return (this.c ? this.b : this.a).t();
    }

    @Override // defpackage.obp
    public final Rect u() {
        return (this.c ? this.b : this.a).u();
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.c ? this.b.v() : this.a.v();
    }

    @Override // defpackage.obp
    public final void x() {
        this.a.K(this);
        this.b.K(this);
        this.a.x();
        this.b.x();
        this.e = this.d.X(new ayrs() { // from class: obl
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                obm obmVar = obm.this;
                Boolean bool = (Boolean) obj;
                if (obmVar.c == bool.booleanValue()) {
                    return;
                }
                obmVar.c = bool.booleanValue();
                obmVar.J();
            }
        });
    }

    @Override // defpackage.obp
    public final void y() {
        this.a.L(this);
        this.b.L(this);
        this.a.y();
        this.b.y();
        Object obj = this.e;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.e = null;
        }
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        this.b.z(i, i2);
        this.a.z(i, i2);
    }
}
