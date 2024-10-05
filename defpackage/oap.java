package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oap extends obb implements aiva, fxo, ypd {
    private final aivb a;
    private final fxp b;
    private final ypa c;
    private final aioc d;
    private final Context j;
    private final int k;
    private final aadw n;
    private final ayqw e = new ayqw();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private float l = 2.4f;
    private float m = 1.777f;

    public oap(Context context, aivb aivbVar, fxp fxpVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.j = context;
        this.a = aivbVar;
        this.b = fxpVar;
        this.c = ypaVar;
        this.d = aiocVar;
        this.n = aadwVar;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.floaty_bar_max_width);
    }

    private final int c() {
        return this.j.getResources().getDimensionPixelSize(R.dimen.floaty_bar_height);
    }

    private final void e(boolean z) {
        this.l = true != z ? 2.4f : 1.777f;
        h();
    }

    private final void g(float f) {
        this.m = f;
        h();
    }

    private final void h() {
        int c = c();
        int round = Math.round(this.l * c());
        int width = this.f.width();
        int height = this.f.height();
        int i = this.b.a;
        int min = (width - Math.min(width, this.k)) / 2;
        int i2 = (height + i) - c;
        int i3 = c + i2;
        this.h.set(min, i2, round + min, i3);
        fav.A(this.m, this.h, this.g);
        this.i.set(min, i2, width - min, i3);
        J();
    }

    @Override // defpackage.fxo
    public final void a() {
        h();
    }

    public final void b(ahef ahefVar) {
        aign c = ahefVar.c();
        if (c.h()) {
            e(true);
        } else if (c.c(aign.READY)) {
            e(false);
        }
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = i / i2;
        }
        g(f);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            b((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.obp
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float m() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float n() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float p() {
        return 0.0f;
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
        return this.i;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.h;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.g;
    }

    @Override // defpackage.obp
    public final void x() {
        this.a.a(this);
        this.b.a(this);
        float f = this.a.a;
        if (f == 0.0d) {
            f = 1.777f;
        }
        g(f);
        if (evr.au(this.n)) {
            this.e.c();
            this.e.g(this.d.G().b.X(new ayrs() { // from class: oao
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    oap.this.b((ahef) obj);
                }
            }));
        } else {
            this.c.g(this);
        }
    }

    @Override // defpackage.obp
    public final void y() {
        this.a.c(this);
        this.b.b(this);
        if (evr.au(this.n)) {
            this.e.c();
        } else {
            this.c.m(this);
        }
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        this.f.set(0, 0, i, i2);
        h();
    }
}
