package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrg implements ayqx, azqc {
    final ayqd a;
    final azrh b;
    boolean c;
    boolean d;
    azqd e;
    boolean f;
    volatile boolean g;
    long h;

    public azrg(ayqd ayqdVar, azrh azrhVar) {
        this.a = ayqdVar;
        this.b = azrhVar;
    }

    @Override // defpackage.azqc, defpackage.ayrw
    public final boolean a(Object obj) {
        return this.g || azqm.e(obj, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    azqd azqdVar = this.e;
                    if (azqdVar == null) {
                        azqdVar = new azqd();
                        this.e = azqdVar;
                    }
                    azqdVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.aP(this);
    }
}
