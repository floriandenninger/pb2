package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhi implements Runnable {
    final /* synthetic */ ayhk a;

    public ayhi(ayhk ayhkVar) {
        this.a = ayhkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amkq.O(((aykf) this.a.f).a.A.get(), "Channel must have been shut down");
    }
}
