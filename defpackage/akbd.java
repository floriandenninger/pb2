package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbd {
    private final amnv a;

    public akbd(amnv amnvVar) {
        this.a = amnvVar;
    }

    public akbd(final tko tkoVar) {
        this.a = amkq.x(new amnv() { // from class: tqj
            @Override // defpackage.amnv
            public final Object get() {
                tkr b = tko.this.b();
                return b == tkr.UNDEFINED ? tkr.SHARED_PREFERENCES_ONLY : b;
            }
        });
    }

    public final Drawable a(View view, Drawable drawable) {
        if (!d()) {
            return null;
        }
        akba a = akba.a(view.getContext());
        a.b = drawable;
        return a.b();
    }

    public final void b(View view, Drawable drawable) {
        view.getClass();
        if (d() && (drawable instanceof TouchFeedbackDrawable) && !(view.getBackground() instanceof TouchFeedbackDrawable)) {
            whu.r(view, drawable);
        }
    }

    public final void c(View view, Drawable drawable) {
        view.getClass();
        if (Build.VERSION.SDK_INT >= 23 && d() && (drawable instanceof TouchFeedbackDrawable) && !(view.getForeground() instanceof TouchFeedbackDrawable)) {
            whu.s(view, drawable);
        }
    }

    public final boolean d() {
        return ((Boolean) this.a.get()).booleanValue();
    }

    public final tkr e() {
        return (tkr) this.a.get();
    }
}
