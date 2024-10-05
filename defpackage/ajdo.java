package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdo implements tbt {
    private final acsy b;

    public ajdo(acsy acsyVar) {
        this.b = acsyVar;
    }

    private static asmn h() {
        asmn b = asmn.b(70);
        return b == null ? asmn.LATENCY_ACTION_ELEMENTS_PERFORMANCE : b;
    }

    @Override // defpackage.tbt
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.tbt
    public final String b() {
        return this.b.e();
    }

    @Override // defpackage.tbt
    public final void c(String str) {
        d(str);
    }

    @Override // defpackage.tbt
    public final void d(String str) {
        this.b.j(str);
        asmn h = h();
        aone createBuilder = asmb.a.createBuilder();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.e = h.bO;
        asmbVar.b |= 1;
        createBuilder.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder.instance;
        str.getClass();
        asmbVar2.b |= 2;
        asmbVar2.f = str;
        this.b.h((asmb) createBuilder.build());
    }

    @Override // defpackage.tbt
    public final void e(String str, int i, tbq tbqVar) {
        acsy acsyVar = this.b;
        asmn h = h();
        aone createBuilder = asme.a.createBuilder();
        String str2 = tbqVar.a;
        createBuilder.copyOnWrite();
        asme asmeVar = (asme) createBuilder.instance;
        str2.getClass();
        asmeVar.b |= 1;
        asmeVar.c = str2;
        Long l = tbqVar.b;
        Long l2 = tbqVar.c;
        Long l3 = tbqVar.d;
        if (l != null && l2 != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            asme asmeVar2 = (asme) createBuilder.instance;
            asmeVar2.b |= 8;
            asmeVar2.f = longValue;
            long longValue2 = l2.longValue();
            long longValue3 = l.longValue();
            createBuilder.copyOnWrite();
            asme asmeVar3 = (asme) createBuilder.instance;
            asmeVar3.b |= 4;
            asmeVar3.e = longValue2 - longValue3;
        } else if (l3 != null) {
            long longValue4 = l3.longValue();
            createBuilder.copyOnWrite();
            asme asmeVar4 = (asme) createBuilder.instance;
            asmeVar4.b |= 4;
            asmeVar4.e = longValue4;
        }
        Integer num = tbqVar.e;
        if (num != null) {
            int intValue = num.intValue();
            createBuilder.copyOnWrite();
            asme asmeVar5 = (asme) createBuilder.instance;
            asmeVar5.b |= 64;
            asmeVar5.i = intValue;
        }
        tbo tboVar = tbqVar.f;
        if (tboVar != null) {
            aone createBuilder2 = asmm.a.createBuilder();
            int i2 = tboVar.i;
            createBuilder2.copyOnWrite();
            asmm asmmVar = (asmm) createBuilder2.instance;
            asmmVar.b |= 32;
            asmmVar.h = i2;
            aksx aksxVar = tboVar.j;
            if (aksxVar != null) {
                boolean z = aksxVar.a;
                createBuilder2.copyOnWrite();
                asmm asmmVar2 = (asmm) createBuilder2.instance;
                asmmVar2.b |= 4;
                asmmVar2.e = z;
                long j = aksxVar.b;
                createBuilder2.copyOnWrite();
                asmm asmmVar3 = (asmm) createBuilder2.instance;
                asmmVar3.b |= 8;
                asmmVar3.f = j;
            }
            amsx<String> amsxVar = tboVar.a;
            if (amsxVar != null && !amsxVar.isEmpty()) {
                for (String str3 : amsxVar) {
                    aone createBuilder3 = asml.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    asml asmlVar = (asml) createBuilder3.instance;
                    str3.getClass();
                    asmlVar.b |= 1;
                    asmlVar.c = str3;
                    createBuilder2.copyOnWrite();
                    asmm asmmVar4 = (asmm) createBuilder2.instance;
                    asml asmlVar2 = (asml) createBuilder3.build();
                    asmlVar2.getClass();
                    aony aonyVar = asmmVar4.c;
                    if (!aonyVar.c()) {
                        asmmVar4.c = aonm.mutableCopy(aonyVar);
                    }
                    asmmVar4.c.add(asmlVar2);
                }
            }
            String str4 = tboVar.b;
            if (str4 != null) {
                createBuilder2.copyOnWrite();
                asmm asmmVar5 = (asmm) createBuilder2.instance;
                asmmVar5.b |= 16;
                asmmVar5.g = str4;
            }
            Integer num2 = tboVar.c;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                createBuilder2.copyOnWrite();
                asmm asmmVar6 = (asmm) createBuilder2.instance;
                asmmVar6.b |= 64;
                asmmVar6.i = intValue2;
            }
            Status status = tboVar.d;
            if (status != null) {
                aone createBuilder4 = asmk.a.createBuilder();
                int value = status.getCode().value();
                createBuilder4.copyOnWrite();
                asmk asmkVar = (asmk) createBuilder4.instance;
                asmkVar.b |= 2;
                asmkVar.c = value;
                String str5 = tboVar.e;
                if (str5 != null) {
                    createBuilder4.copyOnWrite();
                    asmk asmkVar2 = (asmk) createBuilder4.instance;
                    asmkVar2.b |= 4;
                    asmkVar2.d = str5;
                }
                String str6 = tboVar.f;
                if (str6 != null) {
                    createBuilder4.copyOnWrite();
                    asmk asmkVar3 = (asmk) createBuilder4.instance;
                    asmkVar3.b |= 8;
                    asmkVar3.e = str6;
                }
                Boolean bool = tboVar.h;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    createBuilder4.copyOnWrite();
                    asmk asmkVar4 = (asmk) createBuilder4.instance;
                    asmkVar4.b |= 16;
                    asmkVar4.f = booleanValue;
                }
                Integer num3 = tboVar.g;
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    createBuilder4.copyOnWrite();
                    asmk asmkVar5 = (asmk) createBuilder4.instance;
                    asmkVar5.b |= 32;
                    asmkVar5.g = intValue3;
                }
                asmk asmkVar6 = (asmk) createBuilder4.build();
                createBuilder2.copyOnWrite();
                asmm asmmVar7 = (asmm) createBuilder2.instance;
                asmkVar6.getClass();
                asmmVar7.j = asmkVar6;
                asmmVar7.b |= 256;
            }
            createBuilder.copyOnWrite();
            asme asmeVar6 = (asme) createBuilder.instance;
            asmm asmmVar8 = (asmm) createBuilder2.build();
            asmmVar8.getClass();
            asmeVar6.g = asmmVar8;
            asmeVar6.b |= 16;
        }
        acsyVar.p(h, i, str, (asme) createBuilder.build());
    }

    @Override // defpackage.tbt
    public final int f(String str, tbq tbqVar) {
        int a = a();
        e(str, a, tbqVar);
        return a;
    }

    @Override // defpackage.tbt
    public final void g(String str, tbq tbqVar) {
        e(str, a(), tbqVar);
    }
}
