package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzj implements tzf {
    static final List a = Arrays.asList(aoic.SHOWN, aoic.SHOWN_REPLACED, aoic.SHOWN_FORCED);
    private final tyu A;
    public final aoic b;
    public final aohx c;
    public final twn d;
    public final uak e;
    public final uaj f;
    public final ubo g;
    public Long r;
    public final Long s;
    public final int u;
    public final tzh z;
    public String h = null;
    public int v = 0;
    public final List i = new ArrayList();
    public int w = 0;
    public aohq j = null;
    public udc k = null;
    public String l = null;
    public String m = null;
    public aohi n = null;
    public ubl o = null;
    public ubn p = null;
    public final List q = new ArrayList();
    public tzg t = null;
    public int x = 0;
    public int y = 0;

    public tzj(tzh tzhVar, shf shfVar, aoic aoicVar, int i, aohx aohxVar, twn twnVar, uak uakVar, uaj uajVar, ubo uboVar, tyu tyuVar) {
        this.z = tzhVar;
        this.b = aoicVar;
        this.u = i;
        this.c = aohxVar;
        this.d = twnVar;
        this.e = uakVar;
        this.f = uajVar;
        this.g = uboVar;
        this.A = tyuVar;
        this.r = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(shfVar.c()));
        this.s = Long.valueOf(shfVar.d());
    }

    @Override // defpackage.tzf
    public final tzf a(String str) {
        ubl ublVar;
        Iterator it = this.g.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                ublVar = null;
                break;
            }
            ublVar = (ubl) it.next();
            if (ublVar.a.equals(str)) {
                break;
            }
        }
        this.o = ublVar;
        return this;
    }

    @Override // defpackage.tzf
    public final tzf b(txb txbVar) {
        List list = this.q;
        aone createBuilder = aoha.a.createBuilder();
        String str = txbVar.a;
        createBuilder.copyOnWrite();
        aoha aohaVar = (aoha) createBuilder.instance;
        str.getClass();
        aohaVar.b |= 1;
        aohaVar.c = str;
        long longValue = txbVar.b.longValue();
        createBuilder.copyOnWrite();
        aoha aohaVar2 = (aoha) createBuilder.instance;
        aohaVar2.b |= 2;
        aohaVar2.d = longValue;
        long longValue2 = txbVar.f.longValue();
        createBuilder.copyOnWrite();
        aoha aohaVar3 = (aoha) createBuilder.instance;
        aohaVar3.b |= 4;
        aohaVar3.e = longValue2;
        String str2 = txbVar.j;
        createBuilder.copyOnWrite();
        aoha aohaVar4 = (aoha) createBuilder.instance;
        str2.getClass();
        aohaVar4.b |= 8;
        aohaVar4.f = str2;
        aojz aojzVar = txbVar.d.o;
        if (aojzVar == null) {
            aojzVar = aojz.a;
        }
        String str3 = aojzVar.b;
        createBuilder.copyOnWrite();
        aoha aohaVar5 = (aoha) createBuilder.instance;
        str3.getClass();
        aohaVar5.b |= 16;
        aohaVar5.g = str3;
        list.add((aoha) createBuilder.build());
        return this;
    }

    @Override // defpackage.tzf
    public final tzf c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((txb) it.next());
        }
        return this;
    }

    @Override // defpackage.tzf
    public final tzf d(twu twuVar) {
        if (twuVar != null) {
            this.l = twuVar.b;
            this.m = twuVar.c;
        }
        return this;
    }

    @Override // defpackage.tzf
    public final tzf e(aokh aokhVar) {
        aokd aokdVar;
        aokd aokdVar2;
        if (aokhVar != null && !TextUtils.isEmpty(aokhVar.d)) {
            List list = this.q;
            aone createBuilder = aoha.a.createBuilder();
            String str = aokhVar.d;
            createBuilder.copyOnWrite();
            aoha aohaVar = (aoha) createBuilder.instance;
            str.getClass();
            aohaVar.b |= 1;
            aohaVar.c = str;
            long j = aokhVar.h;
            createBuilder.copyOnWrite();
            aoha aohaVar2 = (aoha) createBuilder.instance;
            aohaVar2.b |= 2;
            aohaVar2.d = j;
            long j2 = aokhVar.e;
            createBuilder.copyOnWrite();
            aoha aohaVar3 = (aoha) createBuilder.instance;
            aohaVar3.b |= 4;
            aohaVar3.e = j2;
            if (aokhVar.b == 12) {
                aokdVar = (aokd) aokhVar.c;
            } else {
                aokdVar = aokd.a;
            }
            String str2 = aokdVar.n;
            createBuilder.copyOnWrite();
            aoha aohaVar4 = (aoha) createBuilder.instance;
            str2.getClass();
            aohaVar4.b |= 8;
            aohaVar4.f = str2;
            if (aokhVar.b == 12) {
                aokdVar2 = (aokd) aokhVar.c;
            } else {
                aokdVar2 = aokd.a;
            }
            aojz aojzVar = aokdVar2.o;
            if (aojzVar == null) {
                aojzVar = aojz.a;
            }
            String str3 = aojzVar.b;
            createBuilder.copyOnWrite();
            aoha aohaVar5 = (aoha) createBuilder.instance;
            str3.getClass();
            aohaVar5.b |= 16;
            aohaVar5.g = str3;
            list.add((aoha) createBuilder.build());
        }
        return this;
    }

    @Override // defpackage.tzf
    public final tzf f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((aokh) it.next());
        }
        return this;
    }

    @Override // defpackage.tzf
    public final tzf g(long j) {
        this.r = Long.valueOf(j);
        return this;
    }

    @Override // defpackage.tzf
    public final tzf h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aojv aojvVar = (aojv) it.next();
            List list2 = this.q;
            aone createBuilder = aoha.a.createBuilder();
            String str = aojvVar.c;
            createBuilder.copyOnWrite();
            aoha aohaVar = (aoha) createBuilder.instance;
            str.getClass();
            aohaVar.b |= 1;
            aohaVar.c = str;
            long j = aojvVar.d;
            createBuilder.copyOnWrite();
            aoha aohaVar2 = (aoha) createBuilder.instance;
            aohaVar2.b |= 2;
            aohaVar2.d = j;
            long j2 = aojvVar.e;
            createBuilder.copyOnWrite();
            aoha aohaVar3 = (aoha) createBuilder.instance;
            aohaVar3.b |= 4;
            aohaVar3.e = j2;
            list2.add((aoha) createBuilder.build());
        }
        return this;
    }

    @Override // defpackage.tzf
    public final void i() {
        this.A.b(new Runnable() { // from class: tzi
            /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0455  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1434
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tzi.run():void");
            }
        });
    }
}
