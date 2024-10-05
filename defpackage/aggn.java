package defpackage;

import android.database.sqlite.SQLiteFullException;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aggn implements agst {
    public long a;
    public final shf b;
    public final String c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final agft g;
    public final azrw h;
    public final azrw i;
    public final Set j;
    public final agzr k;
    private final azrw m;
    private final ageh n;
    private final azrw o;
    private final azrw p;
    private final azrw q;
    private final aarr r;
    private final amsx s;

    public aggn(shf shfVar, String str, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ageh agehVar, azrw azrwVar4, agft agftVar, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, Set set, agzr agzrVar, aarr aarrVar, Set set2) {
        this.b = shfVar;
        this.c = str;
        this.m = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.n = agehVar;
        this.f = azrwVar4;
        this.g = agftVar;
        this.h = azrwVar5;
        this.i = azrwVar6;
        this.o = azrwVar7;
        this.p = azrwVar8;
        this.q = azrwVar9;
        this.j = set;
        this.k = agzrVar;
        this.r = aarrVar;
        this.s = amsx.p(set2);
    }

    @Override // defpackage.agst
    public final PlayerResponseModel a(agmv agmvVar) {
        agnv agnvVar = agmvVar instanceof agnv ? (agnv) agmvVar : null;
        if (agnvVar != null) {
            if (agnvVar.w()) {
                throw new aglp();
            }
            if (agnvVar.x()) {
                agnu agnuVar = agnvVar.j;
                if (agnuVar == null || !agnuVar.f()) {
                    throw new agls();
                }
                throw new aglt();
            }
            agil agilVar = (agil) this.f.get();
            String m = agnvVar.m();
            PlayerResponseModel m2 = agilVar.m(m);
            if (m2 == null || m2.c == null) {
                throw new aglp();
            }
            amxd listIterator = this.s.listIterator();
            PlayerResponseModel playerResponseModel = m2;
            while (listIterator.hasNext()) {
                aryr a = ((agsk) listIterator.next()).a(playerResponseModel.a, m);
                if (a != null) {
                    playerResponseModel = new PlayerResponseModel(a, this.b.d(), (aapf) this.p.get());
                }
            }
            long j = aghw.b;
            long j2 = 18000000;
            agnn c = ((agfx) this.o.get()).c(m, new aghh((ailv) this.m.get(), this.b.d() + 18000000));
            if (c != null) {
                playerResponseModel = aedn.E(playerResponseModel, (aapf) this.p.get(), c.c(), c.a(), this.b.d(), j, false);
                if (playerResponseModel.a.F.size() > 0) {
                    aryr aryrVar = playerResponseModel.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = aryrVar.F.iterator();
                    while (it.hasNext()) {
                        asjc asjcVar = (asjc) it.next();
                        if (asjcVar.d.size() != 0) {
                            aone builder = asjcVar.toBuilder();
                            builder.copyOnWrite();
                            ((asjc) builder.instance).d = asjc.emptyProtobufList();
                            Iterator it2 = asjcVar.d.iterator();
                            while (it2.hasNext()) {
                                aryr aryrVar2 = (aryr) this.r.a(((asjb) it2.next()).c.I(), aryr.a);
                                if (aryrVar2 != null) {
                                    aong aongVar = (aong) aryrVar2.toBuilder();
                                    aryv aryvVar = ((aryr) aongVar.instance).h;
                                    if (aryvVar == null) {
                                        aryvVar = aryv.a;
                                    }
                                    aone builder2 = aryvVar.toBuilder();
                                    builder2.copyOnWrite();
                                    ((aryv) builder2.instance).e = aryv.emptyProtobufList();
                                    builder2.copyOnWrite();
                                    ((aryv) builder2.instance).d = aryv.emptyProtobufList();
                                    agfx agfxVar = (agfx) this.o.get();
                                    aryx aryxVar = aryrVar2.g;
                                    if (aryxVar == null) {
                                        aryxVar = aryx.a;
                                    }
                                    Iterator it3 = it;
                                    Iterator it4 = it2;
                                    agnn c2 = agfxVar.c(aryxVar.c, new aghh((ailv) this.m.get(), this.b.d() + 18000000));
                                    if (c2 != null) {
                                        FormatStreamModel d = c2.d(this.n.g());
                                        FormatStreamModel b = c2.b(this.n.g());
                                        if (d != null && (!d.A() || b != null)) {
                                            long max = Math.max(0L, j);
                                            builder2.copyOnWrite();
                                            aryv aryvVar2 = (aryv) builder2.instance;
                                            aryvVar2.b |= 1;
                                            aryvVar2.c = max;
                                            if (!d.A()) {
                                                builder2.ap(d.a);
                                            } else {
                                                builder2.am(d.a);
                                            }
                                            if (b != null) {
                                                builder2.am(b.a);
                                            }
                                            aryv aryvVar3 = (aryv) builder2.build();
                                            aongVar.copyOnWrite();
                                            aryr aryrVar3 = (aryr) aongVar.instance;
                                            aryvVar3.getClass();
                                            aryrVar3.h = aryvVar3;
                                            aryrVar3.b |= 16;
                                            aryrVar2 = (aryr) aongVar.build();
                                        }
                                    }
                                    aong aongVar2 = (aong) asjb.a.createBuilder();
                                    aomf byteString = aryrVar2.toByteString();
                                    aongVar2.copyOnWrite();
                                    asjb asjbVar = (asjb) aongVar2.instance;
                                    asjbVar.b |= 1;
                                    asjbVar.c = byteString;
                                    builder.at(aongVar2);
                                    it = it3;
                                    it2 = it4;
                                    j2 = 18000000;
                                }
                            }
                            arrayList.add((asjc) builder.build());
                            it = it;
                        }
                    }
                    aong aongVar3 = (aong) aryrVar.toBuilder();
                    aongVar3.copyOnWrite();
                    ((aryr) aongVar3.instance).F = aryr.emptyProtobufList();
                    aongVar3.cl(arrayList);
                    return new PlayerResponseModel((aryr) aongVar3.build(), this.b.d(), (aapf) this.p.get());
                }
            }
            return playerResponseModel;
        }
        throw new aglq();
    }

    @Override // defpackage.agst
    public final agnu b(String str) {
        yjk.e();
        if (!this.g.z()) {
            return null;
        }
        agil agilVar = (agil) this.f.get();
        zhq.m(str);
        agjy q = agilVar.l.q(str);
        if (q != null) {
            return q.d();
        }
        return null;
    }

    @Override // defpackage.agst
    public final void c(String str) {
        ((agil) this.f.get()).K(str);
        agjd agjdVar = (agjd) this.o.get();
        agnn c = agjdVar.c(str, null);
        if (c == null) {
            return;
        }
        agnm agnmVar = c.b;
        if (agnmVar != null) {
            agjdVar.d(str, agnmVar.a());
        }
        agnm agnmVar2 = c.a;
        if (agnmVar2 != null) {
            agjdVar.d(str, agnmVar2.a());
        }
    }

    public final void d(String str) {
        agil agilVar = (agil) this.f.get();
        agnv p = agilVar.p(str);
        if (p == null) {
            zga.b(str.length() != 0 ? "[Offline] Refresh video failed because snapshot invalid for ".concat(str) : new String("[Offline] Refresh video failed because snapshot invalid for "));
        } else {
            atrx e = agilVar.e(str);
            ((aghj) this.h.get()).h(str, null, null, e, null, ((agsg) this.d.get()).U(e), p.m, 1, true, true, false);
        }
    }

    public final void e(String str) {
        if (((aghc) this.i.get()).e(str) == null) {
            return;
        }
        agil agilVar = (agil) this.f.get();
        ((agzx) this.q.get()).b(str);
        try {
            agilVar.G(str, ((agzx) this.q.get()).l(str, 2, agilVar.i(str)), this.b.c(), true, (aapf) this.p.get());
        } catch (aasx | SQLiteFullException unused) {
        }
    }

    @Override // defpackage.agst
    public final void f(String str) {
        this.g.s(new aggm(this, str, 1));
    }

    @Override // defpackage.agst
    public final void g(String str) {
        this.g.s(new aggm(this, str, 0));
    }

    @Override // defpackage.agst
    public final void h(String str) {
        this.g.s(new aggm(this, str, 2));
    }

    @Override // defpackage.agst
    public final void i(String str) {
        zhq.m(str);
        this.g.s(new aggm(this, str, 3));
    }

    @Override // defpackage.agst
    public final void j() {
        this.g.s(new Runnable() { // from class: aggl
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
            
                if (r3 != null) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
            
                if (r10 >= 0) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
            
                r7 = r10 + java.util.concurrent.TimeUnit.SECONDS.toMillis(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
            
                if (r3 != null) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
            
                if (r3 != null) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
            
                r7 = r7 + java.util.concurrent.TimeUnit.SECONDS.toMillis(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
            
                if (r3 != null) goto L51;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aggl.run():void");
            }
        });
    }

    @Override // defpackage.agst
    public final boolean k(agnu agnuVar) {
        yjk.e();
        boolean z = false;
        if (this.g.z()) {
            String str = agnuVar.a;
            agil agilVar = (agil) this.f.get();
            PlayerResponseModel m = agilVar.m(str);
            if (m != null) {
                aapf aapfVar = (aapf) this.p.get();
                atqq atqqVar = agnuVar.b;
                aong aongVar = (aong) m.a.toBuilder();
                aongVar.copyOnWrite();
                aryr aryrVar = (aryr) aongVar.instance;
                aryrVar.k = atqqVar;
                aryrVar.b |= 128;
                long j = m.b;
                z = agilVar.G(str, new PlayerResponseModel((aryr) aongVar.build(), j, PlayerResponseModel.d(aapfVar, (aryr) aongVar.build(), j)), agnuVar.d, false, (aapf) this.p.get());
                if (z) {
                    ((aghc) this.i.get()).t(agnuVar.a);
                    return true;
                }
            } else {
                zga.b(str.length() != 0 ? "[Offline] No player response found for video: ".concat(str) : new String("[Offline] No player response found for video: "));
            }
        }
        return z;
    }
}
