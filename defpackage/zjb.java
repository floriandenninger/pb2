package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zjb implements anhh {
    final /* synthetic */ azmi a;

    public zjb(azmi azmiVar) {
        this.a = azmiVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        if (this.a.e()) {
            return;
        }
        if (obj != null) {
            this.a.c(obj);
        } else {
            this.a.a(new IllegalStateException("The value returned from the future was null. This is not allowed. Use Maybe instead if you intend to return null."));
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.a.e()) {
            return;
        }
        this.a.a(th);
    }
}
