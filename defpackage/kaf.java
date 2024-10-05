package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kaf implements kbj, kaq {
    public final jvc a;
    public final aahv b;
    public final fif c;
    public final fif d;
    public final kaq e;
    public final Executor f;
    public final axzf g;
    private final Map h;

    public kaf(Map map, jvc jvcVar, aahv aahvVar, fif fifVar, fif fifVar2, kaq kaqVar, Executor executor, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.h = map;
        this.a = jvcVar;
        this.b = aahvVar;
        this.c = fifVar;
        this.d = fifVar2;
        this.e = kaqVar;
        this.f = executor;
        this.g = axzfVar;
    }

    public static final aong f(aqnf aqnfVar, int i) {
        aone createBuilder = askf.a.createBuilder();
        aulm am = mcy.am(aqmy.REQUEST_TYPE_UNSPECIFIED, aqnfVar, i);
        createBuilder.copyOnWrite();
        askf askfVar = (askf) createBuilder.instance;
        am.getClass();
        askfVar.e = am;
        askfVar.b |= 4;
        askf askfVar2 = (askf) createBuilder.build();
        aong aongVar = (aong) askd.a.createBuilder();
        aongVar.co(askfVar2);
        aongVar.copyOnWrite();
        askd askdVar = (askd) aongVar.instance;
        askdVar.c |= 8;
        askdVar.i = "downloads_page_downloads_item_section_identifier";
        return aongVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        try {
            return (amru) ((anfm) anfq.i(anht.q(anfq.i(anht.q(this.e.e()), new anfz() { // from class: kab
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    final kaf kafVar = kaf.this;
                    if (((Boolean) obj).booleanValue()) {
                        return wbs.I(kafVar.c.b(fid.a().a()).B(new ayrv() { // from class: kad
                            @Override // defpackage.ayrv
                            public final Object a(Object obj2) {
                                return ((fie) obj2).a != 0 ? ayqj.F(true) : kaf.this.d.b(fid.a().a()).G(jtu.p);
                            }
                        }));
                    }
                    return anaf.O(true);
                }
            }, this.f)), new kac(this, juaVar, 1), this.f)).get();
        } catch (InterruptedException | ExecutionException unused) {
            return d();
        }
    }

    public final ammv b(kal kalVar, ammv ammvVar, jua juaVar) {
        kbi kbiVar = (kbi) this.h.get(kalVar);
        kbiVar.getClass();
        amru a = kbiVar.a(ammvVar).a(juaVar);
        return a.isEmpty() ? amlr.a : ammv.j((kbh) a.get(0));
    }

    public final ammv c(kal kalVar, Class cls, ammv ammvVar, jua juaVar) {
        ammv b = b(kalVar, ammvVar, juaVar);
        return b.h() ? ammv.j((aooy) cls.cast(((kbh) b.c()).a)) : amlr.a;
    }

    public final amru d() {
        aone createBuilder = auoy.a.createBuilder();
        aong f = f(aqnf.FILTER_TYPE_NONE, this.g.q());
        createBuilder.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder.instance;
        askd askdVar = (askd) f.build();
        askdVar.getClass();
        auoyVar.j = askdVar;
        auoyVar.b |= 16;
        return amru.r(new kbh((auoy) createBuilder.build()));
    }

    @Override // defpackage.kaq
    public final anhy e() {
        throw null;
    }
}
