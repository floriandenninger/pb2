package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmq implements agtv {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    private final shf b;
    private final SharedPreferences c;
    private final agmu d;
    private final azrw e;
    private final Map f = new HashMap();
    private final Set g;

    public agmq(shf shfVar, SharedPreferences sharedPreferences, agmu agmuVar, azrw azrwVar, Set set) {
        this.b = shfVar;
        this.c = sharedPreferences;
        this.d = agmuVar;
        this.e = azrwVar;
        this.g = set;
    }

    private static final void m(aone aoneVar, agnz agnzVar) {
        long i = agtw.i(agnzVar.g);
        long j = agtw.j(agnzVar.g);
        aoneVar.copyOnWrite();
        atqv atqvVar = (atqv) aoneVar.instance;
        atqv atqvVar2 = atqv.a;
        atqvVar.b |= 4096;
        atqvVar.o = i / 1024;
        aoneVar.copyOnWrite();
        atqv atqvVar3 = (atqv) aoneVar.instance;
        atqvVar3.b |= 2048;
        atqvVar3.n = j / 1024;
    }

    @Override // defpackage.agtv
    public final void a(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void b(agnz agnzVar) {
        if (aedn.J(agnzVar.f)) {
            aone K = aedn.K(agnzVar);
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.h = 12;
            atqvVar.b |= 16;
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar3 = (atqv) K.instance;
            atqvVar3.c |= 64;
            atqvVar3.A = z;
            K.copyOnWrite();
            atqv atqvVar4 = (atqv) K.instance;
            atqvVar4.g = 8;
            atqvVar4.b = 8 | atqvVar4.b;
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void c() {
    }

    @Override // defpackage.agtv
    public final void d(agnz agnzVar) {
        if (aedn.J(agnzVar.f)) {
            aone K = aedn.K(agnzVar);
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.h = 5;
            atqvVar.b |= 16;
            K.copyOnWrite();
            atqv atqvVar3 = (atqv) K.instance;
            atqvVar3.b |= 8388608;
            atqvVar3.v = aedn.I(128);
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar4 = (atqv) K.instance;
            atqvVar4.c |= 64;
            atqvVar4.A = z;
            K.copyOnWrite();
            atqv atqvVar5 = (atqv) K.instance;
            atqvVar5.g = 9;
            atqvVar5.b |= 8;
            amxd listIterator = ((amvs) this.g).listIterator();
            while (listIterator.hasNext()) {
                ((agmt) listIterator.next()).c();
            }
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void e(agnz agnzVar) {
        if (aedn.J(agnzVar.f)) {
            String s = agtw.s(agnzVar.f);
            if (TextUtils.isEmpty(s)) {
                return;
            }
            if (!this.f.containsKey(s) || this.b.c() - ((Long) this.f.get(s)).longValue() >= a) {
                aone K = aedn.K(agnzVar);
                K.copyOnWrite();
                atqv atqvVar = (atqv) K.instance;
                atqv atqvVar2 = atqv.a;
                atqvVar.h = 9;
                atqvVar.b |= 16;
                this.d.c((atqv) K.build());
                this.f.put(s, Long.valueOf(this.b.c()));
            }
        }
    }

    @Override // defpackage.agtv
    public final void f(agnz agnzVar) {
        if (aedn.J(agnzVar.f) && (agnzVar.c & 512) == 0) {
            aone K = aedn.K(agnzVar);
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.h = 5;
            atqvVar.b |= 16;
            int i = agnzVar.c;
            K.copyOnWrite();
            atqv atqvVar3 = (atqv) K.instance;
            atqvVar3.b |= 8388608;
            atqvVar3.v = aedn.I(i);
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar4 = (atqv) K.instance;
            atqvVar4.c |= 64;
            atqvVar4.A = z;
            K.copyOnWrite();
            atqv atqvVar5 = (atqv) K.instance;
            atqvVar5.g = 9;
            atqvVar5.b |= 8;
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void g() {
    }

    @Override // defpackage.agtv
    public final void h(agnz agnzVar) {
        if (aedn.J(agnzVar.f)) {
            aone K = aedn.K(agnzVar);
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.g = 2;
            atqvVar.b |= 8;
            K.copyOnWrite();
            atqv atqvVar3 = (atqv) K.instance;
            atqvVar3.b |= 8388608;
            atqvVar3.v = aedn.I(64);
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar4 = (atqv) K.instance;
            atqvVar4.c = 64 | atqvVar4.c;
            atqvVar4.A = z;
            amxd listIterator = ((amvs) this.g).listIterator();
            while (listIterator.hasNext()) {
                ((agmt) listIterator.next()).d();
            }
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void i(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void j(agnz agnzVar) {
        if (aedn.J(agnzVar.f)) {
            aone K = aedn.K(agnzVar);
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.g = 5;
            atqvVar.b |= 8;
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar3 = (atqv) K.instance;
            atqvVar3.c |= 64;
            atqvVar3.A = z;
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void k(agnz agnzVar, atqs atqsVar, agnf agnfVar) {
        if (agnzVar.b == avjo.TRANSFER_STATE_COMPLETE) {
            this.c.edit().putLong(yny.L("%s_offline_download_success", ((agof) this.e.get()).d()), this.b.c()).apply();
        }
        if (aedn.J(agnzVar.f)) {
            aone K = aedn.K(agnzVar);
            boolean z = ahac.a;
            K.copyOnWrite();
            atqv atqvVar = (atqv) K.instance;
            atqv atqvVar2 = atqv.a;
            atqvVar.c |= 64;
            atqvVar.A = z;
            int ordinal = agnzVar.b.ordinal();
            if (ordinal == 3) {
                K.copyOnWrite();
                atqv atqvVar3 = (atqv) K.instance;
                atqvVar3.h = 2;
                atqvVar3.b |= 16;
                K.copyOnWrite();
                atqv atqvVar4 = (atqv) K.instance;
                atqvVar4.g = 4;
                atqvVar4.b |= 8;
                amxd listIterator = ((amvs) this.g).listIterator();
                while (listIterator.hasNext()) {
                    ((agmt) listIterator.next()).e();
                }
                this.d.c((atqv) K.build());
                return;
            }
            if (ordinal != 5) {
                if (ordinal != 6) {
                    return;
                }
                K.copyOnWrite();
                atqv atqvVar5 = (atqv) K.instance;
                atqvVar5.h = 4;
                atqvVar5.b |= 16;
                K.copyOnWrite();
                atqv atqvVar6 = (atqv) K.instance;
                atqvVar6.g = 6;
                atqvVar6.b |= 8;
                m(K, agnzVar);
                amxd listIterator2 = ((amvs) this.g).listIterator();
                while (listIterator2.hasNext()) {
                    ((agmt) listIterator2.next()).a();
                }
                this.d.c((atqv) K.build());
                return;
            }
            K.copyOnWrite();
            atqv atqvVar7 = (atqv) K.instance;
            atqvVar7.h = 6;
            atqvVar7.b |= 16;
            K.copyOnWrite();
            atqv atqvVar8 = (atqv) K.instance;
            atqvVar8.i = atqsVar.H;
            atqvVar8.b |= 32;
            K.copyOnWrite();
            atqv atqvVar9 = (atqv) K.instance;
            atqvVar9.g = 7;
            atqvVar9.b |= 8;
            m(K, agnzVar);
            amxd listIterator3 = ((amvs) this.g).listIterator();
            while (listIterator3.hasNext()) {
                ((agmt) listIterator3.next()).b();
            }
            this.d.c((atqv) K.build());
        }
    }

    @Override // defpackage.agtv
    public final void l(agnz agnzVar) {
    }
}
