package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrz {
    private static final float[] a = new float[8];

    public static void a(ViewGroup viewGroup, nqb nqbVar, nry nryVar) {
        if (viewGroup == null || nqbVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.panel_header);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            b(frameLayout, nqbVar.b());
        }
        View findViewById = viewGroup.findViewById(R.id.close_button);
        if (findViewById != null) {
            if ((nqbVar instanceof not) || (nqbVar instanceof nou)) {
                findViewById.setVisibility(8);
            } else if (nryVar == null || !nryVar.e()) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        View a2 = nqbVar.a();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.panel_subheader);
        if (viewGroup2 != null) {
            if (a2 != null) {
                viewGroup2.removeAllViews();
                b(viewGroup2, a2);
                viewGroup2.setVisibility(0);
                return;
            }
            viewGroup2.setVisibility(8);
        }
    }

    public static void b(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
    }

    public static void c(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        float K = yjk.K(view.getContext().getResources().getDisplayMetrics(), 12);
        float[] fArr = {K, K, K, K, 0.0f, 0.0f, 0.0f, 0.0f};
        View findViewById = view.findViewById(R.id.arrow_drag_handle);
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (z) {
            gradientDrawable.setCornerRadii(fArr);
        } else {
            gradientDrawable.setCornerRadii(a);
        }
        if (z2) {
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
    }
}
