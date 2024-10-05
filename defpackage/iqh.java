package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqh implements aab {
    final /* synthetic */ iqi a;

    public iqh(iqi iqiVar) {
        this.a = iqiVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        iqi iqiVar = this.a;
        if (iqiVar.g) {
            return;
        }
        iqiVar.g = true;
        Object lM = iqiVar.lM();
        UploadActivity uploadActivity = (UploadActivity) iqiVar;
        eed eedVar = (eed) lM;
        uploadActivity.a = (zbw) eedVar.a.av.get();
        uploadActivity.b = (fwo) eedVar.ah.get();
        uploadActivity.c = (sus) eedVar.ik.get();
        uploadActivity.d = (yxe) eedVar.jU.get();
        uploadActivity.e = axqq.a(eedVar.eG);
        uploadActivity.f = (ykk) eedVar.gA.get();
        uploadActivity.y = (sxd) eedVar.a.nx.get();
        eedVar.jq();
        uploadActivity.z = (zaw) eedVar.a.iN.get();
        uploadActivity.A = (ypa) eedVar.a.B.get();
        uploadActivity.B = (aypn) eedVar.a.yh.get();
        uploadActivity.C = (aaea) eedVar.a.K.get();
        uploadActivity.D = (ajvb) eedVar.al.get();
        uploadActivity.E = eedVar.jV;
        uploadActivity.F = eedVar.a.cO();
        uploadActivity.G = new ajvq();
        uploadActivity.R = eedVar.mF();
        uploadActivity.H = (akai) eedVar.a.xH.get();
        uploadActivity.I = eedVar.jz();
        uploadActivity.f224J = eedVar.jF();
        uploadActivity.h = (anib) eedVar.a.f.get();
        uploadActivity.i = (aahd) eedVar.I.get();
        uploadActivity.j = eedVar.jB();
        uploadActivity.ak = (akwg) eedVar.a.mB.get();
        uploadActivity.k = (afsy) eedVar.a.au.get();
        uploadActivity.l = (ajjz) eedVar.a.kp.get();
        uploadActivity.m = (aarr) eedVar.a.hV.get();
        uploadActivity.n = eedVar.hb();
        uploadActivity.o = (afot) eedVar.hN.get();
        uploadActivity.p = (aftn) eedVar.a.uZ.get();
        uploadActivity.q = eedVar.iA();
        uploadActivity.r = (wan) eedVar.gL.get();
        UploadActivity cR = eedVar.cR();
        anib anibVar = (anib) eedVar.a.f.get();
        aahd aahdVar = (aahd) eedVar.I.get();
        ysy ysyVar = (ysy) eedVar.a.as.get();
        aseb hf = eedVar.a.hf();
        aaea aaeaVar = (aaea) eedVar.a.K.get();
        aaxn aaxnVar = (aaxn) eedVar.a.a.a.get();
        akwg akwgVar = (akwg) eedVar.a.mB.get();
        zto hb = eedVar.hb();
        aksl akslVar = (aksl) eedVar.a.ha.get();
        akwd gD = eedVar.a.gD();
        akvf akvfVar = (akvf) eedVar.a.mN.get();
        akvq akvqVar = (akvq) eedVar.a.mM.get();
        akyb akybVar = (akyb) eedVar.a.mG.get();
        akva akvaVar = new akva(eedVar.a.b.a.getContentResolver());
        gbh aE = eedVar.aE();
        gcl gclVar = (gcl) eedVar.bj.get();
        afsy afsyVar = (afsy) eedVar.a.au.get();
        akwb akwbVar = (akwb) eedVar.a.vW.get();
        axze axzeVar = (axze) eedVar.a.mF.get();
        akai akaiVar = (akai) eedVar.a.xH.get();
        azrw azrwVar = eedVar.jY;
        uploadActivity.s = new irz(cR, anibVar, aahdVar, ysyVar, hf, aaeaVar, aaxnVar, akwgVar, hb, akslVar, gD, akvfVar, akvqVar, akybVar, akvaVar, aE, gclVar, afsyVar, akwbVar, axzeVar, akaiVar, azrwVar, null, null, null, null, null);
        uploadActivity.t = (akxy) eedVar.a.vY.get();
        uploadActivity.am = eedVar.a.li();
        uploadActivity.u = (SharedPreferences) eedVar.a.z.get();
        uploadActivity.v = eedVar.fP();
        uploadActivity.aj = (vgz) eedVar.a.a.br.get();
        uploadActivity.w = (akcy) eedVar.aj.get();
        uploadActivity.x = (akyb) eedVar.a.mG.get();
        uploadActivity.al = (axze) eedVar.a.mF.get();
        uploadActivity.S = (akoh) eedVar.a.a.bs.get();
        uploadActivity.T = (fxj) eedVar.f196J.get();
        uploadActivity.U = (ipr) eedVar.jW.get();
        uploadActivity.Z = (isf) eedVar.jZ.get();
    }
}
