package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nqj implements zcg {
    public final float a;

    public nqj(float f) {
        this.a = f;
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        View findViewById = view.findViewById(R.id.panel_header);
        View findViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new nqi(this, view, findViewById, findViewById2, 0));
        ofFloat.addListener(whu.p(zcfVar));
        ofFloat.start();
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        View findViewById = view.findViewById(R.id.panel_header);
        View findViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new nqi(this, view, findViewById, findViewById2, 1));
        ofFloat.addListener(whu.p(zcfVar));
        ofFloat.start();
    }

    @Override // defpackage.zcg
    public final void c(View view) {
        view.setAlpha(1.0f);
        view.findViewById(R.id.panel_header).setTranslationX(0.0f);
        view.findViewById(R.id.panel_subheader).setTranslationX(0.0f);
        jw.q(view).a();
    }
}
