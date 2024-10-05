package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angv implements anfy {
    final /* synthetic */ angy a;
    final /* synthetic */ anfy b;

    public angv(angy angyVar, anfy anfyVar) {
        this.a = angyVar;
        this.b = anfyVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        if (!this.a.compareAndSet(angx.NOT_RUN, angx.STARTED)) {
            return anaf.M();
        }
        return this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
