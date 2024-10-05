package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class efu implements azrw {
    private final efv a;
    private final int b;

    public efu(efv efvVar, int i) {
        this.a = efvVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i / 100 == 0) {
            switch (i) {
                case 0:
                    efv efvVar = this.a;
                    aipw aipwVar = (aipw) efvVar.c.vO.get();
                    aiqf aiqfVar = (aiqf) efvVar.c.vQ.get();
                    aiqn j = efvVar.j();
                    akfq kK = efvVar.c.kK();
                    efz efzVar = efvVar.c;
                    return new aiqc(aipwVar, aiqfVar, j, kK, new akfq(efzVar.f, efzVar.as, efzVar.aw, efzVar.vR, efzVar.g, efvVar.d.G, efzVar.gw, efvVar.e, null, null), (aaea) efvVar.c.K.get(), null, null);
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
                    efv efvVar2 = this.a;
                    Context context = efvVar2.c.b.a;
                    azqv azqvVar = (azqv) efvVar2.g.get();
                    ayaw.k(azqvVar);
                    return azqvVar;
                case 55:
                    efv efvVar3 = this.a;
                    Context context2 = efvVar3.c.b.a;
                    azqv azqvVar2 = (azqv) efvVar3.h.get();
                    ayaw.k(azqvVar2);
                    return azqvVar2;
                case 56:
                    efv efvVar4 = this.a;
                    Context context3 = efvVar4.c.b.a;
                    azqv azqvVar3 = (azqv) efvVar4.j.get();
                    ayaw.k(azqvVar3);
                    return azqvVar3;
                case 57:
                    efv efvVar5 = this.a;
                    Context context4 = efvVar5.c.b.a;
                    azqv azqvVar4 = (azqv) efvVar5.k.get();
                    ayaw.k(azqvVar4);
                    return azqvVar4;
                case 58:
                    efv efvVar6 = this.a;
                    Context context5 = efvVar6.c.b.a;
                    azqv azqvVar5 = (azqv) efvVar6.l.get();
                    ayaw.k(azqvVar5);
                    return azqvVar5;
                case 59:
                    efv efvVar7 = this.a;
                    Context context6 = efvVar7.c.b.a;
                    azqv azqvVar6 = (azqv) efvVar7.m.get();
                    ayaw.k(azqvVar6);
                    return azqvVar6;
                case 60:
                    efv efvVar8 = this.a;
                    Context context7 = efvVar8.c.b.a;
                    azqv azqvVar7 = (azqv) efvVar8.n.get();
                    ayaw.k(azqvVar7);
                    return azqvVar7;
                case 61:
                    efv efvVar9 = this.a;
                    Context context8 = efvVar9.c.b.a;
                    azqv azqvVar8 = (azqv) efvVar9.o.get();
                    ayaw.k(azqvVar8);
                    return azqvVar8;
                case 62:
                    efv efvVar10 = this.a;
                    Context context9 = efvVar10.c.b.a;
                    azqv azqvVar9 = (azqv) efvVar10.p.get();
                    ayaw.k(azqvVar9);
                    return azqvVar9;
                case 63:
                    efv efvVar11 = this.a;
                    Context context10 = efvVar11.c.b.a;
                    azqv azqvVar10 = (azqv) efvVar11.q.get();
                    ayaw.k(azqvVar10);
                    return azqvVar10;
                case 64:
                    efv efvVar12 = this.a;
                    Context context11 = efvVar12.c.b.a;
                    azqv azqvVar11 = (azqv) efvVar12.r.get();
                    ayaw.k(azqvVar11);
                    return azqvVar11;
                case 65:
                    efv efvVar13 = this.a;
                    Context context12 = efvVar13.c.b.a;
                    azqv azqvVar12 = (azqv) efvVar13.s.get();
                    ayaw.k(azqvVar12);
                    return azqvVar12;
                case 66:
                    efv efvVar14 = this.a;
                    Context context13 = efvVar14.c.b.a;
                    azqv azqvVar13 = (azqv) efvVar14.t.get();
                    ayaw.k(azqvVar13);
                    return azqvVar13;
                case 67:
                    efv efvVar15 = this.a;
                    Context context14 = efvVar15.c.b.a;
                    azqv azqvVar14 = (azqv) efvVar15.u.get();
                    ayaw.k(azqvVar14);
                    return azqvVar14;
                case 68:
                    efv efvVar16 = this.a;
                    Context context15 = efvVar16.c.b.a;
                    azqv azqvVar15 = (azqv) efvVar16.v.get();
                    ayaw.k(azqvVar15);
                    return azqvVar15;
                case 69:
                    efv efvVar17 = this.a;
                    Context context16 = efvVar17.c.b.a;
                    azqv azqvVar16 = (azqv) efvVar17.w.get();
                    ayaw.k(azqvVar16);
                    return azqvVar16;
                case 70:
                    efv efvVar18 = this.a;
                    Context context17 = efvVar18.c.b.a;
                    azqv azqvVar17 = (azqv) efvVar18.y.get();
                    ayaw.k(azqvVar17);
                    return azqvVar17;
                case 71:
                    efv efvVar19 = this.a;
                    Context context18 = efvVar19.c.b.a;
                    azqv azqvVar18 = (azqv) efvVar19.z.get();
                    ayaw.k(azqvVar18);
                    return azqvVar18;
                case 72:
                    efv efvVar20 = this.a;
                    Context context19 = efvVar20.c.b.a;
                    azqv azqvVar19 = (azqv) efvVar20.A.get();
                    ayaw.k(azqvVar19);
                    return azqvVar19;
                case 73:
                    efv efvVar21 = this.a;
                    Context context20 = efvVar21.c.b.a;
                    azqy azqyVar = (azqy) efvVar21.B.get();
                    ayaw.k(azqyVar);
                    return azqyVar;
                case 74:
                    efv efvVar22 = this.a;
                    Context context21 = efvVar22.c.b.a;
                    azqv azqvVar20 = (azqv) efvVar22.x.get();
                    ayaw.k(azqvVar20);
                    return azqvVar20;
                case 75:
                    efv efvVar23 = this.a;
                    Context context22 = efvVar23.c.b.a;
                    azrr azrrVar = (azrr) efvVar23.C.get();
                    ayaw.k(azrrVar);
                    return azrrVar;
                case 76:
                    efv efvVar24 = this.a;
                    Context context23 = efvVar24.c.b.a;
                    azqy azqyVar2 = (azqy) efvVar24.D.get();
                    ayaw.k(azqyVar2);
                    return azqyVar2;
                case 77:
                    efv efvVar25 = this.a;
                    Context context24 = efvVar25.c.b.a;
                    azqy azqyVar3 = (azqy) efvVar25.E.get();
                    ayaw.k(azqyVar3);
                    return azqyVar3;
                case 78:
                    efv efvVar26 = this.a;
                    Context context25 = efvVar26.c.b.a;
                    azqy azqyVar4 = (azqy) efvVar26.F.get();
                    ayaw.k(azqyVar4);
                    return azqyVar4;
                case 79:
                    efv efvVar27 = this.a;
                    Context context26 = efvVar27.c.b.a;
                    azqv azqvVar21 = (azqv) efvVar27.G.get();
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
                    efv efvVar28 = this.a;
                    Context context27 = efvVar28.c.b.a;
                    azqv azqvVar22 = (azqv) efvVar28.H.get();
                    ayaw.k(azqvVar22);
                    return azqvVar22;
                case 88:
                    efv efvVar29 = this.a;
                    Context context28 = efvVar29.c.b.a;
                    azqv azqvVar23 = (azqv) efvVar29.I.get();
                    ayaw.k(azqvVar23);
                    return azqvVar23;
                case 89:
                    efv efvVar30 = this.a;
                    Context context29 = efvVar30.c.b.a;
                    azqv azqvVar24 = (azqv) efvVar30.f206J.get();
                    ayaw.k(azqvVar24);
                    return azqvVar24;
                case 90:
                    efv efvVar31 = this.a;
                    Context context30 = efvVar31.c.b.a;
                    azqv azqvVar25 = (azqv) efvVar31.K.get();
                    ayaw.k(azqvVar25);
                    return azqvVar25;
                case 91:
                    efv efvVar32 = this.a;
                    Context context31 = efvVar32.c.b.a;
                    azqv azqvVar26 = (azqv) efvVar32.L.get();
                    ayaw.k(azqvVar26);
                    return azqvVar26;
                case 92:
                    efv efvVar33 = this.a;
                    Context context32 = efvVar33.c.b.a;
                    azqv azqvVar27 = (azqv) efvVar33.M.get();
                    ayaw.k(azqvVar27);
                    return azqvVar27;
                case 93:
                    efv efvVar34 = this.a;
                    Context context33 = efvVar34.c.b.a;
                    azqv azqvVar28 = (azqv) efvVar34.N.get();
                    ayaw.k(azqvVar28);
                    return azqvVar28;
                case 94:
                    return new ajbq((shf) this.a.c.g.get());
                case 95:
                    return ajbp.a();
                case 96:
                    efv efvVar35 = this.a;
                    return new ajbf((Executor) efvVar35.c.i.get(), efvVar35.a, (shf) efvVar35.c.g.get(), (aaea) efvVar35.c.K.get());
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
        switch (i) {
            case 100:
                efv efvVar36 = this.a;
                zih zihVar = (zih) efvVar36.S.get();
                aixm aixmVar = (aixm) efvVar36.P.get();
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
}
