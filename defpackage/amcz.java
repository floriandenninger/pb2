package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcz implements bzf {
    final /* synthetic */ amcc a;

    public amcz(amcc amccVar) {
        this.a = amccVar;
    }

    @Override // defpackage.bzf
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.bzf
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
