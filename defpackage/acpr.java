package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpr implements afrs {
    public final acpa a;
    public final acpm b;
    public final afrw c;
    public final ynn d;
    private final aazq e;
    private final afsy f;
    private final double g;
    private final boolean h;
    private final afqd i;

    public acpr(acpa acpaVar, aazq aazqVar, acpm acpmVar, afsy afsyVar, afqd afqdVar, ynn ynnVar, afrw afrwVar) {
        this.a = acpaVar;
        this.e = aazqVar;
        this.b = acpmVar;
        this.f = afsyVar;
        this.i = afqdVar;
        this.c = afrwVar;
        this.d = ynnVar;
        this.h = afqdVar.k();
        this.g = afqdVar.a();
    }

    @Override // defpackage.afrs
    public final afqq a() {
        return this.i.e();
    }

    @Override // defpackage.afrs
    public final String b() {
        return "event_logging";
    }

    @Override // defpackage.afrs
    public final void c(String str, afrm afrmVar, List list) {
        afsx d = this.f.d(str);
        agrk agrkVar = null;
        if (d == null) {
            d = afsw.a;
            e("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        afsx afsxVar = d;
        afsg afsgVar = afrmVar.a;
        d("Create requests for GEL!");
        aazp a = this.e.a(afsxVar, adyu.D(afsgVar, this.f), afsgVar.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aone aoneVar = (aone) it.next();
            arpn a2 = arpp.a();
            try {
                a2.m22mergeFrom(((ovz) aoneVar.instance).e, aomw.b());
                if (a2 == null) {
                    e("clientEvent is null", null);
                }
                a.d.add((arpp) a2.build());
            } catch (aoob e) {
                e(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent"), e);
            }
        }
        d("Finish deserializing ClientEvent!");
        if (a.d()) {
            return;
        }
        if (this.b.a()) {
            acpa acpaVar = this.a;
            String string = acpaVar.a.getString(acpa.e(afsxVar), "no_event_id_found");
            long a3 = acpaVar.a(afsxVar);
            if (!string.equals("no_event_id_found") && a3 != -1) {
                agrkVar = new agrk(string, a3);
            }
            if (agrkVar != null) {
                String str2 = agrkVar.a;
                long j = agrkVar.b;
                a.a = str2;
                a.b = j;
            }
        }
        a.c = afrmVar.b;
        d("Try to send GEL request!");
        this.e.b(a, new acpq(this, a, list, str, afsgVar, afsxVar));
    }

    public final void d(final String str) {
        ynm.i(afxc.a(), new ynl() { // from class: acpn
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                acpr acprVar = acpr.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    String.valueOf(acprVar.getClass().getCanonicalName()).length();
                    String.valueOf(str2).length();
                }
            }
        });
    }

    public final void e(String str, Exception exc) {
        if (exc != null) {
            zga.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            if (this.h) {
                String valueOf = String.valueOf(str);
                afsi.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(valueOf) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.g);
                return;
            }
            return;
        }
        zga.c("GEL_DELAYED_EVENT_DEBUG", str);
        if (this.h) {
            String valueOf2 = String.valueOf(str);
            afsi.e(1, 12, valueOf2.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf2) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.g);
        }
    }
}
