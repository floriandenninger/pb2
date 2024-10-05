package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpv implements afwx {
    final /* synthetic */ afsx a;
    final /* synthetic */ acpw b;
    final /* synthetic */ aone c;

    public acpv(acpw acpwVar, aone aoneVar, afsx afsxVar) {
        this.b = acpwVar;
        this.c = aoneVar;
        this.a = afsxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(arps.class.getCanonicalName());
        zga.d(valueOf.length() != 0 ? "Volley request retry failed for type ".concat(valueOf) : new String("Volley request retry failed for type "), cnqVar);
        this.b.d.a(2, new acpt(this, cnqVar));
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arps arpsVar = (arps) obj;
        String valueOf = String.valueOf(arps.class.getCanonicalName());
        if (valueOf.length() != 0) {
            "Successful volley request retried for type ".concat(valueOf);
        }
        this.b.d.a(2, new acpu(this, arpsVar));
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
