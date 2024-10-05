package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqt extends ajqh {
    public ViewPropertyAnimator b;

    private static final boolean i(ajpx ajpxVar) {
        View a = ajpxVar.a.a();
        float translationX = (ajpxVar.g - ajpxVar.e) - a.getTranslationX();
        float translationY = (ajpxVar.h - ajpxVar.f) - a.getTranslationY();
        if (translationX != 0.0f || translationY != 0.0f) {
            a.setTranslationX(-translationX);
            a.setTranslationY(-translationY);
            return true;
        }
        a.setTranslationX(0.0f);
        a.setTranslationY(0.0f);
        return false;
    }

    @Override // defpackage.ajph
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            h();
        }
    }

    @Override // defpackage.ajph
    public final void b() {
        ajpx ajpxVar = ((ajqh) this).a;
        ViewPropertyAnimator animate = ajpxVar.a.a().animate();
        this.b = animate;
        animate.setDuration(ajpxVar.b).translationX(0.0f).translationY(0.0f).setListener(new ajqs(this, ajpxVar)).start();
    }

    @Override // defpackage.ajqh
    protected final boolean c() {
        return i(((ajqh) this).a);
    }

    @Override // defpackage.ajqh
    protected final boolean d(ajpv ajpvVar) {
        ViewPropertyAnimator viewPropertyAnimator;
        boolean i = i(((ajqh) this).a.b(ajpvVar));
        if (!i || (viewPropertyAnimator = this.b) == null) {
            return i;
        }
        viewPropertyAnimator.setListener(null).cancel();
        this.b = null;
        return true;
    }

    public final void h() {
        ajpx ajpxVar = ((ajqh) this).a;
        View a = ajpxVar.a.a();
        a.setTranslationX(0.0f);
        a.setTranslationY(0.0f);
        ajpxVar.d.run();
    }
}
