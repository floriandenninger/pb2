package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agos implements ypd {
    static final long a = TimeUnit.MINUTES.toSeconds(15);
    static final long b = TimeUnit.HOURS.toSeconds(6);
    public static final /* synthetic */ int k = 0;
    public final azrw c;
    public final azrw d;
    public final shf e;
    public final azrw f;
    public final afsy g;
    public final ExecutorService h;
    public final ypa i;
    ayqx j;
    private final azrw l;
    private final ylf m;

    public agos(azrw azrwVar, azrw azrwVar2, shf shfVar, azrw azrwVar3, ylf ylfVar, afsy afsyVar, ExecutorService executorService, ypa ypaVar, azrw azrwVar4) {
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = shfVar;
        this.f = azrwVar3;
        this.m = ylfVar;
        this.g = afsyVar;
        this.h = executorService;
        this.i = ypaVar;
        this.l = azrwVar4;
    }

    private final long g(aair aairVar, long j) {
        auld auldVar;
        aajb aajbVar = (aajb) this.d.get();
        ArrayList arrayList = new ArrayList();
        whl.E(agkj.c, 5, Long.valueOf(j), aajbVar, arrayList);
        final aajc aajcVar = agkj.c;
        aajbVar.c(aajcVar);
        arrayList.add(new aaiy() { // from class: aaiu
            @Override // defpackage.aaiy
            public final void a(vin vinVar) {
                aajc aajcVar2 = aajc.this;
                vinVar.b(" ORDER BY ");
                aajcVar2.a(vinVar);
                vinVar.b(" ASC");
            }
        });
        arrayList.add(new aaiy() { // from class: aait
            @Override // defpackage.aaiy
            public final void a(vin vinVar) {
                vinVar.b(" LIMIT ?");
                vinVar.c("1");
            }
        });
        amru amruVar = (amru) aairVar.e(whl.D(aajbVar, arrayList)).X();
        if (amruVar == null || amruVar.isEmpty() || (auldVar = (auld) aairVar.f((String) amruVar.get(0)).g(auld.class).X()) == null) {
            return 0L;
        }
        return auldVar.getRefreshTime().longValue();
    }

    public final long a() {
        if (this.g.c().z()) {
            return 0L;
        }
        aair a2 = ((aais) this.c.get()).a(this.g.c());
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
        long g = g(a2, seconds);
        if (g != 0) {
            return Math.max(g - seconds, a);
        }
        if (g(a2, 0L) > 0) {
            return b;
        }
        return 0L;
    }

    public final void b() {
        if (this.g.c().z()) {
            return;
        }
        long j = ((awwj) ((agsd) this.l.get()).b.c()).e;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
        long j2 = j - seconds;
        if (j2 <= 0 || j2 >= a) {
            long a2 = a();
            if (a2 == 0) {
                return;
            }
            if (j == 0 || seconds > j || seconds + a2 + a < j) {
                c(a2);
            }
        }
    }

    public final void c(long j) {
        if (j > 0) {
            this.m.e("offline_auto_refresh_wakeup", j, true, 1, null, null, false);
            ((agsd) this.l.get()).b.b(new fjv(TimeUnit.MILLISECONDS.toSeconds(this.e.c()) + j, 14));
        }
    }

    public final void d() {
        afsx c = this.g.c();
        if (c.z() || Objects.equals(null, c)) {
            return;
        }
        e();
        this.j = ((aais) this.c.get()).a(c).g(auld.class).ab(azre.b(this.h)).ay(new ayrs() { // from class: agop
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                agos.this.b();
            }
        }, zxi.k);
    }

    public final void e() {
        Object obj = this.j;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.j = null;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            d();
            return null;
        }
        if (i == 1) {
            e();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
