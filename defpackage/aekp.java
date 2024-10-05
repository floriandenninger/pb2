package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekp {
    final /* synthetic */ aeks a;
    private ovt b = null;
    private long c = 0;

    public aekp(aeks aeksVar) {
        this.a = aeksVar;
    }

    public final synchronized void a(ovt ovtVar) {
        this.b = ovtVar;
        this.c = this.a.n.d();
    }

    public final synchronized void b() {
        this.b = null;
        this.c = 0L;
        notifyAll();
    }

    public final synchronized void c(String str) {
        long d = this.a.n.d();
        long j = this.a.p.f;
        long j2 = d - this.c;
        ovt ovtVar = this.b;
        if (ovtVar != null && j2 < j) {
            if (ovtVar.b.equals(str)) {
                while (true) {
                    try {
                        if (this.b == null) {
                            break;
                        }
                        long j3 = j - (d - this.c);
                        if (j3 <= 0) {
                            break;
                        }
                        wait(j3);
                        d = this.a.n.d();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    } finally {
                        this.b = null;
                        this.c = 0L;
                    }
                }
            }
        }
    }
}
