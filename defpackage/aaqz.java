package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqz {
    public volatile boolean a;
    private final Set b;

    public aaqz(Set set, aaea aaeaVar) {
        this.b = set;
        if (aaeaVar != null) {
            aaeaVar.a.ax(new ayrs() { // from class: aaqx
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    aaqz aaqzVar = aaqz.this;
                    atfr atfrVar = ((arfd) obj).f;
                    if (atfrVar == null) {
                        atfrVar = atfr.a;
                    }
                    aaqzVar.a = atfrVar.g;
                }
            });
        }
    }

    private static final String c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public final void a(afsx afsxVar, aqzg aqzgVar, arnd arndVar) {
        for (aaqy aaqyVar : this.b) {
            try {
                String.format("[TRANSPORT] About to process packet with %s", c(aaqyVar));
                aaqyVar.b(afsxVar, aqzgVar, arndVar == null ? arnd.a : arndVar);
            } catch (Throwable th) {
                if (th.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                } else {
                    zga.d("Exception processing framework update.", th);
                    afsi.c(2, 5, "Exception processing framework update.", th);
                }
            }
        }
    }

    public final void b(afsx afsxVar, aooy aooyVar, byte[] bArr, amnv amnvVar) {
        aomf F;
        aqzg aqzgVar;
        if (this.b.isEmpty()) {
            return;
        }
        String.format("[TRANSPORT] About to route transport proto for %s type.", c(aooyVar));
        if (this.a) {
            F = yny.G(bArr, 777);
        } else {
            F = yny.F(aomf.x(bArr), 777);
        }
        if (F == null) {
            String.format("[TRANSPORT] No transport packet to process on on field 777 %s", c(aooyVar));
            return;
        }
        try {
            aqzgVar = (aqzg) aonm.parseFrom(aqzg.a, F, aomw.b());
        } catch (aoob e) {
            zga.d("[TRANSPORT] Field 777 failed to parse", e);
            aqzgVar = null;
        }
        a(afsxVar, aqzgVar, (arnd) amnvVar.get());
    }
}
