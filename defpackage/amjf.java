package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjf implements anhh {
    final /* synthetic */ amir a;
    final /* synthetic */ anhh b;

    public amjf(amir amirVar, anhh anhhVar) {
        this.a = amirVar;
        this.b = anhhVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        amir e = amjw.e(this.a);
        try {
            this.b.b(obj);
        } finally {
            amjw.e(e);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        amir e = amjw.e(this.a);
        try {
            this.b.qg(th);
        } finally {
            amjw.e(e);
        }
    }
}
