package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agkd {
    public final shf a;
    private final afsy b;
    private final aais c;
    private final Executor d;

    public agkd(shf shfVar, afsy afsyVar, aais aaisVar, Executor executor) {
        this.a = shfVar;
        this.b = afsyVar;
        this.c = aaisVar;
        this.d = executor;
    }

    private final anhy c(String str) {
        return wbs.I(this.c.a(this.b.c()).f(aalt.f(aqpc.b.a(), str)).g(aqoz.class).x(zcz.i).S(amlr.a));
    }

    public final anhy a(String str) {
        if (ammx.e(str)) {
            return anaf.O(null);
        }
        return anfq.h(c(str), afyf.k, this.d);
    }

    public final anhy b(final String str) {
        if (ammx.e(str)) {
            return anaf.O(false);
        }
        return anfq.h(c(str), new amml() { // from class: agkc
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aqpd aqpdVar;
                agkd agkdVar = agkd.this;
                String str2 = str;
                ammv ammvVar = (ammv) obj;
                if (!ammvVar.h()) {
                    return false;
                }
                aqoz aqozVar = (aqoz) ammvVar.c();
                Iterator it = aqozVar.getLicenses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aqpdVar = null;
                        break;
                    }
                    aqpdVar = (aqpd) it.next();
                    if ((aqpdVar.b & 128) != 0 && aqpdVar.i.equals(str2)) {
                        break;
                    }
                }
                if (aqpdVar == null || aqpdVar.f) {
                    return false;
                }
                Instant ofEpochMilli = Instant.ofEpochMilli(agkdVar.a.c());
                if (aqozVar.getPlaybackStartSeconds().longValue() > 0) {
                    return Boolean.valueOf(ofEpochMilli.isAfter(Instant.ofEpochSecond(aqozVar.getPlaybackStartSeconds().longValue() + aqpdVar.e)));
                }
                return Boolean.valueOf(ofEpochMilli.isAfter(Instant.ofEpochSecond(aqozVar.getLicenseExpirySeconds().longValue())));
            }
        }, this.d);
    }
}
