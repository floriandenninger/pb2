package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxz implements nwy {
    public final azqw a;
    public final azqw b;
    public int c;
    public Rect d;
    private final aypn e;
    private final aypn f;
    private final oel g;

    public nxz(oel oelVar, gpe gpeVar) {
        this.g = oelVar;
        azqw av = azqv.ap().av();
        this.a = av;
        azqw av2 = azqv.ap().av();
        this.b = av2;
        this.e = av2.y().h(ntu.k);
        this.d = new Rect();
        this.f = aypn.e(av, aypn.z(false).j(gpeVar.a), nxd.g).h(ntu.k);
    }

    @Override // defpackage.nwy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.nwy
    public final Rect b() {
        return this.d;
    }

    @Override // defpackage.nwy
    public final aypn c() {
        return this.e;
    }

    @Override // defpackage.nwy
    public final aypn d() {
        return this.f;
    }

    @Override // defpackage.nwy
    public final void e() {
        obp c = this.g.c();
        this.a.c(Integer.valueOf(c.t().height()));
        this.b.c(c.r());
        this.g.h(new obo() { // from class: nxx
            @Override // defpackage.obo
            public final void pa(obp obpVar) {
                nxz nxzVar = nxz.this;
                nxzVar.a.c(Integer.valueOf(obpVar.t().height()));
                nxzVar.b.c(obpVar.r());
            }
        });
        final int i = 0;
        this.f.X(new ayrs(this) { // from class: nxy
            public final /* synthetic */ nxz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.d = (Rect) obj;
                } else {
                    this.a.c = ((Integer) obj).intValue();
                }
            }
        });
        final int i2 = 1;
        this.e.X(new ayrs(this) { // from class: nxy
            public final /* synthetic */ nxz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.d = (Rect) obj;
                } else {
                    this.a.c = ((Integer) obj).intValue();
                }
            }
        });
    }
}
