package defpackage;

import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iru implements afwx {
    final /* synthetic */ irz a;

    public iru(irz irzVar) {
        this.a = irzVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Cannot retrieve PhoneVerificationIntroRenderer.", cnqVar);
        this.a.s(8);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aulq aulqVar;
        atvc atvcVar;
        aulq aulqVar2;
        arxe arxeVar = (arxe) obj;
        if (!arxeVar.e) {
            if (arxeVar.b == 3) {
                aulqVar = (aulq) arxeVar.c;
            } else {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(atve.a)) {
                if (arxeVar.b == 3) {
                    aulqVar2 = (aulq) arxeVar.c;
                } else {
                    aulqVar2 = aulq.a;
                }
                atvcVar = (atvc) aulqVar2.pX(atve.a);
            } else {
                atvcVar = null;
            }
            if (atvcVar == null) {
                this.a.s(8);
                return;
            }
            irz irzVar = this.a;
            iqx iqxVar = irzVar.a.M;
            while (iqxVar.e()) {
                iqxVar.b();
            }
            irzVar.m = wcy.g(atvcVar, false);
            dd supportFragmentManager = irzVar.a.getSupportFragmentManager();
            irzVar.u.b(R.id.verification_fragment_upload_container);
            dn k = supportFragmentManager.k();
            k.q(R.id.verification_fragment_upload_container, irzVar.m, "verificationFragmentTag");
            k.i = 4099;
            k.a();
            supportFragmentManager.aa();
            return;
        }
        this.a.s(8);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
