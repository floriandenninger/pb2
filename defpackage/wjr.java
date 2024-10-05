package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wjr extends wji implements wjd, ypd {
    public zaw af;
    public aatg ag;
    public ypa ah;
    public acra ai;
    public ajjz aj;
    public wkk ak;
    public wiz al;
    public afsy am;
    public wcm an;
    public aahd ao;
    public boolean ap;
    public ajoy aq;
    private wjq ar;

    @Override // defpackage.ce
    public final void X() {
        this.ah.m(this);
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.ap = true;
        this.ah.g(this);
        this.ar.d();
    }

    @Override // defpackage.wjd
    public final void aH(wjc wjcVar) {
        this.ah.d(wjcVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            this.ap = false;
            kv();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        super.lZ();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putBoolean("inProgress", this.ar.e);
        apxf apxfVar = this.ae;
        if (apxfVar != null) {
            bundle.putByteArray("endpoint", apxfVar.toByteArray());
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.ap = bundle.getBoolean("inProgress", false);
        o(1, 0);
        if (bundle.containsKey("endpoint")) {
            try {
                byte[] byteArray = bundle.getByteArray("endpoint");
                byteArray.getClass();
                aomw b = aomw.b();
                this.ae = (apxf) aonm.parseFrom(apxf.a, byteArray, b);
            } catch (aoob unused) {
            }
        }
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ar.b();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apxf apxfVar;
        apxf apxfVar2 = this.ae;
        auuo auuoVar = apxfVar2 == null ? null : (auuo) apxfVar2.pX(SignInEndpointOuterClass.signInEndpoint);
        if (auuoVar == null || (auuoVar.b & 2) == 0) {
            apxfVar = null;
        } else {
            apxf apxfVar3 = auuoVar.c;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            apxfVar = apxfVar3;
        }
        wjs wjsVar = new wjs(C(), this.af, this.ai, this.aj, this.aq, null, null);
        wjq wjqVar = new wjq(wjsVar, C(), this.ak, this.ag, this.an, this.am, this.al, this, apxfVar, this.ao, this.ap);
        this.ar = wjqVar;
        wjsVar.f = wjqVar;
        this.ai.d(acsb.b(14586), this.ae, null);
        return wjsVar.d;
    }
}
