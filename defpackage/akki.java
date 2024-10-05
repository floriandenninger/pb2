package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akki implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akkr a;
    private final /* synthetic */ int b;

    public akki(akkr akkrVar, int i) {
        this.b = i;
        this.a = akkrVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            this.a.ag.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = this.a.ag.getHeight();
            this.a.ah.setAlpha(0.0f);
            this.a.ah.animate().alpha(1.0f).setDuration(250L).start();
            this.a.ai.setTranslationY(height);
            this.a.ai.animate().translationY(0.0f).setDuration(250L).setListener(new akkh(this)).start();
            return;
        }
        if (i == 1) {
            akkr akkrVar = this.a;
            akkrVar.as.removeCallbacks(akkrVar.an);
            akkr akkrVar2 = this.a;
            akkrVar2.as.post(akkrVar2.an);
            return;
        }
        if (this.a.aj.getChildCount() > 1) {
            if (this.a.ak.getChildCount() == 0 || this.a.ak.getHeight() > 0) {
                this.a.aj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.a.aJ(true);
            }
        }
    }
}
