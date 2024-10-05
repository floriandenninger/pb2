package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayms implements Runnable {
    final /* synthetic */ aynl a;

    public ayms(aynl aynlVar) {
        this.a = aynlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aynl aynlVar = this.a;
        if (aynlVar.y) {
            return;
        }
        aynlVar.u.e();
    }
}
