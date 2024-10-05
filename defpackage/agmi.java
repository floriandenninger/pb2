package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmi implements agoy {
    private final azrw a;
    private final aais b;
    private final axzg c;

    public agmi(azrw azrwVar, aais aaisVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = aaisVar;
        this.c = axzgVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        String g = aalt.g(atpqVar.d);
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i != 1) {
            if (i == 2) {
                agmm e = ((agof) this.a.get()).a().e();
                if (e == null) {
                    return anaf.O(agou.b);
                }
                agmm.x(e.l(g));
                return anaf.O(agou.a);
            }
            return anaf.O(agou.c);
        }
        atpo atpoVar = atpqVar.e;
        if (atpoVar == null) {
            atpoVar = atpo.b;
        }
        aair c = this.b.c();
        agmm e2 = ((agof) this.a.get()).a().e();
        if (e2 == null) {
            return anaf.O(agou.b);
        }
        awjp awjpVar = (awjp) c.f(((astn) atpoVar.pX(astn.b)).d).g(awjp.class).X();
        if (awjpVar == null) {
            return anaf.O(agou.c);
        }
        avgg thumbnail = awjpVar.getThumbnail();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayrz.c((AtomicReference) this.c.a.a.Y(axzb.r).B().as(false).V(new lgx(atomicBoolean, 9)));
        awjp awjpVar2 = null;
        aami b = atomicBoolean.get() ? e2.b(g, new aami(thumbnail)) : null;
        if (b == null || b.a.isEmpty()) {
            try {
                e2.t(g, thumbnail);
                b = e2.d(g, new aami(thumbnail));
            } catch (IOException unused) {
                return anaf.O(agou.c);
            } catch (ExecutionException unused2) {
                return anaf.O(agou.b);
            }
        }
        aair c2 = this.b.c();
        try {
            aone builder = ((awjq) aonm.parseFrom(awjq.a, awjpVar.c(), aomw.b())).toBuilder();
            avgg e3 = b.e();
            builder.copyOnWrite();
            awjq awjqVar = (awjq) builder.instance;
            e3.getClass();
            awjqVar.j = e3;
            awjqVar.c |= 128;
            awjpVar2 = new awjn(((awjq) builder.build()).toBuilder()).a(c2);
        } catch (aoob unused3) {
            zga.b("could not parse persist YtMainVideoEntity");
        }
        if (awjpVar2 != null) {
            try {
                aajl c3 = ((aajv) c).c();
                c3.d(awjpVar2);
                c3.b().T();
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    return anaf.O(agou.b);
                }
                return anaf.O(agou.c);
            }
        }
        return anaf.O(agou.a);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        throw new UnsupportedOperationException();
    }
}
