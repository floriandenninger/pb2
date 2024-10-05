package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpp implements Runnable {
    final /* synthetic */ arps a;
    final /* synthetic */ acpq b;

    public acpp(acpq acpqVar, arps arpsVar) {
        this.b = acpqVar;
        this.a = arpsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acpq acpqVar = this.b;
        acpr acprVar = acpqVar.f;
        adyu.cj(acprVar.b, acprVar.a, this.a, acpqVar.e);
    }
}
