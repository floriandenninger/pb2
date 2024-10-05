package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeir implements anhh {
    public aes a;

    @Override // defpackage.anhh
    public final void b(Object obj) {
        if (obj != null) {
            this.a.c(obj);
        }
        this.a.d(new NullPointerException());
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.d(th);
    }
}
