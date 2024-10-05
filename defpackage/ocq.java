package defpackage;

import android.graphics.Rect;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocq extends odc {
    private final aeb b;

    public ocq(obp obpVar, obp obpVar2) {
        super(obpVar, obpVar2);
        this.b = new aeb();
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void K(obo oboVar) {
        this.b.add(oboVar);
    }

    @Override // defpackage.ocy, defpackage.obp
    public final void L(obo oboVar) {
        this.b.remove(oboVar);
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
        this.j.set(s);
        Rect rect = this.j;
        rect.top = rect.bottom - fav.n(t.bottom - t.top, t2.bottom - t2.top, 0.22500001f);
        this.h.set(r.left, this.j.top, r.right, this.j.top + r.height());
        this.f.set(this.j);
        fav.A(v.width() / v.height(), this.f, this.g);
        ocp ocpVar = new ocp(this);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((obo) it.next()).pa(ocpVar.a);
        }
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
        return 0.0f;
    }
}
