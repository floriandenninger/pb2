package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqo implements Runnable {
    final /* synthetic */ aqp a;

    public aqo(aqp aqpVar) {
        this.a = aqpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqp aqpVar = this.a;
        aqpVar.e.c.remove(aqpVar.f.a());
    }
}
