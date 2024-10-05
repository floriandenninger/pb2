package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fcv {
    private static final acsx a = new acsz();
    private final acsy b;
    private final fay c;
    private final aifk d;

    public fcv(acsy acsyVar, fay fayVar, aifk aifkVar) {
        this.b = acsyVar;
        this.c = fayVar;
        this.d = aifkVar;
    }

    private static void d(acsx acsxVar, int i, String str) {
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmd.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmd asmdVar = (asmd) createBuilder2.instance;
        asmdVar.d = i - 1;
        asmdVar.b |= 8;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmd asmdVar2 = (asmd) createBuilder2.build();
        asmdVar2.getClass();
        asmbVar.w = asmdVar2;
        asmbVar.c |= 524288;
        createBuilder.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder.instance;
        asmbVar2.b |= 16;
        asmbVar2.h = str;
        acsxVar.a((asmb) createBuilder.build());
    }

    public final acsx a() {
        long j;
        if (!this.d.y()) {
            this.c.a();
            return a;
        }
        if (this.c.e()) {
            if (!this.d.y()) {
                this.c.a();
                return a;
            }
            acsx d = this.b.d(asmn.LATENCY_ACTION_WATCH);
            fay fayVar = this.c;
            if (fayVar.e()) {
                fayVar.b = -2L;
                j = fayVar.a;
            } else {
                j = -1;
            }
            d.f(j);
            d(d, 2, "cold");
            return d;
        }
        return c(2);
    }

    public final void b() {
        this.c.a();
    }

    public final acsx c(int i) {
        if (!this.d.y()) {
            return a;
        }
        acsx b = this.b.b(asmn.LATENCY_ACTION_WATCH);
        d(b, i, "warm");
        return b;
    }
}
