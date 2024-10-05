package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjy extends jhk {
    private static final awie g(agni agniVar) {
        String str = agniVar.a.a;
        long j = agniVar.e;
        long j2 = agniVar.f;
        String g = fhe.g(str);
        g.getClass();
        amkq.O(!g.isEmpty(), "key cannot be empty");
        aone createBuilder = awih.a.createBuilder();
        createBuilder.copyOnWrite();
        awih awihVar = (awih) createBuilder.instance;
        awihVar.c |= 1;
        awihVar.d = g;
        awie awieVar = new awie(createBuilder);
        Long valueOf = Long.valueOf(j);
        aone aoneVar = awieVar.a;
        long longValue = valueOf.longValue();
        aoneVar.copyOnWrite();
        awih awihVar2 = (awih) aoneVar.instance;
        awihVar2.c |= 8;
        awihVar2.g = longValue;
        String t = fhe.t(str);
        aone aoneVar2 = awieVar.a;
        aoneVar2.copyOnWrite();
        awih awihVar3 = (awih) aoneVar2.instance;
        t.getClass();
        awihVar3.c |= 4;
        awihVar3.e = t;
        Long valueOf2 = Long.valueOf(j2);
        aone aoneVar3 = awieVar.a;
        long longValue2 = valueOf2.longValue();
        aoneVar3.copyOnWrite();
        awih awihVar4 = (awih) aoneVar3.instance;
        awihVar4.c |= 16;
        awihVar4.h = longValue2;
        return awieVar;
    }

    @Override // defpackage.jhk
    protected final amsx a(agsl agslVar) {
        amsv i = amsx.i();
        Iterator it = agslVar.j().iterator();
        while (it.hasNext()) {
            i.c(g((agni) it.next()));
        }
        return i.g();
    }

    @Override // defpackage.jhk
    protected final void c(aalc aalcVar, agni agniVar) {
        aalcVar.k(g(agniVar));
    }

    @Override // defpackage.jhk
    protected final void d(aalc aalcVar, String str) {
        aalcVar.g(fhe.g(str));
    }
}
