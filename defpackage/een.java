package defpackage;

import android.app.Activity;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
import com.google.protos.youtube.api.innertube.SubtitlesEndpointOuterClass$SubtitlesEndpoint;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class een implements azrw {
    private final int a;
    private final ehw b;

    public een(ehw ehwVar, int i) {
        this.b = ehwVar;
        this.a = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0092. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v6, types: [hrs, java.lang.Object] */
    @Override // defpackage.azrw
    public final Object get() {
        Object lduVar;
        Object hcdVar;
        Object ilpVar;
        Object imkVar;
        Object obj;
        Object ogxVar;
        Object mugVar;
        int i = this.a;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    mugVar = new mug(this.b.c.a());
                    break;
                case 101:
                    return this.b.aQ();
                case 102:
                    return this.b.aV();
                case 103:
                    return this.b.aS();
                case 104:
                    return this.b.U();
                case 105:
                    return this.b.T();
                case 106:
                    return this.b.af();
                case 107:
                    return this.b.ah();
                case 108:
                    return this.b.ae();
                case 109:
                    return this.b.ag();
                case 110:
                    return this.b.Z();
                case 111:
                    ehw ehwVar = this.b;
                    mugVar = new advq(ehwVar.c.f, ehwVar.b.a.cQ, (byte[]) null, (byte[]) null);
                    break;
                case 112:
                    return this.b.aa();
                case 113:
                    return this.b.ab();
                case 114:
                    return this.b.ac();
                default:
                    throw new AssertionError(i);
            }
            return mugVar;
        }
        switch (i) {
            case 0:
                return this.b.i();
            case 1:
                eed eedVar = this.b.c;
                lduVar = new ldu(eedVar.f, eedVar.dB, 9, (short[][]) null);
                return lduVar;
            case 2:
                lduVar = new kxh(this.b.c.f, 5, (short[]) null);
                return lduVar;
            case 3:
                ehw ehwVar2 = this.b;
                return new ReelBrowseFragmentToolbarController((hcf) ehwVar2.g.get(), new hqc((aahd) ehwVar2.c.I.get(), ehwVar2.c.g(), (ajut) ehwVar2.b.lE.get()), new hqa(ehwVar2.c.g(), (ci) ehwVar2.c.s.get(), ehwVar2.o()), new hpi(ehwVar2.c.g(), (ci) ehwVar2.c.s.get(), ehwVar2.aE(), ehwVar2.o(), null), (acqz) ehwVar2.c.P.get());
            case 4:
                hbx hbxVar = (hbx) this.b.a;
                ayaw.k(hbxVar);
                return hbxVar;
            case 5:
                ehw ehwVar3 = this.b;
                return new ReelBrowseFragmentFeedController((acqz) ehwVar3.c.P.get(), ehwVar3.c.jz(), (ypa) ehwVar3.b.B.get(), (aaue) ehwVar3.b.ka.get(), (zaw) ehwVar3.b.iN.get(), (aaea) ehwVar3.b.K.get(), (aypn) ehwVar3.b.yh.get(), (ajvb) ehwVar3.c.al.get(), ehwVar3.c.jF(), new ajvq(), ehwVar3.aJ(), (SfvAudioItemPlaybackController) ehwVar3.c.hd.get(), ehwVar3.c.mm(), ehwVar3.c.jx(), (sxw) ehwVar3.b.xp.get(), null, null, null);
            case 6:
                ehw ehwVar4 = this.b;
                hcdVar = new hcd((gdz) ehwVar4.c.hx.get(), (acqz) ehwVar4.c.P.get());
                return hcdVar;
            case 7:
                ehw ehwVar5 = this.b;
                ?? kw = ehwVar5.c.kw();
                Executor executor = (Executor) ehwVar5.b.i.get();
                return new hht(kw, executor, ehwVar5.a, (shf) ehwVar5.b.g.get(), (hos) ehwVar5.c.jX.get(), (hmw) ehwVar5.c.hR.get(), hhf.a, (hrv) ehwVar5.b.a.S.get(), (hlo) ehwVar5.c.mD.get(), (hrq) ehwVar5.c.jq.get(), new zpi(), new hhy((hos) ehwVar5.c.jX.get(), (hrq) ehwVar5.c.jq.get(), (anic) ehwVar5.b.f.get(), (Executor) ehwVar5.b.i.get()));
            case 8:
                return this.b.am();
            case 9:
                return this.b.Y();
            case 10:
                ehw ehwVar6 = this.b;
                ajoq ajoqVar = (ajoq) ehwVar6.n.get();
                ajoq ajoqVar2 = (ajoq) ehwVar6.o.get();
                hrv hrvVar = (hrv) ehwVar6.b.a.S.get();
                ida idaVar = (ida) ehwVar6.p.get();
                hjs hjsVar = (hjs) ehwVar6.l.get();
                hik hikVar = (hik) ehwVar6.q.get();
                ayqi ayqiVar = (ayqi) ehwVar6.b.im.get();
                ehwVar6.b.a.q();
                obj = new ajox(new hkk(amrz.m(hjx.class, ajoqVar, hjb.class, ajoqVar2, hiv.class, new hiu(hrvVar, idaVar, hjsVar, hikVar, ayqiVar))), new hki((hkg) ehwVar6.r.get(), ehwVar6.Y()), ehwVar6.u, (hrv) ehwVar6.b.a.S.get());
                return obj;
            case 11:
                return new mwo(1);
            case 12:
                return this.b.al();
            case 13:
                return this.b.B();
            case 14:
                Object obj2 = this.b.a;
                Object obj3 = obj2 instanceof zxz ? ((zxz) obj2).ay : obj2 instanceof zry ? (zry) obj2 : new zry() { // from class: hso
                    @Override // defpackage.zry
                    public final zrx r() {
                        return null;
                    }
                };
                ayaw.k(obj3);
                return obj3;
            case 15:
                icz iczVar = (icz) this.b.a;
                ayaw.k(iczVar);
                return iczVar;
            case 16:
                ehw ehwVar7 = this.b;
                obj = new hii(ehwVar7.c.a(), (Executor) ehwVar7.b.i.get(), (anib) ehwVar7.b.f.get());
                return obj;
            case 17:
                ehw ehwVar8 = this.b;
                hcdVar = new hkg(axqq.a(ehwVar8.t), (hik) ehwVar8.q.get());
                return hcdVar;
            case 18:
                return amsx.r((hkj) this.b.s.get());
            case 19:
                lduVar = new hjk((hkg) this.b.r.get());
                return lduVar;
            case 20:
                return this.b.ak();
            case 21:
                return this.b.j();
            case 22:
                return this.b.m();
            case 23:
                return this.b.n();
            case 24:
                ehw ehwVar9 = this.b;
                lduVar = new hvq(new hxc(ehwVar9.c.a(), (ajut) ehwVar9.b.lE.get(), (aahd) ehwVar9.c.I.get(), (axze) ehwVar9.b.a.cg.get(), (acqz) ehwVar9.c.P.get(), null, null, null, null, null), (axze) ehwVar9.b.a.cg.get(), new hwa(ehwVar9.c.a(), ehwVar9.aI(), null, null), (Handler) ehwVar9.b.an.get(), (ayqi) ehwVar9.b.im.get(), (ayqi) ehwVar9.b.aq.get(), ehwVar9.p(), null, null, null, null, null);
                return lduVar;
            case 25:
                ehw ehwVar10 = this.b;
                lduVar = new hvi(new hse(ehwVar10.c.a(), new hsb(ehwVar10.c.a(), (Executor) ehwVar10.b.f.get(), (Executor) ehwVar10.b.i.get())));
                return lduVar;
            case 26:
                ehw ehwVar11 = this.b;
                return new hvh(ehwVar11.c.a(), new hxq(ehwVar11.c.a()));
            case 27:
                ehw ehwVar12 = this.b;
                hcdVar = new huy(ehwVar12.c.a(), (Handler) ehwVar12.b.an.get());
                return hcdVar;
            case 28:
                lduVar = new hvj(this.b.c.a());
                return lduVar;
            case 29:
                ehw ehwVar13 = this.b;
                aaea aaeaVar = (aaea) ehwVar13.b.K.get();
                amnv gY = ehwVar13.b.gY();
                ainy jh = ehwVar13.c.jh();
                ainl jf = ehwVar13.c.jf();
                ili iliVar = (ili) ehwVar13.c.hD.get();
                ijz ijzVar = (ijz) ehwVar13.D.get();
                ihv ihvVar = (ihv) ehwVar13.F.get();
                ihn ihnVar = (ihn) ehwVar13.b.lM.get();
                ilp ilpVar2 = (ilp) ehwVar13.G.get();
                jgp jgpVar = new jgp(ehwVar13.f212J, ehwVar13.K, (char[]) null, (byte[]) null);
                efz efzVar = ehwVar13.b;
                return new ihl(aaeaVar, gY, jh, jf, iliVar, ijzVar, ihvVar, ihnVar, ilpVar2, jgpVar, new akht(efzVar.vG, ehwVar13.L, efzVar.a.aZ, efzVar.g, efzVar.i, (short[]) null, (byte[]) null, (byte[]) null), (ijr) ehwVar13.I.get(), (ifw) ehwVar13.b.a.aZ.get(), (acqz) ehwVar13.c.P.get(), (Executor) ehwVar13.b.i.get(), (shf) ehwVar13.b.g.get(), (ReelSnackbarController) ehwVar13.c.jF.get(), ehwVar13.Y(), (axze) ehwVar13.b.a.aF.get(), null, null, null, null);
            case 30:
                ehw ehwVar14 = this.b;
                return new ijz(ehwVar14.c.a(), (acqz) ehwVar14.c.P.get(), (axze) ehwVar14.b.a.ci.get(), ehwVar14.Y(), null, null, null);
            case 31:
                ehw ehwVar15 = this.b;
                return new ihv(ehwVar15.c.a(), (Handler) ehwVar15.b.an.get(), (ili) ehwVar15.c.hD.get(), (ijz) ehwVar15.D.get(), (ilm) ehwVar15.E.get(), (aaea) ehwVar15.b.K.get(), (axze) ehwVar15.b.a.ci.get(), ehwVar15.Y(), null, null, null);
            case 32:
                ijo ijoVar = (ijo) this.b.a;
                ayaw.k(ijoVar);
                return ijoVar;
            case 33:
                ehw ehwVar16 = this.b;
                ilpVar = new ilp((vgz) ehwVar16.b.a.cj.get(), (aok) ehwVar16.c.s.get(), (Executor) ehwVar16.b.f.get(), (shf) ehwVar16.b.g.get());
                return ilpVar;
            case 34:
                ehw ehwVar17 = this.b;
                eed eedVar2 = ehwVar17.c;
                return new ogx(eedVar2.cW, eedVar2.bf, eedVar2.P, ehwVar17.I, null, null, null, null, null);
            case 35:
                ehw ehwVar18 = this.b;
                hcdVar = new ijs(axqq.a(ehwVar18.H), (acqz) ehwVar18.c.P.get());
                return hcdVar;
            case 36:
                efz efzVar2 = this.b.b;
                lduVar = new jgp(efzVar2.K, efzVar2.a.aZ, (byte[]) null, (char[]) null);
                return lduVar;
            case 37:
                return this.b.aj();
            case 38:
                ehw ehwVar19 = this.b;
                imkVar = new imk(ehwVar19.c.a(), (aahd) ehwVar19.c.I.get(), (acqz) ehwVar19.c.P.get(), (aaea) ehwVar19.b.K.get(), (ajut) ehwVar19.b.lE.get());
                return imkVar;
            case 39:
                ehw ehwVar20 = this.b;
                return new ikr(ehwVar20.c.a(), (Handler) ehwVar20.b.an.get(), (ili) ehwVar20.c.hD.get(), (ijz) ehwVar20.D.get(), (aaea) ehwVar20.b.K.get());
            case 40:
                ehw ehwVar21 = this.b;
                ilpVar = new ilb((ajjz) ehwVar21.b.kp.get(), ehwVar21.b.gY(), ehwVar21.Y(), (axze) ehwVar21.b.a.aF.get());
                return ilpVar;
            case 41:
                ehw ehwVar22 = this.b;
                eed eedVar3 = ehwVar22.c;
                azrw azrwVar = eedVar3.mP;
                azrw azrwVar2 = eedVar3.mM;
                azrw azrwVar3 = ehwVar22.G;
                efz efzVar3 = ehwVar22.b;
                return new aiqn(azrwVar, azrwVar2, azrwVar3, efzVar3.kp, eedVar3.I, ehwVar22.P, eedVar3.P, eedVar3.lE, ehwVar22.R, ehwVar22.S, efzVar3.lE, eedVar3.lK, eedVar3.cW, eedVar3.bf, ehwVar22.m, efzVar3.a.ci, efzVar3.K, null, null);
            case 42:
                return this.b.g();
            case 43:
                ehw ehwVar23 = this.b;
                eed eedVar4 = ehwVar23.c;
                return new ajyw(eedVar4.P, ehwVar23.Q, eedVar4.mM, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
            case 44:
                return this.b.h();
            case 45:
                return new amsj((byte[]) null, (char[]) null);
            case 46:
                lduVar = new ahxn(this.b.a.qW());
                return lduVar;
            case 47:
                ehw ehwVar24 = this.b;
                return new SubtitlesOverlayPresenter((ahxi) ehwVar24.U.get(), (aisn) ehwVar24.b.wh.get(), (aiuy) ehwVar24.b.iC.get(), ehwVar24.c.jj(), (Executor) ehwVar24.b.f.get(), (Executor) ehwVar24.b.i.get(), (aadw) ehwVar24.b.D.get());
            case 48:
                ehw ehwVar25 = this.b;
                imkVar = new iif((aahd) ehwVar25.c.I.get(), (ili) ehwVar25.c.hD.get(), ehwVar25.c.mp(), null, null);
                return imkVar;
            case 49:
                ehw ehwVar26 = this.b;
                ilpVar = new igs((aahd) ehwVar26.c.I.get(), (ajut) ehwVar26.b.lE.get(), (ili) ehwVar26.c.hD.get(), (acqz) ehwVar26.c.P.get());
                return ilpVar;
            case 50:
                return this.b.aX();
            case 51:
                return this.b.aE();
            case 52:
                return this.b.a();
            case 53:
                return this.b.M();
            case 54:
                return this.b.D();
            case 55:
                return new gej();
            case 56:
                return this.b.N();
            case 57:
                return this.b.C();
            case 58:
                lduVar = new mbb((akpa) this.b.c.nh.get());
                return lduVar;
            case 59:
                return this.b.O();
            case 60:
                return this.b.aK();
            case 61:
                return this.b.e();
            case 62:
                return this.b.f();
            case 63:
                ehw ehwVar27 = this.b;
                lduVar = new ygi(ehwVar27.c.a(), ehwVar27.c.jG(), (aahd) ehwVar27.c.I.get(), (ypa) ehwVar27.b.B.get());
                return lduVar;
            case 64:
                return this.b.az();
            case 65:
                return this.b.aT();
            case 66:
                return this.b.I();
            case 67:
                return this.b.F();
            case 68:
                return this.b.an();
            case 69:
                return this.b.G();
            case 70:
                return this.b.ao();
            case 71:
                ehw ehwVar28 = this.b;
                Activity a = ehwVar28.c.a();
                ety etyVar = (ety) ehwVar28.c.af.get();
                ypa ypaVar = (ypa) ehwVar28.b.B.get();
                ajjz ajjzVar = (ajjz) ehwVar28.b.kp.get();
                jfk jfkVar = (jfk) ehwVar28.am.get();
                abds abdsVar = (abds) ehwVar28.b.lv.get();
                zaw zawVar = (zaw) ehwVar28.b.iN.get();
                ajoy jz = ehwVar28.c.jz();
                ajpa ajpaVar = (ajpa) ehwVar28.c.iq.get();
                ajpaVar.f(jem.class, new jep(a, ajjzVar, 0));
                return new oix(ypaVar, jfkVar, abdsVar, zawVar, jz, ajpaVar, etyVar.d());
            case 72:
                return this.b.H();
            case 73:
                ehw ehwVar29 = this.b;
                Object obj4 = ehwVar29.aj.get();
                jfi jfiVar = (jfi) ehwVar29.ak.get();
                aagt g = aagx.g();
                g.c(amrz.l(SubtitlesEndpointOuterClass$SubtitlesEndpoint.class, (jfh) obj4, MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, jfiVar));
                return g.a();
            case 74:
                return this.b.ap();
            case 75:
                ehw ehwVar30 = this.b;
                Activity a2 = ehwVar30.c.a();
                ainy ji = ehwVar30.c.ji();
                jgi jgiVar = new jgi(new ahxr(a2));
                jgiVar.l(new jge(ji, 0));
                obj = jgiVar;
                return obj;
            case 76:
                return this.b.aq();
            case 77:
                return this.b.aw();
            case 78:
                return new gfw();
            case 79:
                ehw ehwVar31 = this.b;
                imkVar = new jgp(ehwVar31.c.I, ehwVar31.b.lE, (byte[]) null, (char[]) null, (byte[]) null);
                return imkVar;
            case 80:
                ehw ehwVar32 = this.b;
                efz efzVar4 = ehwVar32.b;
                ogxVar = new ogx(efzVar4.kt, efzVar4.kv, efzVar4.gH, ehwVar32.an, (byte[]) null, (byte[]) null, (char[]) null);
                return ogxVar;
            case 81:
                return new fav();
            case 82:
                ehw ehwVar33 = this.b;
                azrw azrwVar4 = ehwVar33.b.kv;
                eed eedVar5 = ehwVar33.c;
                ogxVar = new ajyw(azrwVar4, eedVar5.gr, eedVar5.I, (short[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                return ogxVar;
            case 83:
                return this.b.aB();
            case 84:
                return this.b.d();
            case 85:
                return this.b.J();
            case 86:
                return this.b.K();
            case 87:
                return this.b.c();
            case 88:
                return this.b.ad();
            case 89:
                return this.b.S();
            case 90:
                return this.b.L();
            case 91:
                lduVar = new kcu(this.b.c.ji());
                return lduVar;
            case 92:
                return this.b.P();
            case 93:
                return this.b.au();
            case 94:
                return this.b.aC();
            case 95:
                return this.b.aO();
            case 96:
                ehw ehwVar34 = this.b;
                eed eedVar6 = ehwVar34.c;
                azrw azrwVar5 = eedVar6.f;
                azrw azrwVar6 = eedVar6.al;
                efz efzVar5 = ehwVar34.b;
                return new ohg(azrwVar5, azrwVar6, efzVar5.B, efzVar5.an, eedVar6.iu, eedVar6.lM, eedVar6.nD, (byte[]) null, (byte[]) null, (byte[]) null);
            case 97:
                return this.b.V();
            case 98:
                return this.b.W();
            case 99:
                return this.b.Q();
            default:
                throw new AssertionError(i);
        }
    }
}
