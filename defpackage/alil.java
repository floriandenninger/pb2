package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alil implements Runnable {
    final /* synthetic */ alio a;
    private final /* synthetic */ int b;

    public alil(alio alioVar, int i) {
        this.b = i;
        this.a = alioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            alio alioVar = this.a;
            ((aljc) alioVar.getCurrentDrawable()).h(false, false, true);
            if ((alioVar.getProgressDrawable() == null || !alioVar.getProgressDrawable().isVisible()) && (alioVar.getIndeterminateDrawable() == null || !alioVar.getIndeterminateDrawable().isVisible())) {
                alioVar.setVisibility(4);
            }
            this.a.e = -1L;
            return;
        }
        this.a.e();
    }
}
