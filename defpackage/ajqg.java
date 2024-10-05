package defpackage;

import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqg implements ajph {
    public ajpg a;
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
        ajpg ajpgVar = this.a;
        ViewPropertyAnimator animate = ajpgVar.a.a().animate();
        this.b = animate;
        animate.alpha(1.0f).setDuration(ajpgVar.b).setListener(new ajqp(this, ajpgVar)).start();
    }

    public final void c() {
        ajpg ajpgVar = this.a;
        ajpgVar.a.a().setAlpha(1.0f);
        ajpgVar.d.run();
    }
}
