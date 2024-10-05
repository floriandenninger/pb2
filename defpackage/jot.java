package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jot implements agoy {
    public final fif a;
    public final agof b;

    public jot(agof agofVar, fif fifVar) {
        this.b = agofVar;
        this.a = fifVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(final afsx afsxVar, atpq atpqVar) {
        final String g = aalt.g(atpqVar.d);
        if (g.isEmpty()) {
            return anaf.O(agou.c);
        }
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i == 1) {
            final atpo atpoVar = atpqVar.e;
            if (atpoVar == null) {
                atpoVar = atpo.b;
            }
            final agss k = this.b.a().k();
            return anfq.i(anht.q(wbs.I(this.a.a(g).x(jif.k).S(Optional.empty()))), new anfz() { // from class: joq
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    agss agssVar = agss.this;
                    String str = g;
                    atpo atpoVar2 = atpoVar;
                    Optional optional = (Optional) obj;
                    if (!optional.isPresent()) {
                        return anaf.O(agou.c);
                    }
                    asxs asxsVar = (asxs) optional.get();
                    awic f = asxsVar.f();
                    aone createBuilder = atqx.a.createBuilder();
                    String videoId = asxsVar.getVideoId();
                    createBuilder.copyOnWrite();
                    atqx atqxVar = (atqx) createBuilder.instance;
                    videoId.getClass();
                    atqxVar.b |= 1;
                    atqxVar.c = videoId;
                    String title = asxsVar.getTitle();
                    createBuilder.copyOnWrite();
                    atqx atqxVar2 = (atqx) createBuilder.instance;
                    title.getClass();
                    atqxVar2.b |= 8;
                    atqxVar2.f = title;
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(asxsVar.getPublishedTimestampMillis().longValue());
                    createBuilder.copyOnWrite();
                    atqx atqxVar3 = (atqx) createBuilder.instance;
                    atqxVar3.b |= 32;
                    atqxVar3.h = seconds;
                    int intValue = asxsVar.getLengthSeconds().intValue();
                    createBuilder.copyOnWrite();
                    atqx atqxVar4 = (atqx) createBuilder.instance;
                    atqxVar4.b |= 8192;
                    atqxVar4.o = intValue;
                    String az = wbs.az(asxsVar.getLengthSeconds().intValue());
                    createBuilder.copyOnWrite();
                    atqx atqxVar5 = (atqx) createBuilder.instance;
                    az.getClass();
                    atqxVar5.b |= 16;
                    atqxVar5.g = az;
                    long longValue = asxsVar.getViewCount().longValue();
                    createBuilder.copyOnWrite();
                    atqx atqxVar6 = (atqx) createBuilder.instance;
                    atqxVar6.b |= 64;
                    atqxVar6.i = longValue;
                    String str2 = asxsVar.getLocalizedStrings().c;
                    createBuilder.copyOnWrite();
                    atqx atqxVar7 = (atqx) createBuilder.instance;
                    str2.getClass();
                    atqxVar7.b |= 1024;
                    atqxVar7.l = str2;
                    String str3 = asxsVar.getLocalizedStrings().d;
                    createBuilder.copyOnWrite();
                    atqx atqxVar8 = (atqx) createBuilder.instance;
                    str3.getClass();
                    atqxVar8.b |= 2048;
                    atqxVar8.m = str3;
                    String str4 = asxsVar.getLocalizedStrings().e;
                    createBuilder.copyOnWrite();
                    atqx atqxVar9 = (atqx) createBuilder.instance;
                    str4.getClass();
                    atqxVar9.b |= 4096;
                    atqxVar9.n = str4;
                    avgg thumbnail = asxsVar.getThumbnail();
                    createBuilder.copyOnWrite();
                    atqx atqxVar10 = (atqx) createBuilder.instance;
                    thumbnail.getClass();
                    atqxVar10.d = thumbnail;
                    atqxVar10.b |= 2;
                    aqyg formattedDescription = asxsVar.getFormattedDescription();
                    createBuilder.copyOnWrite();
                    atqx atqxVar11 = (atqx) createBuilder.instance;
                    formattedDescription.getClass();
                    atqxVar11.k = formattedDescription;
                    atqxVar11.b |= 512;
                    if (f != null) {
                        aone createBuilder2 = atot.a.createBuilder();
                        aone createBuilder3 = atos.a.createBuilder();
                        String channelId = f.getChannelId();
                        createBuilder3.copyOnWrite();
                        atos atosVar = (atos) createBuilder3.instance;
                        channelId.getClass();
                        atosVar.b |= 1;
                        atosVar.c = channelId;
                        String title2 = f.getTitle();
                        createBuilder3.copyOnWrite();
                        atos atosVar2 = (atos) createBuilder3.instance;
                        title2.getClass();
                        atosVar2.b |= 4;
                        atosVar2.e = title2;
                        avgg avatar = f.getAvatar();
                        createBuilder3.copyOnWrite();
                        atos atosVar3 = (atos) createBuilder3.instance;
                        avatar.getClass();
                        atosVar3.d = avatar;
                        atosVar3.b |= 2;
                        createBuilder2.copyOnWrite();
                        atot atotVar = (atot) createBuilder2.instance;
                        atos atosVar4 = (atos) createBuilder3.build();
                        atosVar4.getClass();
                        atotVar.c = atosVar4;
                        atotVar.b |= 1;
                        atot atotVar2 = (atot) createBuilder2.build();
                        createBuilder.copyOnWrite();
                        atqx atqxVar12 = (atqx) createBuilder.instance;
                        atotVar2.getClass();
                        atqxVar12.e = atotVar2;
                        atqxVar12.b |= 4;
                    }
                    agssVar.m(agnp.c((atqx) createBuilder.build()));
                    agot a = agou.a();
                    a.a = 2;
                    aone createBuilder4 = atpq.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    atpq atpqVar2 = (atpq) createBuilder4.instance;
                    atpqVar2.c = 1;
                    atpqVar2.b |= 1;
                    String f2 = aalt.f(asxo.b.a(), str);
                    createBuilder4.copyOnWrite();
                    atpq atpqVar3 = (atpq) createBuilder4.instance;
                    f2.getClass();
                    atpqVar3.b |= 2;
                    atpqVar3.d = f2;
                    createBuilder4.copyOnWrite();
                    atpq atpqVar4 = (atpq) createBuilder4.instance;
                    atpoVar2.getClass();
                    atpqVar4.e = atpoVar2;
                    atpqVar4.b |= 4;
                    atpq atpqVar5 = (atpq) createBuilder4.build();
                    asxp asxpVar = (asxp) atpoVar2.pX(asxp.b);
                    aong aongVar = (aong) atpo.b.createBuilder();
                    int i2 = atpoVar2.d;
                    aongVar.copyOnWrite();
                    atpo atpoVar3 = (atpo) aongVar.instance;
                    atpoVar3.c |= 1;
                    atpoVar3.d = i2;
                    aongVar.cp(new aonw(atpoVar2.e, atpo.a));
                    if (!new aonw(((atpo) aongVar.instance).e, atpo.a).contains(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI)) {
                        aongVar.cq(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI);
                    }
                    aonk aonkVar = atwy.b;
                    aone createBuilder5 = atwy.a.createBuilder();
                    atrx b = atrx.b(asxpVar.c);
                    if (b == null) {
                        b = atrx.UNKNOWN_FORMAT_TYPE;
                    }
                    createBuilder5.copyOnWrite();
                    atwy atwyVar = (atwy) createBuilder5.instance;
                    atwyVar.e = b.k;
                    atwyVar.c |= 2;
                    aongVar.e(aonkVar, (atwy) createBuilder5.build());
                    aone createBuilder6 = atpq.a.createBuilder();
                    createBuilder6.copyOnWrite();
                    atpq atpqVar6 = (atpq) createBuilder6.instance;
                    atpqVar6.c = 1;
                    atpqVar6.b |= 1;
                    String f3 = aalt.f(atxc.b.a(), str);
                    createBuilder6.copyOnWrite();
                    atpq atpqVar7 = (atpq) createBuilder6.instance;
                    f3.getClass();
                    atpqVar7.b |= 2;
                    atpqVar7.d = f3;
                    atpo atpoVar4 = (atpo) aongVar.build();
                    createBuilder6.copyOnWrite();
                    atpq atpqVar8 = (atpq) createBuilder6.instance;
                    atpoVar4.getClass();
                    atpqVar8.e = atpoVar4;
                    atpqVar8.b |= 4;
                    a.b(amru.s(atpqVar5, (atpq) createBuilder6.build()));
                    return anaf.O(a.a());
                }
            }, angq.a);
        }
        if (i == 2) {
            final atpo atpoVar2 = atpqVar.e;
            if (atpoVar2 == null) {
                atpoVar2 = atpo.b;
            }
            return anfq.i(anht.q(anaf.S(new Callable() { // from class: jos
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    jot jotVar = jot.this;
                    afsx afsxVar2 = afsxVar;
                    String str = g;
                    agsn a = jotVar.b.a();
                    if (!afsxVar2.d().equals(a.q())) {
                        return agou.b;
                    }
                    a.k().q(str);
                    return agou.a;
                }
            }, angq.a)), new anfz() { // from class: jor
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    jot jotVar = jot.this;
                    final String str = g;
                    final atpo atpoVar3 = atpoVar2;
                    agou agouVar = (agou) obj;
                    if (agouVar == agou.a) {
                        aakv c = ((fja) jotVar.a).c();
                        return aney.h(anfq.h(anht.q(wbs.N(ayph.y(c.f(fhe.w()).g(awiu.class).c(new kvr(c, str, 1)), c.c().a(fhe.o(str)).b()))), new amml() { // from class: jop
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                String str2 = str;
                                atpo atpoVar4 = atpoVar3;
                                agot a = agou.a();
                                a.a = 2;
                                aone createBuilder = atpq.a.createBuilder();
                                createBuilder.copyOnWrite();
                                atpq atpqVar2 = (atpq) createBuilder.instance;
                                atpqVar2.c = 2;
                                atpqVar2.b |= 1;
                                String d = aalt.d(197, str2);
                                createBuilder.copyOnWrite();
                                atpq atpqVar3 = (atpq) createBuilder.instance;
                                d.getClass();
                                atpqVar3.b = 2 | atpqVar3.b;
                                atpqVar3.d = d;
                                createBuilder.copyOnWrite();
                                atpq atpqVar4 = (atpq) createBuilder.instance;
                                atpoVar4.getClass();
                                atpqVar4.e = atpoVar4;
                                atpqVar4.b |= 4;
                                a.b(amru.r((atpq) createBuilder.build()));
                                return a.a();
                            }
                        }, angq.a), Throwable.class, icu.s, angq.a);
                    }
                    return anaf.O(agouVar);
                }
            }, angq.a);
        }
        Object[] objArr = new Object[2];
        int bU2 = anaf.bU(atpqVar.c);
        if (bU2 == 0) {
            bU2 = 1;
        }
        objArr[0] = Integer.valueOf(bU2 - 1);
        objArr[1] = 261;
        zga.e("Could not handle action: %s for type %s", objArr);
        return anaf.O(agou.c);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        return anaf.O(amru.q());
    }
}
