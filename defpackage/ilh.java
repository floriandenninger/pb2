package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ilh {
    public final ajjz a;
    public final aahd b;
    public final acqz c;
    public final ajut d;
    View e;
    View f;
    public LottieAnimationView g;
    public ImageView h;
    public View i;
    public ajkj j;
    public boolean k = false;

    public ilh(ajjz ajjzVar, aahd aahdVar, acqz acqzVar, ajut ajutVar) {
        this.a = ajjzVar;
        this.b = aahdVar;
        this.c = acqzVar;
        this.d = ajutVar;
    }

    public static View a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewGroup.addView(inflate);
        etx.M(inflate, true);
        return inflate;
    }

    public static void b(ViewGroup viewGroup, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(view);
        }
        viewGroup.addView(view);
    }

    public final void c() {
        View view = this.f;
        if (view != null) {
            etx.M(view, false);
            this.f.setOnClickListener(null);
        }
        View view2 = this.e;
        if (view2 != null) {
            etx.M(view2, false);
            this.e.setOnClickListener(null);
        }
        this.j = null;
        this.k = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = null;
        this.h = null;
    }
}
