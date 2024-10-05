package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acut implements Runnable {
    final /* synthetic */ acuu a;

    public acut(acuu acuuVar) {
        this.a = acuuVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        String str = acuu.a;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("Could not get available Media Routes for starting background playback: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }

    public final void b(List list, acvd acvdVar) {
        bpv bpvVar;
        String str = acvdVar.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bpvVar = null;
                break;
            } else {
                bpvVar = (bpv) it.next();
                if (adeg.c(str, bpvVar.c)) {
                    break;
                }
            }
        }
        if (bpvVar == null) {
            this.a.e.postDelayed(this, 300L);
            return;
        }
        if (!str.equals(bpvVar.c)) {
            String str2 = acuu.a;
            String.format("routeId mismatch: requested=%s matched=%s", str, bpvVar.c);
        }
        acuu acuuVar = this.a;
        acuuVar.h.i(acuuVar.s);
        if (((Boolean) this.a.j.get()).booleanValue()) {
            this.a.c(1);
        } else {
            if (this.a.c.M(bpvVar, acvdVar.d)) {
                return;
            }
            zga.c(acuu.a, "failed selecting route");
            this.a.c(2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final acvd acvdVar = this.a.n;
        if (acvdVar == null) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(acvdVar.c);
        long c = this.a.f.c();
        acuu acuuVar = this.a;
        if (c - acuuVar.o >= millis) {
            zga.m(acuu.a, "timed out waiting for device");
            this.a.c(0);
        } else if (acuuVar.m.N) {
            ynm.k(acuuVar.d.b(), this.a.l, abbr.j, new ynl() { // from class: acus
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    acut.this.b((List) obj, acvdVar);
                }
            });
        } else {
            b(acuuVar.d.a(), acvdVar);
        }
    }
}
