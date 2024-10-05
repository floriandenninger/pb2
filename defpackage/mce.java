package defpackage;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mce implements mck {
    public acra a;
    public LinearLayout b;
    public aomf c;
    private RecyclerView e;
    private boolean f = false;
    final mcw d = new mcw(this);

    public mce(RecyclerView recyclerView, LinearLayout linearLayout, acra acraVar) {
        this.e = recyclerView;
        this.b = linearLayout;
        this.a = acraVar;
    }

    public static void j(View view, boolean z, int i) {
        if (jw.e(view) != 1 ? z : !z) {
            i = -i;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, i);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // defpackage.mck
    public final ammv a() {
        int i;
        float f;
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            f = this.b.getTranslationX();
            i = layoutParams.getMarginEnd();
        } else {
            i = 0;
            f = 0.0f;
        }
        return ammv.j(new mcj(i, f, this.d.a));
    }

    @Override // defpackage.mck
    public final void b() {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.aF(this.d);
            this.e = null;
            this.b = null;
        }
    }

    @Override // defpackage.mck
    public final void c(boolean z) {
        RecyclerView recyclerView;
        mcw mcwVar = this.d;
        mcwVar.a.c = !z;
        if (z || (recyclerView = this.e) == null) {
            return;
        }
        mcwVar.c(recyclerView, 0, 0);
    }

    @Override // defpackage.mck
    public final void d(mcj mcjVar) {
        if (mcjVar.c == null || this.e == null) {
            return;
        }
        f(mcjVar.a, mcjVar.b);
        mcw mcwVar = this.d;
        mcwVar.a = mcjVar.c;
        mcwVar.c(this.e, 0, 0);
    }

    @Override // defpackage.mck
    public final void e(acra acraVar) {
        this.a = acraVar;
    }

    final void f(int i, float f) {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMarginEnd(i);
            LinearLayout linearLayout2 = this.b;
            linearLayout2.getClass();
            linearLayout2.setTranslationX(f);
            this.b.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.mck
    public final void g(boolean z) {
        this.f = z;
    }

    @Override // defpackage.mck
    public final void h(aomf aomfVar) {
        this.c = aomfVar;
    }

    @Override // defpackage.mck
    public final void i() {
        LinearLayout linearLayout;
        if (!this.f && (linearLayout = this.b) != null) {
            f(-((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).width, 0.0f);
            this.d.a = mcv.a();
        }
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.aF(this.d);
            this.e.aD(this.d);
        }
    }
}
