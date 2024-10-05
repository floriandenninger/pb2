package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwa implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final /* synthetic */ int p;

    public adwa(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, int i) {
        this.p = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
        this.l = azrwVar12;
        this.m = azrwVar13;
        this.n = azrwVar14;
        this.o = azrwVar15;
    }

    public adwa(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, int i, byte[] bArr) {
        this.p = i;
        this.c = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.g = azrwVar4;
        this.m = azrwVar5;
        this.i = azrwVar6;
        this.d = azrwVar7;
        this.n = azrwVar8;
        this.a = azrwVar9;
        this.b = azrwVar10;
        this.j = azrwVar11;
        this.o = azrwVar12;
        this.h = azrwVar13;
        this.l = azrwVar14;
        this.k = azrwVar15;
    }

    public static adwa a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15) {
        return new adwa(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, 0);
    }

    public static tlk b(Context context, anib anibVar, amru amruVar, tmh tmhVar, vcw vcwVar, ttw ttwVar, ammv ammvVar, amnv amnvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, vfg vfgVar, ammv ammvVar6, ammv ammvVar7) {
        tss ttbVar;
        final tln tlnVar = new tln();
        tlnVar.b = context.getApplicationContext();
        anibVar.getClass();
        tlnVar.c = anibVar;
        tlnVar.d.addAll(amruVar);
        tlnVar.e = ammv.i(tmhVar);
        tlnVar.f = vcwVar;
        tlnVar.g = ttwVar;
        tlnVar.h = ammvVar;
        tlnVar.i = amnvVar;
        tlnVar.k = ammvVar2;
        tlnVar.l = ammvVar3;
        tlnVar.m = ammvVar4;
        tlnVar.n = ammvVar5;
        tlnVar.o = ammvVar6;
        tlnVar.j = vfgVar;
        tlnVar.p = ammvVar7;
        tlnVar.b.getClass();
        tlnVar.e.getClass();
        tlnVar.f.getClass();
        tlnVar.j.getClass();
        tlnVar.g.getClass();
        tlnVar.h.getClass();
        tlnVar.i.getClass();
        Executor E = anaf.E(tlnVar.c);
        if (tlnVar.l.h()) {
            anaf.Y(anaf.T(new anfy() { // from class: tll
                @Override // defpackage.anfy
                public final anhy a() {
                    return ((tkc) tln.this.l.c()).a();
                }
            }, E), new sfi(3), angq.a);
        }
        if (tlnVar.o.h()) {
            tlnVar.g.b = tlnVar.o;
        }
        tlnVar.a.a = new trp(tlnVar.b);
        tlnVar.a.c = new tru(E);
        tlnVar.a.b = new trs(tlnVar.k, tlnVar.i);
        tko tkoVar = (tko) tlnVar.p.e(new tlm());
        if (tlnVar.m.h()) {
            ttbVar = new tsz(tlnVar.b, (aafr) tlnVar.m.c());
        } else {
            ttbVar = new ttb();
        }
        tlnVar.q = ammv.j(new rwh(tlnVar.b));
        tlnVar.a.d = new trx(tlnVar.f, tlnVar.g, ttbVar, tlnVar.h, tlnVar.n, tlnVar.o, tlnVar.r, tlnVar.q, tkoVar);
        tlnVar.a.e = new tsb(tlnVar.c, tlnVar.j);
        trr trrVar = tlnVar.a;
        ayaw.j(trrVar.a, trp.class);
        ayaw.j(trrVar.b, trs.class);
        ayaw.j(trrVar.c, tru.class);
        ayaw.j(trrVar.d, trx.class);
        ayaw.j(trrVar.e, tsb.class);
        tse tseVar = new tse(trrVar.a, trrVar.b, trrVar.c, trrVar.d, trrVar.e);
        tlnVar.b.getApplicationContext();
        anaf.E(E);
        if (tlnVar.h.h()) {
            ammv.j((ttr) tlnVar.h.c());
        }
        new HashMap();
        Context context2 = tlnVar.b;
        tss tssVar = (tss) tseVar.b.get();
        Context b = trq.b(tseVar.a);
        tss tssVar2 = (tss) tseVar.b.get();
        trf b2 = tseVar.b();
        trh trhVar = (trh) tseVar.h.get();
        tov a = tseVar.a();
        tow towVar = (tow) tseVar.j.get();
        tnj tnjVar = new tnj(trq.b(tseVar.a), (tow) tseVar.j.get(), tseVar.b(), (trh) tseVar.h.get(), (tss) tseVar.b.get(), (shf) tseVar.i.get(), (vcw) tseVar.f.get(), (ammv) tseVar.d.get(), (tme) tseVar.c.get(), (Executor) tseVar.g.get(), (tko) tseVar.e.get());
        tme tmeVar = (tme) tseVar.c.get();
        tth tthVar = new tth(trq.b(tseVar.a), (tow) tseVar.j.get(), tseVar.b(), (vcw) tseVar.f.get(), (tss) tseVar.b.get(), (tme) tseVar.c.get(), (ammv) tseVar.d.get(), (Executor) tseVar.g.get(), (tko) tseVar.e.get());
        tsw tswVar = new tsw(tseVar.a(), (tow) tseVar.j.get(), (tss) tseVar.b.get(), (Executor) tseVar.g.get(), (tko) tseVar.e.get());
        tta ttaVar = new tta(trq.b(tseVar.a), (tss) tseVar.b.get(), (ammv) tseVar.d.get(), (tko) tseVar.e.get());
        ammv ammvVar8 = (ammv) tseVar.d.get();
        Executor executor = (Executor) tseVar.g.get();
        ammv ammvVar9 = (ammv) tseVar.k.get();
        tko tkoVar2 = (tko) tseVar.e.get();
        return new tmd(context2, tssVar, new tqd(b, tssVar2, b2, trhVar, a, towVar, tnjVar, tmeVar, tthVar, tswVar, ttaVar, ammvVar8, executor, ammvVar9, tkoVar2), E, tlnVar.d, tlnVar.e, tlnVar.f, tlnVar.h);
    }

    public static adwa c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15) {
        return new adwa(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, 1, null);
    }

    public static aeie d(Context context, final Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, shf shfVar, ysy ysyVar, final String str, Object obj, aaoz aaozVar, final aenf aenfVar, final atse atseVar, atsg atsgVar, azrw azrwVar, yss yssVar, final axzg axzgVar) {
        List list;
        final advq advqVar = (advq) obj;
        if (atseVar == null || atseVar.g.isEmpty()) {
            return null;
        }
        final int max = Math.max(atseVar.m, 0);
        final long j = atseVar.h * 1000;
        HashSet hashSet = new HashSet();
        Iterator<E> it = new aonw(atseVar.q, atse.a).iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((apue) it.next()).o));
        }
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        amnv amnvVar = new amnv(str, advqVar, executor, aenfVar, atseVar, axzgVar, max, j, bArr, bArr2) { // from class: advu
            public final /* synthetic */ String a;
            public final /* synthetic */ advq b;
            public final /* synthetic */ Executor c;
            public final /* synthetic */ aenf d;
            public final /* synthetic */ atse e;
            public final /* synthetic */ int f;
            public final /* synthetic */ long g;
            public final /* synthetic */ axzg h;

            @Override // defpackage.amnv
            public final Object get() {
                String str2 = this.a;
                advq advqVar2 = this.b;
                Executor executor2 = this.c;
                aenf aenfVar2 = this.d;
                atse atseVar2 = this.e;
                axzg axzgVar2 = this.h;
                return new pow(adyu.z(str2, advqVar2, executor2, aenfVar2, atseVar2, axzgVar2), this.f, this.g);
            }
        };
        String str2 = atseVar.g;
        if (atsgVar == null) {
            list = new ArrayList();
        } else {
            list = atsgVar.b;
        }
        return new aeie(amnvVar, str2, list, atseVar.i * 1000, atseVar.n, atseVar.o, shfVar, true != atseVar.r ? scheduledExecutorService : scheduledExecutorService2, ysyVar, (aeig) azrwVar.get(), aaozVar, yssVar, hashSet);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.p != 0 ? b((Context) ((axqs) this.c).a, (anib) this.e.get(), (amru) this.f.get(), ((aagd) this.g).get(), (vcw) this.m.get(), (ttw) this.i.get(), (ammv) this.d.get(), (amnv) this.n.get(), (ammv) ((axqs) this.a).a, (ammv) ((axqs) this.b).a, (ammv) this.j.get(), (ammv) this.o.get(), (vfg) this.h.get(), (ammv) ((axqs) this.l).a, (ammv) this.k.get()) : d((Context) ((axqs) this.a).a, (Executor) this.b.get(), (ScheduledExecutorService) this.c.get(), (ScheduledExecutorService) this.d.get(), (shf) this.e.get(), (ysy) this.f.get(), (String) this.g.get(), this.h.get(), (aaoz) this.i.get(), (aenf) this.j.get(), ((adwe) this.k).get(), ((adwf) this.l).get(), this.m, (yss) this.n.get(), (axzg) this.o.get());
    }
}
