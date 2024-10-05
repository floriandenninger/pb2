package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uam implements uah {
    private final udm a;
    private final uan b;
    private final uao c;
    private final uaq d;
    private final uar e;
    private final tzh f;
    private final uaq g;
    private final uan h;
    private final uaq i;
    private final uan j;

    public uam(uaq uaqVar, udm udmVar, uan uanVar, uaq uaqVar2, uan uanVar2, uan uanVar3, uao uaoVar, uaq uaqVar3, uar uarVar, tzh tzhVar, byte[] bArr, byte[] bArr2) {
        this.i = uaqVar;
        this.a = udmVar;
        this.j = uanVar;
        this.g = uaqVar2;
        this.h = uanVar2;
        this.b = uanVar3;
        this.c = uaoVar;
        this.d = uaqVar3;
        this.e = uarVar;
        this.f = tzhVar;
    }

    private final void j(String str, udn udnVar, int i) {
        if (udnVar.b != null) {
            tzf c = this.f.c(i);
            ((tzj) c).l = str;
            c.i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r9.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    @Override // defpackage.uah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uag a(java.lang.String r17, java.util.List r18, defpackage.aoko r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uam.a(java.lang.String, java.util.List, aoko):uag");
    }

    @Override // defpackage.uah
    public final uag b(String str, List list, aoko aokoVar) {
        try {
            uan uanVar = this.j;
            aojt b = uanVar.c.b();
            aone createBuilder = aoiv.a.createBuilder();
            String str2 = uanVar.a.a;
            createBuilder.copyOnWrite();
            aoiv aoivVar = (aoiv) createBuilder.instance;
            str2.getClass();
            aoivVar.b |= 1;
            aoivVar.c = str2;
            createBuilder.copyOnWrite();
            aoiv aoivVar2 = (aoiv) createBuilder.instance;
            aony aonyVar = aoivVar2.d;
            if (!aonyVar.c()) {
                aoivVar2.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) aoivVar2.d);
            aone createBuilder2 = aoil.a.createBuilder();
            createBuilder2.copyOnWrite();
            aoil aoilVar = (aoil) createBuilder2.instance;
            b.getClass();
            aoilVar.c = b;
            aoilVar.b |= 1;
            aojr b2 = uanVar.b.b();
            createBuilder2.copyOnWrite();
            aoil aoilVar2 = (aoil) createBuilder2.instance;
            b2.getClass();
            aoilVar2.d = b2;
            aoilVar2.b |= 2;
            aoil aoilVar3 = (aoil) createBuilder2.build();
            createBuilder.copyOnWrite();
            aoiv aoivVar3 = (aoiv) createBuilder.instance;
            aoilVar3.getClass();
            aony aonyVar2 = aoivVar3.e;
            if (!aonyVar2.c()) {
                aoivVar3.e = aonm.mutableCopy(aonyVar2);
            }
            aoivVar3.e.add(aoilVar3);
            createBuilder.copyOnWrite();
            aoiv aoivVar4 = (aoiv) createBuilder.instance;
            aokoVar.getClass();
            aoivVar4.f = aokoVar;
            aoivVar4.b |= 2;
            aoiv aoivVar5 = (aoiv) createBuilder.build();
            udn b3 = this.a.b(str, aoivVar5);
            j(str, b3, 19);
            return uag.a(aoivVar5, b3);
        } catch (uab e) {
            uaf c = uag.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.uah
    public final uag c(String str, List list, aoko aokoVar) {
        try {
            uaq uaqVar = this.g;
            aone createBuilder = aoix.a.createBuilder();
            String str2 = uaqVar.a.a;
            createBuilder.copyOnWrite();
            aoix aoixVar = (aoix) createBuilder.instance;
            str2.getClass();
            aoixVar.b |= 1;
            aoixVar.c = str2;
            createBuilder.copyOnWrite();
            aoix aoixVar2 = (aoix) createBuilder.instance;
            aony aonyVar = aoixVar2.d;
            if (!aonyVar.c()) {
                aoixVar2.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) aoixVar2.d);
            aojt b = uaqVar.b.b();
            createBuilder.copyOnWrite();
            aoix aoixVar3 = (aoix) createBuilder.instance;
            b.getClass();
            aony aonyVar2 = aoixVar3.e;
            if (!aonyVar2.c()) {
                aoixVar3.e = aonm.mutableCopy(aonyVar2);
            }
            aoixVar3.e.add(b);
            createBuilder.copyOnWrite();
            aoix aoixVar4 = (aoix) createBuilder.instance;
            aokoVar.getClass();
            aoixVar4.f = aokoVar;
            aoixVar4.b |= 2;
            aoix aoixVar5 = (aoix) createBuilder.build();
            udn c = this.a.c(str, aoixVar5);
            j(str, c, 20);
            return uag.a(aoixVar5, c);
        } catch (uab e) {
            uaf c2 = uag.c();
            c2.c = e;
            c2.b(true);
            return c2.a();
        }
    }

    @Override // defpackage.uah
    public final uag d(String str, Long l, aokf aokfVar, aoko aokoVar) {
        if (new aonw(axsj.a.get().a().c, ucs.a).contains(aokfVar)) {
            uaf c = uag.c();
            c.c = new ual(aokfVar);
            c.b(false);
            return c.a();
        }
        try {
            uan uanVar = this.h;
            aone createBuilder = aoiz.a.createBuilder();
            String str2 = uanVar.a.a;
            createBuilder.copyOnWrite();
            aoiz aoizVar = (aoiz) createBuilder.instance;
            str2.getClass();
            aoizVar.b |= 1;
            aoizVar.c = str2;
            aoju c2 = uanVar.c.c();
            createBuilder.copyOnWrite();
            aoiz aoizVar2 = (aoiz) createBuilder.instance;
            c2.getClass();
            aoizVar2.d = c2;
            aoizVar2.b |= 2;
            createBuilder.copyOnWrite();
            aoiz aoizVar3 = (aoiz) createBuilder.instance;
            aoizVar3.g = aokfVar.j;
            aoizVar3.b |= 32;
            aojr b = uanVar.b.b();
            createBuilder.copyOnWrite();
            aoiz aoizVar4 = (aoiz) createBuilder.instance;
            b.getClass();
            aoizVar4.f = b;
            aoizVar4.b |= 16;
            createBuilder.copyOnWrite();
            aoiz aoizVar5 = (aoiz) createBuilder.instance;
            aokoVar.getClass();
            aoizVar5.h = aokoVar;
            aoizVar5.b |= 64;
            if (l.longValue() > 0) {
                long longValue = l.longValue();
                createBuilder.copyOnWrite();
                aoiz aoizVar6 = (aoiz) createBuilder.instance;
                aoizVar6.b |= 4;
                aoizVar6.e = longValue;
            }
            aoiz aoizVar7 = (aoiz) createBuilder.build();
            udn d = this.a.d(str, aoizVar7);
            j(str, d, 13);
            return uag.a(aoizVar7, d);
        } catch (uab e) {
            uaf c3 = uag.c();
            c3.c = e;
            c3.b(true);
            return c3.a();
        }
    }

    @Override // defpackage.uah
    public final uag e(String str, long j, List list, aokf aokfVar, aoko aokoVar) {
        if (new aonw(axsj.a.get().b().c, ucs.a).contains(aokfVar)) {
            uaf c = uag.c();
            c.c = new ual(aokfVar);
            c.b(false);
            return c.a();
        }
        try {
            uan uanVar = this.b;
            aone createBuilder = aojb.a.createBuilder();
            String str2 = uanVar.a.a;
            createBuilder.copyOnWrite();
            aojb aojbVar = (aojb) createBuilder.instance;
            str2.getClass();
            aojbVar.b |= 1;
            aojbVar.c = str2;
            aoju c2 = uanVar.c.c();
            createBuilder.copyOnWrite();
            aojb aojbVar2 = (aojb) createBuilder.instance;
            c2.getClass();
            aojbVar2.d = c2;
            aojbVar2.b |= 2;
            aojr b = uanVar.b.b();
            createBuilder.copyOnWrite();
            aojb aojbVar3 = (aojb) createBuilder.instance;
            b.getClass();
            aojbVar3.g = b;
            aojbVar3.b |= 32;
            createBuilder.copyOnWrite();
            aojb aojbVar4 = (aojb) createBuilder.instance;
            aojbVar4.h = aokfVar.j;
            aojbVar4.b |= 64;
            createBuilder.copyOnWrite();
            aojb aojbVar5 = (aojb) createBuilder.instance;
            aojbVar5.f = 1;
            aojbVar5.b |= 16;
            createBuilder.copyOnWrite();
            aojb aojbVar6 = (aojb) createBuilder.instance;
            aojbVar6.b |= 4;
            aojbVar6.e = j;
            createBuilder.copyOnWrite();
            aojb aojbVar7 = (aojb) createBuilder.instance;
            aony aonyVar = aojbVar7.i;
            if (!aonyVar.c()) {
                aojbVar7.i = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) aojbVar7.i);
            createBuilder.copyOnWrite();
            aojb aojbVar8 = (aojb) createBuilder.instance;
            aokoVar.getClass();
            aojbVar8.j = aokoVar;
            aojbVar8.b |= 128;
            aojb aojbVar9 = (aojb) createBuilder.build();
            udn e = this.a.e(str, aojbVar9);
            j(str, e, 14);
            return uag.a(aojbVar9, e);
        } catch (uab e2) {
            uaf c3 = uag.c();
            c3.c = e2;
            c3.b(true);
            return c3.a();
        }
    }

    @Override // defpackage.uah
    public final uag f(String str, aoko aokoVar) {
        try {
            uao uaoVar = this.c;
            aone createBuilder = aojd.a.createBuilder();
            String str2 = uaoVar.a.a;
            createBuilder.copyOnWrite();
            aojd aojdVar = (aojd) createBuilder.instance;
            str2.getClass();
            aojdVar.b |= 1;
            aojdVar.c = str2;
            aojt b = uaoVar.c.b();
            createBuilder.copyOnWrite();
            aojd aojdVar2 = (aojd) createBuilder.instance;
            b.getClass();
            aojdVar2.d = b;
            aojdVar2.b |= 2;
            aone createBuilder2 = aojn.a.createBuilder();
            aone createBuilder3 = aojm.a.createBuilder();
            long parseLong = Long.parseLong(uaoVar.a.b);
            createBuilder3.copyOnWrite();
            aojm aojmVar = (aojm) createBuilder3.instance;
            aojmVar.b |= 1;
            aojmVar.c = parseLong;
            String b2 = uaoVar.b.b();
            createBuilder3.copyOnWrite();
            aojm aojmVar2 = (aojm) createBuilder3.instance;
            b2.getClass();
            aojmVar2.b |= 2;
            aojmVar2.d = b2;
            createBuilder2.copyOnWrite();
            aojn aojnVar = (aojn) createBuilder2.instance;
            aojm aojmVar3 = (aojm) createBuilder3.build();
            aojmVar3.getClass();
            aojnVar.c = aojmVar3;
            aojnVar.b |= 1;
            createBuilder.copyOnWrite();
            aojd aojdVar3 = (aojd) createBuilder.instance;
            aojn aojnVar2 = (aojn) createBuilder2.build();
            aojnVar2.getClass();
            aojdVar3.e = aojnVar2;
            aojdVar3.b |= 4;
            createBuilder.copyOnWrite();
            aojd aojdVar4 = (aojd) createBuilder.instance;
            aokoVar.getClass();
            aojdVar4.f = aokoVar;
            aojdVar4.b |= 8;
            aojd aojdVar5 = (aojd) createBuilder.build();
            udn f = this.a.f(str, aojdVar5);
            j(str, f, 16);
            return uag.a(aojdVar5, f);
        } catch (uab e) {
            uaf c = uag.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.uah
    public final uag g(String str, twj twjVar, boolean z, aoko aokoVar) {
        try {
            uaq uaqVar = this.d;
            aone createBuilder = aojf.a.createBuilder();
            String str2 = uaqVar.a.a;
            createBuilder.copyOnWrite();
            aojf aojfVar = (aojf) createBuilder.instance;
            str2.getClass();
            aojfVar.b |= 1;
            aojfVar.c = str2;
            createBuilder.copyOnWrite();
            aojf aojfVar2 = (aojf) createBuilder.instance;
            aokoVar.getClass();
            aojfVar2.f = aokoVar;
            aojfVar2.b |= 8;
            for (twg twgVar : twjVar.a) {
                aone createBuilder2 = aojl.a.createBuilder();
                twi twiVar = twgVar.a;
                aone createBuilder3 = aoio.a.createBuilder();
                String str3 = twiVar.a;
                createBuilder3.copyOnWrite();
                aoio aoioVar = (aoio) createBuilder3.instance;
                str3.getClass();
                aoioVar.b |= 1;
                aoioVar.c = str3;
                if (!TextUtils.isEmpty(twiVar.b)) {
                    String str4 = twiVar.b;
                    createBuilder3.copyOnWrite();
                    aoio aoioVar2 = (aoio) createBuilder3.instance;
                    str4.getClass();
                    aoioVar2.b |= 2;
                    aoioVar2.d = str4;
                }
                aoio aoioVar3 = (aoio) createBuilder3.build();
                createBuilder2.copyOnWrite();
                aojl aojlVar = (aojl) createBuilder2.instance;
                aoioVar3.getClass();
                aojlVar.c = aoioVar3;
                aojlVar.b |= 1;
                int i = twgVar.b;
                int i2 = i - 1;
                if (i != 0) {
                    int i3 = i2 != 1 ? i2 != 2 ? 1 : 2 : 3;
                    createBuilder2.copyOnWrite();
                    aojl aojlVar2 = (aojl) createBuilder2.instance;
                    aojlVar2.d = i3 - 1;
                    aojlVar2.b |= 2;
                    aojl aojlVar3 = (aojl) createBuilder2.build();
                    createBuilder.copyOnWrite();
                    aojf aojfVar3 = (aojf) createBuilder.instance;
                    aojlVar3.getClass();
                    aony aonyVar = aojfVar3.d;
                    if (!aonyVar.c()) {
                        aojfVar3.d = aonm.mutableCopy(aonyVar);
                    }
                    aojfVar3.d.add(aojlVar3);
                } else {
                    throw null;
                }
            }
            if (z) {
                aojt b = uaqVar.b.b();
                createBuilder.copyOnWrite();
                aojf aojfVar4 = (aojf) createBuilder.instance;
                b.getClass();
                aojfVar4.e = b;
                aojfVar4.b |= 4;
            }
            aojf aojfVar5 = (aojf) createBuilder.build();
            udn g = this.a.g(str, aojfVar5);
            j(str, g, 22);
            return uag.a(aojfVar5, g);
        } catch (uab e) {
            uaf c = uag.c();
            c.c = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.uah
    public final uag h(String str, aokm aokmVar, aoko aokoVar) {
        if (new aonw(axsd.a.get().a().c, ucu.a).contains(aokmVar)) {
            uaf c = uag.c();
            c.c = new ual(aokmVar);
            c.b(false);
            return c.a();
        }
        try {
            aojh a = this.e.a(str, aokmVar, aokoVar);
            udn h = this.a.h(str, a);
            j(str, h, 15);
            return uag.a(a, h);
        } catch (uab e) {
            uaf c2 = uag.c();
            c2.c = e;
            c2.b(true);
            return c2.a();
        }
    }

    @Override // defpackage.uah
    public final void i(String str, aokw aokwVar) {
        aone createBuilder = aojj.a.createBuilder();
        createBuilder.copyOnWrite();
        aojj aojjVar = (aojj) createBuilder.instance;
        str.getClass();
        aojjVar.b |= 1;
        aojjVar.c = str;
        createBuilder.copyOnWrite();
        aojj aojjVar2 = (aojj) createBuilder.instance;
        aokwVar.getClass();
        aojjVar2.d = aokwVar;
        aojjVar2.b |= 2;
        aojj aojjVar3 = (aojj) createBuilder.build();
        udn i = this.a.i(aojjVar3);
        j(null, i, 18);
        uag.a(aojjVar3, i);
    }
}
