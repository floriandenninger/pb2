package defpackage;

import io.grpc.Status;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykm implements Runnable {
    final /* synthetic */ ayco a;
    final /* synthetic */ aycm b;

    public aykm(aycm aycmVar, ayco aycoVar) {
        this.b = aycmVar;
        this.a = aycoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aylg aylgVar;
        Status status;
        Object obj;
        ayco aycoVar = this.a;
        List list = aycoVar.a;
        this.b.c.G.b(1, "Resolved address: {0}, config={1}", list, aycoVar.b);
        aykx aykxVar = this.b.c;
        if (aykxVar.S != 2) {
            aykxVar.G.b(2, "Address resolved: {0}", list);
            this.b.c.S = 2;
        }
        this.b.c.T = null;
        ayco aycoVar2 = this.a;
        ayck ayckVar = aycoVar2.c;
        ayba aybaVar = (ayba) aycoVar2.b.c(ayba.a);
        aylg aylgVar2 = (ayckVar == null || (obj = ayckVar.b) == null) ? null : (aylg) obj;
        Status status2 = ayckVar != null ? ayckVar.a : null;
        aykx aykxVar2 = this.b.c;
        if (!aykxVar2.L) {
            if (aylgVar2 != null) {
                aykxVar2.G.a(2, "Service config from name resolver discarded by channel settings");
            }
            aylgVar = aykx.f;
            if (aybaVar != null) {
                this.b.c.G.a(2, "Config selector from name resolver discarded by channel settings");
            }
            this.b.c.I.d(aylgVar.a());
        } else {
            if (aylgVar2 != null) {
                if (aybaVar != null) {
                    aykxVar2.I.d(aybaVar);
                    if (aylgVar2.a() != null) {
                        this.b.c.G.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    aykxVar2.I.d(aylgVar2.a());
                }
            } else if (status2 == null) {
                aylgVar2 = aykx.f;
                this.b.c.I.d(null);
            } else {
                if (!aykxVar2.K) {
                    aykxVar2.G.a(2, "Fallback to error due to invalid first service config without default config");
                    this.b.b(ayckVar.a);
                    return;
                }
                aylgVar2 = aykxVar2.f141J;
            }
            if (!aylgVar2.equals(this.b.c.f141J)) {
                axzq axzqVar = this.b.c.G;
                Object[] objArr = new Object[1];
                objArr[0] = aylgVar2 == aykx.f ? " to empty" : "";
                axzqVar.b(2, "Service config changed{0}", objArr);
                this.b.c.f141J = aylgVar2;
            }
            try {
                this.b.c.K = true;
            } catch (RuntimeException e) {
                Logger logger = aykx.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.b.c.i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), (Throwable) e);
            }
            aylgVar = aylgVar2;
        }
        axzj axzjVar = this.a.b;
        aycm aycmVar = this.b;
        if (aycmVar.a == aycmVar.c.s) {
            axzh b = axzjVar.b();
            axzi axziVar = ayba.a;
            if (b.a.b.containsKey(axziVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(b.a.b);
                identityHashMap.remove(axziVar);
                b.a = new axzj(identityHashMap);
            }
            Map map = b.b;
            if (map != null) {
                map.remove(axziVar);
            }
            Map map2 = aylgVar.c;
            if (map2 != null) {
                b.b(aybs.a, map2);
                b.a();
            }
            ayfk ayfkVar = this.b.a.a;
            aybo a = aybp.a();
            a.a = list;
            a.b = b.a();
            a.c = aylgVar.b;
            aybp a2 = a.a();
            List list2 = a2.a;
            axzj axzjVar2 = a2.b;
            aynt ayntVar = (aynt) a2.c;
            if (ayntVar == null) {
                try {
                    ayfp ayfpVar = ayfkVar.d;
                    String str = ayfpVar.b;
                    aybt a3 = ayfpVar.a.a(str);
                    if (a3 == null) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Trying to load '");
                        sb2.append(str);
                        sb2.append("' because ");
                        sb2.append("using default policy");
                        sb2.append(", but it's unavailable");
                        throw new ayfo(sb2.toString());
                    }
                    ayntVar = new aynt(a3, null);
                } catch (ayfo e2) {
                    ayfkVar.a.b(ayae.TRANSIENT_FAILURE, new ayfm(Status.n.withDescription(e2.getMessage())));
                    ayfkVar.b.c();
                    ayfkVar.c = null;
                    ayfkVar.b = new ayfn();
                    status = Status.b;
                }
            }
            if (ayfkVar.c == null || !ayntVar.a.b().equals(ayfkVar.c.b())) {
                ayfkVar.a.b(ayae.CONNECTING, new ayfl());
                ayfkVar.b.c();
                ayfkVar.c = ayntVar.a;
                aybs aybsVar = ayfkVar.b;
                ayfkVar.b = ayfkVar.c.a(ayfkVar.a);
                ayfkVar.a.a().b(2, "Load balancer changed from {0} to {1}", aybsVar.getClass().getSimpleName(), ayfkVar.b.getClass().getSimpleName());
            }
            Object obj2 = ayntVar.b;
            if (obj2 != null) {
                ayfkVar.a.a().b(1, "Load-balancing config: {0}", ayntVar.b);
            }
            aybs aybsVar2 = ayfkVar.b;
            if (a2.a.isEmpty()) {
                Status status3 = Status.o;
                String valueOf2 = String.valueOf(list2);
                String valueOf3 = String.valueOf(axzjVar2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 55 + String.valueOf(valueOf3).length());
                sb3.append("NameResolver returned no usable address. addrs=");
                sb3.append(valueOf2);
                sb3.append(", attrs=");
                sb3.append(valueOf3);
                status = status3.withDescription(sb3.toString());
            } else {
                aybo a4 = aybp.a();
                a4.a = a2.a;
                a4.b = axzjVar2;
                a4.c = obj2;
                aybsVar2.b(a4.a());
                status = Status.b;
            }
            if (status.f()) {
                return;
            }
            aycm aycmVar2 = this.b;
            String valueOf4 = String.valueOf(aycmVar2.b);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
            sb4.append(valueOf4);
            sb4.append(" was used");
            aycmVar2.a(status.a(sb4.toString()));
        }
    }
}
