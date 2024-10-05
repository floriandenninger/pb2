package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sq {
    private final ImageView a;
    private yi b;

    public sq(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            ud.c(drawable);
        }
        if (drawable == null || Build.VERSION.SDK_INT > 21) {
            return;
        }
        if (this.b == null) {
            this.b = new yi();
        }
        yi yiVar = this.b;
        yiVar.a();
        ColorStateList imageTintList = this.a.getImageTintList();
        if (imageTintList != null) {
            yiVar.d = true;
            yiVar.a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
        if (imageTintMode != null) {
            yiVar.c = true;
            yiVar.b = imageTintMode;
        }
        if (yiVar.d || yiVar.c) {
            xc.h(drawable, yiVar, this.a.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        int f;
        yk l = yk.l(this.a.getContext(), attributeSet, nx.f, i, 0);
        ImageView imageView = this.a;
        jw.L(imageView, imageView.getContext(), nx.f, attributeSet, l.b, i, 0);
        try {
            Drawable drawable2 = this.a.getDrawable();
            if (drawable2 == null && (f = l.f(1, -1)) != -1 && (drawable2 = nz.b(this.a.getContext(), f)) != null) {
                this.a.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                ud.c(drawable2);
            }
            if (l.q(2)) {
                jj.h(this.a, l.g(2));
            }
            if (l.q(3)) {
                ImageView imageView2 = this.a;
                imageView2.setImageTintMode(ud.a(l.c(3, -1), null));
                if (Build.VERSION.SDK_INT == 21 && (drawable = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            l.o();
        }
    }

    public final void c(int i) {
        if (i != 0) {
            Drawable b = nz.b(this.a.getContext(), i);
            if (b != null) {
                ud.c(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    public final boolean d() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}
