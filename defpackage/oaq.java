package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oaq extends obb implements fxo {
    private final Context a;
    private final fxp b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private int f;
    private int g;

    public oaq(Context context, fxp fxpVar) {
        this.a = context;
        this.b = fxpVar;
    }

    @Override // defpackage.fxo
    public final void a() {
        z(this.f, this.g);
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
        return this.c;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.d;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.e;
    }

    @Override // defpackage.obp
    public final void x() {
        this.b.a(this);
    }

    @Override // defpackage.obp
    public final void y() {
        this.b.b(this);
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        this.f = i;
        this.g = i2;
        int max = Math.max((int) (i * (true != yjk.Y(this.a) ? 0.4f : 0.35f)), yjk.K(this.a.getResources().getDisplayMetrics(), 240));
        int i3 = (int) (max / 1.777f);
        this.c.set(0, 0, max, this.a.getResources().getDimensionPixelSize(R.dimen.floaty_box_controls_height) + i3);
        this.d.set(0, 0, this.c.width(), i3);
        fav.A(1.777f, this.d, this.e);
        int width = i - this.c.width();
        int height = (i2 + this.b.a) - this.c.height();
        this.c.offset(width, height);
        this.d.offset(width, height);
        this.e.offset(width, height);
        J();
    }
}
