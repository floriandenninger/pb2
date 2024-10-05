package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcb extends wce implements wjd, ypd {
    public zaw af;
    public aatg ag;
    public wcm ah;
    public wiz ai;
    public azrw aj;
    public ypa ak;
    public afsy al;
    public acra am;
    public ajjz an;
    public wkk ao;
    public ajut ap;
    public boolean aq;
    public wbz ar;
    public akpq as;
    public ajoy at;
    private wjq au;
    private boolean av = false;

    public static wcb aG(apxf apxfVar) {
        Bundle bundle = new Bundle();
        if (apxfVar != null) {
            bundle.putByteArray("endpoint", apxfVar.toByteArray());
        }
        wcb wcbVar = new wcb();
        wcbVar.af(bundle);
        return wcbVar;
    }

    @Override // defpackage.ce
    public final void X() {
        this.ak.m(this);
        this.av = true;
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.av) {
            dn k = mO().k();
            k.m(this);
            k.r(aG(this.ae), "fusion-sign-in-flow-fragment");
            k.a();
            this.av = false;
        }
        this.aq = true;
        this.ak.g(this);
        this.au.d();
    }

    @Override // defpackage.wab
    public final void aF(apxf apxfVar) {
        this.ae = apxfVar;
        this.am.d(acsb.b(14586), apxfVar, null);
    }

    @Override // defpackage.wjd
    public final void aH(wjc wjcVar) {
        if (wjcVar.a() == wjb.CANCELLED) {
            kv();
        }
        this.ak.d(wjcVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            kv();
            return null;
        }
        if (i == 1) {
            this.aq = false;
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
        apxf apxfVar = this.ae;
        if (apxfVar != null) {
            bundle.putByteArray("endpoint", apxfVar.toByteArray());
        }
        bundle.putBoolean("inProgress", this.au.e);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.aq = bundle.getBoolean("inProgress", false);
        o(1, R.style.Theme_YouTube_Fusion_SignInFlowFragment);
        if (bundle.containsKey("endpoint")) {
            try {
                aF((apxf) aonm.parseFrom(apxf.a, bundle.getByteArray("endpoint"), aomw.b()));
            } catch (aoob unused) {
            }
        }
        n(true);
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.au.b();
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
        wcd wcdVar = new wcd(C(), this.af, this.am, this.an, this.at, this.ar, this.aj, this.ap, this.as, null, null);
        wjq wjqVar = new wjq(wcdVar, C(), this.ao, this.ag, this.ah, this.ai, this.al, this, this.ar, apxfVar, (aahd) this.aj.get(), this.aq);
        this.au = wjqVar;
        wcdVar.f = wjqVar;
        return wcdVar.a;
    }
}
