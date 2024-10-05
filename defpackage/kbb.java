package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbb implements kbj, kaq {
    public final aais a;
    public final fif b;
    public final afsy c;
    public final fka d;
    public final jyu e;
    public final Executor f;
    public final jok g;
    private final Map h;

    public kbb(Map map, aais aaisVar, fif fifVar, afsy afsyVar, fka fkaVar, jyu jyuVar, Executor executor, jok jokVar) {
        this.h = map;
        this.a = aaisVar;
        this.b = fifVar;
        this.c = afsyVar;
        this.d = fkaVar;
        this.e = jyuVar;
        this.f = executor;
        this.g = jokVar;
    }

    @Override // defpackage.kbj
    public final amru a(final jua juaVar) {
        yjk.e();
        try {
            return (amru) ((anfm) anfq.i(anht.q(e()), new anfz() { // from class: kay
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    kbb kbbVar = kbb.this;
                    jua juaVar2 = juaVar;
                    if (((Boolean) obj).booleanValue()) {
                        aone createBuilder = askf.a.createBuilder();
                        aulm an = mcy.an(aqnb.REQUEST_TYPE_UNSPECIFIED);
                        createBuilder.copyOnWrite();
                        askf askfVar = (askf) createBuilder.instance;
                        an.getClass();
                        askfVar.e = an;
                        askfVar.b |= 4;
                        aong aongVar = (aong) askd.a.createBuilder();
                        aongVar.cy(createBuilder);
                        aongVar.copyOnWrite();
                        askd askdVar = (askd) aongVar.instance;
                        askdVar.c |= 8;
                        askdVar.i = "downloads_page_smart_downloads_item_section_identifier";
                        return anfq.i(anht.q(kbbVar.d.b(kbbVar.c.c().b())), new kba(kbbVar, aongVar, juaVar2, 0), kbbVar.f);
                    }
                    return anaf.O(amru.q());
                }
            }, this.f)).get();
        } catch (InterruptedException | ExecutionException unused) {
            return amru.q();
        }
    }

    public final ammv b(kal kalVar, Class cls, ammv ammvVar, jua juaVar) {
        kbi kbiVar = (kbi) this.h.get(kalVar);
        kbiVar.getClass();
        amru a = kbiVar.a(ammvVar).a(juaVar);
        return a.isEmpty() ? amlr.a : ammv.j((aooy) cls.cast(((kbh) a.get(0)).a));
    }

    @Override // defpackage.kaq
    public final synchronized anhy e() {
        return anfq.i(anht.q(this.d.b(this.c.c().b())), new anfz() { // from class: kax
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final kbb kbbVar = kbb.this;
                if (((Boolean) obj).booleanValue()) {
                    return anaf.O(true);
                }
                anht q = anht.q(wbs.I(kbbVar.e.a()));
                final anht q2 = anht.q(anfq.h(((ywp) kbbVar.d.c.get()).a(), new fjz(kbbVar.c.c().b(), 2), angq.a));
                return anfq.i(q, new anfz() { // from class: kaz
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        kbb kbbVar2 = kbb.this;
                        anht anhtVar = q2;
                        if (!((Boolean) obj2).booleanValue()) {
                            return anaf.O(false);
                        }
                        return anfq.h(anhtVar, jpt.o, kbbVar2.f);
                    }
                }, kbbVar.f);
            }
        }, this.f);
    }
}
