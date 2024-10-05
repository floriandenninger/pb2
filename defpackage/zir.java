package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zir implements aypi {
    final /* synthetic */ aes a;

    public zir(aes aesVar) {
        this.a = aesVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(final ayqx ayqxVar) {
        aes aesVar = this.a;
        ayqxVar.getClass();
        aesVar.a(new Runnable() { // from class: ziq
            @Override // java.lang.Runnable
            public final void run() {
                ayqx.this.qc();
            }
        }, angq.a);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.c(null);
    }
}
