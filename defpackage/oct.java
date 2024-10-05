package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oct extends odc {
    private int b;

    public oct(obp obpVar, obp obpVar2, int i) {
        super(obpVar, obpVar2);
        this.b = i;
        b();
    }

    @Override // defpackage.odc
    public final void b() {
        obp obpVar = this.e;
        obpVar.getClass();
        this.f.set(obpVar.t());
        this.g.set(this.e.v());
        this.f.offset(0, (int) (this.b * 0.2f));
        this.g.offset(0, (int) (this.b * 0.2f));
        this.i.set(this.e.u());
        this.h.set(this.e.r());
        this.j.set(this.e.s());
        if (this.e.q() > 0.0f) {
            Rect rect = this.i;
            rect.offsetTo(rect.left, this.f.bottom);
            Rect rect2 = this.h;
            rect2.offsetTo(rect2.left, this.f.top);
            return;
        }
        this.h.offsetTo(this.f.left, this.f.bottom);
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void z(int i, int i2) {
        this.b = i2;
        b();
    }
}
