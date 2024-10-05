package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjr extends jhl {
    private final azrw a;

    public jjr(azrw azrwVar) {
        this.a = azrwVar;
    }

    private static atwz h(agnv agnvVar, Map map) {
        PlayerResponseModel playerResponseModel = agnvVar.p;
        aryr aryrVar = playerResponseModel == null ? aryr.a : playerResponseModel.a;
        String m = agnvVar.m();
        long j = agnvVar.f;
        amsx bU = evr.bU(map, agnvVar.m());
        String s = fhe.s(m);
        s.getClass();
        amkq.O(!s.isEmpty(), "key cannot be empty");
        aone createBuilder = atxc.a.createBuilder();
        createBuilder.copyOnWrite();
        atxc atxcVar = (atxc) createBuilder.instance;
        atxcVar.c |= 1;
        atxcVar.d = s;
        atwz atwzVar = new atwz(createBuilder);
        aomf byteString = aryrVar.toByteString();
        aone aoneVar = atwzVar.a;
        aoneVar.copyOnWrite();
        atxc atxcVar2 = (atxc) aoneVar.instance;
        atxcVar2.c |= 2;
        atxcVar2.e = byteString;
        Long valueOf = Long.valueOf(j);
        aone aoneVar2 = atwzVar.a;
        long longValue = valueOf.longValue();
        aoneVar2.copyOnWrite();
        atxc atxcVar3 = (atxc) aoneVar2.instance;
        atxcVar3.c |= 8;
        atxcVar3.g = longValue;
        String q = fhe.q(m);
        aone aoneVar3 = atwzVar.a;
        aoneVar3.copyOnWrite();
        atxc atxcVar4 = (atxc) aoneVar3.instance;
        q.getClass();
        atxcVar4.c |= 128;
        atxcVar4.l = q;
        String x = fhe.x(m);
        aone aoneVar4 = atwzVar.a;
        aoneVar4.copyOnWrite();
        atxc atxcVar5 = (atxc) aoneVar4.instance;
        x.getClass();
        atxcVar5.c |= 32;
        atxcVar5.i = x;
        String l = fhe.l(m);
        aone aoneVar5 = atwzVar.a;
        aoneVar5.copyOnWrite();
        atxc atxcVar6 = (atxc) aoneVar5.instance;
        l.getClass();
        atxcVar6.c |= 64;
        atxcVar6.k = l;
        amxd listIterator = bU.listIterator();
        while (listIterator.hasNext()) {
            String[] strArr = {fhe.b((String) listIterator.next())};
            for (int i = 0; i <= 0; i++) {
                String str = strArr[i];
                aone aoneVar6 = atwzVar.a;
                aoneVar6.copyOnWrite();
                atxc atxcVar7 = (atxc) aoneVar6.instance;
                str.getClass();
                aony aonyVar = atxcVar7.j;
                if (!aonyVar.c()) {
                    atxcVar7.j = aonm.mutableCopy(aonyVar);
                }
                atxcVar7.j.add(str);
            }
        }
        return atwzVar;
    }

    private final Map i() {
        return ((agof) this.a.get()).a().g().f();
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        amsv i = amsx.i();
        Map i2 = i();
        Iterator it = agswVar.j().iterator();
        while (it.hasNext()) {
            i.c(h((agnv) it.next(), i2));
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void b(aalc aalcVar, agnv agnvVar) {
        aalcVar.k(h(agnvVar, i()));
    }

    @Override // defpackage.jhl
    protected final void e(aalc aalcVar, String str) {
        aalcVar.g(fhe.s(str));
    }
}
