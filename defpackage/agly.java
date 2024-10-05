package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agly implements agoy {
    static final long a = TimeUnit.DAYS.toSeconds(2);
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final aais e;
    private final zgj f;
    private final ypa g;
    private final shf h;
    private final agzp i;
    private final agzr j;

    public agly(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, aais aaisVar, zgj zgjVar, ypa ypaVar, shf shfVar, agzp agzpVar, agzr agzrVar) {
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = aaisVar;
        this.f = zgjVar;
        this.g = ypaVar;
        this.h = shfVar;
        this.i = agzpVar;
        this.j = agzrVar;
    }

    private final anhy d(afsx afsxVar, String str, atpo atpoVar) {
        atxb atxbVar = (atxb) this.e.a(afsxVar).f(aalt.f(119, str)).g(atxb.class).X();
        PlayerResponseModel playerResponseModel = null;
        PlayerResponseModel h = (atxbVar == null || !atxbVar.h()) ? null : PlayerResponseModel.h(atxbVar.getPlayerResponseBytes().I(), 0L);
        if (h == null) {
            try {
                playerResponseModel = ((agzx) this.b.get()).l(str, 2, ((atwy) atpoVar.pX(atwy.b)).d.I());
            } catch (aasx unused) {
            }
        } else {
            playerResponseModel = h;
        }
        if (playerResponseModel == null) {
            return anaf.O(agou.c);
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData == null) {
            return anaf.O(agou.c);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(videoStreamingData);
        if (this.j.h()) {
            Iterator it = this.i.a(playerResponseModel).iterator();
            while (it.hasNext()) {
                VideoStreamingData videoStreamingData2 = ((PlayerResponseModel) it.next()).c;
                if (videoStreamingData2 != null) {
                    arrayList.add(videoStreamingData2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VideoStreamingData videoStreamingData3 = (VideoStreamingData) arrayList.get(i);
            String a2 = this.f.a();
            String o = videoStreamingData3.o();
            String str2 = videoStreamingData3.j;
            String str3 = videoStreamingData3.c;
            aepm aepmVar = (aepm) this.c.get();
            try {
                aepmVar.b(str3, a2, o, str2);
                arrayList2.add(aepmVar.f(videoStreamingData3.p, a2));
            } catch (aepj e) {
                agsn a3 = ((agof) this.d.get()).a();
                agil A = a3.A();
                if (A != null) {
                    A.V(str, agnf.CANNOT_OFFLINE);
                    try {
                        ammv ammvVar = (ammv) a3.m().h(str).get();
                        if (ammvVar.h()) {
                            this.g.f(new agli((agnv) ammvVar.c(), atqs.NOT_PLAYABLE));
                        }
                    } catch (InterruptedException | ExecutionException unused2) {
                    }
                }
                aair a4 = this.e.a(afsxVar);
                aqpb aqpbVar = e.a;
                aalc c = a4.c();
                String g = g(str);
                if (aqpbVar != null) {
                    aqox d = aqoy.d(g);
                    aone aoneVar = d.a;
                    aoneVar.copyOnWrite();
                    aqpc aqpcVar = (aqpc) aoneVar.instance;
                    aqpc aqpcVar2 = aqpc.a;
                    aqpcVar.i = aqpbVar;
                    aqpcVar.c |= 16;
                    aqoz b = d.b();
                    c.g(g);
                    c.d(b);
                    c.b().T();
                    b.toString();
                }
                return anaf.O(agou.c);
            }
        }
        h(this.e.a(afsxVar), str, arrayList2);
        return anaf.O(agou.a);
    }

    private final anhy e(afsx afsxVar, String str, atpo atpoVar) {
        aqoz f;
        aair a2 = this.e.a(afsxVar);
        aqov aqovVar = (aqov) atpoVar.pX(aqov.b);
        if ((aqovVar.c & 64) != 0) {
            aqpc aqpcVar = aqovVar.e;
            if (aqpcVar == null) {
                aqpcVar = aqpc.a;
            }
            f = aqoz.b(aqpcVar).b();
        } else {
            f = f(a2, str);
        }
        if (f == null || f.getLicenses().isEmpty()) {
            return anaf.O(agou.a);
        }
        boolean z = false;
        for (aqpd aqpdVar : f.getLicenses()) {
            String a3 = this.f.a();
            String str2 = aqpdVar.g;
            String str3 = aqpdVar.h;
            String str4 = aqpdVar.i;
            aepm aepmVar = (aepm) this.c.get();
            try {
                aepmVar.b(str4, a3, str2, str3);
                aepmVar.g(aqpdVar, f.getPlaybackStartSeconds().longValue());
            } catch (aepj unused) {
                z = true;
            }
        }
        agmw agmwVar = new agmw(aaku.a);
        agmwVar.g("license_released", true);
        aalc c = a2.c();
        c.e(f, agmwVar.e());
        c.a(f.d()).b().T();
        return anaf.O(z ? agou.c : agou.a);
    }

    private static aqoz f(aair aairVar, String str) {
        return (aqoz) aairVar.f(g(str)).g(aqoz.class).X();
    }

    private static String g(String str) {
        return aalt.f(146, str);
    }

    private final void h(aair aairVar, String str, List list) {
        aalc c = aairVar.c();
        String g = g(str);
        if (list.isEmpty()) {
            return;
        }
        aqpd aqpdVar = (aqpd) list.get(0);
        aqox d = aqoy.d(g);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aqpd aqpdVar2 = (aqpd) it.next();
                aone aoneVar = d.a;
                aoneVar.copyOnWrite();
                aqpc aqpcVar = (aqpc) aoneVar.instance;
                aqpc aqpcVar2 = aqpc.a;
                aqpdVar2.getClass();
                aony aonyVar = aqpcVar.e;
                if (!aonyVar.c()) {
                    aqpcVar.e = aonm.mutableCopy(aonyVar);
                }
                aqpcVar.e.add(aqpdVar2);
            }
        }
        if (aqpdVar.d > 0) {
            Long valueOf = Long.valueOf((this.h.c() / 1000) + aqpdVar.d);
            aone aoneVar2 = d.a;
            long longValue = valueOf.longValue();
            aoneVar2.copyOnWrite();
            aqpc aqpcVar3 = (aqpc) aoneVar2.instance;
            aqpc aqpcVar4 = aqpc.a;
            aqpcVar3.c |= 4;
            aqpcVar3.g = longValue;
        }
        String f = aalt.f(148, g);
        if (aqpdVar.f) {
            long longValue2 = Long.valueOf(((aqpc) d.a.instance).g).longValue();
            long j = a;
            f.getClass();
            amkq.O(!f.isEmpty(), "key cannot be empty");
            aone createBuilder = aule.a.createBuilder();
            createBuilder.copyOnWrite();
            aule auleVar = (aule) createBuilder.instance;
            auleVar.b |= 1;
            auleVar.c = f;
            aulb aulbVar = new aulb(createBuilder);
            Long valueOf2 = Long.valueOf(longValue2 - j);
            aone aoneVar3 = aulbVar.a;
            long longValue3 = valueOf2.longValue();
            aoneVar3.copyOnWrite();
            aule auleVar2 = (aule) aoneVar3.instance;
            auleVar2.b |= 2;
            auleVar2.d = longValue3;
            auld b = aulbVar.b();
            c.d(b);
            String d2 = b.d();
            aone aoneVar4 = d.a;
            aoneVar4.copyOnWrite();
            aqpc aqpcVar5 = (aqpc) aoneVar4.instance;
            d2.getClass();
            aqpcVar5.c |= 8;
            aqpcVar5.h = d2;
        } else {
            auld auldVar = (auld) aairVar.f(f).g(auld.class).X();
            if (auldVar != null) {
                c.h(auldVar);
            }
        }
        aqoz b2 = d.b();
        c.d(b2);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(((aqpd) it2.next()).i);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (!sb2.isEmpty()) {
            awxk d3 = aaku.d();
            d3.t("drmAssociatedVideos", sb2);
            c.f(b2.d(), d3.s());
        }
        c.b().T();
        b2.toString();
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        String g = aalt.g(atpqVar.d);
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i == 1) {
            atpo atpoVar = atpqVar.e;
            if (atpoVar == null) {
                atpoVar = atpo.b;
            }
            return d(afsxVar, g, atpoVar);
        }
        if (i == 2) {
            atpo atpoVar2 = atpqVar.e;
            if (atpoVar2 == null) {
                atpoVar2 = atpo.b;
            }
            return e(afsxVar, g, atpoVar2);
        }
        if (i != 3) {
            if (i == 4) {
                atpo atpoVar3 = atpqVar.e;
                if (atpoVar3 == null) {
                    atpoVar3 = atpo.b;
                }
                aqov aqovVar = (aqov) atpoVar3.pX(aqov.b);
                aair a2 = this.e.a(afsxVar);
                long j = aqovVar.d;
                aqoz f = f(a2, g);
                if (f.getPlaybackStartSeconds().longValue() == 0) {
                    aalc c = a2.c();
                    aqox b = aqoz.b(f.b);
                    Long valueOf = Long.valueOf(j);
                    aone aoneVar = b.a;
                    long longValue = valueOf.longValue();
                    aoneVar.copyOnWrite();
                    aqpc aqpcVar = (aqpc) aoneVar.instance;
                    aqpc aqpcVar2 = aqpc.a;
                    aqpcVar.c |= 2;
                    aqpcVar.f = longValue;
                    c.k(b);
                    c.b().T();
                }
                return anaf.O(agou.a);
            }
            return anaf.O(agou.c);
        }
        atpo atpoVar4 = atpqVar.e;
        if (atpoVar4 == null) {
            atpoVar4 = atpo.b;
        }
        aair a3 = this.e.a(afsxVar);
        aqoz f2 = f(a3, g);
        if (!((aqov) atpoVar4.pX(aqov.b)).f) {
            if (f2 == null || f2.getLicenses().isEmpty()) {
                return anaf.O(agou.c);
            }
            ArrayList arrayList = new ArrayList();
            for (aqpd aqpdVar : f2.getLicenses()) {
                String a4 = this.f.a();
                String str = aqpdVar.g;
                String str2 = aqpdVar.h;
                String str3 = aqpdVar.i;
                aepm aepmVar = (aepm) this.c.get();
                try {
                    aepmVar.b(str3, a4, str, str2);
                    aqpd a5 = aepmVar.a(aqpdVar);
                    if (a5 != null) {
                        arrayList.add(a5);
                    } else {
                        return anaf.O(agou.c);
                    }
                } catch (aepj unused) {
                    return anaf.O(agou.c);
                }
            }
            h(a3, g, arrayList);
            return anaf.O(agou.a);
        }
        e(afsxVar, g, atpoVar4);
        return d(afsxVar, g, atpoVar4);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        throw new UnsupportedOperationException();
    }
}
