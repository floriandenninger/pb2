package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkd extends jhk {
    private final azrw a;

    public jkd(azrw azrwVar) {
        this.a = azrwVar;
    }

    private final void g(agng agngVar) {
        awjd awjdVar;
        int aM;
        amsj amsjVar = (amsj) this.a.get();
        String f = etx.f(agngVar.a);
        if (agngVar.a.startsWith("BL")) {
            atoo g = etx.g(agngVar);
            int i = 1;
            if (g != null && (g.b & 1) != 0 && (aM = anaf.aM(g.c)) != 0) {
                i = aM;
            }
            int i2 = i - 1;
            if (i2 == 2) {
                awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO_AVATAR;
            } else if (i2 != 3) {
                awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_TWO_BY_TWO;
            } else {
                awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO;
            }
        } else {
            awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO;
        }
        amsjVar.a.put(f, awjdVar);
    }

    private static final awiy l(agni agniVar) {
        avgg avggVar;
        agng agngVar = agniVar.a;
        List list = agniVar.b;
        String str = agngVar.a;
        String t = fhe.t(str);
        t.getClass();
        amkq.O(!t.isEmpty(), "key cannot be empty");
        aone createBuilder = awjc.a.createBuilder();
        createBuilder.copyOnWrite();
        awjc awjcVar = (awjc) createBuilder.instance;
        awjcVar.c |= 1;
        awjcVar.d = t;
        awiy awiyVar = new awiy(createBuilder);
        aone aoneVar = awiyVar.a;
        aoneVar.copyOnWrite();
        awjc awjcVar2 = (awjc) aoneVar.instance;
        awjcVar2.c |= 4;
        awjcVar2.e = str;
        String str2 = agngVar.b;
        aone aoneVar2 = awiyVar.a;
        aoneVar2.copyOnWrite();
        awjc awjcVar3 = (awjc) aoneVar2.instance;
        str2.getClass();
        awjcVar3.c |= 16;
        awjcVar3.g = str2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String[] strArr = {fhe.u(str, (String) it.next())};
            for (int i = 0; i <= 0; i++) {
                String str3 = strArr[i];
                aone aoneVar3 = awiyVar.a;
                aoneVar3.copyOnWrite();
                awjc awjcVar4 = (awjc) aoneVar3.instance;
                str3.getClass();
                aony aonyVar = awjcVar4.l;
                if (!aonyVar.c()) {
                    awjcVar4.l = aonm.mutableCopy(aonyVar);
                }
                awjcVar4.l.add(str3);
            }
        }
        agnb agnbVar = agngVar.c;
        if (agnbVar != null) {
            String c = fhe.c(agnbVar.a);
            aone aoneVar4 = awiyVar.a;
            aoneVar4.copyOnWrite();
            awjc awjcVar5 = (awjc) aoneVar4.instance;
            c.getClass();
            awjcVar5.c |= 8;
            awjcVar5.f = c;
        }
        Integer valueOf = Integer.valueOf(awjd.PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO.f);
        aone createBuilder2 = aucv.a.createBuilder();
        avgg e = agngVar.e.e();
        createBuilder2.copyOnWrite();
        aucv aucvVar = (aucv) createBuilder2.instance;
        e.getClass();
        aucvVar.c = e;
        aucvVar.b = 1;
        awiyVar.b(valueOf, (aucv) createBuilder2.build());
        atoo g = etx.g(agngVar);
        if (g == null || (g.b & 2) == 0) {
            avggVar = null;
        } else {
            avggVar = g.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        }
        awiyVar.b(4, evr.bG(avggVar));
        awiyVar.b(3, evr.bG(avggVar));
        awiyVar.b(2, evr.bG(null));
        awiyVar.b(0, evr.bG(null));
        return awiyVar;
    }

    @Override // defpackage.jhk
    protected final amsx a(agsl agslVar) {
        amsv i = amsx.i();
        for (agni agniVar : agslVar.j()) {
            i.c(l(agniVar));
            g(agniVar.a);
        }
        return i.g();
    }

    @Override // defpackage.jhk
    protected final void c(aalc aalcVar, agni agniVar) {
        aalcVar.k(l(agniVar));
        g(agniVar.a);
    }

    @Override // defpackage.jhk
    protected final void d(aalc aalcVar, String str) {
        aalcVar.g(fhe.t(str));
        amsj amsjVar = (amsj) this.a.get();
        amsjVar.a.remove(etx.f(str));
    }

    @Override // defpackage.jhk
    protected final void e(aalc aalcVar, agni agniVar, agnh agnhVar) {
        aalcVar.k(l(agniVar));
    }

    @Override // defpackage.jhk
    protected final void f(aalc aalcVar, agni agniVar) {
        aalcVar.k(l(agniVar));
        g(agniVar.a);
    }
}
