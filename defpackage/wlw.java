package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wlw extends wlg implements wlp, wmb, wmf, wmi, wml {
    public aahd ae;
    public wlx af;
    public acra ag;
    private dd ah;
    private boolean ai;
    private boolean aj;
    private wmc al;
    private wmg am;
    private wlq an;
    private wmm ao;
    private wmj ap;
    private atvc aq;
    private atut ar;
    private atuo as;
    private atuq at;
    private atuf au;
    private String av;
    private String aw;
    private long ay;
    private String az;
    private String ak = "FRAGMENT_NAME_INTRO";
    private arzs ax = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
    private boolean aA = false;

    private final void aX(acsc acscVar) {
        this.ag.d(acscVar, null, null);
    }

    private final void aY(atuo atuoVar, boolean z) {
        if (this.an == null || z) {
            this.as = atuoVar;
            long j = this.ay;
            String str = this.az;
            wlq wlqVar = new wlq();
            Bundle bundle = new Bundle();
            if (atuoVar != null) {
                bundle.putByteArray("ARG_RENDERER", atuoVar.toByteArray());
            }
            bundle.putLong("ARG_IDV_REQUEST_ID", j);
            bundle.putString("ARG_PARAMS", str);
            wlqVar.af(bundle);
            this.an = wlqVar;
        }
        aW(this.an, "FRAGMENT_NAME_CODE_INPUT");
        aX(acsb.b(30709));
    }

    private final void aZ(atvc atvcVar) {
        if (this.al == null) {
            this.aq = atvcVar;
            wmc wmcVar = new wmc();
            Bundle bundle = new Bundle();
            if (atvcVar != null) {
                amkq.cn(bundle, "ARG_RENDERER", atvcVar);
            }
            wmcVar.af(bundle);
            this.al = wmcVar;
        }
        aW(this.al, "FRAGMENT_NAME_INTRO");
        aX(acsb.b(30707));
    }

    private final void ba(atut atutVar, boolean z) {
        if (this.am == null || z) {
            this.ar = atutVar;
            wmg wmgVar = new wmg();
            Bundle bundle = new Bundle();
            if (atutVar != null) {
                bundle.putByteArray("ARG_RENDERER", atutVar.toByteArray());
            }
            wmgVar.af(bundle);
            this.am = wmgVar;
        }
        aW(this.am, "FRAGMENT_NAME_PHONE_INPUT");
        aX(acsb.b(30708));
    }

    private final void bb(atuf atufVar, boolean z) {
        if (this.ap == null || z) {
            this.au = atufVar;
            arzs arzsVar = this.ax;
            String str = this.aw;
            String str2 = this.av;
            Long valueOf = Long.valueOf(this.ay);
            String str3 = this.az;
            atufVar.getClass();
            arzsVar.getClass();
            str.getClass();
            str2.getClass();
            wmj wmjVar = new wmj();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_RENDERER", amkq.cl(atufVar));
            bundle.putInt("ARG_CODE_DELIVERY_METHOD", arzsVar.d);
            bundle.putString("ARG_COUNTRY_CODE", str);
            bundle.putString("ARG_PHONE_NUMBER", str2);
            bundle.putLong("ARG_IDV_REQUEST_ID", valueOf.longValue());
            bundle.putString("ARG_PARAMS", str3);
            wmjVar.af(bundle);
            this.ap = wmjVar;
        }
        aW(this.ap, "FRAGMENT_NAME_RESULT_ERROR");
        aX(acsb.b(30711));
    }

    private final void bc(atuq atuqVar) {
        if (this.ao == null) {
            this.at = atuqVar;
            wmm wmmVar = new wmm();
            Bundle bundle = new Bundle();
            if (atuqVar != null) {
                bundle.putByteArray("ARG_RENDERER", atuqVar.toByteArray());
            }
            wmmVar.af(bundle);
            this.ao = wmmVar;
        }
        aW(this.ao, "FRAGMENT_NAME_RESULT_SUCCESS");
        aX(acsb.b(30710));
    }

    private static boolean bd(ce ceVar) {
        return (ceVar == null || ceVar.s || ceVar.H || !ceVar.ar() || !ceVar.at() || ceVar.C() == null) ? false : true;
    }

    private static boolean be(ce ceVar) {
        return ceVar != null && bd(ceVar) && ceVar.av();
    }

    @Override // defpackage.ce
    public final void Z() {
        Dialog dialog;
        super.Z();
        if (this.ai && (dialog = this.d) != null) {
            if (dialog.getWindow() != null) {
                WindowManager.LayoutParams attributes = this.d.getWindow().getAttributes();
                yjk.L(C());
                attributes.height = (int) qX().getDimension(R.dimen.av_flow_dialog_height);
                attributes.width = (int) qX().getDimension(R.dimen.av_flow_dialog_width);
                this.d.getWindow().setAttributes(attributes);
            }
            if (this.aj) {
                this.d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: wlv
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        wlw wlwVar = wlw.this;
                        if (i != 4 || keyEvent.getAction() != 1) {
                            return false;
                        }
                        wlwVar.aH();
                        return true;
                    }
                });
            }
        }
        if (TextUtils.equals(this.ak, "FRAGMENT_NAME_INTRO")) {
            aZ(this.aq);
            return;
        }
        if (TextUtils.equals(this.ak, "FRAGMENT_NAME_PHONE_INPUT")) {
            ba(this.ar, false);
            return;
        }
        if (TextUtils.equals(this.ak, "FRAGMENT_NAME_CODE_INPUT")) {
            aY(this.as, false);
        } else if (TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_SUCCESS")) {
            bc(this.at);
        } else if (TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_ERROR")) {
            bb(this.au, false);
        }
    }

    @Override // defpackage.wky
    public final void a() {
        aH();
    }

    @Override // defpackage.wly
    public final void aH() {
        if (be(this.al)) {
            this.af.h();
            return;
        }
        if (be(this.am)) {
            aZ(this.aq);
            return;
        }
        if (be(this.an)) {
            ba(this.ar, false);
        } else if (be(this.ap)) {
            this.af.h();
        } else {
            be(this.ao);
        }
    }

    @Override // defpackage.wly
    public final void aI(Configuration configuration) {
        if (bd(this.al)) {
            this.al.onConfigurationChanged(configuration);
            return;
        }
        if (bd(this.am)) {
            this.am.onConfigurationChanged(configuration);
            return;
        }
        if (bd(this.an)) {
            this.an.onConfigurationChanged(configuration);
        } else if (bd(this.ao)) {
            this.ao.onConfigurationChanged(configuration);
        } else if (bd(this.ap)) {
            this.ap.onConfigurationChanged(configuration);
        }
    }

    @Override // defpackage.wmb
    public final void aJ() {
        this.af.i();
    }

    @Override // defpackage.wmb
    public final void aK(atut atutVar) {
        ba(atutVar, true);
    }

    @Override // defpackage.wmb
    public final void aL(apxf apxfVar) {
        this.ae.c(apxfVar, null);
    }

    @Override // defpackage.wmf
    public final void aM(arzs arzsVar, String str, String str2) {
        this.ax = arzsVar;
        this.aw = str;
        this.av = str2;
    }

    @Override // defpackage.wmf
    public final void aN() {
        this.af.i();
    }

    @Override // defpackage.wmf
    public final void aO(atut atutVar) {
        ba(atutVar, true);
    }

    @Override // defpackage.wmf
    public final void aP(atuo atuoVar, long j, String str) {
        this.ay = j;
        this.az = str;
        aY(atuoVar, true);
    }

    @Override // defpackage.wmi
    public final void aQ() {
        this.af.i();
    }

    @Override // defpackage.wmi
    public final void aR(atut atutVar) {
        ba(atutVar, true);
    }

    @Override // defpackage.wmi
    public final void aS(atuo atuoVar, long j, String str) {
        this.ay = j;
        this.az = str;
        aY(atuoVar, true);
    }

    @Override // defpackage.wmi
    public final void aT(atuq atuqVar) {
        bc(atuqVar);
    }

    @Override // defpackage.wmi
    public final void aU(atuf atufVar) {
        bb(atufVar, true);
    }

    @Override // defpackage.wml
    public final void aV() {
        this.af.u();
    }

    protected final void aW(ce ceVar, String str) {
        if (this.ah == null) {
            this.ah = mN();
        }
        dn k = this.ah.k();
        ce f = this.ah.f(this.ak);
        if (ceVar.equals(f)) {
            k.n(ceVar);
            k.a();
            return;
        }
        ce f2 = this.ah.f(str);
        if (f2 != null && !f2.equals(ceVar)) {
            k.m(f2);
        }
        if (f != null && f.ar()) {
            k.l(f);
        }
        if (!ceVar.ar()) {
            k.q(R.id.verification_fragment_container, ceVar, str);
        } else if (ceVar.G) {
            k.n(ceVar);
        }
        k.i = 4099;
        k.a();
        this.ak = str;
    }

    @Override // defpackage.wlp
    public final void b() {
        this.af.i();
    }

    @Override // defpackage.wlp
    public final void c(atuq atuqVar) {
        bc(atuqVar);
    }

    @Override // defpackage.wlp
    public final void d(atuf atufVar) {
        bb(atufVar, true);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (this.ah == null) {
            this.ah = mN();
        }
        wmc wmcVar = this.al;
        if (wmcVar != null) {
            this.ah.L(bundle, "BUNDLE_INTRO_FRAGMENT", wmcVar);
        }
        wmg wmgVar = this.am;
        if (wmgVar != null) {
            this.ah.L(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT", wmgVar);
        }
        wlq wlqVar = this.an;
        if (wlqVar != null) {
            this.ah.L(bundle, "BUNDLE_CODE_INPUT_FRAGMENT", wlqVar);
        }
        wmm wmmVar = this.ao;
        if (wmmVar != null) {
            this.ah.L(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT", wmmVar);
        }
        wmj wmjVar = this.ap;
        if (wmjVar != null) {
            this.ah.L(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT", wmjVar);
        }
        atvc atvcVar = this.aq;
        if (atvcVar != null) {
            bundle.putByteArray("BUNDLE_INTRO_RENDERER", atvcVar.toByteArray());
        }
        atut atutVar = this.ar;
        if (atutVar != null) {
            bundle.putByteArray("BUNDLE_PHONE_INPUT_RENDERER", atutVar.toByteArray());
        }
        atuo atuoVar = this.as;
        if (atuoVar != null) {
            bundle.putByteArray("BUNDLE_CODE_INPUT_RENDERER", atuoVar.toByteArray());
        }
        atuq atuqVar = this.at;
        if (atuqVar != null) {
            bundle.putByteArray("BUNDLE_RESULT_SUCCESS_RENDERER", atuqVar.toByteArray());
        }
        atuf atufVar = this.au;
        if (atufVar != null) {
            bundle.putByteArray("BUNDLE_RESULT_ERROR_RENDERER", atufVar.toByteArray());
        }
        bundle.putString("BUNDLE_CURRENT_FRAGMENT", this.ak);
        bundle.putString("BUNDLE_CURRENT_PHONE_NUMBER", this.av);
        bundle.putString("BUNDLE_CURRENT_COUNTRY_CODE", this.aw);
        bundle.putInt("BUNDLE_CURRENT_DELIVERY_METHOD", this.ax.d);
        bundle.putLong("BUNDLE_CURRENT_IDV_REQUEST_ID", this.ay);
        bundle.putBoolean("BUNDLE_DID_ROUTE_ATTESTATION_COMMAND", this.aA);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            if (this.ah == null) {
                this.ah = mN();
            }
            dn k = this.ah.k();
            wmc wmcVar = (wmc) this.ah.g(bundle, "BUNDLE_INTRO_FRAGMENT");
            this.al = wmcVar;
            if (wmcVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_INTRO")) {
                k.l(this.al);
            }
            wmg wmgVar = (wmg) this.ah.g(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT");
            this.am = wmgVar;
            if (wmgVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_PHONE_INPUT")) {
                k.l(this.am);
            }
            wlq wlqVar = (wlq) this.ah.g(bundle, "BUNDLE_CODE_INPUT_FRAGMENT");
            this.an = wlqVar;
            if (wlqVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_CODE_INPUT")) {
                k.l(this.an);
            }
            wmm wmmVar = (wmm) this.ah.g(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT");
            this.ao = wmmVar;
            if (wmmVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_SUCCESS")) {
                k.l(this.ao);
            }
            wmj wmjVar = (wmj) this.ah.g(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT");
            this.ap = wmjVar;
            if (wmjVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_ERROR")) {
                k.l(this.ap);
            }
            k.a();
            try {
                byte[] byteArray = bundle.getByteArray("BUNDLE_INTRO_RENDERER");
                if (byteArray != null) {
                    this.aq = (atvc) aonm.parseFrom(atvc.a, byteArray, aomw.b());
                }
                byte[] byteArray2 = bundle.getByteArray("BUNDLE_PHONE_INPUT_RENDERER");
                if (byteArray2 != null) {
                    this.ar = (atut) aonm.parseFrom(atut.a, byteArray2, aomw.b());
                }
                byte[] byteArray3 = bundle.getByteArray("BUNDLE_CODE_INPUT_RENDERER");
                if (byteArray3 != null) {
                    this.as = (atuo) aonm.parseFrom(atuo.a, byteArray3, aomw.b());
                }
                byte[] byteArray4 = bundle.getByteArray("BUNDLE_RESULT_SUCCESS_RENDERER");
                if (byteArray4 != null) {
                    this.at = (atuq) aonm.parseFrom(atuq.a, byteArray4, aomw.b());
                }
                byte[] byteArray5 = bundle.getByteArray("BUNDLE_RESULT_ERROR_RENDERER");
                if (byteArray5 != null) {
                    this.au = (atuf) aonm.parseFrom(atuf.a, byteArray5, aomw.b());
                }
                this.ak = bundle.getString("BUNDLE_CURRENT_FRAGMENT");
                this.av = bundle.getString("BUNDLE_CURRENT_PHONE_NUMBER");
                this.aw = bundle.getString("BUNDLE_CURRENT_COUNTRY_CODE");
                arzs b = arzs.b(bundle.getInt("BUNDLE_CURRENT_DELIVERY_METHOD"));
                this.ax = b;
                if (b == null) {
                    this.ax = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
                }
                this.ay = bundle.getLong("BUNDLE_CURRENT_IDV_REQUEST_ID");
                this.aA = bundle.getBoolean("BUNDLE_DID_ROUTE_ATTESTATION_COMMAND");
            } catch (aoob e) {
                throw new RuntimeException("Failed to parse a known parcelable proto", e);
            }
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        if (this.aA) {
            return;
        }
        atvc atvcVar = this.aq;
        if ((atvcVar.b & 64) != 0) {
            aahd aahdVar = this.ae;
            apxf apxfVar = atvcVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
            this.aA = true;
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.m;
        this.ai = bundle2.getBoolean("ARG_SHOW_AS_DIALOG", false);
        this.aj = bundle2.getBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        if (bundle2.containsKey("ARG_INTRO_RENDERER")) {
            try {
                this.aq = (atvc) amkq.cj(bundle2, "ARG_INTRO_RENDERER", atvc.a, aomw.b());
            } catch (aoob e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        return layoutInflater.inflate(R.layout.verification_fragment, viewGroup, false);
    }
}
