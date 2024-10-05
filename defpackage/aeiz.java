package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeiz {
    private final aarn a;
    private final aelb b;
    private final aelw c;

    public aeiz(aarn aarnVar, aelb aelbVar, aelw aelwVar) {
        afki.a(aarnVar);
        this.a = aarnVar;
        this.b = aelbVar;
        this.c = aelwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy a(aeip aeipVar) {
        try {
            return anaf.O((arxk) aarr.c(this.b.c(aeipVar.a.I(), aeipVar.b.I(), aeipVar.c.I(), aeipVar.d), arxk.a));
        } catch (aela e) {
            this.c.c("response.decrypt", e);
            return anaf.N(e);
        } catch (IllegalArgumentException e2) {
            this.c.c("response.parse", e2);
            return anaf.N(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy b(arxk arxkVar) {
        int dv = amkq.dv(arxkVar.b);
        if (dv == 0 || dv != 2) {
            int dv2 = amkq.dv(arxkVar.b);
            if (dv2 == 0) {
                dv2 = 1;
            }
            StringBuilder sb = new StringBuilder(48);
            sb.append("Non-OK Onesie proxy status received: ");
            sb.append(dv2 - 1);
            IOException iOException = new IOException(sb.toString());
            this.c.c("response.badproxystatus", iOException);
            return anaf.N(iOException);
        }
        int i = arxkVar.c;
        if (i != 200) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Non-200 Apiary response: ");
            sb2.append(i);
            IOException iOException2 = new IOException(sb2.toString());
            this.c.c("response.badstatus", iOException2);
            return anaf.N(iOException2);
        }
        aarn aarnVar = this.a;
        byte[] I = arxkVar.e.I();
        amrp h = amru.h(arxkVar.d.size());
        for (arxi arxiVar : arxkVar.d) {
            h.h(new cnf(arxiVar.c, arxiVar.d));
        }
        cnm qk = aarnVar.qk(new cnh(200, I, false, 0L, (List) h.g()));
        Object obj = qk.a;
        if (obj != null) {
            return anaf.O((aooy) obj);
        }
        afki.a(qk.c);
        return anaf.N(qk.c);
    }
}
