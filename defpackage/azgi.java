package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgi implements Runnable {
    final /* synthetic */ azgk a;
    private final Throwable b;

    public azgi(azgk azgkVar, Throwable th) {
        this.a = azgkVar;
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
