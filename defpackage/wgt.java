package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wgt implements amml {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ wgt(long j, String str, int i) {
        this.c = i;
        this.b = j;
        this.a = str;
    }

    public /* synthetic */ wgt(String str, long j, int i) {
        this.c = i;
        this.a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            String str = this.a;
            long j = this.b;
            aone builder = ((awul) obj).toBuilder();
            builder.copyOnWrite();
            awul awulVar = (awul) builder.instance;
            aoot aootVar = awulVar.g;
            if (!aootVar.b) {
                awulVar.g = aootVar.a();
            }
            awulVar.g.put(str, Long.valueOf(j));
            return (awul) builder.build();
        }
        if (i == 1) {
            String str2 = this.a;
            long j2 = this.b;
            fkg fkgVar = (fkg) obj;
            fkb fkbVar = fkb.a;
            aoot aootVar2 = fkgVar.j;
            if (aootVar2.containsKey(str2)) {
                fkbVar = (fkb) aootVar2.get(str2);
            }
            aone builder2 = fkbVar.toBuilder();
            aone builder3 = fkgVar.toBuilder();
            builder2.copyOnWrite();
            fkb fkbVar2 = (fkb) builder2.instance;
            fkbVar2.b = 2 | fkbVar2.b;
            fkbVar2.d = j2;
            builder2.copyOnWrite();
            fkb fkbVar3 = (fkb) builder2.instance;
            fkbVar3.b |= 1;
            fkbVar3.c = true;
            builder3.i(str2, (fkb) builder2.build());
            return (fkg) builder3.build();
        }
        if (i == 2) {
            long j3 = this.b;
            String str3 = this.a;
            aone builder4 = ((awve) obj).toBuilder();
            builder4.copyOnWrite();
            awve awveVar = (awve) builder4.instance;
            awveVar.b = 2 | awveVar.b;
            awveVar.d = j3;
            builder4.copyOnWrite();
            awve awveVar2 = (awve) builder4.instance;
            str3.getClass();
            awveVar2.b |= 1;
            awveVar2.c = str3;
            builder4.copyOnWrite();
            awve awveVar3 = (awve) builder4.instance;
            awveVar3.b |= 4;
            awveVar3.e = true;
            return (awve) builder4.build();
        }
        if (i == 3) {
            String str4 = this.a;
            long j4 = this.b;
            aone builder5 = ((awwa) obj).toBuilder();
            builder5.bs(str4, j4);
            return (awwa) builder5.build();
        }
        if (i == 4) {
            String str5 = this.a;
            long j5 = this.b;
            aone builder6 = ((awwj) obj).toBuilder();
            aone createBuilder = awwh.a.createBuilder();
            createBuilder.copyOnWrite();
            awwh awwhVar = (awwh) createBuilder.instance;
            awwhVar.b = 1 | awwhVar.b;
            awwhVar.c = j5;
            builder6.by(str5, (awwh) createBuilder.build());
            return (awwj) builder6.build();
        }
        String str6 = this.a;
        long j6 = this.b;
        aone builder7 = ((awwp) obj).toBuilder();
        builder7.bA(str6, j6);
        return (awwp) builder7.build();
    }
}
