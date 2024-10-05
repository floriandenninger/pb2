package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abvt {
    private static abvt l;
    public ScheduledExecutorService a;
    public acpl b;
    public boolean c;
    public shf d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int j = 1;
    public int k = 1;
    public final Map i = new HashMap();

    private abvt() {
    }

    public static abvt b() {
        if (l == null) {
            l = new abvt();
        }
        return l;
    }

    public static arpp c(Object obj) {
        arpn a = arpp.a();
        if (obj instanceof asrs) {
            a.copyOnWrite();
            ((arpp) a.instance).cM((asru) ((asrs) obj).build());
            return (arpp) a.build();
        }
        if (obj instanceof asrw) {
            a.copyOnWrite();
            ((arpp) a.instance).cN((asrx) ((asrw) obj).build());
            return (arpp) a.build();
        }
        if (obj instanceof asry) {
            a.copyOnWrite();
            ((arpp) a.instance).cO((asrz) ((asry) obj).build());
            return (arpp) a.build();
        }
        if (obj instanceof assa) {
            a.copyOnWrite();
            ((arpp) a.instance).cP((assb) ((assa) obj).build());
            return (arpp) a.build();
        }
        if (obj instanceof asse) {
            a.copyOnWrite();
            ((arpp) a.instance).cR((assg) ((asse) obj).build());
            return (arpp) a.build();
        }
        if (!(obj instanceof assc)) {
            return null;
        }
        a.copyOnWrite();
        ((arpp) a.instance).cQ((assd) ((assc) obj).build());
        return (arpp) a.build();
    }

    public static Object e(Class cls, asrv asrvVar) {
        if (cls.equals(asru.class)) {
            asrs asrsVar = (asrs) asru.a.createBuilder();
            asrsVar.copyOnWrite();
            asru asruVar = (asru) asrsVar.instance;
            asrvVar.getClass();
            asruVar.c = asrvVar;
            asruVar.b |= 1;
            return asrsVar;
        }
        if (cls.equals(asrx.class)) {
            asrw asrwVar = (asrw) asrx.a.createBuilder();
            asrwVar.copyOnWrite();
            asrx asrxVar = (asrx) asrwVar.instance;
            asrvVar.getClass();
            asrxVar.c = asrvVar;
            asrxVar.b |= 1;
            return asrwVar;
        }
        if (cls.equals(asrz.class)) {
            asry asryVar = (asry) asrz.a.createBuilder();
            asryVar.copyOnWrite();
            asrz asrzVar = (asrz) asryVar.instance;
            asrvVar.getClass();
            asrzVar.c = asrvVar;
            asrzVar.b |= 1;
            return asryVar;
        }
        if (cls.equals(assb.class)) {
            assa assaVar = (assa) assb.a.createBuilder();
            assaVar.copyOnWrite();
            assb assbVar = (assb) assaVar.instance;
            asrvVar.getClass();
            assbVar.c = asrvVar;
            assbVar.b |= 1;
            return assaVar;
        }
        if (cls.equals(assg.class)) {
            asse asseVar = (asse) assg.a.createBuilder();
            asseVar.copyOnWrite();
            assg assgVar = (assg) asseVar.instance;
            asrvVar.getClass();
            assgVar.c = asrvVar;
            assgVar.b |= 1;
            return asseVar;
        }
        if (!cls.equals(assd.class)) {
            return null;
        }
        assc asscVar = (assc) assd.a.createBuilder();
        asscVar.copyOnWrite();
        assd assdVar = (assd) asscVar.instance;
        asrvVar.getClass();
        assdVar.c = asrvVar;
        assdVar.b |= 1;
        return asscVar;
    }

    public final abvs a(Class cls) {
        abvs abvsVar;
        synchronized (this.i) {
            if (!this.i.containsKey(cls)) {
                this.i.put(cls, new abvs());
            }
            abvsVar = (abvs) this.i.get(cls);
        }
        return abvsVar;
    }

    public final asrv d(abvs abvsVar) {
        abvsVar.getClass();
        long c = this.d.c();
        aone createBuilder = asrv.a.createBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            String str = this.e;
            createBuilder.copyOnWrite();
            asrv asrvVar = (asrv) createBuilder.instance;
            str.getClass();
            asrvVar.b |= 1;
            asrvVar.c = str;
        }
        int i = this.j;
        createBuilder.copyOnWrite();
        asrv asrvVar2 = (asrv) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        asrvVar2.i = i2;
        asrvVar2.b |= 128;
        createBuilder.copyOnWrite();
        asrv asrvVar3 = (asrv) createBuilder.instance;
        asrvVar3.b |= 64;
        asrvVar3.h = true;
        boolean z = this.f;
        createBuilder.copyOnWrite();
        asrv asrvVar4 = (asrv) createBuilder.instance;
        asrvVar4.b |= 16;
        asrvVar4.f = z;
        boolean z2 = this.g;
        createBuilder.copyOnWrite();
        asrv asrvVar5 = (asrv) createBuilder.instance;
        asrvVar5.b |= 32;
        asrvVar5.g = z2;
        int i3 = this.k;
        createBuilder.copyOnWrite();
        asrv asrvVar6 = (asrv) createBuilder.instance;
        int i4 = i3 - 1;
        if (i3 != 0) {
            asrvVar6.j = i4;
            asrvVar6.b |= 1024;
            long j = abvsVar.d;
            createBuilder.copyOnWrite();
            asrv asrvVar7 = (asrv) createBuilder.instance;
            asrvVar7.b |= 4;
            asrvVar7.d = j;
            createBuilder.copyOnWrite();
            asrv asrvVar8 = (asrv) createBuilder.instance;
            asrvVar8.b |= 8;
            asrvVar8.e = c;
            boolean z3 = this.h;
            createBuilder.copyOnWrite();
            asrv asrvVar9 = (asrv) createBuilder.instance;
            asrvVar9.b |= 2048;
            asrvVar9.k = z3;
            abvsVar.d = c;
            return (asrv) createBuilder.build();
        }
        throw null;
    }

    public final void f(Class cls, Class cls2, abvr abvrVar) {
        abvs a = a(cls);
        synchronized (this.i) {
            a.b.put(cls2, abvrVar);
        }
    }

    public final void g() {
        this.e = null;
        this.k = 1;
        this.j = 1;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    public final void h(Object obj) {
        arpp c;
        if (this.c && (c = c(obj)) != null) {
            String valueOf = String.valueOf(obj.toString());
            if (valueOf.length() != 0) {
                "LiveCreationMetricsLogger:: ".concat(valueOf);
            }
            this.b.c(c);
        }
    }

    public final void i(Class cls) {
        if (this.c) {
            abvs a = a(cls);
            if (a.e) {
                Object e = e(cls, d(a));
                synchronized (this.i) {
                    Iterator it = a.b.entrySet().iterator();
                    while (it.hasNext()) {
                        abvr abvrVar = (abvr) ((Map.Entry) it.next()).getValue();
                        if (abvrVar != null) {
                            abvrVar.a(e);
                        }
                    }
                }
                String valueOf = String.valueOf(e.toString());
                if (valueOf.length() != 0) {
                    "LiveCreationMetricsLogger:: ".concat(valueOf);
                }
                this.b.c(c(e));
            }
        }
    }

    public final void j(Class cls, long j) {
        abvs a = a(cls);
        a.e = true;
        a.c = j;
        l(cls, a);
    }

    public final void k(Class cls) {
        abvs a = a(cls);
        a.e = false;
        Future future = a.a;
        if (future != null) {
            future.cancel(false);
            a.a = null;
        }
    }

    public final void l(final Class cls, abvs abvsVar) {
        Future future;
        if (this.c) {
            if (abvsVar.c > 0 && abvsVar.e && abvsVar.a == null) {
                ScheduledExecutorService scheduledExecutorService = this.a;
                Runnable runnable = new Runnable() { // from class: abvq
                    @Override // java.lang.Runnable
                    public final void run() {
                        abvt.this.i(cls);
                    }
                };
                long j = abvsVar.c;
                abvsVar.a = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            if (abvsVar.c > 0 || (future = abvsVar.a) == null) {
                return;
            }
            future.cancel(false);
            abvsVar.a = null;
        }
    }

    public final void m(int i) {
        abvs a = a(assd.class);
        if (a.e && this.c) {
            assc asscVar = (assc) e(assd.class, d(a));
            if (asscVar == null) {
                zga.b("Could not create stage metric");
                return;
            }
            asscVar.copyOnWrite();
            assd assdVar = (assd) asscVar.instance;
            assd assdVar2 = assd.a;
            assdVar.d = i - 1;
            assdVar.b |= 2;
            h(asscVar);
        }
    }

    public final void n(int i, int i2, cnq cnqVar) {
        cnh cnhVar;
        abvs a = a(asrz.class);
        if (a.e && this.c) {
            asry asryVar = (asry) e(asrz.class, d(a));
            asryVar.copyOnWrite();
            asrz asrzVar = (asrz) asryVar.instance;
            asrz asrzVar2 = asrz.a;
            asrzVar.d = i - 1;
            asrzVar.b |= 2;
            asryVar.copyOnWrite();
            asrz asrzVar3 = (asrz) asryVar.instance;
            asrzVar3.e = i2 - 1;
            asrzVar3.b |= 4;
            if (cnqVar != null && (cnhVar = cnqVar.b) != null) {
                int i3 = cnhVar.a;
                asryVar.copyOnWrite();
                asrz asrzVar4 = (asrz) asryVar.instance;
                asrzVar4.b |= 8;
                asrzVar4.f = i3;
            }
            h(asryVar);
        }
    }
}
