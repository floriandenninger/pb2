package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyu implements affk {
    final /* synthetic */ aeyh a;

    public aeyu(aeyh aeyhVar) {
        this.a = aeyhVar;
    }

    @Override // defpackage.affk
    public final aefm b(aefl aeflVar) {
        aefn aefnVar = aeflVar.d;
        if (aefnVar == null) {
            aefnVar = aefn.a;
        }
        if ((aeflVar.b & 1) != 0) {
            int i = aefnVar.b;
            if ((i & 1) != 0 && (i & 2) != 0) {
                aeyh aeyhVar = this.a;
                ovw a = ovw.a(aeflVar.c);
                if (a == null) {
                    a = ovw.TRACK_TYPE_AUDIO;
                }
                ajcb ajcbVar = aefnVar.c;
                if (ajcbVar == null) {
                    ajcbVar = ajcb.a;
                }
                List c = aeyhVar.c(a).c(ajcbVar, aefnVar.d, aeflVar.e);
                aone createBuilder = aefm.a.createBuilder();
                int i2 = 0;
                while (true) {
                    int i3 = -1;
                    while (i2 < c.size()) {
                        aeyf aeyfVar = (aeyf) c.get(i2);
                        if (i3 == -1) {
                            i3 = aeyfVar.b;
                        }
                        i2++;
                        if (i2 >= c.size() || !((aeyf) c.get(i2)).a.equals(aeyfVar.a)) {
                            aone createBuilder2 = aefn.a.createBuilder();
                            ajcb ajcbVar2 = aeyfVar.a;
                            createBuilder2.copyOnWrite();
                            aefn aefnVar2 = (aefn) createBuilder2.instance;
                            ajcbVar2.getClass();
                            aefnVar2.c = ajcbVar2;
                            aefnVar2.b |= 1;
                            createBuilder2.copyOnWrite();
                            aefn aefnVar3 = (aefn) createBuilder2.instance;
                            aefnVar3.b |= 2;
                            aefnVar3.d = i3;
                            int i4 = aeyfVar.b;
                            createBuilder2.copyOnWrite();
                            aefn aefnVar4 = (aefn) createBuilder2.instance;
                            aefnVar4.b |= 4;
                            aefnVar4.e = i4;
                            aefn aefnVar5 = (aefn) createBuilder2.build();
                            createBuilder.copyOnWrite();
                            aefm aefmVar = (aefm) createBuilder.instance;
                            aefnVar5.getClass();
                            aony aonyVar = aefmVar.b;
                            if (!aonyVar.c()) {
                                aefmVar.b = aonm.mutableCopy(aonyVar);
                            }
                            aefmVar.b.add(aefnVar5);
                        }
                    }
                    return (aefm) createBuilder.build();
                }
            }
        }
        return aefm.a;
    }

    @Override // defpackage.affk
    public final aefk a(aefj aefjVar) {
        if ((aefjVar.b & 1) == 0) {
            return aefk.a;
        }
        aeyh aeyhVar = this.a;
        ovw a = ovw.a(aefjVar.c);
        if (a == null) {
            a = ovw.TRACK_TYPE_AUDIO;
        }
        aeyhVar.c(a).e();
        aone createBuilder = aefk.a.createBuilder();
        createBuilder.copyOnWrite();
        aefk aefkVar = (aefk) createBuilder.instance;
        aefkVar.b |= 1;
        aefkVar.c = true;
        return (aefk) createBuilder.build();
    }

    @Override // defpackage.affk
    public final aefp c(aefo aefoVar) {
        if ((aefoVar.b & 1) == 0) {
            return aefp.a;
        }
        aeyh aeyhVar = this.a;
        long c = aeyc.c(aefoVar.c);
        ArrayList arrayList = new ArrayList(2);
        if (aeyhVar.a.i(c)) {
            arrayList.add(ovw.TRACK_TYPE_AUDIO);
        }
        if (aeyhVar.b.i(c)) {
            arrayList.add(ovw.TRACK_TYPE_VIDEO);
        }
        aone createBuilder = aefp.a.createBuilder();
        createBuilder.copyOnWrite();
        aefp aefpVar = (aefp) createBuilder.instance;
        aonu aonuVar = aefpVar.b;
        if (!aonuVar.c()) {
            aefpVar.b = aonm.mutableCopy(aonuVar);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aefpVar.b.g(((ovw) it.next()).d);
        }
        return (aefp) createBuilder.build();
    }
}
