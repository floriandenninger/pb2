package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aknb implements akmu {
    public final ysy a;
    public atmk c = atmk.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
    public final azqv b = azqv.ap();
    private final amnv d = amkq.x(new amnv() { // from class: akmz
        @Override // defpackage.amnv
        public final Object get() {
            return aknb.this.b.n().G().l(500L, TimeUnit.MILLISECONDS).y();
        }
    });

    public aknb(aypn aypnVar, ysy ysyVar, Executor executor, ynx ynxVar) {
        this.a = ysyVar;
        if (ynxVar.d().j) {
            aypnVar.E(azre.b(executor)).X(new ayrs() { // from class: akna
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    aknb aknbVar = aknb.this;
                    atmk atmkVar = (atmk) obj;
                    aknbVar.c = atmkVar;
                    azqv azqvVar = aknbVar.b;
                    akmv akmvVar = new akmv();
                    akmvVar.a(atmk.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
                    int i = 1;
                    akmvVar.b = 1;
                    akmvVar.a(atmkVar);
                    if (aknbVar.a.m()) {
                        i = 2;
                    } else if (aknbVar.a.r()) {
                        i = 3;
                    }
                    akmvVar.b = i;
                    atmk atmkVar2 = akmvVar.a;
                    if (atmkVar2 == null) {
                        StringBuilder sb = new StringBuilder();
                        if (akmvVar.a == null) {
                            sb.append(" effectiveConnectionType");
                        }
                        if (akmvVar.b == 0) {
                            sb.append(" networkTransportType");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    azqvVar.c(new akmw(atmkVar2, i));
                }
            });
        }
    }

    @Override // defpackage.akmu
    public final ammv a(aozh aozhVar, akmw akmwVar) {
        atmk atmkVar = atmk.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        int ordinal = akmwVar.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                if ((aozhVar.b & 8) != 0) {
                    return ammv.j(Integer.valueOf(aozhVar.f));
                }
            } else if (ordinal != 4) {
                if (ordinal == 5 && (aozhVar.b & 2) != 0) {
                    return ammv.j(Integer.valueOf(aozhVar.d));
                }
            } else if ((aozhVar.b & 4) != 0) {
                return ammv.j(Integer.valueOf(aozhVar.e));
            }
        } else if ((aozhVar.b & 16) != 0) {
            return ammv.j(Integer.valueOf(aozhVar.g));
        }
        return (aozhVar.b & 1) != 0 ? ammv.j(Integer.valueOf(aozhVar.c)) : amlr.a;
    }

    @Override // defpackage.akmu
    public final atmk b() {
        return this.c;
    }

    @Override // defpackage.akmu
    public final aypn c() {
        return (aypn) this.d.get();
    }
}
