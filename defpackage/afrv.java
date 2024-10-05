package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrv {
    public final amrz a;
    private final ywr b;
    private final avdq c;

    public afrv(ynx ynxVar, amrz amrzVar, ywr ywrVar) {
        this.b = ywrVar;
        this.a = amrzVar;
        avdq avdqVar = ynxVar.e().g;
        this.c = avdqVar == null ? avdq.a : avdqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(String str) {
        anhy a = this.b.a();
        if (!a.isDone()) {
            return -2L;
        }
        awwa awwaVar = (awwa) ynm.h(a, awwa.a);
        str.getClass();
        aoot aootVar = awwaVar.h;
        if (aootVar.containsKey(str)) {
            return ((Long) aootVar.get(str)).longValue();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized aqjl b(String str, long j) {
        long a = a(str);
        if (a != -2) {
            awwa awwaVar = (awwa) this.b.c();
            str.getClass();
            aoot aootVar = awwaVar.c;
            if (aootVar.containsKey(str) && ((Boolean) aootVar.get(str)).booleanValue()) {
                aone createBuilder = aqjl.a.createBuilder();
                int an = aobq.an(((Integer) this.a.get(str)).intValue());
                createBuilder.copyOnWrite();
                aqjl aqjlVar = (aqjl) createBuilder.instance;
                int i = an - 1;
                if (an == 0) {
                    throw null;
                }
                aqjlVar.c = i;
                aqjlVar.b |= 1;
                awwa awwaVar2 = (awwa) this.b.c();
                str.getClass();
                aoot aootVar2 = awwaVar2.d;
                int intValue = aootVar2.containsKey(str) ? ((Integer) aootVar2.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqjl aqjlVar2 = (aqjl) createBuilder.instance;
                aqjlVar2.b |= 2;
                aqjlVar2.d = intValue;
                str.getClass();
                aoot aootVar3 = awwaVar2.e;
                int intValue2 = aootVar3.containsKey(str) ? ((Integer) aootVar3.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqjl aqjlVar3 = (aqjl) createBuilder.instance;
                aqjlVar3.b |= 4;
                aqjlVar3.e = intValue2;
                str.getClass();
                aoot aootVar4 = awwaVar2.i;
                int intValue3 = aootVar4.containsKey(str) ? ((Integer) aootVar4.get(str)).intValue() : 0;
                createBuilder.copyOnWrite();
                aqjl aqjlVar4 = (aqjl) createBuilder.instance;
                aqjlVar4.b |= 64;
                aqjlVar4.h = intValue3;
                str.getClass();
                aoot aootVar5 = awwaVar2.g;
                int intValue4 = aootVar5.containsKey(str) ? ((Integer) aootVar5.get(str)).intValue() : 0;
                if (intValue4 != 0) {
                    str.getClass();
                    aoot aootVar6 = awwaVar2.f;
                    long longValue = aootVar6.containsKey(str) ? ((Long) aootVar6.get(str)).longValue() : 0L;
                    createBuilder.copyOnWrite();
                    aqjl aqjlVar5 = (aqjl) createBuilder.instance;
                    aqjlVar5.b |= 8;
                    aqjlVar5.f = (int) (longValue / intValue4);
                }
                if (a == -1) {
                    createBuilder.copyOnWrite();
                    aqjl aqjlVar6 = (aqjl) createBuilder.instance;
                    aqjlVar6.b |= 32;
                    aqjlVar6.g = -1;
                } else {
                    createBuilder.copyOnWrite();
                    aqjl aqjlVar7 = (aqjl) createBuilder.instance;
                    aqjlVar7.b |= 32;
                    aqjlVar7.g = (int) (j - a);
                }
                return (aqjl) createBuilder.build();
            }
        }
        return null;
    }

    public final void c(String str) {
        ynm.m(this.b.b(new wgs(str, 17)), afka.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(final String str, final int i, final long j) {
        if (this.a.containsKey(str)) {
            ynm.m(this.b.b(new amml() { // from class: afru
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    String str2 = str;
                    long j2 = j;
                    int i2 = i;
                    awwa awwaVar = (awwa) obj;
                    aone builder = awwaVar.toBuilder();
                    aoot aootVar = awwaVar.f;
                    builder.bu(str2, (aootVar.containsKey(str2) ? ((Long) aootVar.get(str2)).longValue() : 0L) + j2);
                    aoot aootVar2 = awwaVar.g;
                    builder.bo(str2, (aootVar2.containsKey(str2) ? ((Integer) aootVar2.get(str2)).intValue() : 0) + 1);
                    aoot aootVar3 = awwaVar.i;
                    builder.bp(str2, (aootVar3.containsKey(str2) ? ((Integer) aootVar3.get(str2)).intValue() : 0) + i2);
                    builder.bq(str2, true);
                    return (awwa) builder.build();
                }
            }), afka.e);
        }
    }

    public final void i(String str, long j) {
        if (this.a.containsKey(str)) {
            ynm.m(this.b.b(new wgt(str, j, 3)), afka.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j(final String str, final int i, final int i2) {
        if (this.a.containsKey(str)) {
            ynm.m(this.b.b(new amml() { // from class: afrt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    String str2 = str;
                    int i3 = i;
                    int i4 = i2;
                    awwa awwaVar = (awwa) obj;
                    aone builder = awwaVar.toBuilder();
                    builder.bt(str2, i3);
                    str2.getClass();
                    aoot aootVar = awwaVar.e;
                    builder.br(str2, (aootVar.containsKey(str2) ? ((Integer) aootVar.get(str2)).intValue() : 0) + i4);
                    builder.bq(str2, true);
                    return (awwa) builder.build();
                }
            }), afka.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        avdq avdqVar = this.c;
        return avdqVar != null && avdqVar.b;
    }
}
