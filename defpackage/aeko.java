package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeko implements anhh {
    private aes a;

    public final String c(aes aesVar) {
        this.a = aesVar;
        return "Onesie init segment future.";
    }

    public final void d() {
        this.a.b();
    }

    @Override // defpackage.anhh
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void b(aekd aekdVar) {
        if (aekdVar != null) {
            this.a.c(aekdVar);
        }
        this.a.d(new NullPointerException());
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.d(th);
    }
}
