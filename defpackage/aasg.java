package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aasg implements afvb {
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public final shf b;
    public long c = Long.MIN_VALUE;
    private final ScheduledExecutorService d;
    private final aaea e;
    private anhy f;
    private final aloh g;

    public aasg(aloh alohVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.d = scheduledExecutorService;
        this.g = alohVar;
        this.b = shfVar;
        this.e = aaeaVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        afsi.c(2, 5, "Error obtaining Spatula Header value.", th);
        zga.n("Error obtaining Spatula Header value.", th);
    }

    private final synchronized void d() {
        anhy anhyVar = this.f;
        if (anhyVar == null || anhyVar.isDone()) {
            qob a2 = qdy.a(this.g.a);
            qrd b = qre.b();
            b.a = new qes(1);
            b.c = 1520;
            anhy V = anaf.V(rwh.Y(a2.t(b.a())), 300L, TimeUnit.MILLISECONDS, this.d);
            this.f = V;
            ynm.k(V, this.d, lra.t, new ynl() { // from class: aasf
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    aasg aasgVar = aasg.this;
                    aasgVar.c = aasgVar.b.d();
                }
            });
        }
    }

    private final synchronized boolean f(Map map) {
        if (this.b.d() < a + this.c) {
            try {
                map.put("X-Goog-YTSpatula", (String) anaf.W(this.f));
                return true;
            } catch (ExecutionException e) {
                afsi.c(2, 5, "Spatula header value valid but task not done.", e);
                zga.n("Spatula header value valid but task not done.", e);
            }
        } else {
            map.put("X-Goog-YTSpatula", "");
        }
        return false;
    }

    @Override // defpackage.afvb
    public final asuq a() {
        return asuq.SPATULA_V1;
    }

    @Override // defpackage.afvb
    public final void b(Map map, afvp afvpVar) {
        atfr atfrVar = this.e.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        if (!atfrVar.e) {
            atfr atfrVar2 = this.e.a().f;
            if (atfrVar2 == null) {
                atfrVar2 = atfr.a;
            }
            if (!atfrVar2.f || !afvpVar.g().contains("/player")) {
                return;
            }
        }
        if (f(map)) {
            return;
        }
        d();
    }

    @Override // defpackage.afvb
    public final boolean e() {
        return false;
    }
}
