package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpb implements agoy, jok {
    public final azqv a = azqv.aq(false);
    public final azrw b;
    public final aahd c;
    public final agof d;
    private final aais e;
    private final jtv f;
    private final fif g;

    public jpb(aais aaisVar, azrw azrwVar, jtv jtvVar, aahd aahdVar, fif fifVar, agof agofVar) {
        this.e = aaisVar;
        this.b = azrwVar;
        this.f = jtvVar;
        this.c = aahdVar;
        this.g = fifVar;
        this.d = agofVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        return anaf.O(amru.q());
    }

    @Override // defpackage.jok
    public final aypn i() {
        return this.a.G().y();
    }

    @Override // defpackage.jok
    public final ayqj j() {
        azap azapVar = new azap(this.a.aj(), false, 0);
        ayrv ayrvVar = aynu.o;
        return azapVar;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        int bU = anaf.bU(atpqVar.c);
        final int i = 1;
        if (bU == 0) {
            bU = 1;
        }
        int i2 = bU - 1;
        final int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                final aair a = this.e.a(afsxVar);
                return anfq.i(anht.q(anaf.R(new Runnable() { // from class: jpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        jpb.this.d.a().k().h("smart_downloads_video_list_");
                    }
                }, angq.a)), new anfz() { // from class: jow
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        aair aairVar = aair.this;
                        return wbs.I(aairVar.f(fhe.w()).g(awiu.class).s(new joz(aairVar, 0)).E(jif.l).Q(ayqj.F(agou.a)));
                    }
                }, angq.a);
            }
            if (i2 != 3) {
                Object[] objArr = new Object[2];
                int bU2 = anaf.bU(atpqVar.c);
                if (bU2 == 0) {
                    bU2 = 1;
                }
                objArr[0] = Integer.valueOf(bU2 - 1);
                objArr[1] = 164;
                zga.e("Could not handle action: %s for type %s", objArr);
                return anaf.O(agou.c);
            }
        }
        this.a.c(true);
        fif fifVar = this.g;
        fib a2 = fid.a();
        a2.b(aqnf.FILTER_TYPE_NONE);
        return aney.h(anfq.i(anfq.i(anht.q(wbs.I(fifVar.b(a2.a()).S(this.f.a(), epc.n))), new anfz(this) { // from class: jov
            public final /* synthetic */ jpb a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i3 == 0) {
                    ammw ammwVar = (ammw) obj;
                    juc jucVar = (juc) this.a.b.get();
                    amru amruVar = ((fie) ammwVar.a).b;
                    amrp f = amru.f();
                    int size = amruVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        f.h(((aakt) amruVar.get(i4)).d());
                    }
                    amru g = f.g();
                    aswl aswlVar = (aswl) ammwVar.b;
                    angq angqVar = angq.a;
                    jub a3 = jucVar.a();
                    a3.k();
                    a3.a = jucVar.b.a(true);
                    a3.d(aqme.DOWNLOAD_RECS_FEATURE_TYPE_SMART_DOWNLOADS);
                    a3.e(aswlVar);
                    a3.b = ammv.j(g);
                    return anfq.h(anht.q(jucVar.a.b(a3, angqVar)), jpt.i, angqVar);
                }
                final jpb jpbVar = this.a;
                final ammv ammvVar = (ammv) obj;
                final agss k = jpbVar.d.a().k();
                return anfq.i(anfq.i(anht.q(k.n()), new anfz() { // from class: joy
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        agss agssVar = agss.this;
                        if (!((ammv) obj2).h()) {
                            return agssVar.x(new bagd("smart_downloads_video_list_", 0, 3, null));
                        }
                        return anaf.O(true);
                    }
                }, angq.a), new anfz() { // from class: jox
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        jpb jpbVar2 = jpb.this;
                        ammv ammvVar2 = ammvVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            jpbVar2.a.c(false);
                            return anaf.O(agou.c);
                        }
                        if (ammvVar2.h()) {
                            jpbVar2.c.a((apxf) ammvVar2.c());
                        }
                        jpbVar2.a.c(false);
                        return anaf.O(agou.a);
                    }
                }, angq.a);
            }
        }, angq.a), new anfz(this) { // from class: jov
            public final /* synthetic */ jpb a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i == 0) {
                    ammw ammwVar = (ammw) obj;
                    juc jucVar = (juc) this.a.b.get();
                    amru amruVar = ((fie) ammwVar.a).b;
                    amrp f = amru.f();
                    int size = amruVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        f.h(((aakt) amruVar.get(i4)).d());
                    }
                    amru g = f.g();
                    aswl aswlVar = (aswl) ammwVar.b;
                    angq angqVar = angq.a;
                    jub a3 = jucVar.a();
                    a3.k();
                    a3.a = jucVar.b.a(true);
                    a3.d(aqme.DOWNLOAD_RECS_FEATURE_TYPE_SMART_DOWNLOADS);
                    a3.e(aswlVar);
                    a3.b = ammv.j(g);
                    return anfq.h(anht.q(jucVar.a.b(a3, angqVar)), jpt.i, angqVar);
                }
                final jpb jpbVar = this.a;
                final ammv ammvVar = (ammv) obj;
                final agss k = jpbVar.d.a().k();
                return anfq.i(anfq.i(anht.q(k.n()), new anfz() { // from class: joy
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        agss agssVar = agss.this;
                        if (!((ammv) obj2).h()) {
                            return agssVar.x(new bagd("smart_downloads_video_list_", 0, 3, null));
                        }
                        return anaf.O(true);
                    }
                }, angq.a), new anfz() { // from class: jox
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        jpb jpbVar2 = jpb.this;
                        ammv ammvVar2 = ammvVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            jpbVar2.a.c(false);
                            return anaf.O(agou.c);
                        }
                        if (ammvVar2.h()) {
                            jpbVar2.c.a((apxf) ammvVar2.c());
                        }
                        jpbVar2.a.c(false);
                        return anaf.O(agou.a);
                    }
                }, angq.a);
            }
        }, angq.a), Throwable.class, icu.t, angq.a);
    }
}
