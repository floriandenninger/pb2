package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class allo extends allk {
    private static final int[] a = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager p;
    private boolean q;

    private allo(Context context, ViewGroup viewGroup, View view, alll alllVar) {
        super(context, viewGroup, view, alllVar);
        this.p = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static allo m(View view, int i, int i2) {
        return n(view, view.getResources().getText(i), i2);
    }

    public static allo n(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() != 16908290) {
                        viewGroup2 = (ViewGroup) view;
                    } else {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                }
                if (view != null) {
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        int i2 = R.layout.design_layout_snackbar_include;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
        allo alloVar = new allo(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        alloVar.p(charSequence);
        alloVar.h = i;
        return alloVar;
    }

    @Override // defpackage.allk
    public final int a() {
        int i = this.h;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.p.getRecommendedTimeoutMillis(i, (true != this.q ? 0 : 4) | 3);
        }
        if (this.q && this.p.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void o(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.f.getChildAt(0)).b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.q = false;
        } else {
            this.q = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new alln(this, onClickListener));
        }
    }

    public final void p(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f.getChildAt(0)).a.setText(charSequence);
    }

    public final void q(int i, View.OnClickListener onClickListener) {
        o(this.e.getText(i), onClickListener);
    }
}
