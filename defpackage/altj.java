package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class altj implements alti {
    private final alsk a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public altj(alsk alskVar, Window window, AttributeSet attributeSet, int i) {
        this.a = alskVar;
        View findViewById = alskVar.findViewById(R.id.suc_layout_status);
        if (findViewById == null) {
            throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
        }
        if (findViewById instanceof StatusBarBackgroundLayout) {
            this.b = (StatusBarBackgroundLayout) findViewById;
        } else {
            this.c = (LinearLayout) findViewById;
        }
        View decorView = window.getDecorView();
        this.d = decorView;
        if (Build.VERSION.SDK_INT >= 23) {
            window.setStatusBarColor(0);
            TypedArray obtainStyledAttributes = alskVar.getContext().obtainStyledAttributes(attributeSet, alsl.d, i, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, Build.VERSION.SDK_INT < 23 || (decorView.getSystemUiVisibility() & 8192) == 8192);
            if (Build.VERSION.SDK_INT >= 23) {
                if (alskVar.f()) {
                    Context context = alskVar.getContext();
                    z = alte.f(context).j(context, altc.CONFIG_LIGHT_STATUS_BAR, false);
                }
                if (z) {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                } else {
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                }
            }
            a(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(Drawable drawable) {
        if (this.a.f() && !this.a.g()) {
            Context context = this.a.getContext();
            drawable = alte.f(context).d(context, altc.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.a = drawable;
        statusBarBackgroundLayout.setWillNotDraw(drawable == null);
        statusBarBackgroundLayout.setFitsSystemWindows(drawable != null);
        statusBarBackgroundLayout.invalidate();
    }
}
