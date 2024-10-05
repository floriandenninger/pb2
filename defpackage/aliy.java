package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aliy extends aljc {
    public static final /* synthetic */ int c = 0;
    private static final alg j = new alix();
    public final aljd a;
    public float b;
    private final ali k;
    private final alh l;
    private boolean m;

    public aliy(Context context, alip alipVar, aljd aljdVar) {
        super(context, alipVar);
        this.m = false;
        this.a = aljdVar;
        aljdVar.b = this;
        ali aliVar = new ali();
        this.k = aliVar;
        aliVar.c();
        aliVar.e(50.0f);
        alh alhVar = new alh(this, j);
        this.l = alhVar;
        alhVar.n = aliVar;
        e(1.0f);
    }

    public final void a(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Override // defpackage.aljc
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        float n = alkd.n(this.d.getContentResolver());
        if (n == 0.0f) {
            this.m = true;
        } else {
            this.m = false;
            this.k.e(50.0f / n);
        }
        return b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.a.f(canvas, c());
            this.a.e(canvas, this.h);
            this.a.d(canvas, this.h, 0.0f, this.b, akwg.q(this.e.c[0], this.i));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.aljc, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.l.k();
        a(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.m) {
            this.l.k();
            a(i / 10000.0f);
            return true;
        }
        this.l.h(this.b * 10000.0f);
        this.l.i(i);
        return true;
    }
}
