package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqo extends ajqj {
    public ViewPropertyAnimator b;
    public ViewPropertyAnimator c;
    private float d;
    private float e;

    private static final void g(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.ajph
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            f();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        } else {
            e();
        }
    }

    @Override // defpackage.ajph
    public final void b() {
        ajqd ajqdVar = this.a;
        long j = ajqdVar.c;
        ViewPropertyAnimator animate = ajqdVar.a.a().animate();
        this.b = animate;
        animate.setDuration(j).alpha(0.0f).translationX(this.d).translationY(this.e).setListener(new ajqm(this, ajqdVar)).start();
        ViewPropertyAnimator animate2 = ajqdVar.b.a().animate();
        this.c = animate2;
        animate2.setDuration(j).alpha(1.0f).translationX(0.0f).translationY(0.0f).setListener(new ajqn(this, ajqdVar)).start();
    }

    @Override // defpackage.ajqj
    protected final boolean c() {
        ajqd ajqdVar = this.a;
        this.d = ajqdVar.j - ajqdVar.h;
        this.e = ajqdVar.k - ajqdVar.i;
        View a = ajqdVar.a.a();
        float f = this.d;
        float translationX = a.getTranslationX();
        float f2 = this.e;
        float translationY = a.getTranslationY();
        View a2 = ajqdVar.b.a();
        a2.setAlpha(0.0f);
        a2.setTranslationX(-(f - translationX));
        a2.setTranslationY(-(f2 - translationY));
        return true;
    }

    public final void e() {
        ajqd ajqdVar = this.a;
        g(ajqdVar.b.a());
        ajqdVar.g.run();
    }

    public final void f() {
        ajqd ajqdVar = this.a;
        g(ajqdVar.a.a());
        ajqdVar.e.run();
    }
}
