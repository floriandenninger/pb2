package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpw implements afrs {
    public final acpa a;
    public final acpm b;
    public final afrw c;
    public final ynn d;
    public final afqq e = new acps();
    private final aazq f;
    private final afsy g;
    private final boolean h;
    private final double i;

    public acpw(acpa acpaVar, acpm acpmVar, aazq aazqVar, afsy afsyVar, ynn ynnVar, afrw afrwVar) {
        acpaVar.getClass();
        this.a = acpaVar;
        aazqVar.getClass();
        this.f = aazqVar;
        acpmVar.getClass();
        this.b = acpmVar;
        afsyVar.getClass();
        this.g = afsyVar;
        afrwVar.getClass();
        this.c = afrwVar;
        ynnVar.getClass();
        this.d = ynnVar;
        this.h = afrwVar.h();
        this.i = afrwVar.a();
    }

    private final void d(String str, Exception exc) {
        if (exc != null) {
            zga.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            if (this.h) {
                afsi.d(1, 12, str.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(str) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.i);
                return;
            }
            return;
        }
        zga.c("GEL_DELAYED_EVENT_DEBUG", str);
        if (this.h) {
            afsi.e(1, 12, str.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.i);
        }
    }

    @Override // defpackage.afrs
    public final afqq a() {
        return this.e;
    }

    @Override // defpackage.afrs
    public final String b() {
        return "event_logging_fixed_batch_retry";
    }

    @Override // defpackage.afrs
    public final void c(String str, afrm afrmVar, List list) {
        afsx d = this.g.d(str);
        if (d == null) {
            d = afsw.a;
            d("Cannot resolve Identity from identityId in EventLoggingRequestRetryDelayedEventDispatcher. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        afsg afsgVar = afrmVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aone aoneVar = (aone) it.next();
            aone createBuilder = arpr.a.createBuilder();
            try {
                createBuilder.m22mergeFrom(((ovz) aoneVar.instance).e, aomw.b());
                aazp a = this.f.a(d, adyu.D(afsgVar, this.g), afsgVar.b);
                arpr arprVar = (arpr) createBuilder.build();
                if (arprVar.f.size() != 0) {
                    a.d = arprVar.f;
                }
                if ((arprVar.b & 4) != 0) {
                    arpv arpvVar = arprVar.e;
                    if (arpvVar == null) {
                        arpvVar = arpv.a;
                    }
                    a.a = arpvVar.c;
                    arpv arpvVar2 = arprVar.e;
                    if (arpvVar2 == null) {
                        arpvVar2 = arpv.a;
                    }
                    a.b = arpvVar2.d;
                }
                if (!a.d()) {
                    this.f.b(a, new acpv(this, aoneVar, d));
                }
            } catch (aoob e) {
                d("EventLoggingRequestRetryDelayedEventDispatcher.dispatchEvents() could not deserialize EventLoggingRequest", e);
            }
        }
    }
}
