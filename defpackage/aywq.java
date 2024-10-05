package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywq implements Runnable {
    final /* synthetic */ ayws a;
    private final Throwable b;

    public aywq(ayws aywsVar, Throwable th) {
        this.a = aywsVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.b(this.b);
        } finally {
            this.a.d.qc();
        }
    }
}
