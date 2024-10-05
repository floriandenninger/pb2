package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahca {
    public final ahcc a;
    public zih b;
    public ahdq c;
    public boolean d;
    public boolean e;

    public ahca(afhz afhzVar) {
        ahcc ahccVar = new ahcc();
        this.a = ahccVar;
        afhzVar.d(ahccVar);
    }

    public final acsx a() {
        zih zihVar = this.b;
        if (zihVar != null) {
            return (acsx) zihVar.a();
        }
        return null;
    }

    public final void b(aypn aypnVar, aypn aypnVar2, aypn aypnVar3) {
        ayqw ayqwVar = new ayqw();
        final int i = 8;
        ayqwVar.d(aypnVar.X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i2 = 9;
        ayqwVar.d(aypnVar3.Y(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i2) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, zxi.n));
        final int i3 = 7;
        ayqwVar.d(ahbw.c(aypnVar2, ahbz.c).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i3) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i4 = 3;
        ayqwVar.d(ahbw.c(aypnVar3, afyf.q).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i4) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i5 = 4;
        ayqwVar.d(ahbw.c(aypnVar3, afyf.r).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i5) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i6 = 10;
        ayqwVar.d(ahbw.c(aypnVar2, afyf.p).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i6) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i7 = 2;
        ayqwVar.d(ahbw.c(aypnVar2, ahbz.b).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i7) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i8 = 5;
        ayqwVar.d(ahbw.c(aypnVar2, afyf.s).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i8) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i9 = 6;
        ayqwVar.d(ahbw.c(aypnVar3, ahbz.a).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i9) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i10 = 1;
        ayqwVar.d(ahbw.c(aypnVar3, afyf.t).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i10) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
        final int i11 = 0;
        ayqwVar.d(aypnVar2.n().N(afly.j).X(new ayrs(this) { // from class: ahby
            public final /* synthetic */ ahca a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar;
                switch (i11) {
                    case 0:
                        this.a.e();
                        return;
                    case 1:
                        ahca ahcaVar = this.a;
                        aeqq aeqqVar = (aeqq) obj;
                        FormatStreamModel f = aeqqVar.f();
                        if (f == null) {
                            f = aeqqVar.e();
                        }
                        acsx acsxVar2 = (acsx) ahcaVar.b.a();
                        if (f == null || acsxVar2 == null) {
                            return;
                        }
                        aone createBuilder = asmb.a.createBuilder();
                        aone createBuilder2 = asmd.a.createBuilder();
                        int e = f.e();
                        createBuilder2.copyOnWrite();
                        asmd asmdVar = (asmd) createBuilder2.instance;
                        asmdVar.b = 1 | asmdVar.b;
                        asmdVar.c = e;
                        createBuilder.copyOnWrite();
                        asmb asmbVar = (asmb) createBuilder.instance;
                        asmd asmdVar2 = (asmd) createBuilder2.build();
                        asmdVar2.getClass();
                        asmbVar.w = asmdVar2;
                        asmbVar.c = 524288 | asmbVar.c;
                        acsxVar2.a((asmb) createBuilder.build());
                        return;
                    case 2:
                        this.a.c();
                        return;
                    case 3:
                        ahca ahcaVar2 = this.a;
                        ahcz ahczVar = (ahcz) obj;
                        if (((acsx) ahcaVar2.b.a()) != null) {
                            ahcaVar2.d(ahczVar);
                            return;
                        }
                        return;
                    case 4:
                        ahca ahcaVar3 = this.a;
                        ahde ahdeVar = (ahde) obj;
                        acsx acsxVar3 = (acsx) ahcaVar3.b.a();
                        int e2 = (int) ahcaVar3.a.e();
                        if (acsxVar3 == null || ahcaVar3.d) {
                            return;
                        }
                        ahcaVar3.d(ahdeVar);
                        ahcaVar3.d = true;
                        if (e2 > 0) {
                            aone createBuilder3 = asmb.a.createBuilder();
                            aone createBuilder4 = asmd.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            asmd asmdVar3 = (asmd) createBuilder4.instance;
                            asmdVar3.b |= 64;
                            asmdVar3.e = e2;
                            createBuilder3.copyOnWrite();
                            asmb asmbVar2 = (asmb) createBuilder3.instance;
                            asmd asmdVar4 = (asmd) createBuilder4.build();
                            asmdVar4.getClass();
                            asmbVar2.w = asmdVar4;
                            asmbVar2.c |= 524288;
                            acsxVar3.a((asmb) createBuilder3.build());
                            return;
                        }
                        return;
                    case 5:
                        ahca ahcaVar4 = this.a;
                        ahdi ahdiVar = (ahdi) obj;
                        if (ahcaVar4.b.a() != null) {
                            ahcaVar4.d(ahdiVar);
                            return;
                        }
                        return;
                    case 6:
                        this.a.c = (ahdq) obj;
                        return;
                    case 7:
                        ahef ahefVar = (ahef) obj;
                        acsx acsxVar4 = (acsx) this.a.b.a();
                        String e3 = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        if (ahefVar.c() != aign.PLAYBACK_LOADED || acsxVar4 == null || e3 == null || b == null) {
                            return;
                        }
                        acsxVar4.c("gv");
                        aone createBuilder5 = asmb.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        asmb asmbVar3 = (asmb) createBuilder5.instance;
                        asmbVar3.b |= 2048;
                        asmbVar3.k = e3;
                        if (!b.y().isEmpty()) {
                            String y = b.y();
                            createBuilder5.copyOnWrite();
                            asmb asmbVar4 = (asmb) createBuilder5.instance;
                            y.getClass();
                            asmbVar4.b |= 33554432;
                            asmbVar4.p = y;
                        }
                        acsxVar4.a((asmb) createBuilder5.build());
                        return;
                    case 8:
                        ahca ahcaVar5 = this.a;
                        ahcaVar5.c();
                        ahcaVar5.a.f();
                        ajbl a = ((ahel) obj).a();
                        if (a != null) {
                            ahcaVar5.b = a.b();
                            return;
                        } else {
                            ahcaVar5.b = ahbt.c;
                            return;
                        }
                    case 9:
                        ahca ahcaVar6 = this.a;
                        ahel ahelVar = (ahel) obj;
                        acsx a2 = ahcaVar6.a();
                        if (a2 != null && !ahcaVar6.e) {
                            aone createBuilder6 = asmb.a.createBuilder();
                            String Z = ahelVar.a().Z();
                            createBuilder6.copyOnWrite();
                            asmb asmbVar5 = (asmb) createBuilder6.instance;
                            Z.getClass();
                            asmbVar5.b |= 16384;
                            asmbVar5.l = Z;
                            PlayerResponseModel c = ahelVar.a().c();
                            if (c != null) {
                                String y2 = c.y();
                                createBuilder6.copyOnWrite();
                                asmb asmbVar6 = (asmb) createBuilder6.instance;
                                y2.getClass();
                                asmbVar6.b |= 134217728;
                                asmbVar6.q = y2;
                            }
                            a2.a((asmb) createBuilder6.build());
                            ahcaVar6.e = true;
                        }
                        ajbl a3 = ahelVar.a();
                        ahdq ahdqVar = ahcaVar6.c;
                        if (ahdqVar != null && TextUtils.equals(a3.Z(), ahdqVar.b()) && (acsxVar = (acsx) a3.b().a()) != null) {
                            acsxVar.f(ahdqVar.a());
                        }
                        ahcaVar6.c = null;
                        return;
                    default:
                        ahca ahcaVar7 = this.a;
                        ynz ynzVar = (ynz) obj;
                        acsx acsxVar5 = (acsx) ahcaVar7.b.a();
                        if (acsxVar5 != null) {
                            if ((ynzVar instanceof ahda) || (ynzVar instanceof ahdf)) {
                                acsxVar5.c(ynzVar.f());
                                ahcaVar7.e();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }));
    }

    public final void c() {
        acsx a = a();
        if (a != null) {
            a.c("pl_int");
            e();
        }
    }

    public final void d(ahcw ahcwVar) {
        acsx acsxVar = (acsx) this.b.a();
        if (acsxVar != null) {
            if (ahcwVar.a() > 0) {
                acsxVar.d(ahcwVar.f(), ahcwVar.a());
            } else {
                acsxVar.c(ahcwVar.f());
            }
        }
    }

    public final void e() {
        acsx acsxVar = (acsx) this.b.a();
        if (acsxVar != null) {
            acsxVar.c("aa");
            zih zihVar = this.b;
            if (zihVar instanceof aifl) {
                ((aifl) zihVar).a = null;
            }
            this.d = false;
            this.e = false;
        }
    }
}
