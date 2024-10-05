package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgh implements Runnable {
    final /* synthetic */ azgk a;

    public azgh(azgk azgkVar) {
        this.a = azgkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.sh();
        } finally {
            this.a.d.qc();
        }
    }
}
