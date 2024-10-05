package defpackage;

import android.text.TextUtils;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xln {
    public final wyu a;
    private final wni b;
    private final aaea c;
    private final shf d;
    private final acpl e;
    private final ScheduledExecutorService f;
    private final AtomicInteger g = new AtomicInteger(0);

    public xln(wni wniVar, aaea aaeaVar, shf shfVar, acpl acplVar, ScheduledExecutorService scheduledExecutorService, wyu wyuVar) {
        this.b = wniVar;
        this.c = aaeaVar;
        this.d = shfVar;
        this.e = acplVar;
        this.f = scheduledExecutorService;
        this.a = wyuVar;
    }

    public final void a(apaa apaaVar, xeo xeoVar, xgh xghVar, xev xevVar) {
        e(apaaVar, xghVar, xevVar, null, 0, null, null, xeoVar, false);
    }

    public final void b(apaa apaaVar, xeo xeoVar, xgh xghVar, boolean z) {
        e(apaaVar, xghVar, null, null, 0, null, null, xeoVar, z);
    }

    public final void c(apaa apaaVar, xgh xghVar, xev xevVar, xfw xfwVar, xeo xeoVar) {
        e(apaaVar, xghVar, xevVar, null, 0, null, xfwVar, xeoVar, false);
    }

    public final void d(apaa apaaVar, int i, List list, xeo xeoVar) {
        e(apaaVar, null, null, null, i, list, null, xeoVar, false);
    }

    public final void e(final apaa apaaVar, final xgh xghVar, final xev xevVar, final xgv xgvVar, final int i, final List list, final xfw xfwVar, final xeo xeoVar, final boolean z) {
        if (apaaVar == apaa.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED) {
            return;
        }
        final long c = this.d.c();
        final int incrementAndGet = this.g.incrementAndGet();
        wni wniVar = this.b;
        if (!wniVar.m) {
            f(apaaVar, xghVar, xevVar, xgvVar, i, list, xfwVar, xeoVar, z, c, incrementAndGet);
            return;
        }
        int i2 = wniVar.n;
        if (i2 > 0) {
            final int i3 = 1;
            this.f.schedule(new Runnable(this) { // from class: xll
                public final /* synthetic */ xln a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i3 != 0) {
                        this.a.f(apaaVar, xghVar, xevVar, xgvVar, i, list, xfwVar, xeoVar, z, c, incrementAndGet);
                    } else {
                        this.a.f(apaaVar, xghVar, xevVar, xgvVar, i, list, xfwVar, xeoVar, z, c, incrementAndGet);
                    }
                }
            }, i2, TimeUnit.MILLISECONDS);
        } else {
            final int i4 = 0;
            this.f.execute(new Runnable(this) { // from class: xll
                public final /* synthetic */ xln a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i4 != 0) {
                        this.a.f(apaaVar, xghVar, xevVar, xgvVar, i, list, xfwVar, xeoVar, z, c, incrementAndGet);
                    } else {
                        this.a.f(apaaVar, xghVar, xevVar, xgvVar, i, list, xfwVar, xeoVar, z, c, incrementAndGet);
                    }
                }
            });
        }
    }

    public final void f(apaa apaaVar, xgh xghVar, xev xevVar, xgv xgvVar, int i, List list, xfw xfwVar, xeo xeoVar, boolean z, long j, int i2) {
        aowz aowzVar;
        apax apaxVar;
        apbs k = wbs.k(this.c);
        if (k == null || !k.b) {
            final apam a = apan.a();
            a.copyOnWrite();
            ((apan) a.instance).j(apaaVar);
            a.copyOnWrite();
            ((apan) a.instance).i(i2);
            boolean d = this.a.d();
            aone createBuilder = apai.a.createBuilder();
            if (xghVar != null) {
                apbj a2 = wyu.a(xghVar, z, d);
                createBuilder.copyOnWrite();
                apai apaiVar = (apai) createBuilder.instance;
                a2.getClass();
                apaiVar.d = a2;
                apaiVar.b |= 2;
            }
            if (xevVar != null) {
                aone f = wyu.f(xevVar.b, xevVar.c, xevVar.g.keySet());
                if (d) {
                    aone createBuilder2 = apaz.a.createBuilder();
                    String str = xevVar.a;
                    createBuilder2.copyOnWrite();
                    apaz apazVar = (apaz) createBuilder2.instance;
                    apazVar.b |= 1;
                    apazVar.c = str;
                    amru amruVar = xevVar.d;
                    int i3 = ((amvj) amruVar).c;
                    int i4 = 0;
                    while (i4 < i3) {
                        apbk b = wyu.b((xgx) amruVar.get(i4));
                        createBuilder2.copyOnWrite();
                        apaz apazVar2 = (apaz) createBuilder2.instance;
                        b.getClass();
                        amru amruVar2 = amruVar;
                        aony aonyVar = apazVar2.d;
                        if (!aonyVar.c()) {
                            apazVar2.d = aonm.mutableCopy(aonyVar);
                        }
                        apazVar2.d.add(b);
                        i4++;
                        amruVar = amruVar2;
                    }
                    amru amruVar3 = xevVar.e;
                    int i5 = ((amvj) amruVar3).c;
                    int i6 = 0;
                    while (i6 < i5) {
                        apbk b2 = wyu.b((xgx) amruVar3.get(i6));
                        createBuilder2.copyOnWrite();
                        apaz apazVar3 = (apaz) createBuilder2.instance;
                        b2.getClass();
                        amru amruVar4 = amruVar3;
                        aony aonyVar2 = apazVar3.e;
                        if (!aonyVar2.c()) {
                            apazVar3.e = aonm.mutableCopy(aonyVar2);
                        }
                        apazVar3.e.add(b2);
                        i6++;
                        amruVar3 = amruVar4;
                    }
                    amru amruVar5 = xevVar.f;
                    int i7 = ((amvj) amruVar5).c;
                    int i8 = 0;
                    while (i8 < i7) {
                        apbk b3 = wyu.b((xgx) amruVar5.get(i8));
                        createBuilder2.copyOnWrite();
                        apaz apazVar4 = (apaz) createBuilder2.instance;
                        b3.getClass();
                        amru amruVar6 = amruVar5;
                        aony aonyVar3 = apazVar4.f;
                        if (!aonyVar3.c()) {
                            apazVar4.f = aonm.mutableCopy(aonyVar3);
                        }
                        apazVar4.f.add(b3);
                        i8++;
                        amruVar5 = amruVar6;
                    }
                    apaz apazVar5 = (apaz) createBuilder2.build();
                    f.copyOnWrite();
                    apba apbaVar = (apba) f.instance;
                    apba apbaVar2 = apba.a;
                    apazVar5.getClass();
                    apbaVar.d = apazVar5;
                    apbaVar.b |= 2;
                }
                apba apbaVar3 = (apba) f.build();
                createBuilder.copyOnWrite();
                apai apaiVar2 = (apai) createBuilder.instance;
                apbaVar3.getClass();
                apaiVar2.e = apbaVar3;
                apaiVar2.b |= 4;
            }
            if (xgvVar != null) {
                aone createBuilder3 = apbk.a.createBuilder();
                apag apagVar = (apag) wyl.a.get(Integer.valueOf(xgvVar.a));
                if (apagVar == null) {
                    apagVar = apag.TRIGGER_CATEGORY_UNSPECIFIED;
                }
                createBuilder3.copyOnWrite();
                apbk apbkVar = (apbk) createBuilder3.instance;
                apbkVar.f = apagVar.k;
                apbkVar.b |= 2;
                apbk e = wyu.e(xgvVar.b, createBuilder3);
                createBuilder.copyOnWrite();
                apai apaiVar3 = (apai) createBuilder.instance;
                e.getClass();
                apaiVar3.f = e;
                apaiVar3.b |= 8;
            }
            if (i != 0) {
                aone createBuilder4 = apbd.a.createBuilder();
                createBuilder4.copyOnWrite();
                apbd apbdVar = (apbd) createBuilder4.instance;
                apbdVar.d = i - 1;
                apbdVar.b |= 2;
                if (d) {
                    aone createBuilder5 = apbc.a.createBuilder();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            apbj a3 = wyu.a((xgh) it.next(), false, true);
                            createBuilder5.copyOnWrite();
                            apbc apbcVar = (apbc) createBuilder5.instance;
                            a3.getClass();
                            aony aonyVar4 = apbcVar.b;
                            if (!aonyVar4.c()) {
                                apbcVar.b = aonm.mutableCopy(aonyVar4);
                            }
                            apbcVar.b.add(a3);
                        }
                    }
                    apbc apbcVar2 = (apbc) createBuilder5.build();
                    createBuilder4.copyOnWrite();
                    apbd apbdVar2 = (apbd) createBuilder4.instance;
                    apbcVar2.getClass();
                    apbdVar2.c = apbcVar2;
                    apbdVar2.b |= 1;
                }
                apbd apbdVar3 = (apbd) createBuilder4.build();
                createBuilder.copyOnWrite();
                apai apaiVar4 = (apai) createBuilder.instance;
                apbdVar3.getClass();
                apaiVar4.c = apbdVar3;
                apaiVar4.b |= 1;
            }
            if (xfwVar != null) {
                aone createBuilder6 = apbg.a.createBuilder();
                apah apahVar = xfwVar.a;
                createBuilder6.copyOnWrite();
                apbg apbgVar = (apbg) createBuilder6.instance;
                apbgVar.c = apahVar.af;
                apbgVar.b |= 1;
                int i9 = xfwVar.b;
                createBuilder6.copyOnWrite();
                apbg apbgVar2 = (apbg) createBuilder6.instance;
                apbgVar2.b |= 2;
                apbgVar2.e = i9;
                if (d) {
                    amru amruVar7 = xfwVar.c;
                    int i10 = ((amvj) amruVar7).c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ammv ammvVar = (ammv) amruVar7.get(i11);
                        if (ammvVar.h()) {
                            aone createBuilder7 = apbf.a.createBuilder();
                            createBuilder7.copyOnWrite();
                            apbf apbfVar = (apbf) createBuilder7.instance;
                            apbfVar.b |= 1;
                            apbfVar.d = true;
                            amru<String> amruVar8 = ((xeq) ammvVar.c()).e;
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : amruVar8) {
                                if (wyl.e.containsKey(str2)) {
                                    arrayList.add((apad) wyl.e.get(str2));
                                } else {
                                    String valueOf = String.valueOf(str2);
                                    whu.l(null, valueOf.length() != 0 ? "Ping migration undefined key for macro logging map: ".concat(valueOf) : new String("Ping migration undefined key for macro logging map: "));
                                }
                            }
                            createBuilder7.copyOnWrite();
                            apbf apbfVar2 = (apbf) createBuilder7.instance;
                            aonu aonuVar = apbfVar2.c;
                            if (!aonuVar.c()) {
                                apbfVar2.c = aonm.mutableCopy(aonuVar);
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                apbfVar2.c.g(((apad) it2.next()).ac);
                            }
                            apbf apbfVar3 = (apbf) createBuilder7.build();
                            createBuilder6.copyOnWrite();
                            apbg apbgVar3 = (apbg) createBuilder6.instance;
                            apbfVar3.getClass();
                            aony aonyVar5 = apbgVar3.d;
                            if (!aonyVar5.c()) {
                                apbgVar3.d = aonm.mutableCopy(aonyVar5);
                            }
                            apbgVar3.d.add(apbfVar3);
                        }
                    }
                }
                apbg apbgVar4 = (apbg) createBuilder6.build();
                createBuilder.copyOnWrite();
                apai apaiVar5 = (apai) createBuilder.instance;
                apbgVar4.getClass();
                apaiVar5.g = apbgVar4;
                apaiVar5.b |= 16;
            }
            if (xeoVar != null) {
                if (xeoVar == xeo.a) {
                    apaxVar = apax.a;
                } else {
                    aone createBuilder8 = apax.a.createBuilder();
                    xfu xfuVar = xeoVar.b;
                    aone createBuilder9 = apbe.a.createBuilder();
                    if (!TextUtils.isEmpty(xfuVar.a)) {
                        String str3 = xfuVar.a;
                        createBuilder9.copyOnWrite();
                        apbe apbeVar = (apbe) createBuilder9.instance;
                        apbeVar.b |= 1;
                        apbeVar.c = str3;
                    }
                    boolean z2 = xfuVar.b;
                    createBuilder9.copyOnWrite();
                    apbe apbeVar2 = (apbe) createBuilder9.instance;
                    apbeVar2.b |= 2;
                    apbeVar2.d = z2;
                    boolean z3 = xfuVar.c;
                    createBuilder9.copyOnWrite();
                    apbe apbeVar3 = (apbe) createBuilder9.instance;
                    apbeVar3.b |= 4;
                    apbeVar3.e = z3;
                    boolean z4 = xfuVar.d;
                    createBuilder9.copyOnWrite();
                    apbe apbeVar4 = (apbe) createBuilder9.instance;
                    apbeVar4.b |= 8;
                    apbeVar4.f = z4;
                    xck xckVar = xeoVar.c;
                    aone createBuilder10 = apak.a.createBuilder();
                    if (!TextUtils.isEmpty(xckVar.a)) {
                        String str4 = xckVar.a;
                        createBuilder10.copyOnWrite();
                        apak apakVar = (apak) createBuilder10.instance;
                        apakVar.b |= 1;
                        apakVar.c = str4;
                    }
                    createBuilder8.copyOnWrite();
                    apax apaxVar2 = (apax) createBuilder8.instance;
                    apbe apbeVar5 = (apbe) createBuilder9.build();
                    apbeVar5.getClass();
                    apaxVar2.c = apbeVar5;
                    apaxVar2.b |= 1;
                    createBuilder8.copyOnWrite();
                    apax apaxVar3 = (apax) createBuilder8.instance;
                    apak apakVar2 = (apak) createBuilder10.build();
                    apakVar2.getClass();
                    apaxVar3.d = apakVar2;
                    apaxVar3.b |= 4;
                    apaxVar = (apax) createBuilder8.build();
                }
                createBuilder.copyOnWrite();
                apai apaiVar6 = (apai) createBuilder.instance;
                apaxVar.getClass();
                apaiVar6.h = apaxVar;
                apaiVar6.b |= 32;
            }
            apai apaiVar7 = (apai) createBuilder.build();
            a.copyOnWrite();
            ((apan) a.instance).h(apaiVar7);
            if (wbs.q(this.c) && xghVar != null) {
                xghVar.h.ifPresent(new Consumer() { // from class: xlm
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        apam apamVar = apam.this;
                        aomf aomfVar = ((aoyn) obj).c;
                        apamVar.copyOnWrite();
                        ((apan) apamVar.instance).l(aomfVar);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (xevVar != null && (aowzVar = (aowz) xevVar.h.f()) != null && (aowzVar.b & 1) != 0) {
                aomf aomfVar = aowzVar.c;
                a.copyOnWrite();
                ((apan) a.instance).k(aomfVar);
            }
            apan apanVar = (apan) a.build();
            acpl acplVar = this.e;
            aone createBuilder11 = apao.a.createBuilder();
            createBuilder11.copyOnWrite();
            apao apaoVar = (apao) createBuilder11.instance;
            apanVar.getClass();
            apaoVar.c = apanVar;
            apaoVar.b = 11;
            apao apaoVar2 = (apao) createBuilder11.build();
            arpn a4 = arpp.a();
            a4.copyOnWrite();
            ((arpp) a4.instance).bZ(apaoVar2);
            acplVar.f((arpp) a4.build(), j);
        }
    }
}
