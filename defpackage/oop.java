package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oop implements fgp, gbh {
    public final gap a;
    public final zaz c;
    private final fgq e;
    private final azrw f;
    private final aypn g;
    private boolean i;
    public final Rect b = new Rect();
    private fhg h = fhg.NONE;

    public oop(gap gapVar, fgq fgqVar, zaz zazVar, aypn aypnVar, azrw azrwVar) {
        this.a = gapVar;
        this.e = fgqVar;
        this.c = zazVar;
        this.f = azrwVar;
        this.g = aypnVar;
    }

    private final void k(boolean z) {
        zaz zazVar = this.c;
        if (zazVar != null) {
            zazVar.j(z);
        }
    }

    @Override // defpackage.gbh
    public final BottomUiContainer a() {
        return this.a.b;
    }

    @Override // defpackage.gbh
    public final gbi b() {
        return this.a.c;
    }

    @Override // defpackage.gbh
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.gbh
    public final void d(BottomUiContainer bottomUiContainer) {
        if (this.a.a) {
            return;
        }
        this.g.X(new ayrs() { // from class: ooo
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oop oopVar = oop.this;
                zck zckVar = (zck) obj;
                if (oopVar.a.b == null) {
                    return;
                }
                zat zatVar = zckVar.a.b;
                Rect rect = new Rect();
                if (oopVar.c.m()) {
                    rect.set(zckVar.a.a);
                } else if (oopVar.c.l() && !zatVar.a.isEmpty()) {
                    rect.set(zatVar.b(), zatVar.d(), zatVar.c(), zatVar.a());
                }
                if (oopVar.b.equals(rect)) {
                    return;
                }
                oopVar.b.set(rect);
                oopVar.a.b.setPadding(oopVar.b.left, 0, oopVar.b.right, 0);
            }
        });
        this.e.i(this);
        this.a.d(bottomUiContainer);
    }

    @Override // defpackage.gbh
    public final void e(gbi gbiVar) {
        if (this.e.g().b()) {
            this.a.b.l(gbiVar.c());
        }
    }

    @Override // defpackage.gbh
    public final void f() {
        this.a.f();
        k(false);
    }

    @Override // defpackage.gbh
    public final void g(gbi gbiVar) {
        this.a.g(gbiVar);
        this.i = true;
        k(true);
    }

    @Override // defpackage.gbh
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.gbh
    public final void i(gbf gbfVar) {
        this.a.i(gbfVar);
    }

    @Override // defpackage.gbh
    public final boolean j(gbi gbiVar) {
        return this.a.j(gbiVar) && !this.e.g().e();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        boolean b = fhgVar2.b();
        fhg fhgVar3 = fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        fhg fhgVar4 = fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        boolean z = (this.h == fhgVar2 || this.i) ? false : true;
        if (b || (fhgVar == fhgVar3 && fhgVar2 != fhgVar4 && z)) {
            c(false);
            ((slr) this.f.get()).a();
        }
        this.i = false;
        gap gapVar = this.a;
        gbi gbiVar = gapVar.c;
        gapVar.b.l((gbiVar != null && gbiVar.c()) || !b);
        gbi gbiVar2 = this.a.c;
        if (gbiVar2 != null && gbiVar2.c()) {
            k(true);
        }
        if (fhgVar2.m()) {
            return;
        }
        this.h = fhgVar2;
    }
}
