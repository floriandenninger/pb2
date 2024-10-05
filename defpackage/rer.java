package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rer implements Runnable {
    final /* synthetic */ rhh a;
    final /* synthetic */ res b;

    public rer(res resVar, rhh rhhVar) {
        this.b = resVar;
        this.a = rhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ansv ansvVar = ((rgt) this.a).z;
        if (ansv.d()) {
            this.a.aG().g(this);
            return;
        }
        boolean d = this.b.d();
        this.b.a = 0L;
        if (d) {
            this.b.b();
        }
    }
}
