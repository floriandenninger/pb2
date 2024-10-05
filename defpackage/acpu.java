package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpu implements Runnable {
    final /* synthetic */ arps a;
    final /* synthetic */ acpv b;

    public acpu(acpv acpvVar, arps arpsVar) {
        this.b = acpvVar;
        this.a = arpsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acpv acpvVar = this.b;
        acpw acpwVar = acpvVar.b;
        adyu.cj(acpwVar.b, acpwVar.a, this.a, acpvVar.a);
    }
}
