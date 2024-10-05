package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sx extends st {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public sx(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void b() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable c = gl.c(drawable.mutate());
                this.c = c;
                if (this.f) {
                    c.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.st
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        yk l = yk.l(this.b.getContext(), attributeSet, nx.g, i, 0);
        SeekBar seekBar = this.b;
        jw.L(seekBar, seekBar.getContext(), nx.g, attributeSet, l.b, i, 0);
        Drawable i2 = l.i(0);
        if (i2 != null) {
            this.b.setThumb(i2);
        }
        Drawable h = l.h(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = h;
        if (h != null) {
            h.setCallback(this.b);
            gl.e(h, jw.e(this.b));
            if (h.isStateful()) {
                h.setState(this.b.getDrawableState());
            }
            b();
        }
        this.b.invalidate();
        if (l.q(3)) {
            this.e = ud.a(l.c(3, -1), this.e);
            this.g = true;
        }
        if (l.q(2)) {
            this.d = l.g(2);
            this.f = true;
        }
        l.o();
        b();
    }
}
