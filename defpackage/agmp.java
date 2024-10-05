package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmp implements agmu {
    private final acpl a;
    private final agsm b;
    private final ysy c;
    private final shf d;
    private final agsg e;
    private final yxn f;
    private final acpz g;

    public agmp(acpl acplVar, agsm agsmVar, ysy ysyVar, shf shfVar, agsg agsgVar, yxn yxnVar, acpz acpzVar) {
        acplVar.getClass();
        this.a = acplVar;
        this.b = agsmVar;
        this.c = ysyVar;
        this.d = shfVar;
        this.e = agsgVar;
        this.f = yxnVar;
        this.g = acpzVar;
    }

    @Override // defpackage.agmu
    public final void a(atou atouVar) {
        long c = this.d.c();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dq(atouVar);
        this.a.f((arpp) a.build(), c);
    }

    @Override // defpackage.agmu
    public final void b(atpx atpxVar) {
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).m31do(atpxVar);
        this.a.c((arpp) a.build());
    }

    @Override // defpackage.agmu
    public final void c(atqv atqvVar) {
        int bM;
        long c = this.d.c();
        zhq.m(atqvVar.d);
        int bN = anaf.bN(atqvVar.h);
        amkq.E(((bN == 0 || bN == 1) && ((bM = anaf.bM(atqvVar.g)) == 0 || bM == 1)) ? false : true);
        aone builder = atqvVar.toBuilder();
        long b = this.b.b();
        builder.copyOnWrite();
        atqv atqvVar2 = (atqv) builder.instance;
        atqvVar2.b |= 512;
        atqvVar2.l = b / 1024;
        aqjw f = this.c.f();
        builder.copyOnWrite();
        atqv atqvVar3 = (atqv) builder.instance;
        atqvVar3.p = f.B;
        atqvVar3.b |= 16384;
        boolean k = this.e.P() ? this.f.k(this.e.y(this.f)) : false;
        builder.copyOnWrite();
        atqv atqvVar4 = (atqv) builder.instance;
        atqvVar4.c |= 16;
        atqvVar4.y = k;
        atqv atqvVar5 = (atqv) builder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dr(atqvVar5);
        this.a.f((arpp) a.build(), c);
        if ((atqvVar5.b & 2) != 0) {
            acpz acpzVar = this.g;
            int bN2 = anaf.bN(atqvVar5.h);
            if (bN2 == 0) {
                bN2 = 1;
            }
            acpx acpxVar = new acpx(bN2 - 1, 3);
            aone createBuilder = aqwx.a.createBuilder();
            aone createBuilder2 = atqu.a.createBuilder();
            createBuilder2.copyOnWrite();
            atqu atquVar = (atqu) createBuilder2.instance;
            atqvVar5.getClass();
            atquVar.c = atqvVar5;
            atquVar.b = 1 | atquVar.b;
            createBuilder.copyOnWrite();
            aqwx aqwxVar = (aqwx) createBuilder.instance;
            atqu atquVar2 = (atqu) createBuilder2.build();
            atquVar2.getClass();
            aqwxVar.d = atquVar2;
            aqwxVar.b |= 2;
            acpxVar.a = (aqwx) createBuilder.build();
            acpzVar.d(acpxVar, aqxl.FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED, atqvVar5.e, c);
        }
    }

    @Override // defpackage.agmu
    public final void d(String str, int i, awav awavVar, int i2, int i3, boolean z) {
        aone createBuilder = atpy.a.createBuilder();
        createBuilder.copyOnWrite();
        atpy atpyVar = (atpy) createBuilder.instance;
        str.getClass();
        atpyVar.b |= 1;
        atpyVar.c = str;
        createBuilder.copyOnWrite();
        atpy atpyVar2 = (atpy) createBuilder.instance;
        atpyVar2.d = i - 1;
        atpyVar2.b |= 2;
        createBuilder.copyOnWrite();
        atpy atpyVar3 = (atpy) createBuilder.instance;
        awavVar.getClass();
        atpyVar3.e = awavVar;
        atpyVar3.b |= 8;
        createBuilder.copyOnWrite();
        atpy atpyVar4 = (atpy) createBuilder.instance;
        atpyVar4.b |= 32;
        atpyVar4.f = i2;
        createBuilder.copyOnWrite();
        atpy atpyVar5 = (atpy) createBuilder.instance;
        atpyVar5.b |= 64;
        atpyVar5.g = i3;
        createBuilder.copyOnWrite();
        atpy atpyVar6 = (atpy) createBuilder.instance;
        atpyVar6.b |= 256;
        atpyVar6.h = z;
        atpy atpyVar7 = (atpy) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dp(atpyVar7);
        this.a.c((arpp) a.build());
    }

    @Override // defpackage.agmu
    public final void e(ammv ammvVar, int i, int i2) {
        aone createBuilder = atxm.a.createBuilder();
        if (ammvVar.h()) {
            String str = (String) ammvVar.c();
            createBuilder.copyOnWrite();
            atxm atxmVar = (atxm) createBuilder.instance;
            atxmVar.b |= 1;
            atxmVar.c = str;
        }
        createBuilder.copyOnWrite();
        atxm atxmVar2 = (atxm) createBuilder.instance;
        atxmVar2.d = i - 1;
        atxmVar2.b |= 2;
        createBuilder.copyOnWrite();
        atxm atxmVar3 = (atxm) createBuilder.instance;
        atxmVar3.e = i2 - 1;
        atxmVar3.b |= 4;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dx((atxm) createBuilder.build());
        this.a.c((arpp) a.build());
    }
}
