package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahvt extends AnimationDrawable {
    private final ImageView a;
    private final int b;
    private final int c;
    private Drawable d;
    private boolean e;
    private boolean f;

    public ahvt(ImageView imageView, int i, int i2, boolean z) {
        this.a = imageView;
        this.b = i;
        this.c = i2;
        if (z) {
            return;
        }
        c();
        d();
    }

    private final Drawable c() {
        if (this.d == null) {
            this.d = aii.a(this.a.getContext(), this.c);
        }
        return this.d;
    }

    private final void d() {
        if (this.e) {
            return;
        }
        Drawable a = aii.a(this.a.getContext(), this.b);
        if (a instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) a;
            setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < animationDrawable.getNumberOfFrames(); i++) {
                addFrame(animationDrawable.getFrame(i), animationDrawable.getDuration(i));
            }
        } else if (c() != null) {
            addFrame(c(), 0);
        }
        this.e = true;
    }

    public final void a() {
        this.f = false;
        this.a.setImageDrawable(this);
        d();
        stop();
        selectDrawable(0);
        start();
    }

    public final void b() {
        this.f = true;
        this.a.setImageDrawable(c());
        stop();
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z && !this.f) {
            b();
            c().setVisible(false, false);
        }
        return visible;
    }
}
