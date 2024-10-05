package defpackage;

import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqr extends ajqi {
    public ViewPropertyAnimator b;

    @Override // defpackage.ajph
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            c();
        }
    }

    @Override // defpackage.ajph
    public final void b() {
        ajqa ajqaVar = ((ajqi) this).a;
        ViewPropertyAnimator animate = ajqaVar.a.a().animate();
        this.b = animate;
        animate.alpha(0.0f).setDuration(ajqaVar.b).setListener(new ajqq(this, ajqaVar)).start();
    }

    public final void c() {
        ajqa ajqaVar = ((ajqi) this).a;
        ajqaVar.a.a().setAlpha(1.0f);
        ajqaVar.d.run();
    }

    @Override // defpackage.ajqi
    protected final void d() {
    }
}
