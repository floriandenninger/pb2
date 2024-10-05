package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adrj implements adro {
    final /* synthetic */ adrk a;

    public adrj(adrk adrkVar) {
        this.a = adrkVar;
    }

    @Override // defpackage.adro
    public final void a() {
        String str = adrk.a;
        synchronized (this.a.d) {
            this.a.c = 2;
        }
    }

    @Override // defpackage.adro
    public final void b() {
        String str = adrk.a;
        synchronized (this.a.d) {
            this.a.c = 0;
        }
    }
}
