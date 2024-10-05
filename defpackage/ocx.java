package defpackage;

import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocx extends odc {
    private final Rect b;
    private boolean c;

    public ocx(obp obpVar) {
        super(null, obpVar);
        this.b = new Rect();
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final ammv I() {
        return ammv.j(-16777216);
    }

    @Override // defpackage.odc
    public final void b() {
        int i;
        obp obpVar = this.e;
        obpVar.getClass();
        this.h.set(obpVar.r());
        this.i.set(this.e.u());
        this.g.set(this.e.v());
        this.f.set(this.e.t());
        this.j.set(this.e.s());
        this.g.offset(0, this.b.top);
        if (!this.c) {
            i = this.b.top;
            this.f.top += i;
        } else {
            int i2 = this.b.top;
            i = i2 + i2;
        }
        this.f.bottom += i;
        this.h.offset(0, i);
        this.i.offset(0, i);
    }

    public final void c(zck zckVar) {
        boolean z = this.c;
        this.c = zckVar.a.b.d() > 0;
        if (this.b.equals(zckVar.a.a) && this.c == z) {
            return;
        }
        this.b.set(zckVar.a.a);
        b();
    }
}
