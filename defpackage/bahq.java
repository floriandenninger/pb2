package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahq implements bahy {
    final /* synthetic */ bahu a;

    public bahq(bahu bahuVar) {
        this.a = bahuVar;
    }

    @Override // defpackage.bahy
    public final void a() {
        if (this.a.d.g.compareAndSet(1, 4)) {
            bahu bahuVar = this.a;
            bair bairVar = bahuVar.a;
            bahx bahxVar = bahuVar.d;
            bairVar.onResponseStarted(bahxVar, bahxVar.o);
        }
    }
}
