package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrq {
    private final agrz a;

    public agrq(agrz agrzVar) {
        this.a = agrzVar;
    }

    public final agnp a(String str) {
        atqx atqxVar;
        yjk.e();
        agry a = this.a.a();
        a.a.add(str);
        a.k();
        try {
            Iterator it = this.a.b(a).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    atqxVar = null;
                    break;
                }
                atqy atqyVar = (atqy) it.next();
                atqx atqxVar2 = atqyVar.c;
                if (atqxVar2 == null) {
                    atqxVar2 = atqx.a;
                }
                if (atqxVar2.c.equals(str)) {
                    atqxVar = atqyVar.c;
                    if (atqxVar == null) {
                        atqxVar = atqx.a;
                    }
                }
            }
            if (atqxVar == null) {
                String valueOf = String.valueOf(str);
                throw new ExecutionException(new aasx(valueOf.length() != 0 ? "No video data returned for videoId=".concat(valueOf) : new String("No video data returned for videoId=")));
            }
            return agnp.c(atqxVar);
        } catch (aasx e) {
            throw new ExecutionException(e);
        }
    }

    public final agnx b(String str, int i) {
        ArrayList arrayList;
        int i2;
        yjk.e();
        agry a = this.a.a();
        a.b.add(str);
        a.k();
        try {
            arxa b = this.a.b(a);
            atqa i3 = ahbj.i(b, str);
            atqa i4 = ahbj.i(b, str);
            if (i4 != null) {
                arrayList = new ArrayList();
                Iterator it = i4.f.iterator();
                while (it.hasNext()) {
                    atqx atqxVar = ((atqy) it.next()).c;
                    if (atqxVar == null) {
                        atqxVar = atqx.a;
                    }
                    arrayList.add(atqxVar);
                }
            } else {
                arrayList = null;
            }
            if (i3 == null || arrayList == null) {
                return null;
            }
            if (i3.f.size() != 0) {
                i2 = i3.f.size();
                aone builder = i3.toBuilder();
                builder.copyOnWrite();
                ((atqa) builder.instance).f = atqa.emptyProtobufList();
                i3 = (atqa) builder.build();
            } else {
                i2 = 0;
            }
            avgg avggVar = i3.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            aami aamiVar = new aami(avggVar);
            atot atotVar = i3.e;
            if (atotVar == null) {
                atotVar = atot.a;
            }
            agng c = agng.c(i3, false, i2, aamiVar, agnb.a(atotVar));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(agnp.c((atqx) it2.next()));
            }
            agnx agnxVar = new agnx(c, arrayList2);
            if (i < 0) {
                return null;
            }
            agng agngVar = agnxVar.a;
            List list = agnxVar.b;
            List subList = list.subList(0, Math.min(list.size(), i));
            return new agnx(new agng(agngVar, subList.size()), subList);
        } catch (aasx e) {
            throw new ExecutionException(e);
        }
    }

    public final arwx c(long j, long j2, int i, float f, List list) {
        yjk.e();
        agrz agrzVar = this.a;
        agrx agrxVar = new agrx(agrzVar.f, agrzVar.a.c(), agrzVar.c, null, null, null);
        agrxVar.c = j;
        agrxVar.d = j2;
        agrxVar.s = i;
        agrxVar.t = f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agrp agrpVar = (agrp) it.next();
            String str = agrpVar.a;
            long j3 = agrpVar.b;
            String[] strArr = agrpVar.c;
            long j4 = agrpVar.d;
            long j5 = agrpVar.e;
            agzr.d(agrxVar.a);
            aone createBuilder = arwu.a.createBuilder();
            createBuilder.copyOnWrite();
            arwu arwuVar = (arwu) createBuilder.instance;
            arwuVar.b |= 1;
            arwuVar.c = str;
            createBuilder.copyOnWrite();
            arwu arwuVar2 = (arwu) createBuilder.instance;
            arwuVar2.b |= 2;
            arwuVar2.d = j3;
            List asList = Arrays.asList(strArr);
            createBuilder.copyOnWrite();
            arwu arwuVar3 = (arwu) createBuilder.instance;
            aony aonyVar = arwuVar3.e;
            if (!aonyVar.c()) {
                arwuVar3.e = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) asList, (List) arwuVar3.e);
            createBuilder.copyOnWrite();
            arwu arwuVar4 = (arwu) createBuilder.instance;
            arwuVar4.b |= 4;
            arwuVar4.f = true;
            createBuilder.copyOnWrite();
            arwu arwuVar5 = (arwu) createBuilder.instance;
            arwuVar5.b |= 8;
            arwuVar5.g = j4;
            createBuilder.copyOnWrite();
            arwu arwuVar6 = (arwu) createBuilder.instance;
            arwuVar6.b |= 16;
            arwuVar6.h = 0L;
            agrxVar.b.add((arwu) createBuilder.build());
        }
        agrxVar.k();
        try {
            return (arwx) this.a.b.d(agrxVar);
        } catch (aasx e) {
            throw new ExecutionException(e);
        }
    }
}
