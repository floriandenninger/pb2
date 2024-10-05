package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obe extends obb {
    private final obn a;
    private final obd c = new obd(this);
    private final Rect b = new Rect();

    public obe(obn obnVar) {
        this.a = obnVar;
    }

    @Override // defpackage.obp
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final Rect r() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect s() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.b;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.a.a(this.b);
    }

    @Override // defpackage.obp
    public final void x() {
        this.a.i(this.c);
        J();
    }

    @Override // defpackage.obp
    public final void y() {
        this.a.j(this.c);
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        this.b.set(0, 0, i, i2);
        J();
    }
}
