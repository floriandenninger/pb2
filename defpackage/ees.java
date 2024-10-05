package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ees implements azrw {
    private final eet a;
    private final int b;

    public ees(eet eetVar, int i) {
        this.a = eetVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        aldg aldgVar;
        switch (this.b) {
            case 0:
                eet eetVar = this.a;
                akzq akzqVar = eetVar.a;
                azrw azrwVar = eetVar.u;
                azrw azrwVar2 = eetVar.w;
                azrw azrwVar3 = eetVar.A;
                azrw azrwVar4 = eetVar.B;
                akzq akzqVar2 = akzq.UNKNOWN_UPLOAD;
                int ordinal = akzqVar.ordinal();
                if (ordinal == 1) {
                    aldgVar = (aldg) azrwVar.get();
                } else if (ordinal == 2) {
                    aldgVar = (aldg) azrwVar2.get();
                } else if (ordinal == 3) {
                    aldgVar = (aldg) azrwVar3.get();
                } else if (ordinal == 5) {
                    aldgVar = (aldg) azrwVar4.get();
                } else {
                    int i = akzqVar.g;
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unsupported UploadFlow ");
                    sb.append(i);
                    throw new UnsupportedOperationException(sb.toString());
                }
                ayaw.k(aldgVar);
                return aldgVar;
            case 1:
                eet eetVar2 = this.a;
                return new alcr((aldz) eetVar2.c.vV.get(), (aldo) eetVar2.d.get(), (alcs) eetVar2.g.get(), (albq) eetVar2.i.get(), (albe) eetVar2.k.get(), (alee) eetVar2.l.get(), (alay) eetVar2.m.get(), (alcn) eetVar2.n.get(), (albh) eetVar2.o.get(), (aldd) eetVar2.p.get(), (alch) eetVar2.q.get(), (alav) eetVar2.r.get(), (albs) eetVar2.s.get(), (albw) eetVar2.t.get(), (alaj) eetVar2.e.get(), 1);
            case 2:
                return new aldo();
            case 3:
                eet eetVar3 = this.a;
                return new alcs((aaea) eetVar3.c.K.get(), (alaj) eetVar3.e.get(), (akwg) eetVar3.c.mB.get(), (akyb) eetVar3.c.mG.get(), (axze) eetVar3.c.mF.get(), (alep) eetVar3.c.mC.get(), (albx) eetVar3.c.vX.get(), (aleh) eetVar3.f.get(), null, null, null, null);
            case 4:
                eet eetVar4 = this.a;
                efz efzVar = eetVar4.c;
                Context context = efzVar.b.a;
                akzk akzkVar = new akzk();
                axze axzeVar = (axze) eetVar4.c.mF.get();
                aadw aadwVar = (aadw) eetVar4.c.D.get();
                alaj alajVar = new alaj();
                alajVar.b(new alab(context, akzkVar, axzeVar, 1, null, null, null));
                alajVar.b(new alab(context, akzkVar, axzeVar, 0, null, null, null));
                alajVar.b(new zyl(context, aadwVar, akzkVar, axzeVar, null, null, null));
                alajVar.b(new alaq());
                return alajVar;
            case 5:
                eet eetVar5 = this.a;
                return new aleh((Executor) eetVar5.c.f.get(), (axze) eetVar5.c.mF.get(), 6, 5, (akwm) eetVar5.c.mD.get(), eetVar5.b, ayst.a, null, null, null);
            case 6:
                eet eetVar6 = this.a;
                return new albq((shf) eetVar6.c.g.get(), (aaea) eetVar6.c.K.get(), eetVar6.c.hf(), (alaj) eetVar6.e.get(), (axze) eetVar6.c.mF.get(), (akyb) eetVar6.c.mG.get(), (albx) eetVar6.c.vX.get(), (alep) eetVar6.c.mC.get(), (aleh) eetVar6.h.get(), null, null, null);
            case 7:
                eet eetVar7 = this.a;
                return new aleh((Executor) eetVar7.c.f.get(), (axze) eetVar7.c.mF.get(), 5, 4, (akwm) eetVar7.c.mD.get(), eetVar7.b, aflz.s, null, null, null);
            case 8:
                eet eetVar8 = this.a;
                efz efzVar2 = eetVar8.c;
                return new albe(efzVar2.b.a, (shf) efzVar2.g.get(), (aaea) eetVar8.c.K.get(), eetVar8.c.hf(), (afsy) eetVar8.c.au.get(), (wco) eetVar8.c.dc.get(), (akxh) eetVar8.c.mI.get(), (akyo) eetVar8.c.mL.get(), (aleh) eetVar8.h.get(), (axze) eetVar8.c.mF.get(), (alej) eetVar8.j.get(), eetVar8.b(), (akwg) eetVar8.c.mB.get(), (akyb) eetVar8.c.mG.get(), (albx) eetVar8.c.vX.get(), (alaj) eetVar8.e.get(), (alep) eetVar8.c.mC.get(), null, null, null, null);
            case 9:
                return new alej((alaj) this.a.e.get());
            case 10:
                eet eetVar9 = this.a;
                return new alee((aaea) eetVar9.c.K.get(), (ScheduledExecutorService) eetVar9.c.f.get(), (akyb) eetVar9.c.mG.get(), (axze) eetVar9.c.mF.get(), (alep) eetVar9.c.mC.get(), null, null, null);
            case 11:
                eet eetVar10 = this.a;
                efz efzVar3 = eetVar10.c;
                return new alay(efzVar3.b.a, (shf) efzVar3.g.get(), (aaea) eetVar10.c.K.get(), (akym) eetVar10.c.mP.get(), (alej) eetVar10.j.get(), (axze) eetVar10.c.mF.get(), (akxh) eetVar10.c.mI.get(), (akyb) eetVar10.c.mG.get(), (albx) eetVar10.c.vX.get(), (alaj) eetVar10.e.get(), (alep) eetVar10.c.mC.get(), null, null, null);
            case 12:
                eet eetVar11 = this.a;
                return new alcn((shf) eetVar11.c.g.get(), (aaea) eetVar11.c.K.get(), eetVar11.c.hf(), (akxh) eetVar11.c.mI.get(), (akyk) eetVar11.c.mE.get(), (akym) eetVar11.c.mP.get(), (axze) eetVar11.c.mF.get(), (alej) eetVar11.j.get(), eetVar11.b(), (akwg) eetVar11.c.mB.get(), (akyb) eetVar11.c.mG.get(), (albx) eetVar11.c.vX.get(), (alaj) eetVar11.e.get(), (alep) eetVar11.c.mC.get(), null, null, null, null);
            case 13:
                eet eetVar12 = this.a;
                return new albh((aaea) eetVar12.c.K.get(), (afsy) eetVar12.c.au.get(), eetVar12.c.hf(), (akxy) eetVar12.c.vY.get(), (aaxn) eetVar12.c.vZ.get(), (alaj) eetVar12.e.get(), (alah) eetVar12.c.wa.get(), (akyo) eetVar12.c.mL.get(), (axze) eetVar12.c.mF.get(), (akyb) eetVar12.c.mG.get(), (alep) eetVar12.c.mC.get(), null, null, null);
            case 14:
                eet eetVar13 = this.a;
                return new aldd((aaea) eetVar13.c.K.get(), (ScheduledExecutorService) eetVar13.c.f.get(), (axze) eetVar13.c.mF.get(), (afsy) eetVar13.c.au.get(), (akwm) eetVar13.c.mD.get(), (akxw) eetVar13.c.wb.get(), (akyb) eetVar13.c.mG.get(), (akxh) eetVar13.c.mI.get(), (alep) eetVar13.c.mC.get(), null, null, null);
            case 15:
                eet eetVar14 = this.a;
                return new alch((aaea) eetVar14.c.K.get(), (afsy) eetVar14.c.au.get(), eetVar14.c.hf(), (abde) eetVar14.c.wc.get(), (akyo) eetVar14.c.mL.get(), (axze) eetVar14.c.mF.get(), (akyb) eetVar14.c.mG.get(), (alep) eetVar14.c.mC.get(), null, null, null, null);
            case 16:
                eet eetVar15 = this.a;
                return new alav((aaea) eetVar15.c.K.get(), (alaj) eetVar15.e.get(), (axze) eetVar15.c.mF.get(), (akyb) eetVar15.c.mG.get(), (alep) eetVar15.c.mC.get(), null, null, null);
            case 17:
                eet eetVar16 = this.a;
                return new albs((aaea) eetVar16.c.K.get(), (axze) eetVar16.c.mF.get(), (akyb) eetVar16.c.mG.get(), (alep) eetVar16.c.mC.get(), null, null, null);
            case 18:
                eet eetVar17 = this.a;
                efz efzVar4 = eetVar17.c;
                return new albw(efzVar4.b.a, (akyb) efzVar4.mG.get(), (alep) eetVar17.c.mC.get());
            case 19:
                eet eetVar18 = this.a;
                return new albo((aldz) eetVar18.c.vV.get(), (aldo) eetVar18.d.get(), (albm) eetVar18.v.get(), (aldd) eetVar18.p.get(), (albw) eetVar18.t.get());
            case 20:
                eet eetVar19 = this.a;
                return new albm((aaea) eetVar19.c.K.get(), eetVar19.c.hf(), (aaxn) eetVar19.c.vZ.get(), (akyo) eetVar19.c.mL.get(), (axze) eetVar19.c.mF.get(), (akyb) eetVar19.c.mG.get(), (alep) eetVar19.c.mC.get(), null, null, null);
            case 21:
                eet eetVar20 = this.a;
                return new alce((aldz) eetVar20.c.vV.get(), (aldo) eetVar20.d.get(), (albq) eetVar20.i.get(), (albe) eetVar20.k.get(), (alcn) eetVar20.n.get(), (alcg) eetVar20.x.get(), (alba) eetVar20.y.get(), (alee) eetVar20.l.get(), (alcc) eetVar20.z.get(), (aldd) eetVar20.p.get(), (alav) eetVar20.r.get(), (albs) eetVar20.s.get(), (albw) eetVar20.t.get(), (alaj) eetVar20.e.get());
            case 22:
                eet eetVar21 = this.a;
                return new alcg((aaea) eetVar21.c.K.get(), (afsy) eetVar21.c.au.get(), eetVar21.c.hf(), (akxy) eetVar21.c.vY.get(), (akyo) eetVar21.c.mL.get(), (axze) eetVar21.c.mF.get(), (akyb) eetVar21.c.mG.get(), (alep) eetVar21.c.mC.get(), null, null, null);
            case 23:
                eet eetVar22 = this.a;
                return new alba((aaea) eetVar22.c.K.get(), (afsy) eetVar22.c.au.get(), (abbm) eetVar22.c.wd.get(), (akyo) eetVar22.c.mL.get(), (axze) eetVar22.c.mF.get(), eetVar22.c.hf(), (akyb) eetVar22.c.mG.get(), (alep) eetVar22.c.mC.get(), null, null, null);
            case 24:
                eet eetVar23 = this.a;
                return new alcc((aaea) eetVar23.c.K.get(), (afsy) eetVar23.c.au.get(), (akxy) eetVar23.c.vY.get(), (akyo) eetVar23.c.mL.get(), (axze) eetVar23.c.mF.get(), (alaj) eetVar23.e.get(), (alah) eetVar23.c.wa.get(), eetVar23.c.hf(), (akyb) eetVar23.c.mG.get(), (alep) eetVar23.c.mC.get(), null, null, null);
            default:
                eet eetVar24 = this.a;
                return new alcr((aldz) eetVar24.c.vV.get(), (aldo) eetVar24.d.get(), (alcs) eetVar24.g.get(), (albq) eetVar24.i.get(), (albe) eetVar24.k.get(), (alee) eetVar24.l.get(), (alay) eetVar24.m.get(), (alcn) eetVar24.n.get(), (albh) eetVar24.o.get(), (aldd) eetVar24.p.get(), (alch) eetVar24.q.get(), (alav) eetVar24.r.get(), (albs) eetVar24.s.get(), (albw) eetVar24.t.get(), (alaj) eetVar24.e.get(), 0);
        }
    }
}
