package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvm {
    public final ajos a;
    public final LinearLayout b;
    public final ajnc c;
    public WeakReference d;
    public int e;
    private final int f;
    private ajny g;

    public mvm(Context context, ajos ajosVar, LinearLayout linearLayout, ajnc ajncVar) {
        this.a = ajosVar;
        this.b = linearLayout;
        this.c = ajncVar;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_row_divider_margin);
        d(false);
    }

    public final void a(ajok ajokVar) {
        if (this.g == null) {
            this.g = new ajny();
        }
        b(this.c.c(ajokVar, this.g), true);
    }

    public final void b(View view, boolean z) {
        ViewGroup.MarginLayoutParams layoutParams;
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        int i = z ? this.f : 0;
        if (z) {
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        }
        view.setLayoutParams(layoutParams);
        this.b.addView(view);
    }

    public final void c(boolean z) {
        boolean z2 = false;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            boolean z3 = true;
            if (z && i >= this.e) {
                z3 = false;
            }
            whu.I(this.b.getChildAt(i), z3);
            z2 |= z3;
        }
        d(z2);
    }

    public final void d(boolean z) {
        whu.I(this.b, z);
    }
}
