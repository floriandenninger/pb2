package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpd implements Runnable {
    final /* synthetic */ rpe a;

    public rpd(rpe rpeVar) {
        this.a = rpeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            rpf rpfVar = this.a.b;
            if (rpfVar != null) {
                rpfVar.b();
            }
        }
    }
}
