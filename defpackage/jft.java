package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jft extends akm {
    final /* synthetic */ MdxWatchDrawerLayout a;

    public jft(MdxWatchDrawerLayout mdxWatchDrawerLayout) {
        this.a = mdxWatchDrawerLayout;
    }

    @Override // defpackage.akm
    public final int b(View view) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
        return mdxWatchDrawerLayout.h - mdxWatchDrawerLayout.i;
    }

    @Override // defpackage.akm
    public final void d(int i) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
        boolean z = i != 0;
        mdxWatchDrawerLayout.k = z;
        if (z) {
            return;
        }
        if (mdxWatchDrawerLayout.m) {
            if (zev.e(mdxWatchDrawerLayout.getContext())) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setContentDescription(mdxWatchDrawerLayout.getContext().getString(R.string.mdx_minibar_accessibility_queue_opened_action));
                zev.b(mdxWatchDrawerLayout.getContext(), obtain);
                mdxWatchDrawerLayout.i(false);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) mdxWatchDrawerLayout.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(mdxWatchDrawerLayout.getWindowToken(), 0);
            }
            View view = mdxWatchDrawerLayout.f;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        if (mdxWatchDrawerLayout.l) {
            mdxWatchDrawerLayout.l = false;
            mdxWatchDrawerLayout.c();
        }
        MdxWatchDrawerLayout mdxWatchDrawerLayout2 = this.a;
        if (zev.e(mdxWatchDrawerLayout2.getContext())) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain(32);
            obtain2.setContentDescription(mdxWatchDrawerLayout2.getContext().getString(R.string.mdx_minibar_accessibility_queue_closed_action));
            zev.b(mdxWatchDrawerLayout2.getContext(), obtain2);
            mdxWatchDrawerLayout2.i(true);
        }
        View view2 = mdxWatchDrawerLayout2.e;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    @Override // defpackage.akm
    public final void e(View view, float f, float f2) {
        int i;
        if (f2 > 400.0f) {
            i = this.a.h;
        } else if (f2 < -400.0f) {
            i = this.a.i;
        } else {
            MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
            int i2 = mdxWatchDrawerLayout.g;
            int i3 = mdxWatchDrawerLayout.h;
            i = mdxWatchDrawerLayout.i;
            int i4 = ((i3 - i) / 2) + i;
            if (i2 > i4) {
                i = i3;
            } else if (i2 >= i4) {
                i = 0;
            }
        }
        if (this.a.c.isPresent() && ((akn) this.a.c.get()).j(0, i)) {
            jw.G(this.a);
        }
    }

    @Override // defpackage.akm
    public final boolean f(View view, int i) {
        return view == this.a.d;
    }

    @Override // defpackage.akm
    public final int h(View view, int i) {
        int paddingTop = this.a.getPaddingTop();
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a;
        int i2 = mdxWatchDrawerLayout.i;
        return Math.min(Math.max(i, paddingTop + i2), mdxWatchDrawerLayout.h);
    }

    @Override // defpackage.akm
    public final void i(View view, int i, int i2, int i3) {
        jfq jfqVar = this.a.b;
        if (jfqVar != null) {
            jfqVar.a(1.0f - (i2 / r2.h));
        }
        this.a.j(i2, false);
    }
}
