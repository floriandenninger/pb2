package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ocs extends odc {
    private int b;

    public ocs(obp obpVar, obp obpVar2, int i) {
        super(obpVar, obpVar2);
        this.b = i;
        b();
    }

    @Override // defpackage.odc
    public final void b() {
        obp obpVar = this.d;
        obpVar.getClass();
        this.e.getClass();
        this.f.set(obpVar.t());
        this.j.set(this.d.s());
        this.g.set(this.d.v());
        this.i.set(this.e.u());
        this.j.top = (int) (this.b / 2.0f);
        Rect rect = this.f;
        rect.offsetTo(rect.left, this.j.top);
        Rect rect2 = this.g;
        rect2.offsetTo(rect2.left, this.j.top);
        this.h.set(this.e.r());
        this.j.bottom = this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        return ((this.d != null ? r1.t().centerY() : 0.0f) - (this.b / 2.0f)) / this.b;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float m() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float n() {
        return 1.0f;
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
