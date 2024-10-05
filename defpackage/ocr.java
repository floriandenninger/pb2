package defpackage;

import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocr extends odc {
    public ocr(ocq ocqVar, obp obpVar) {
        super(ocqVar, obpVar);
        b();
    }

    @Override // defpackage.odc
    public final void b() {
        this.d.getClass();
        obp obpVar = this.e;
        obpVar.getClass();
        Rect v = obpVar.v();
        Rect t = this.d.t();
        Rect t2 = this.e.t();
        Rect s = this.d.s();
        Rect r = this.e.r();
        fav.s(this.f, t, t2, 0.2352941f);
        fav.s(this.j, s, r, 0.2352941f);
        this.j.top = this.f.bottom;
        this.h.set(this.j);
        fav.A(v.width() / v.height(), this.f, this.g);
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
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float p() {
        return 1.0f;
    }
}
