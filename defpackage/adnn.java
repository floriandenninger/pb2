package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnn implements Runnable {
    final /* synthetic */ adnr a;

    public adnn(adnr adnrVar) {
        this.a = adnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adph adphVar = this.a.c;
        if (adphVar != null) {
            adphVar.d();
            this.a.e();
        }
    }
}
