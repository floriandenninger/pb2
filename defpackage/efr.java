package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class efr implements azrw {
    private final efs a;
    private final int b;

    public efr(efs efsVar, int i) {
        this.a = efsVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    efs efsVar = this.a;
                    zih zihVar = (zih) efsVar.S.get();
                    aixm aixmVar = (aixm) efsVar.P.get();
                    return advr.l(zihVar, aixmVar);
                case 101:
                    return aizl.c((ajbq) this.a.O.get());
                case 102:
                    return afhy.i();
                case 103:
                    return aizl.e(this.a.b);
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                efs efsVar2 = this.a;
                aipw aipwVar = (aipw) efsVar2.c.vO.get();
                aiqf aiqfVar = (aiqf) efsVar2.c.vQ.get();
                aiqn j = efsVar2.j();
                akfq kK = efsVar2.c.kK();
                efz efzVar = efsVar2.c;
                return new aiqc(aipwVar, aiqfVar, j, kK, new akfq(efzVar.f, efzVar.as, efzVar.aw, efzVar.vR, efzVar.g, efsVar2.d.p, efzVar.gw, efsVar2.e, null, null), (aaea) efsVar2.c.K.get(), null, null);
            case 1:
                return null;
            case 2:
                return ((azqv) this.a.g.get()).G();
            case 3:
                return azqv.ap();
            case 4:
                return ((azqv) this.a.h.get()).G();
            case 5:
                return azqv.ap();
            case 6:
                return ((azqv) this.a.i.get()).G();
            case 7:
                return azqv.ap();
            case 8:
                return ((azqv) this.a.j.get()).G();
            case 9:
                return azqv.ap();
            case 10:
                return ((azqv) this.a.k.get()).G();
            case 11:
                return azqv.ap();
            case 12:
                return ((azqv) this.a.l.get()).G();
            case 13:
                return azqv.ap();
            case 14:
                return aiyl.b((azqv) this.a.m.get());
            case 15:
                return azqv.ap();
            case 16:
                return ((azqv) this.a.n.get()).G();
            case 17:
                return azqv.ap();
            case 18:
                return ((azqv) this.a.o.get()).G();
            case 19:
                return azqv.ap();
            case 20:
                return ((azqv) this.a.p.get()).G();
            case 21:
                return azqv.ap();
            case 22:
                return ((azqv) this.a.q.get()).G();
            case 23:
                return azqv.ap();
            case 24:
                return ((azqv) this.a.r.get()).G();
            case 25:
                return azqv.ap();
            case 26:
                return ((azqv) this.a.s.get()).G();
            case 27:
                return azqv.ap();
            case 28:
                return ((azqv) this.a.t.get()).G();
            case 29:
                return azqv.ap();
            case 30:
                return ((azqv) this.a.u.get()).G();
            case 31:
                return azqv.ap();
            case 32:
                return ((azqv) this.a.v.get()).G();
            case 33:
                return azqv.ap();
            case 34:
                return ((azqv) this.a.w.get()).G();
            case 35:
                return azqv.ap();
            case 36:
                return ((azqv) this.a.x.get()).G();
            case 37:
                return azqv.ap();
            case 38:
                return ((azqv) this.a.y.get()).G();
            case 39:
                return azqv.ap();
            case 40:
                return ((azqv) this.a.z.get()).G();
            case 41:
                return azqv.ap();
            case 42:
                return ((azqv) this.a.A.get()).G();
            case 43:
                return azqv.ap();
            case 44:
                return ((azqy) this.a.B.get()).G();
            case 45:
                return azqy.ap();
            case 46:
                return azrr.ab();
            case 47:
                return ((azqy) this.a.D.get()).G();
            case 48:
                return azqy.ap();
            case 49:
                return ((azqy) this.a.E.get()).G();
            case 50:
                return azqy.ap();
            case 51:
                return ((azqy) this.a.F.get()).G();
            case 52:
                return azqy.ap();
            case 53:
                return azqv.ap();
            case 54:
                efs efsVar3 = this.a;
                Context context = efsVar3.c.b.a;
                azqv azqvVar = (azqv) efsVar3.g.get();
                ayaw.k(azqvVar);
                return azqvVar;
            case 55:
                efs efsVar4 = this.a;
                Context context2 = efsVar4.c.b.a;
                azqv azqvVar2 = (azqv) efsVar4.h.get();
                ayaw.k(azqvVar2);
                return azqvVar2;
            case 56:
                efs efsVar5 = this.a;
                Context context3 = efsVar5.c.b.a;
                azqv azqvVar3 = (azqv) efsVar5.j.get();
                ayaw.k(azqvVar3);
                return azqvVar3;
            case 57:
                efs efsVar6 = this.a;
                Context context4 = efsVar6.c.b.a;
                azqv azqvVar4 = (azqv) efsVar6.k.get();
                ayaw.k(azqvVar4);
                return azqvVar4;
            case 58:
                efs efsVar7 = this.a;
                Context context5 = efsVar7.c.b.a;
                azqv azqvVar5 = (azqv) efsVar7.l.get();
                ayaw.k(azqvVar5);
                return azqvVar5;
            case 59:
                efs efsVar8 = this.a;
                Context context6 = efsVar8.c.b.a;
                azqv azqvVar6 = (azqv) efsVar8.m.get();
                ayaw.k(azqvVar6);
                return azqvVar6;
            case 60:
                efs efsVar9 = this.a;
                Context context7 = efsVar9.c.b.a;
                azqv azqvVar7 = (azqv) efsVar9.n.get();
                ayaw.k(azqvVar7);
                return azqvVar7;
            case 61:
                efs efsVar10 = this.a;
                Context context8 = efsVar10.c.b.a;
                azqv azqvVar8 = (azqv) efsVar10.o.get();
                ayaw.k(azqvVar8);
                return azqvVar8;
            case 62:
                efs efsVar11 = this.a;
                Context context9 = efsVar11.c.b.a;
                azqv azqvVar9 = (azqv) efsVar11.p.get();
                ayaw.k(azqvVar9);
                return azqvVar9;
            case 63:
                efs efsVar12 = this.a;
                Context context10 = efsVar12.c.b.a;
                azqv azqvVar10 = (azqv) efsVar12.q.get();
                ayaw.k(azqvVar10);
                return azqvVar10;
            case 64:
                efs efsVar13 = this.a;
                Context context11 = efsVar13.c.b.a;
                azqv azqvVar11 = (azqv) efsVar13.r.get();
                ayaw.k(azqvVar11);
                return azqvVar11;
            case 65:
                efs efsVar14 = this.a;
                Context context12 = efsVar14.c.b.a;
                azqv azqvVar12 = (azqv) efsVar14.s.get();
                ayaw.k(azqvVar12);
                return azqvVar12;
            case 66:
                efs efsVar15 = this.a;
                Context context13 = efsVar15.c.b.a;
                azqv azqvVar13 = (azqv) efsVar15.t.get();
                ayaw.k(azqvVar13);
                return azqvVar13;
            case 67:
                efs efsVar16 = this.a;
                Context context14 = efsVar16.c.b.a;
                azqv azqvVar14 = (azqv) efsVar16.u.get();
                ayaw.k(azqvVar14);
                return azqvVar14;
            case 68:
                efs efsVar17 = this.a;
                Context context15 = efsVar17.c.b.a;
                azqv azqvVar15 = (azqv) efsVar17.v.get();
                ayaw.k(azqvVar15);
                return azqvVar15;
            case 69:
                efs efsVar18 = this.a;
                Context context16 = efsVar18.c.b.a;
                azqv azqvVar16 = (azqv) efsVar18.w.get();
                ayaw.k(azqvVar16);
                return azqvVar16;
            case 70:
                efs efsVar19 = this.a;
                Context context17 = efsVar19.c.b.a;
                azqv azqvVar17 = (azqv) efsVar19.y.get();
                ayaw.k(azqvVar17);
                return azqvVar17;
            case 71:
                efs efsVar20 = this.a;
                Context context18 = efsVar20.c.b.a;
                azqv azqvVar18 = (azqv) efsVar20.z.get();
                ayaw.k(azqvVar18);
                return azqvVar18;
            case 72:
                efs efsVar21 = this.a;
                Context context19 = efsVar21.c.b.a;
                azqv azqvVar19 = (azqv) efsVar21.A.get();
                ayaw.k(azqvVar19);
                return azqvVar19;
            case 73:
                efs efsVar22 = this.a;
                Context context20 = efsVar22.c.b.a;
                azqy azqyVar = (azqy) efsVar22.B.get();
                ayaw.k(azqyVar);
                return azqyVar;
            case 74:
                efs efsVar23 = this.a;
                Context context21 = efsVar23.c.b.a;
                azqv azqvVar20 = (azqv) efsVar23.x.get();
                ayaw.k(azqvVar20);
                return azqvVar20;
            case 75:
                efs efsVar24 = this.a;
                Context context22 = efsVar24.c.b.a;
                azrr azrrVar = (azrr) efsVar24.C.get();
                ayaw.k(azrrVar);
                return azrrVar;
            case 76:
                efs efsVar25 = this.a;
                Context context23 = efsVar25.c.b.a;
                azqy azqyVar2 = (azqy) efsVar25.D.get();
                ayaw.k(azqyVar2);
                return azqyVar2;
            case 77:
                efs efsVar26 = this.a;
                Context context24 = efsVar26.c.b.a;
                azqy azqyVar3 = (azqy) efsVar26.E.get();
                ayaw.k(azqyVar3);
                return azqyVar3;
            case 78:
                efs efsVar27 = this.a;
                Context context25 = efsVar27.c.b.a;
                azqy azqyVar4 = (azqy) efsVar27.F.get();
                ayaw.k(azqyVar4);
                return azqyVar4;
            case 79:
                efs efsVar28 = this.a;
                Context context26 = efsVar28.c.b.a;
                azqv azqvVar21 = (azqv) efsVar28.G.get();
                ayaw.k(azqvVar21);
                return azqvVar21;
            case 80:
                return azqv.ap();
            case 81:
                return azqv.ap();
            case 82:
                return azqv.ap();
            case 83:
                return azqv.ap();
            case 84:
                return azqv.ap();
            case 85:
                return azqv.ap();
            case 86:
                return azqv.ap();
            case 87:
                efs efsVar29 = this.a;
                Context context27 = efsVar29.c.b.a;
                azqv azqvVar22 = (azqv) efsVar29.H.get();
                ayaw.k(azqvVar22);
                return azqvVar22;
            case 88:
                efs efsVar30 = this.a;
                Context context28 = efsVar30.c.b.a;
                azqv azqvVar23 = (azqv) efsVar30.I.get();
                ayaw.k(azqvVar23);
                return azqvVar23;
            case 89:
                efs efsVar31 = this.a;
                Context context29 = efsVar31.c.b.a;
                azqv azqvVar24 = (azqv) efsVar31.f205J.get();
                ayaw.k(azqvVar24);
                return azqvVar24;
            case 90:
                efs efsVar32 = this.a;
                Context context30 = efsVar32.c.b.a;
                azqv azqvVar25 = (azqv) efsVar32.K.get();
                ayaw.k(azqvVar25);
                return azqvVar25;
            case 91:
                efs efsVar33 = this.a;
                Context context31 = efsVar33.c.b.a;
                azqv azqvVar26 = (azqv) efsVar33.L.get();
                ayaw.k(azqvVar26);
                return azqvVar26;
            case 92:
                efs efsVar34 = this.a;
                Context context32 = efsVar34.c.b.a;
                azqv azqvVar27 = (azqv) efsVar34.M.get();
                ayaw.k(azqvVar27);
                return azqvVar27;
            case 93:
                efs efsVar35 = this.a;
                Context context33 = efsVar35.c.b.a;
                azqv azqvVar28 = (azqv) efsVar35.N.get();
                ayaw.k(azqvVar28);
                return azqvVar28;
            case 94:
                return new ajbq((shf) this.a.c.g.get());
            case 95:
                return ajbp.a();
            case 96:
                efs efsVar36 = this.a;
                return new ajbf((Executor) efsVar36.c.i.get(), efsVar36.a, (shf) efsVar36.c.g.get(), (aaea) efsVar36.c.K.get());
            case 97:
                return null;
            case 98:
                return aifu.m((zih) this.a.R.get());
            case 99:
                return aizl.d((aiqc) this.a.f.get());
            default:
                throw new AssertionError(i);
        }
    }
}
