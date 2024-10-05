package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afty implements aful {
    protected final yol a;
    public final Executor b;
    public final shf c;
    private final afql e;
    private final ysl f;
    private final afsy g;
    private final Set h;

    public afty(yol yolVar, Executor executor, afql afqlVar, shf shfVar, ysl yslVar, afsy afsyVar, Set set) {
        yolVar.getClass();
        this.a = yolVar;
        executor.getClass();
        this.b = executor;
        afqlVar.getClass();
        this.e = afqlVar;
        shfVar.getClass();
        this.c = shfVar;
        yslVar.getClass();
        this.f = yslVar;
        afsyVar.getClass();
        this.g = afsyVar;
        set.getClass();
        this.h = set;
    }

    @Override // defpackage.aful
    public final synchronized void a() {
        yjk.e();
        long c = this.c.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yok b = this.a.b();
        while (b.hasNext()) {
            owe oweVar = (owe) b.next();
            if (oweVar.k > c) {
                if (oweVar.l > 0 && oweVar.n + oweVar.o <= c) {
                }
                arrayList.add(new ammr(oweVar.c, oweVar.j));
            }
            arrayList2.add(oweVar.c);
        }
        b.a();
        int i = 0;
        if (arrayList.size() > this.e.c()) {
            int size = arrayList.size() - this.e.c();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((ammr) arrayList.get(i2)).b);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.a.d();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.n((String) arrayList2.get(i3));
            }
            this.a.i();
        }
        ArrayList<aone> arrayList3 = new ArrayList();
        yok b2 = this.a.b();
        while (b2.hasNext()) {
            owe oweVar2 = (owe) b2.next();
            if (i < this.e.a()) {
                arrayList3.add(oweVar2.toBuilder());
            }
            i++;
        }
        b2.a();
        this.a.d();
        try {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                this.a.n(((owe) ((aone) it.next()).instance).c);
            }
            this.a.i();
            this.a.f();
            for (final aone aoneVar : arrayList3) {
                owe oweVar3 = (owe) aoneVar.instance;
                int i4 = oweVar3.l;
                if (i4 > 0) {
                    if (i4 <= oweVar3.p.size()) {
                        owe oweVar4 = (owe) aoneVar.instance;
                        if (c >= oweVar4.m + oweVar4.p.a(i4 - 1)) {
                        }
                    }
                    d(aoneVar);
                }
                afwx a = afxb.a(aftv.a, new cnk() { // from class: aftu
                    @Override // defpackage.cnk
                    public final void kY(final cnq cnqVar) {
                        final afty aftyVar = afty.this;
                        final aone aoneVar2 = aoneVar;
                        aftyVar.b.execute(new Runnable() { // from class: aftx
                            @Override // java.lang.Runnable
                            public final void run() {
                                afty aftyVar2 = afty.this;
                                aone aoneVar3 = aoneVar2;
                                cnq cnqVar2 = cnqVar;
                                owe oweVar5 = (owe) aoneVar3.instance;
                                if (oweVar5.l >= oweVar5.p.size() || adyu.A(cnqVar2)) {
                                    return;
                                }
                                owe oweVar6 = (owe) aoneVar3.instance;
                                if (oweVar6.o == 0) {
                                    return;
                                }
                                int i5 = oweVar6.l;
                                aoneVar3.copyOnWrite();
                                owe oweVar7 = (owe) aoneVar3.instance;
                                oweVar7.b |= 256;
                                oweVar7.l = i5 + 1;
                                long c2 = aftyVar2.c.c();
                                aoneVar3.copyOnWrite();
                                owe oweVar8 = (owe) aoneVar3.instance;
                                oweVar8.b |= 512;
                                oweVar8.m = c2;
                                aftyVar2.d(aoneVar3);
                            }
                        });
                    }
                });
                if (((owe) aoneVar.instance).n == 0) {
                    aoneVar.copyOnWrite();
                    owe oweVar5 = (owe) aoneVar.instance;
                    oweVar5.b |= 1024;
                    oweVar5.n = c;
                }
                if ((((owe) aoneVar.instance).b & 8) == 0) {
                    a.kY(new aftt("malformed request proto"));
                } else {
                    this.f.a(new afua((owe) aoneVar.build(), a, this.c, this.e, this.g, this.h));
                }
            }
        } finally {
            this.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aful
    public final synchronized void b(afum afumVar) {
        yjk.e();
        aone createBuilder = owe.a.createBuilder();
        String uuid = UUID.randomUUID().toString();
        createBuilder.copyOnWrite();
        owe oweVar = (owe) createBuilder.instance;
        uuid.getClass();
        oweVar.b |= 1;
        oweVar.c = uuid;
        String str = ((afub) afumVar).c;
        createBuilder.copyOnWrite();
        owe oweVar2 = (owe) createBuilder.instance;
        oweVar2.b |= 64;
        oweVar2.j = str;
        long j = ((afub) afumVar).k;
        createBuilder.copyOnWrite();
        owe oweVar3 = (owe) createBuilder.instance;
        oweVar3.b |= 128;
        oweVar3.k = j;
        long j2 = ((afub) afumVar).l;
        createBuilder.copyOnWrite();
        owe oweVar4 = (owe) createBuilder.instance;
        oweVar4.b |= 2048;
        oweVar4.o = j2;
        long c = ((afub) afumVar).b.c();
        createBuilder.copyOnWrite();
        owe oweVar5 = (owe) createBuilder.instance;
        oweVar5.b |= 32;
        oweVar5.i = c;
        String str2 = ((yvo) afumVar).d;
        createBuilder.copyOnWrite();
        owe oweVar6 = (owe) createBuilder.instance;
        str2.getClass();
        oweVar6.b |= 8;
        oweVar6.e = str2;
        int i = ((yvo) afumVar).j;
        createBuilder.copyOnWrite();
        owe oweVar7 = (owe) createBuilder.instance;
        oweVar7.b |= 4;
        oweVar7.d = i - 1;
        String d = ((afub) afumVar).a.d();
        createBuilder.copyOnWrite();
        owe oweVar8 = (owe) createBuilder.instance;
        oweVar8.b |= 4096;
        oweVar8.q = d;
        List list = ((afub) afumVar).m;
        createBuilder.copyOnWrite();
        owe oweVar9 = (owe) createBuilder.instance;
        aonx aonxVar = oweVar9.p;
        if (!aonxVar.c()) {
            oweVar9.p = aonm.mutableCopy(aonxVar);
        }
        aolo.addAll((Iterable) list, (List) oweVar9.p);
        try {
            byte[] qm = ((yvo) afumVar).qm();
            if (qm != null) {
                aomf x = aomf.x(qm);
                createBuilder.copyOnWrite();
                owe oweVar10 = (owe) createBuilder.instance;
                oweVar10.b |= 16;
                oweVar10.h = x;
            }
        } catch (cnb e) {
            String valueOf = String.valueOf(e.getLocalizedMessage());
            zga.b(valueOf.length() != 0 ? "Auth failure: ".concat(valueOf) : new String("Auth failure: "));
        }
        for (Map.Entry entry : ((yvo) afumVar).f().entrySet()) {
            aone createBuilder2 = owa.a.createBuilder();
            String str3 = (String) entry.getKey();
            createBuilder2.copyOnWrite();
            owa owaVar = (owa) createBuilder2.instance;
            str3.getClass();
            owaVar.b |= 1;
            owaVar.c = str3;
            String str4 = (String) entry.getValue();
            createBuilder2.copyOnWrite();
            owa owaVar2 = (owa) createBuilder2.instance;
            str4.getClass();
            owaVar2.b |= 2;
            owaVar2.d = str4;
            createBuilder.copyOnWrite();
            owe oweVar11 = (owe) createBuilder.instance;
            owa owaVar3 = (owa) createBuilder2.build();
            owaVar3.getClass();
            aony aonyVar = oweVar11.f;
            if (!aonyVar.c()) {
                oweVar11.f = aonm.mutableCopy(aonyVar);
            }
            oweVar11.f.add(owaVar3);
        }
        Iterator it = ((afub) afumVar).n.iterator();
        while (it.hasNext()) {
            int i2 = ((asuq) it.next()).g;
            createBuilder.copyOnWrite();
            owe oweVar12 = (owe) createBuilder.instance;
            aonu aonuVar = oweVar12.g;
            if (!aonuVar.c()) {
                oweVar12.g = aonm.mutableCopy(aonuVar);
            }
            oweVar12.g.g(i2);
        }
        owe oweVar13 = (owe) createBuilder.build();
        this.a.l(oweVar13.c, oweVar13);
    }

    @Override // defpackage.aful
    public final boolean c() {
        return !this.a.b().hasNext();
    }

    public final void d(final aone aoneVar) {
        this.b.execute(new Runnable() { // from class: aftw
            @Override // java.lang.Runnable
            public final void run() {
                afty aftyVar = afty.this;
                aone aoneVar2 = aoneVar;
                aftyVar.a.d();
                try {
                    String.format(Locale.US, "Requeue request with %d errors to %s", Integer.valueOf(((owe) aoneVar2.instance).l), ((owe) aoneVar2.instance).e);
                    aftyVar.a.l(((owe) aoneVar2.instance).c, (owe) aoneVar2.build());
                    aftyVar.a.i();
                } finally {
                    aftyVar.a.f();
                }
            }
        });
    }
}
