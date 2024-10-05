package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efx implements azrw {
    private final efy a;
    private final int b;

    public efx(efy efyVar, int i) {
        this.a = efyVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    efy efyVar = this.a;
                    zih zihVar = (zih) efyVar.T.get();
                    aixm aixmVar = (aixm) efyVar.Q.get();
                    return advr.l(zihVar, aixmVar);
                case 101:
                    return aizl.c((ajbq) this.a.P.get());
                case 102:
                    return afhy.i();
                case 103:
                    return aizl.e(this.a.c);
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                efy efyVar2 = this.a;
                aipw aipwVar = (aipw) efyVar2.d.vO.get();
                aiqf aiqfVar = (aiqf) efyVar2.d.vQ.get();
                aiqn j = efyVar2.j();
                akfq kK = efyVar2.d.kK();
                efz efzVar = efyVar2.d;
                return new aiqc(aipwVar, aiqfVar, j, kK, new akfq(efzVar.f, efzVar.as, efzVar.aw, efzVar.vR, efzVar.g, efyVar2.e.D, efzVar.gw, efyVar2.f, null, null), (aaea) efyVar2.d.K.get(), null, null);
            case 1:
                return null;
            case 2:
                return ((azqv) this.a.h.get()).G();
            case 3:
                return azqv.ap();
            case 4:
                return ((azqv) this.a.i.get()).G();
            case 5:
                return azqv.ap();
            case 6:
                return ((azqv) this.a.j.get()).G();
            case 7:
                return azqv.ap();
            case 8:
                return ((azqv) this.a.k.get()).G();
            case 9:
                return azqv.ap();
            case 10:
                return ((azqv) this.a.l.get()).G();
            case 11:
                return azqv.ap();
            case 12:
                return ((azqv) this.a.m.get()).G();
            case 13:
                return azqv.ap();
            case 14:
                return aiyl.b((azqv) this.a.n.get());
            case 15:
                return azqv.ap();
            case 16:
                return ((azqv) this.a.o.get()).G();
            case 17:
                return azqv.ap();
            case 18:
                return ((azqv) this.a.p.get()).G();
            case 19:
                return azqv.ap();
            case 20:
                return ((azqv) this.a.q.get()).G();
            case 21:
                return azqv.ap();
            case 22:
                return ((azqv) this.a.r.get()).G();
            case 23:
                return azqv.ap();
            case 24:
                return ((azqv) this.a.s.get()).G();
            case 25:
                return azqv.ap();
            case 26:
                return ((azqv) this.a.t.get()).G();
            case 27:
                return azqv.ap();
            case 28:
                return ((azqv) this.a.u.get()).G();
            case 29:
                return azqv.ap();
            case 30:
                return ((azqv) this.a.v.get()).G();
            case 31:
                return azqv.ap();
            case 32:
                return ((azqv) this.a.w.get()).G();
            case 33:
                return azqv.ap();
            case 34:
                return ((azqv) this.a.x.get()).G();
            case 35:
                return azqv.ap();
            case 36:
                return ((azqv) this.a.y.get()).G();
            case 37:
                return azqv.ap();
            case 38:
                return ((azqv) this.a.z.get()).G();
            case 39:
                return azqv.ap();
            case 40:
                return ((azqv) this.a.A.get()).G();
            case 41:
                return azqv.ap();
            case 42:
                return ((azqv) this.a.B.get()).G();
            case 43:
                return azqv.ap();
            case 44:
                return ((azqy) this.a.C.get()).G();
            case 45:
                return azqy.ap();
            case 46:
                return azrr.ab();
            case 47:
                return ((azqy) this.a.E.get()).G();
            case 48:
                return azqy.ap();
            case 49:
                return ((azqy) this.a.F.get()).G();
            case 50:
                return azqy.ap();
            case 51:
                return ((azqy) this.a.G.get()).G();
            case 52:
                return azqy.ap();
            case 53:
                return azqv.ap();
            case 54:
                efy efyVar3 = this.a;
                Context context = efyVar3.d.b.a;
                azqv azqvVar = (azqv) efyVar3.h.get();
                ayaw.k(azqvVar);
                return azqvVar;
            case 55:
                efy efyVar4 = this.a;
                Context context2 = efyVar4.d.b.a;
                azqv azqvVar2 = (azqv) efyVar4.i.get();
                ayaw.k(azqvVar2);
                return azqvVar2;
            case 56:
                efy efyVar5 = this.a;
                Context context3 = efyVar5.d.b.a;
                azqv azqvVar3 = (azqv) efyVar5.k.get();
                ayaw.k(azqvVar3);
                return azqvVar3;
            case 57:
                efy efyVar6 = this.a;
                Context context4 = efyVar6.d.b.a;
                azqv azqvVar4 = (azqv) efyVar6.l.get();
                ayaw.k(azqvVar4);
                return azqvVar4;
            case 58:
                efy efyVar7 = this.a;
                Context context5 = efyVar7.d.b.a;
                azqv azqvVar5 = (azqv) efyVar7.m.get();
                ayaw.k(azqvVar5);
                return azqvVar5;
            case 59:
                efy efyVar8 = this.a;
                Context context6 = efyVar8.d.b.a;
                azqv azqvVar6 = (azqv) efyVar8.n.get();
                ayaw.k(azqvVar6);
                return azqvVar6;
            case 60:
                efy efyVar9 = this.a;
                Context context7 = efyVar9.d.b.a;
                azqv azqvVar7 = (azqv) efyVar9.o.get();
                ayaw.k(azqvVar7);
                return azqvVar7;
            case 61:
                efy efyVar10 = this.a;
                Context context8 = efyVar10.d.b.a;
                azqv azqvVar8 = (azqv) efyVar10.p.get();
                ayaw.k(azqvVar8);
                return azqvVar8;
            case 62:
                efy efyVar11 = this.a;
                Context context9 = efyVar11.d.b.a;
                azqv azqvVar9 = (azqv) efyVar11.q.get();
                ayaw.k(azqvVar9);
                return azqvVar9;
            case 63:
                efy efyVar12 = this.a;
                Context context10 = efyVar12.d.b.a;
                azqv azqvVar10 = (azqv) efyVar12.r.get();
                ayaw.k(azqvVar10);
                return azqvVar10;
            case 64:
                efy efyVar13 = this.a;
                Context context11 = efyVar13.d.b.a;
                azqv azqvVar11 = (azqv) efyVar13.s.get();
                ayaw.k(azqvVar11);
                return azqvVar11;
            case 65:
                efy efyVar14 = this.a;
                Context context12 = efyVar14.d.b.a;
                azqv azqvVar12 = (azqv) efyVar14.t.get();
                ayaw.k(azqvVar12);
                return azqvVar12;
            case 66:
                efy efyVar15 = this.a;
                Context context13 = efyVar15.d.b.a;
                azqv azqvVar13 = (azqv) efyVar15.u.get();
                ayaw.k(azqvVar13);
                return azqvVar13;
            case 67:
                efy efyVar16 = this.a;
                Context context14 = efyVar16.d.b.a;
                azqv azqvVar14 = (azqv) efyVar16.v.get();
                ayaw.k(azqvVar14);
                return azqvVar14;
            case 68:
                efy efyVar17 = this.a;
                Context context15 = efyVar17.d.b.a;
                azqv azqvVar15 = (azqv) efyVar17.w.get();
                ayaw.k(azqvVar15);
                return azqvVar15;
            case 69:
                efy efyVar18 = this.a;
                Context context16 = efyVar18.d.b.a;
                azqv azqvVar16 = (azqv) efyVar18.x.get();
                ayaw.k(azqvVar16);
                return azqvVar16;
            case 70:
                efy efyVar19 = this.a;
                Context context17 = efyVar19.d.b.a;
                azqv azqvVar17 = (azqv) efyVar19.z.get();
                ayaw.k(azqvVar17);
                return azqvVar17;
            case 71:
                efy efyVar20 = this.a;
                Context context18 = efyVar20.d.b.a;
                azqv azqvVar18 = (azqv) efyVar20.A.get();
                ayaw.k(azqvVar18);
                return azqvVar18;
            case 72:
                efy efyVar21 = this.a;
                Context context19 = efyVar21.d.b.a;
                azqv azqvVar19 = (azqv) efyVar21.B.get();
                ayaw.k(azqvVar19);
                return azqvVar19;
            case 73:
                efy efyVar22 = this.a;
                Context context20 = efyVar22.d.b.a;
                azqy azqyVar = (azqy) efyVar22.C.get();
                ayaw.k(azqyVar);
                return azqyVar;
            case 74:
                efy efyVar23 = this.a;
                Context context21 = efyVar23.d.b.a;
                azqv azqvVar20 = (azqv) efyVar23.y.get();
                ayaw.k(azqvVar20);
                return azqvVar20;
            case 75:
                efy efyVar24 = this.a;
                Context context22 = efyVar24.d.b.a;
                azrr azrrVar = (azrr) efyVar24.D.get();
                ayaw.k(azrrVar);
                return azrrVar;
            case 76:
                efy efyVar25 = this.a;
                Context context23 = efyVar25.d.b.a;
                azqy azqyVar2 = (azqy) efyVar25.E.get();
                ayaw.k(azqyVar2);
                return azqyVar2;
            case 77:
                efy efyVar26 = this.a;
                Context context24 = efyVar26.d.b.a;
                azqy azqyVar3 = (azqy) efyVar26.F.get();
                ayaw.k(azqyVar3);
                return azqyVar3;
            case 78:
                efy efyVar27 = this.a;
                Context context25 = efyVar27.d.b.a;
                azqy azqyVar4 = (azqy) efyVar27.G.get();
                ayaw.k(azqyVar4);
                return azqyVar4;
            case 79:
                efy efyVar28 = this.a;
                Context context26 = efyVar28.d.b.a;
                azqv azqvVar21 = (azqv) efyVar28.H.get();
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
                efy efyVar29 = this.a;
                Context context27 = efyVar29.d.b.a;
                azqv azqvVar22 = (azqv) efyVar29.I.get();
                ayaw.k(azqvVar22);
                return azqvVar22;
            case 88:
                efy efyVar30 = this.a;
                Context context28 = efyVar30.d.b.a;
                azqv azqvVar23 = (azqv) efyVar30.f207J.get();
                ayaw.k(azqvVar23);
                return azqvVar23;
            case 89:
                efy efyVar31 = this.a;
                Context context29 = efyVar31.d.b.a;
                azqv azqvVar24 = (azqv) efyVar31.K.get();
                ayaw.k(azqvVar24);
                return azqvVar24;
            case 90:
                efy efyVar32 = this.a;
                Context context30 = efyVar32.d.b.a;
                azqv azqvVar25 = (azqv) efyVar32.L.get();
                ayaw.k(azqvVar25);
                return azqvVar25;
            case 91:
                efy efyVar33 = this.a;
                Context context31 = efyVar33.d.b.a;
                azqv azqvVar26 = (azqv) efyVar33.M.get();
                ayaw.k(azqvVar26);
                return azqvVar26;
            case 92:
                efy efyVar34 = this.a;
                Context context32 = efyVar34.d.b.a;
                azqv azqvVar27 = (azqv) efyVar34.N.get();
                ayaw.k(azqvVar27);
                return azqvVar27;
            case 93:
                efy efyVar35 = this.a;
                Context context33 = efyVar35.d.b.a;
                azqv azqvVar28 = (azqv) efyVar35.O.get();
                ayaw.k(azqvVar28);
                return azqvVar28;
            case 94:
                return new ajbq((shf) this.a.d.g.get());
            case 95:
                return ajbp.a();
            case 96:
                efy efyVar36 = this.a;
                return new ajbf((Executor) efyVar36.d.i.get(), efyVar36.b, (shf) efyVar36.d.g.get(), (aaea) efyVar36.d.K.get());
            case 97:
                return null;
            case 98:
                return aifu.m((zih) this.a.S.get());
            case 99:
                return aizl.d((aiqc) this.a.g.get());
            default:
                throw new AssertionError(i);
        }
    }
}
