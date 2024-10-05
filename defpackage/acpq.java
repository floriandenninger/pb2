package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpq implements afwx {
    final /* synthetic */ aazp a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;
    final /* synthetic */ afsg d;
    final /* synthetic */ afsx e;
    final /* synthetic */ acpr f;

    public acpq(acpr acprVar, aazp aazpVar, List list, String str, afsg afsgVar, afsx afsxVar) {
        this.f = acprVar;
        this.a = aazpVar;
        this.b = list;
        this.c = str;
        this.d = afsgVar;
        this.e = afsxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(arps.class.getCanonicalName());
        zga.f("GEL_DELAYED_EVENT_DEBUG", valueOf.length() != 0 ? "Volley request failed for type ".concat(valueOf) : new String("Volley request failed for type "), cnqVar);
        if (this.f.b.a()) {
            acpr acprVar = this.f;
            String valueOf2 = String.valueOf(cnqVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb.append("Encountered VolleyError: ");
            sb.append(valueOf2);
            acprVar.d(sb.toString());
            this.f.d.a(2, new acpo(this, cnqVar));
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arps arpsVar = (arps) obj;
        String valueOf = String.valueOf(arps.class.getCanonicalName());
        if (valueOf.length() != 0) {
            "Successful volley request for type ".concat(valueOf);
        }
        this.f.d.a(2, new acpp(this, arpsVar));
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
