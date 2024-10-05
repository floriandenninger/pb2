package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpu extends alpq {
    final /* synthetic */ alqa a;

    public alpu(alqa alqaVar) {
        this.a = alqaVar;
    }

    @Override // defpackage.alpq
    public final void a() {
        alqa alqaVar = this.a;
        if (alqaVar.k != null) {
            alqaVar.a.unbindService(alqaVar.j);
            this.a.e = false;
            alqa alqaVar2 = this.a;
            alqaVar2.k = null;
            alqaVar2.j = null;
        }
        this.a.c();
    }
}
