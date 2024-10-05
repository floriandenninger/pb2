package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwc implements axqr {
    private final azrw A;
    private final azrw B;
    private final azrw C;
    private final azrw D;
    private final azrw E;
    private final azrw F;
    private final azrw G;
    private final azrw H;
    private final azrw I;

    /* renamed from: J, reason: collision with root package name */
    private final azrw f36J;
    private final azrw K;
    private final azrw L;
    private final azrw M;
    private final azrw N;
    private final azrw O;
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final azrw p;
    private final azrw q;
    private final azrw r;
    private final azrw s;
    private final azrw t;
    private final azrw u;
    private final azrw v;
    private final azrw w;
    private final azrw x;
    private final azrw y;
    private final azrw z;

    public adwc(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18, azrw azrwVar19, azrw azrwVar20, azrw azrwVar21, azrw azrwVar22, azrw azrwVar23, azrw azrwVar24, azrw azrwVar25, azrw azrwVar26, azrw azrwVar27, azrw azrwVar28, azrw azrwVar29, azrw azrwVar30, azrw azrwVar31, azrw azrwVar32, azrw azrwVar33, azrw azrwVar34, azrw azrwVar35, azrw azrwVar36, azrw azrwVar37, azrw azrwVar38, azrw azrwVar39, azrw azrwVar40, azrw azrwVar41) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
        this.l = azrwVar12;
        this.m = azrwVar13;
        this.n = azrwVar14;
        this.o = azrwVar15;
        this.p = azrwVar16;
        this.q = azrwVar17;
        this.r = azrwVar18;
        this.s = azrwVar19;
        this.t = azrwVar20;
        this.u = azrwVar21;
        this.v = azrwVar22;
        this.w = azrwVar23;
        this.x = azrwVar24;
        this.y = azrwVar25;
        this.z = azrwVar26;
        this.A = azrwVar27;
        this.B = azrwVar28;
        this.C = azrwVar29;
        this.D = azrwVar30;
        this.E = azrwVar31;
        this.F = azrwVar32;
        this.G = azrwVar33;
        this.H = azrwVar34;
        this.I = azrwVar35;
        this.f36J = azrwVar36;
        this.K = azrwVar37;
        this.L = azrwVar38;
        this.M = azrwVar39;
        this.N = azrwVar40;
        this.O = azrwVar41;
    }

    public static adwc a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, azrw azrwVar18, azrw azrwVar19, azrw azrwVar20, azrw azrwVar21, azrw azrwVar22, azrw azrwVar23, azrw azrwVar24, azrw azrwVar25, azrw azrwVar26, azrw azrwVar27, azrw azrwVar28, azrw azrwVar29, azrw azrwVar30, azrw azrwVar31, azrw azrwVar32, azrw azrwVar33, azrw azrwVar34, azrw azrwVar35, azrw azrwVar36, azrw azrwVar37, azrw azrwVar38, azrw azrwVar39, azrw azrwVar40, azrw azrwVar41) {
        return new adwc(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, azrwVar17, azrwVar18, azrwVar19, azrwVar20, azrwVar21, azrwVar22, azrwVar23, azrwVar24, azrwVar25, azrwVar26, azrwVar27, azrwVar28, azrwVar29, azrwVar30, azrwVar31, azrwVar32, azrwVar33, azrwVar34, azrwVar35, azrwVar36, azrwVar37, azrwVar38, azrwVar39, azrwVar40, azrwVar41);
    }

    public static aemv b(Context context, afhs afhsVar, aemd aemdVar, ysy ysyVar, afix afixVar, azrw azrwVar, afkn afknVar, String str, ScheduledExecutorService scheduledExecutorService, axpg axpgVar, aenf aenfVar, afhf afhfVar, aaoz aaozVar, adyl adylVar, aeez aeezVar, ptk ptkVar, axfg axfgVar, aeqg aeqgVar, shf shfVar, shf shfVar2, aehs aehsVar, affe affeVar, afhw afhwVar, aejn aejnVar, afcu afcuVar, aeet aeetVar, azrw azrwVar2, aexw aexwVar, afdq afdqVar, afeu afeuVar, aezm aezmVar, yss yssVar, afgb afgbVar, adyj adyjVar, afgt afgtVar) {
        afdf afdfVar = new afdf(shfVar, afhsVar);
        aenc aencVar = new aenc(context, ysyVar, aeezVar, str, afhsVar, afknVar, aemdVar, afdfVar, adylVar, afhwVar);
        aene aeneVar = new aene(context, ysyVar, aeezVar, aemdVar, afhsVar);
        afbs afbsVar = new afbs(context, ysyVar, adylVar, scheduledExecutorService, afixVar, aenfVar, aehsVar, aeezVar, aeqgVar, afhsVar, afknVar, axfgVar, shfVar2, azrwVar, afhfVar, ptkVar, afdfVar, afhwVar, aejnVar, afdqVar);
        aeut aeutVar = new aeut(aenfVar, shfVar2, psf.a, afixVar, new aeve(scheduledExecutorService, aenfVar, adylVar, context, aezmVar, adyjVar, affeVar), axpgVar, afhsVar, ysyVar, context, ptkVar, aeezVar, aehsVar, afknVar, aeqgVar, afdfVar, afje.b, afje.d, adylVar, azrwVar, axfgVar, afhwVar, aejnVar, afcuVar, azrwVar2, aexwVar, afeuVar, yssVar, afgbVar, afgtVar);
        afixVar.a(afiw.a(aaozVar.get()).a(), 1);
        return new aemv(new afce(new afcm(new afbv(aeutVar, afhsVar, aeutVar, afbsVar, aencVar, aeneVar), adylVar, ysyVar, afhsVar, new Handler(Looper.getMainLooper()), shfVar), afhsVar), new afcv(context, afhsVar), afhsVar, adylVar, aeetVar, afgtVar);
    }

    @Override // defpackage.azrw
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = (Context) ((axqs) this.a).a;
        afhs afhsVar = (afhs) this.b.get();
        aemd aemdVar = (aemd) this.c.get();
        ysy ysyVar = (ysy) this.d.get();
        afix afixVar = (afix) this.e.get();
        azrw azrwVar = this.g;
        afkn afknVar = ((ahai) this.h).get();
        String str = (String) this.i.get();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.j.get();
        axpg a = axqq.a(this.k);
        aenf aenfVar = (aenf) this.l.get();
        afhf afhfVar = (afhf) this.m.get();
        aaoz aaozVar = (aaoz) this.n.get();
        adyl adylVar = (adyl) this.p.get();
        aeez aeezVar = ((aefa) this.q).get();
        ptk ptkVar = (ptk) this.r.get();
        axfg axfgVar = (axfg) this.s.get();
        aeqg aeqgVar = (aeqg) this.t.get();
        shf shfVar = (shf) this.v.get();
        shf shfVar2 = (shf) this.w.get();
        aehs aehsVar = (aehs) this.x.get();
        affe affeVar = (affe) this.z.get();
        afhw afhwVar = (afhw) this.B.get();
        aejn aejnVar = (aejn) this.C.get();
        afcu afcuVar = (afcu) this.D.get();
        aeet aeetVar = (aeet) this.E.get();
        azrw azrwVar2 = this.F;
        aexw aexwVar = (aexw) this.G.get();
        afdq afdqVar = (afdq) this.H.get();
        afeu afeuVar = ((afev) this.I).get();
        aezm aezmVar = ((aezu) this.f36J).get();
        return b(context, afhsVar, aemdVar, ysyVar, afixVar, azrwVar, afknVar, str, scheduledExecutorService, a, aenfVar, afhfVar, aaozVar, adylVar, aeezVar, ptkVar, axfgVar, aeqgVar, shfVar, shfVar2, aehsVar, affeVar, afhwVar, aejnVar, afcuVar, aeetVar, azrwVar2, aexwVar, afdqVar, afeuVar, aezmVar, (yss) this.L.get(), (afgb) this.M.get(), (adyj) this.N.get(), (afgt) this.O.get());
    }
}
