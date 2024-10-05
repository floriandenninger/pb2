package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvt {
    static final long a = TimeUnit.DAYS.toSeconds(30);
    static final long b = TimeUnit.DAYS.toSeconds(1);
    public static final long c = TimeUnit.MINUTES.toSeconds(10);
    public final fjs d;
    public final azrw e;
    public final azrw f;
    private final ysy g;
    private final shf h;
    private final fka i;

    public jvt(ysy ysyVar, shf shfVar, fjs fjsVar, fka fkaVar, azrw azrwVar, azrw azrwVar2) {
        this.g = ysyVar;
        this.h = shfVar;
        this.d = fjsVar;
        this.i = fkaVar;
        this.e = azrwVar;
        this.f = azrwVar2;
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Failed to update offline last client video playback position sync time millis.", th);
    }

    public final void b(long j) {
        if (this.g.o() && !c(j) && ((agof) this.e.get()).h()) {
            final agto agtoVar = (agto) this.f.get();
            anhy anhyVar = agtoVar.g;
            if (anhyVar == null || anhyVar.isCancelled() || agtoVar.g.isDone()) {
                agtoVar.g = anfq.i(anht.q(anfq.h(anfq.i(anht.q(anaf.O(((agof) agtoVar.e.get()).a())), ufj.l, agtoVar.a), new amml() { // from class: agtm
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        agto agtoVar2 = agto.this;
                        Collection<agnv> collection = (Collection) obj;
                        if (collection == null) {
                            return null;
                        }
                        aaxn aaxnVar = (aaxn) agtoVar2.d.get();
                        agtoVar2.f = new agsa(aaxnVar.f, aaxnVar.a.c(), null, null, null);
                        agtoVar2.f.k();
                        agtoVar2.f.b = ((agsg) agtoVar2.c.get()).o(((agof) agtoVar2.e.get()).d());
                        for (agnv agnvVar : collection) {
                            if (!agnvVar.s()) {
                                aone createBuilder = avzg.a.createBuilder();
                                String d = aalt.d(avzg.b.a(), agnvVar.m());
                                createBuilder.copyOnWrite();
                                avzg avzgVar = (avzg) createBuilder.instance;
                                d.getClass();
                                avzgVar.c |= 1;
                                avzgVar.d = d;
                                String m = agnvVar.m();
                                createBuilder.copyOnWrite();
                                avzg avzgVar2 = (avzg) createBuilder.instance;
                                m.getClass();
                                avzgVar2.c |= 2;
                                avzgVar2.e = m;
                                long j2 = agnvVar.h;
                                createBuilder.copyOnWrite();
                                avzg avzgVar3 = (avzg) createBuilder.instance;
                                avzgVar3.c |= 4;
                                avzgVar3.f = j2;
                                agtoVar2.f.a.add((avzg) createBuilder.build());
                            }
                        }
                        return agtoVar2.f;
                    }
                }, angq.a)), new anfz() { // from class: agtn
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        agto agtoVar2 = agto.this;
                        agsa agsaVar = (agsa) obj;
                        if (agsaVar == null || agsaVar.a.size() == 0) {
                            return anaf.O(null);
                        }
                        aaxn aaxnVar = (aaxn) agtoVar2.d.get();
                        return aaxnVar.b.b(agsaVar, agtoVar2.a);
                    }
                }, angq.a);
                ynm.k(agtoVar.g, angq.a, new afka(15), new agtl(agtoVar, 0));
            }
            ynm.m(this.i.b.b(new fjv(this.h.c(), 1)), jun.c);
        }
    }

    public final boolean c(long j) {
        return this.h.c() - ((fke) this.i.b.c()).f < TimeUnit.SECONDS.toMillis(j);
    }
}
