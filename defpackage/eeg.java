package defpackage;

import android.content.Context;
import java.security.Key;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eeg implements azrw {
    private final eeh a;
    private final int b;

    public eeg(eeh eehVar, int i) {
        this.a = eehVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        switch (this.b) {
            case 0:
                return new aghe((ageh) this.a.f.get());
            case 1:
                eeh eehVar = this.a;
                return new ageh((agek) eehVar.d.we.get(), (agmm) eehVar.e.get(), (agsg) eehVar.d.gU.get(), (yxn) eehVar.d.gF.get(), axqq.a(axqw.a));
            case 2:
                eeh eehVar2 = this.a;
                efz efzVar = eehVar2.d;
                Context context = efzVar.b.a;
                String str = eehVar2.a;
                zgj bY = efzVar.bY();
                ajjz ajjzVar = (ajjz) eehVar2.d.kp.get();
                aisn aisnVar = (aisn) eehVar2.d.wh.get();
                yxn yxnVar = (yxn) eehVar2.d.gF.get();
                aadw aadwVar = (aadw) eehVar2.d.D.get();
                agsg agsgVar = (agsg) eehVar2.d.gU.get();
                efz efzVar2 = eehVar2.d;
                return new agmm(context, str, bY, ajjzVar, aisnVar, yxnVar, aadwVar, agsgVar, efzVar2.kX, (aksl) efzVar2.ha.get(), (axzg) eehVar2.d.gO.get(), null, null, null);
            case 3:
                eeh eehVar3 = this.a;
                agmm agmmVar = (agmm) eehVar3.e.get();
                agjf agjfVar = (agjf) eehVar3.k.get();
                agid agidVar = (agid) eehVar3.l.get();
                agjv agjvVar = (agjv) eehVar3.m.get();
                agiv agivVar = (agiv) eehVar3.n.get();
                agjl agjlVar = (agjl) eehVar3.o.get();
                agjh agjhVar = (agjh) eehVar3.p.get();
                agjg agjgVar = (agjg) eehVar3.q.get();
                agib agibVar = (agib) eehVar3.r.get();
                aghy aghyVar = (aghy) eehVar3.s.get();
                return new agil(agmmVar, agjfVar, agidVar, agjvVar, agivVar, agjlVar, agjhVar, agjgVar, agibVar, aghyVar, (agjs) eehVar3.x.get(), (shf) eehVar3.d.g.get(), (agzr) eehVar3.d.gP.get(), null);
            case 4:
                eeh eehVar4 = this.a;
                return new agjf((Key) eehVar4.d.gb.get(), (agik) eehVar4.i.get(), (agis) eehVar4.j.get());
            case 5:
                eeh eehVar5 = this.a;
                efz efzVar3 = eehVar5.d;
                return new agik(new ajyg(efzVar3.g, efzVar3.by, efzVar3.D, eehVar5.e, (char[]) null), (aght) eehVar5.d.be.get(), (String) eehVar5.h.get(), null);
            case 6:
                String p = agfp.p(this.a.a);
                ayaw.k(p);
                return p;
            case 7:
                return new agis((agik) this.a.i.get());
            case 8:
                eeh eehVar6 = this.a;
                return new agid((agik) eehVar6.i.get(), eehVar6.e);
            case 9:
                eeh eehVar7 = this.a;
                return new agjv((agik) eehVar7.i.get(), eehVar7.e, (shf) eehVar7.d.g.get(), (agid) eehVar7.l.get());
            case 10:
                eeh eehVar8 = this.a;
                return new agiv((agik) eehVar8.i.get(), eehVar8.e, (shf) eehVar8.d.g.get(), (agid) eehVar8.l.get(), (agjv) eehVar8.m.get(), (agzr) eehVar8.d.gP.get());
            case 11:
                eeh eehVar9 = this.a;
                return new agjl((agik) eehVar9.i.get(), eehVar9.e, (agid) eehVar9.l.get(), (agjv) eehVar9.m.get(), (shf) eehVar9.d.g.get());
            case 12:
                return new agjh((agik) this.a.i.get());
            case 13:
                return new agjg((agik) this.a.i.get(), null);
            case 14:
                return new agib((agik) this.a.i.get());
            case 15:
                return new aghy((agik) this.a.i.get());
            case 16:
                return new aedn((agik) this.a.i.get());
            case 17:
                return new agjg((agik) this.a.i.get());
            case 18:
                eeh eehVar10 = this.a;
                final agjs agjsVar = new agjs((Executor) eehVar10.d.lj.get(), (agej) eehVar10.f.get(), (agik) eehVar10.i.get(), (agjv) eehVar10.m.get(), (agjf) eehVar10.k.get(), (agiv) eehVar10.n.get(), (agjl) eehVar10.o.get(), (agka) eehVar10.v.get(), new akpq(eehVar10.e, eehVar10.l, (char[]) null, (byte[]) null, (byte[]) null), amvs.a, (aypy) eehVar10.w.get(), null, null, null);
                agjsVar.h.ax(new ayrs() { // from class: agjn
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        agjs agjsVar2 = agjs.this;
                        int size = agjsVar2.c().b().size();
                        for (String str2 : ((agkz) obj).a) {
                            agjsVar2.n(str2);
                            agjsVar2.m(str2);
                        }
                        if (size <= 0 || !agjsVar2.f().isEmpty()) {
                            return;
                        }
                        Iterator it = agjsVar2.g.iterator();
                        while (it.hasNext()) {
                            agfp agfpVar = ((agfo) it.next()).a;
                            agfpVar.e.a(agfpVar.G);
                        }
                    }
                });
                return agjsVar;
            case 19:
                eeh eehVar11 = this.a;
                shf shfVar = (shf) eehVar11.d.g.get();
                return new agka(shfVar);
            case 20:
                return azrl.e();
            case 21:
                eeh eehVar12 = this.a;
                return new agii((agmm) eehVar12.e.get(), (agid) eehVar12.l.get(), (agjv) eehVar12.m.get(), (agiv) eehVar12.n.get(), (agjl) eehVar12.o.get(), (agil) eehVar12.y.get(), (azrs) eehVar12.w.get());
            case 22:
                eeh eehVar13 = this.a;
                return new aghv();
            case 23:
                eeh eehVar14 = this.a;
                shf shfVar2 = (shf) eehVar14.d.g.get();
                String str2 = eehVar14.a;
                efz efzVar4 = eehVar14.d;
                azrw azrwVar = efzVar4.gW;
                azrw azrwVar2 = efzVar4.gU;
                azrw azrwVar3 = efzVar4.lf;
                agvh agvhVar = (agvh) efzVar4.kF.get();
                efz efzVar5 = eehVar14.d;
                final aghc aghcVar = new aghc(shfVar2, str2, azrwVar, azrwVar2, azrwVar3, agvhVar, efzVar5.kU, eehVar14.b, (Executor) efzVar5.lj.get(), (Executor) eehVar14.d.f.get(), eehVar14.f, (agjv) eehVar14.m.get(), eehVar14.y, eehVar14.A, eehVar14.B, eehVar14.D, (agzz) eehVar14.d.gG.get(), eehVar14.F, eehVar14.G, (aypy) eehVar14.w.get());
                aghcVar.p.ax(new ayrs() { // from class: aggo
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        aghc aghcVar2 = aghc.this;
                        agil agilVar = (agil) aghcVar2.k.get();
                        for (String str3 : ((agkz) obj).a) {
                            aghcVar2.s(str3);
                            agilVar.v(str3);
                        }
                    }
                });
                return aghcVar;
            case 24:
                eeh eehVar15 = this.a;
                zgj bY2 = eehVar15.d.bY();
                String str3 = eehVar15.a;
                efz efzVar6 = eehVar15.d;
                return new aghj(bY2, str3, efzVar6.gW, new aghi((shf) efzVar6.g.get(), (agil) eehVar15.y.get(), eehVar15.d.bY(), (agzx) eehVar15.d.kZ.get(), (aght) eehVar15.d.be.get(), (aaea) eehVar15.d.K.get()), (aguh) eehVar15.d.lg.get(), (agvh) eehVar15.d.kF.get());
            case 25:
                return new ajoy(this.a.y, (short[]) null);
            case 26:
                eeh eehVar16 = this.a;
                efz efzVar7 = eehVar16.d;
                azrw azrwVar4 = efzVar7.he;
                azrw azrwVar5 = eehVar16.y;
                azrw azrwVar6 = eehVar16.C;
                return new agfx(azrwVar4, azrwVar5, azrwVar6);
            case 27:
                return new aghk((aghc) this.a.E.get());
            case 28:
                agsy agsyVar = new agsy();
                agsyVar.b = new agsz(agsyVar, agsyVar.a);
                return agsyVar;
            case 29:
                eeh eehVar17 = this.a;
                return new agsi((akpq) eehVar17.H.get(), (agsg) eehVar17.d.gU.get(), null, null, null);
            case 30:
                eeh eehVar18 = this.a;
                return new akpq(eehVar18.y, eehVar18.d.kZ, (byte[]) null, (byte[]) null, (byte[]) null);
            case 31:
                return new akgl(null);
            case 32:
                eeh eehVar19 = this.a;
                shf shfVar3 = (shf) eehVar19.d.g.get();
                String str4 = eehVar19.a;
                efz efzVar8 = eehVar19.d;
                azrw azrwVar7 = efzVar8.he;
                azrw azrwVar8 = efzVar8.gU;
                azrw azrwVar9 = efzVar8.kQ;
                ageh agehVar = (ageh) eehVar19.f.get();
                azrw azrwVar10 = eehVar19.y;
                agft agftVar = eehVar19.b;
                azrw azrwVar11 = eehVar19.A;
                azrw azrwVar12 = eehVar19.E;
                azrw azrwVar13 = eehVar19.D;
                efz efzVar9 = eehVar19.d;
                azrw azrwVar14 = efzVar9.iP;
                azrw azrwVar15 = efzVar9.kZ;
                amvs amvsVar = amvs.a;
                agzr agzrVar = (agzr) eehVar19.d.gP.get();
                aarr aarrVar = (aarr) eehVar19.d.hV.get();
                efz efzVar10 = eehVar19.d;
                return new aggn(shfVar3, str4, azrwVar7, azrwVar8, azrwVar9, agehVar, azrwVar10, agftVar, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, amvsVar, agzrVar, aarrVar, amsx.r(new jve(efzVar10.b.a, (afsy) efzVar10.au.get(), (aais) efzVar10.dJ.get())));
            case 33:
                eeh eehVar20 = this.a;
                return new ageo(eehVar20.L, (Executor) eehVar20.d.lj.get(), eehVar20.y, eehVar20.b);
            case 34:
                eeh eehVar21 = this.a;
                shf shfVar4 = (shf) eehVar21.d.g.get();
                efz efzVar11 = eehVar21.d;
                return new aghd(efzVar11.wj, efzVar11.iP, (agil) eehVar21.y.get(), shfVar4);
            case 35:
                eeh eehVar22 = this.a;
                efz efzVar12 = eehVar22.d;
                Context context2 = efzVar12.b.a;
                shf shfVar5 = (shf) efzVar12.g.get();
                String str5 = eehVar22.a;
                efz efzVar13 = eehVar22.d;
                azrw azrwVar16 = efzVar13.gU;
                agvh agvhVar2 = (agvh) efzVar13.kF.get();
                efz efzVar14 = eehVar22.d;
                return new agff(shfVar5, str5, azrwVar16, agvhVar2, efzVar14.mt, efzVar14.kU, eehVar22.b, (Executor) efzVar14.f.get(), (Executor) eehVar22.d.lj.get(), (agiv) eehVar22.n.get(), eehVar22.y, eehVar22.f, eehVar22.e, eehVar22.A, eehVar22.B, eehVar22.E, eehVar22.x, (agzz) eehVar22.d.gG.get(), eehVar22.I, eehVar22.G, eehVar22.f198J, (aadw) eehVar22.d.D.get(), (aaea) eehVar22.d.K.get());
            case 36:
                eeh eehVar23 = this.a;
                efz efzVar15 = eehVar23.d;
                return new aggk(efzVar15.gU, eehVar23.b, eehVar23.H, eehVar23.A, eehVar23.B, eehVar23.E, eehVar23.o, eehVar23.x, (aaea) efzVar15.K.get(), eehVar23.a, (agvh) eehVar23.d.kF.get(), (agzz) eehVar23.d.gG.get(), (agsm) eehVar23.d.gI.get(), (shf) eehVar23.d.g.get(), eehVar23.G, eehVar23.y, (Executor) eehVar23.d.f.get());
            case 37:
                return new agep(this.a.j);
            case 38:
                eeh eehVar24 = this.a;
                return new agfy(eehVar24.l, eehVar24.u, eehVar24.b);
            case 39:
                eeh eehVar25 = this.a;
                return new agke((aair) eehVar25.R.get(), (aajb) eehVar25.d.dG.get(), (agzr) eehVar25.d.gP.get());
            default:
                eeh eehVar26 = this.a;
                aair a = ((aais) eehVar26.d.dJ.get()).a(eehVar26.c);
                ayaw.k(a);
                return a;
        }
    }
}
