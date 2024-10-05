package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxm {
    public final azrw a;
    public final bph b;
    public final azrw c;
    public final Executor d;
    private final azrw g;
    private final adlt h;
    public atbc f = atbc.a;
    public final acxl e = new acxl(this);

    public acxm(azrw azrwVar, azrw azrwVar2, bph bphVar, azrw azrwVar3, Executor executor, adlt adltVar) {
        this.g = azrwVar;
        this.a = azrwVar2;
        this.b = bphVar;
        this.c = azrwVar3;
        this.d = executor;
        this.h = adltVar;
    }

    public final atbc a(List list) {
        yjk.f();
        aone createBuilder = atbc.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bpv bpvVar = (bpv) it.next();
            aone createBuilder2 = atbe.a.createBuilder();
            String str = bpvVar.d;
            createBuilder2.copyOnWrite();
            atbe atbeVar = (atbe) createBuilder2.instance;
            str.getClass();
            atbeVar.b |= 1;
            atbeVar.c = str;
            String str2 = bpvVar.c;
            createBuilder2.copyOnWrite();
            atbe atbeVar2 = (atbe) createBuilder2.instance;
            str2.getClass();
            int i = 2;
            atbeVar2.b |= 2;
            atbeVar2.d = str2;
            if (!adee.e(bpvVar)) {
                Stream.CC.concat(Collection.EL.stream(((adlj) this.g.get()).b()), Collection.EL.stream(((adlj) this.g.get()).c())).filter(new opz(adgb.q(bpvVar.q), 5)).findFirst().ifPresent(new wkx(createBuilder2, i));
            }
            adlm g = this.h.g();
            if (g != null && bpvVar.m()) {
                if (g.l() != null) {
                    String str3 = g.l().c;
                    createBuilder2.copyOnWrite();
                    atbe atbeVar3 = (atbe) createBuilder2.instance;
                    atbeVar3.b |= 4;
                    atbeVar3.e = str3;
                }
                atbe atbeVar4 = (atbe) createBuilder2.build();
                createBuilder.copyOnWrite();
                atbc atbcVar = (atbc) createBuilder.instance;
                atbeVar4.getClass();
                atbcVar.d = atbeVar4;
                atbcVar.b |= 1;
            }
            atbe atbeVar5 = (atbe) createBuilder2.build();
            createBuilder.copyOnWrite();
            atbc atbcVar2 = (atbc) createBuilder.instance;
            atbeVar5.getClass();
            aony aonyVar = atbcVar2.c;
            if (!aonyVar.c()) {
                atbcVar2.c = aonm.mutableCopy(aonyVar);
            }
            atbcVar2.c.add(atbeVar5);
        }
        return (atbc) createBuilder.build();
    }
}
