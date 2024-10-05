package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aixi extends aixo {
    public volatile boolean l;
    public volatile int m;

    public aixi(long j, long j2, int i, int i2, String str) {
        super(j, j2, i - 1, str);
        this.l = true;
        this.m = i2;
    }

    protected void a() {
    }

    protected void b(boolean z, boolean z2, boolean z3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void l(boolean z, boolean z2, boolean z3, long j) {
        if (this.l) {
            rL(z, z2, z3, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(long j) {
        if (p() >= j) {
            return;
        }
        this.o.a = j;
    }

    public final synchronized void n() {
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void o() {
        if (this.l) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rK(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void rL(boolean z, boolean z2, boolean z3, long j) {
        b(z, z2, z3);
    }
}
