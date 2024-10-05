package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywp implements Runnable {
    final /* synthetic */ ayws a;

    public aywp(ayws aywsVar) {
        this.a = aywsVar;
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
