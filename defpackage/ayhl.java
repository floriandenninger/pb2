package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhl implements Runnable {
    final /* synthetic */ ayac a;
    final /* synthetic */ ayhx b;

    public ayhl(ayhx ayhxVar, ayac ayacVar) {
        this.b = ayhxVar;
        this.a = ayacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.h(this.a);
    }
}
