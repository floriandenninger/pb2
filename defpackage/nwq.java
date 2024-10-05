package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nwq implements zcg {
    final /* synthetic */ nwr a;
    private final boolean b;
    private final boolean c;
    private final amsx d;

    public nwq(nwr nwrVar, boolean z, nqg nqgVar) {
        amsx k;
        this.a = nwrVar;
        this.b = z;
        boolean z2 = false;
        if (nqgVar != null && nqgVar.v()) {
            z2 = true;
        }
        this.c = z2;
        if (nqgVar == null) {
            k = nyh.a;
        } else {
            k = nqgVar.k();
        }
        this.d = k;
    }

    private final int e() {
        if (this.b) {
            return this.a.b.b().top - this.a.b.b().height();
        }
        return this.a.b.b().bottom;
    }

    private final void f(final View view, long j, zcf zcfVar, int i, nxh nxhVar) {
        int a;
        nwr nwrVar = this.a;
        nxh nxhVar2 = nxh.FULL_BLEED;
        int ordinal = nxhVar.ordinal();
        final int i2 = 1;
        if (ordinal == 0 || ordinal == 1) {
            a = nwx.a(this.a.b.b().bottom, this.a.b.a(), nxhVar);
        } else if (ordinal == 2) {
            a = e();
        } else {
            String valueOf = String.valueOf(nxhVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Tried to find end offset for invalid size state: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
        aypn c = nwrVar.c(i, a, j, this.a.a(), zcfVar);
        if (this.b) {
            final int i3 = 0;
            c.T(this.a.b.d(), this.a.b.c(), new gii(7)).an(aysu.d, new ayrm(this) { // from class: nwo
                public final /* synthetic */ nwq a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrm
                public final void a() {
                    if (i2 != 0) {
                        this.a.d(view);
                    } else {
                        this.a.d(view);
                    }
                }
            }).am(aysu.d, aysu.d, new ayrm(this) { // from class: nwo
                public final /* synthetic */ nwq a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrm
                public final void a() {
                    if (i3 != 0) {
                        this.a.d(view);
                    } else {
                        this.a.d(view);
                    }
                }
            }).X(new ayrs() { // from class: nwp
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    nwq nwqVar = nwq.this;
                    View view2 = view;
                    view2.setClipBounds((Rect) obj);
                    view2.invalidate();
                    nwqVar.a.f.c(true);
                }
            });
        }
        this.a.c.b(nxhVar, c);
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        f(view, j, zcfVar, this.a.h, nxh.HIDDEN);
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        f(view, j, zcfVar, e(), this.a.d.b(this.c, this.d));
    }

    @Override // defpackage.zcg
    public final void c(View view) {
    }

    public final void d(View view) {
        view.setClipBounds(null);
        view.invalidate();
        this.a.f.c(false);
    }
}
