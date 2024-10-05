package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmm implements Runnable {
    final /* synthetic */ fmn a;

    public fmm(fmn fmnVar) {
        this.a = fmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fmn fmnVar = this.a;
        fmnVar.f.removeCallbacks(fmnVar.e);
        if (this.a.b() == 0.0f) {
            this.a.g();
        } else {
            this.a.c();
            this.a.f.postInvalidate();
        }
    }
}
