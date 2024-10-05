package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbq implements kbj, kaq {
    public final aahv a;
    public final kbi b;
    public final kaq c;
    public final afsy d;
    private final fif e;
    private final Executor f;

    public kbq(aahv aahvVar, kbi kbiVar, fif fifVar, kaq kaqVar, Executor executor, afsy afsyVar) {
        this.a = aahvVar;
        this.b = kbiVar;
        this.e = fifVar;
        this.c = kaqVar;
        this.f = executor;
        this.d = afsyVar;
    }

    public static amru b() {
        aone createBuilder = auoy.a.createBuilder();
        askd askdVar = (askd) d().build();
        createBuilder.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder.instance;
        askdVar.getClass();
        auoyVar.j = askdVar;
        auoyVar.b |= 16;
        return amru.r(new kbh((auoy) createBuilder.build()));
    }

    public static aong d() {
        aong aongVar = (aong) askd.a.createBuilder();
        aone createBuilder = askf.a.createBuilder();
        aone createBuilder2 = aqnd.a.createBuilder();
        aone createBuilder3 = aqmx.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqmx aqmxVar = (aqmx) createBuilder3.instance;
        aqmxVar.b |= 1;
        aqmxVar.c = true;
        aqmx aqmxVar2 = (aqmx) createBuilder3.build();
        createBuilder2.copyOnWrite();
        aqnd aqndVar = (aqnd) createBuilder2.instance;
        aqmxVar2.getClass();
        aqndVar.c = aqmxVar2;
        aqndVar.b = 5;
        aulm ao = mcy.ao((aqnd) createBuilder2.build());
        createBuilder.copyOnWrite();
        askf askfVar = (askf) createBuilder.instance;
        ao.getClass();
        askfVar.e = ao;
        askfVar.b |= 4;
        aongVar.co((askf) createBuilder.build());
        aongVar.copyOnWrite();
        askd askdVar = (askd) aongVar.instance;
        askdVar.c |= 8;
        askdVar.i = "downloads_page_disclaimer_item_section_identifier";
        return aongVar;
    }

    @Override // defpackage.kbj
    public final amru a(final jua juaVar) {
        yjk.e();
        try {
            return (amru) ((anfm) anfq.i(anht.q(wbs.I(c().x(jtu.t).H(ayps.w(false)).R())), new anfz() { // from class: kbn
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    final kbq kbqVar = kbq.this;
                    final jua juaVar2 = juaVar;
                    if (((Boolean) obj).booleanValue()) {
                        ayps c = kbqVar.c();
                        kbr kbrVar = (kbr) kbqVar.c;
                        ammv a = kbrVar.c.a();
                        boolean z = true;
                        boolean z2 = kbrVar.f.e() && yjk.a(kbrVar.a) && kbrVar.b.p();
                        boolean z3 = kbrVar.d.b() && !mcy.ag(a, kbrVar.e.a(kbrVar.g.c()));
                        if (!z2 && !z3) {
                            z = false;
                        }
                        amru amruVar = (amru) c.M(ayps.v(anaf.O(Boolean.valueOf(z))), epc.o).x(new ayrv() { // from class: kbp
                            @Override // defpackage.ayrv
                            public final Object a(Object obj2) {
                                kbq kbqVar2 = kbq.this;
                                ammw ammwVar = (ammw) obj2;
                                return ((jzw) kbqVar2.b).a(ammv.j(new jzx(((Integer) ammwVar.a).intValue(), true == ((Boolean) ammwVar.b).booleanValue() ? 2 : 1))).a(juaVar2);
                            }
                        }).H(ayps.w(amru.q())).X();
                        aong d = kbq.d();
                        if (!amruVar.isEmpty()) {
                            d.cn((askg) ((kbh) amruVar.get(0)).a);
                        }
                        aone createBuilder = auoy.a.createBuilder();
                        askd askdVar = (askd) d.build();
                        createBuilder.copyOnWrite();
                        auoy auoyVar = (auoy) createBuilder.instance;
                        askdVar.getClass();
                        auoyVar.j = askdVar;
                        auoyVar.b |= 16;
                        return anaf.O(amru.r(new kbh((auoy) createBuilder.build())));
                    }
                    return anaf.O(kbq.b());
                }
            }, this.f)).get();
        } catch (InterruptedException | ExecutionException unused) {
            return b();
        }
    }

    public final ayps c() {
        return this.e.b(fid.a().a()).G(jtu.r).G(new ayrv() { // from class: kbo
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                kbq kbqVar = kbq.this;
                amru amruVar = (amru) obj;
                aahu a = kbqVar.a.a(kbqVar.d.c());
                ammv ammvVar = amlr.a;
                int size = amruVar.size();
                int i = 0;
                while (i < size) {
                    aakt aaktVar = (aakt) amruVar.get(i);
                    if (aaktVar instanceof awil) {
                        ammvVar = fav.H(ammv.j((awil) aaktVar));
                    } else if (aaktVar instanceof awig) {
                        awja b = ((awig) ((amna) ammv.j((awig) aaktVar)).a).b();
                        if (b != null) {
                            amru b2 = b.b();
                            int i2 = ((amvj) b2).c;
                            int i3 = 0;
                            while (i3 < i2) {
                                awjp b3 = ((awji) b2.get(i3)).b();
                                ammv H = b3 == null ? amlr.a : fav.H(fav.G(fhe.h(b3.getVideoId()), a));
                                i3++;
                                if (H.h()) {
                                    ammvVar = H;
                                    break;
                                }
                            }
                        }
                        ammvVar = amlr.a;
                    }
                    i++;
                    if (ammvVar.h()) {
                        break;
                    }
                }
                return ammvVar;
            }
        }).h(khf.b).x(jtu.s).H(ayps.w(0));
    }

    @Override // defpackage.kaq
    public final anhy e() {
        throw null;
    }
}
