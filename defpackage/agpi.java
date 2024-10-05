package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpi implements Runnable {
    public anhy a;
    private final anib b;
    private final ScheduledExecutorService c;
    private final Map d;
    private final agpd e;
    private final agoz f;
    private final shf g;

    public agpi(anib anibVar, ScheduledExecutorService scheduledExecutorService, Map map, agpd agpdVar, agoz agozVar, shf shfVar) {
        this.b = anibVar;
        this.c = scheduledExecutorService;
        this.d = map;
        this.e = agpdVar;
        this.f = agozVar;
        this.g = shfVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Problem with orchestration worker", th);
        afsi.c(2, 28, "Problem with orchestration worker", th);
    }

    private static amru c(amru amruVar) {
        amrp f = amru.f();
        for (int i = 0; i < ((amvj) amruVar).c; i++) {
            f.h(agou.c);
        }
        return f.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(final defpackage.agpg r16, final defpackage.agov r17, defpackage.agou r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpi.d(agpg, agov, agou, long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        anhy anhyVar = this.a;
        if (anhyVar == null || anhyVar.isDone()) {
            anhy submit = this.b.submit(this);
            this.a = submit;
            ynm.j(submit, angq.a, afka.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        agou agouVar;
        amru c;
        agou agouVar2;
        ammv i = ammv.i((agpg) this.e.h.get());
        if (i.h()) {
            agpg agpgVar = (agpg) i.c();
            for (agov a = agpgVar.a(); a != null; a = agpgVar.a()) {
                agoy agoyVar = (agoy) this.d.get(Integer.valueOf(a.b));
                if (agoyVar != null) {
                    amru b = agpgVar.b(a, agoyVar.a(a.c));
                    amvj amvjVar = (amvj) b;
                    if (amvjVar.c > 1) {
                        amxe it = b.iterator();
                        while (it.hasNext()) {
                            agpgVar.k((agov) it.next(), 3);
                        }
                        long d = this.g.d();
                        try {
                            afsx afsxVar = agpgVar.a;
                            amrp f = amru.f();
                            amxe it2 = b.iterator();
                            while (it2.hasNext()) {
                                f.h(((agov) it2.next()).c);
                            }
                            c = (amru) ((anhv) agoyVar.c(afsxVar, f.g())).b;
                        } catch (SQLiteException | InterruptedException | ExecutionException unused) {
                            c = c(b);
                        } catch (RuntimeException e) {
                            zga.d("Problem with a controller", e);
                            c = c(b);
                        }
                        long d2 = this.g.d() - d;
                        long c2 = this.g.c();
                        if (amvjVar.c != c.size()) {
                            int i2 = ((agov) b.get(0)).b;
                            StringBuilder sb = new StringBuilder(63);
                            sb.append("BatchedResult size does not match actions for type: ");
                            sb.append(i2);
                            zga.l(sb.toString());
                        }
                        amxe it3 = b.iterator();
                        Iterator it4 = c.iterator();
                        while (it3.hasNext()) {
                            agov agovVar = (agov) it3.next();
                            if (it4.hasNext()) {
                                agouVar2 = (agou) it4.next();
                            } else {
                                agouVar2 = agou.b;
                            }
                            d(agpgVar, agovVar, agouVar2, d2, c2);
                        }
                    } else {
                        agpgVar.k(a, 3);
                        long d3 = this.g.d();
                        try {
                            agouVar = (agou) agoyVar.b(agpgVar.a, a.c).get();
                        } catch (SQLiteException | InterruptedException | ExecutionException unused2) {
                            agouVar = agou.c;
                        } catch (RuntimeException e2) {
                            zga.d("Problem with a controller", e2);
                            agouVar = agou.c;
                        }
                        d(agpgVar, a, agouVar, this.g.d() - d3, this.g.c());
                    }
                }
            }
        }
    }
}
