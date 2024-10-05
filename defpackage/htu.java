package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htu extends hsq implements akaq, htj, hws, hve, hwh, hyz, ibp {
    public static final /* synthetic */ int ax = 0;
    private boolean aB;
    private apxf aC;
    private hvc aD;
    private Dialog aE;
    private avcy aF;
    private avxs aG;
    private avxs aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    public zto ae;
    public zto af;
    public zrt ag;
    public hye ah;
    public ibq ai;
    public gni aj;
    public hrv ak;
    public akar al;
    public htl am;
    public hwt an;
    public axdk ao;
    public aqdt ap;
    public htw ar;
    public aadw as;
    public akap at;
    public vgz av;
    public trp aw;
    public Handler b;
    public aahd c;
    public hwk d;
    public zum e;
    private static final long ay = TimeUnit.MINUTES.toMillis(1);
    static final PermissionDescriptor[] a = {new PermissionDescriptor(0, acsb.c(31566), acsb.c(31569)), new PermissionDescriptor(1, acsb.c(31564), acsb.c(31567)), new PermissionDescriptor(2, acsb.c(31565), acsb.c(31568))};
    private static final PermissionDescriptor[] az = new PermissionDescriptor[0];
    public final htv aq = new htq(this);
    public final htr au = new htr(this);

    public static boolean bc(apxf apxfVar) {
        return apxfVar != null && ((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apxfVar.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c > 0;
    }

    private final zrx bf() {
        zxz zxzVar = (zxz) mN().f("reelEditFragment2");
        if (zxzVar == null) {
            return null;
        }
        return zxzVar.ay.r();
    }

    private final void bg(String str) {
        if (this.aB) {
            zga.c("PresetFilterDebug", str);
        }
    }

    public static htu p(apxf apxfVar, boolean z, boolean z2) {
        htu htuVar = new htu();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        bundle.putBoolean("modify_window_fullscreen_mode", z);
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z2);
        htuVar.af(bundle);
        return htuVar;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.hyz
    public final void a(axdk axdkVar) {
        zrx bf = bf();
        if (bf != null) {
            bf.a(axdkVar);
        }
    }

    @Override // defpackage.hve
    public final void aF(final RecordingInfo recordingInfo) {
        new AlertDialog.Builder(C()).setTitle(O(R.string.reel_discard_editor_changes_title)).setMessage(O(R.string.reel_discard_editor_changes_description)).setPositiveButton(R.string.reel_discard_editor_changes_dialog_discard_button_text, new DialogInterface.OnClickListener() { // from class: htm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                htu htuVar = htu.this;
                RecordingInfo recordingInfo2 = recordingInfo;
                htuVar.aO(false);
                if (recordingInfo2 != null && recordingInfo2.e) {
                    File file = new File(recordingInfo2.c);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                if (htuVar.mN().f("reelEditFragment2") != null) {
                    htuVar.aS();
                    return;
                }
                htw htwVar = htuVar.ar;
                if (htwVar != null) {
                    htwVar.c();
                }
            }
        }).setNegativeButton(R.string.reel_discard_editor_changes_dialog_cancel_button_text, (DialogInterface.OnClickListener) null).show();
    }

    @Override // defpackage.hwh
    public final void aG(avcy avcyVar, avxs avxsVar, avxs avxsVar2) {
        boolean z = true;
        if (avcyVar != null && avxsVar != null) {
            z = false;
        }
        amkq.N(z);
        this.aF = avcyVar;
        this.aG = avxsVar;
        this.aH = avxsVar2;
        if (avcyVar != null) {
            this.e.c(avcyVar);
            bg("ReelCreationFragment::onEffectsSettingsReceived->setSwazzleEffectsSettings");
        } else if (avxsVar != null) {
            this.ae.f(avxsVar, false);
        }
        if (avxsVar2 != null) {
            this.af.e(avxsVar2);
        }
    }

    @Override // defpackage.icq
    public final void aH(ce ceVar) {
        dn k = mN().k();
        k.m(ceVar);
        k.a();
    }

    @Override // defpackage.icq
    public final void aI(axdj axdjVar) {
        zrx bf = bf();
        if (bf != null) {
            bf.b(axdjVar);
        }
    }

    @Override // defpackage.akaq
    public final void aJ() {
        htw htwVar = this.ar;
        if (htwVar != null) {
            htwVar.c();
        }
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.b.post(new hts(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2  */
    @Override // defpackage.zwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aL(com.google.android.libraries.youtube.edit.common.DeviceLocalFile r21) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htu.aL(com.google.android.libraries.youtube.edit.common.DeviceLocalFile):void");
    }

    @Override // defpackage.hws
    public final void aM() {
        htw htwVar = this.ar;
        if (htwVar != null) {
            htwVar.c();
        }
    }

    public final void aN(ce ceVar, String str) {
        dn k = mN().k();
        k.u(R.id.reel_container, ceVar, str);
        k.a();
    }

    public final void aO(boolean z) {
        if (!this.aI || this.ar == null) {
            return;
        }
        Window window = C().getWindow();
        if (z) {
            window.addFlags(1024);
            window.setSoftInputMode(2);
        } else {
            window.clearFlags(1024);
            window.setSoftInputMode(16);
            this.ar.f();
        }
    }

    @Override // defpackage.hwh
    public final void aP(boolean z) {
        this.aK = z;
    }

    @Override // defpackage.icq
    public final void aQ() {
        hvb hvbVar;
        hvc hvcVar = (hvc) mN().f("reelEditFragment2");
        this.aD = hvcVar;
        if (hvcVar == null || (hvbVar = hvcVar.av) == null) {
            return;
        }
        hvbVar.a.bf();
    }

    @Override // defpackage.icq
    public final void aR() {
        hvb hvbVar;
        hvc hvcVar = (hvc) mN().f("reelEditFragment2");
        this.aD = hvcVar;
        if (hvcVar == null || (hvbVar = hvcVar.av) == null) {
            return;
        }
        hvbVar.a.aZ();
    }

    public final void aS() {
        aqac aqacVar;
        int i;
        htl htlVar = (htl) mN().f("cameraFragment");
        this.am = htlVar;
        if (htlVar == null) {
            apxf apxfVar = this.aC;
            int i2 = 0;
            if (apxfVar == null || !apxfVar.pY(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                aqacVar = null;
            } else {
                LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) this.aC.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                int i3 = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.c;
                aqac aqacVar2 = (lightweightCameraEndpointOuterClass$LightweightCameraEndpoint == null || lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.size() == 0) ? null : (aqac) ((aulq) lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.get(0)).pX(CommentStickerRendererOuterClass.commentStickerRenderer);
                if (aqacVar2 != null) {
                    aqacVar = aqacVar2;
                    i2 = i3;
                    i = 1;
                    this.am = htl.aX(i, i2 * 1000, aqacVar, this.ae, this.e, this.aJ, this.aC);
                } else {
                    aqacVar = aqacVar2;
                    i2 = i3;
                }
            }
            i = 0;
            this.am = htl.aX(i, i2 * 1000, aqacVar, this.ae, this.e, this.aJ, this.aC);
        }
        this.am.aN(this);
        aN(this.am, "cameraFragment");
        this.d.sendEmptyMessage(3);
        if (this.ap != null) {
            this.b.post(new hts(this, 1, null));
        }
        akar akarVar = this.al;
        if (akarVar != null) {
            akarVar.aG(null);
            this.al = null;
        }
    }

    @Override // defpackage.icq
    public final void aT(aone aoneVar) {
        zrx bf = bf();
        if (bf != null) {
            bf.l(aoneVar);
        }
    }

    @Override // defpackage.hwh
    public final void aU(RecordingInfo recordingInfo, apxf apxfVar, int i) {
        aO(true);
        HashMap hashMap = new HashMap();
        hashMap.put("fragment_tag", "reelEditFragment2");
        hashMap.put("recording_info", recordingInfo);
        hashMap.put("kazoo_effects_loader", this.af);
        hashMap.put("destination_endpoint", this.aC);
        hashMap.put("comment_sticker", this.ao);
        akar akarVar = this.al;
        if (akarVar != null) {
            akarVar.aG(null);
            this.al = null;
        }
        acra r = r();
        int i2 = 1 != i ? 39304 : 18044;
        if (r != null) {
            acqq acqqVar = (acqq) r;
            if (acqqVar.g != null) {
                aone createBuilder = atmc.a.createBuilder();
                String str = acqqVar.g.a;
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                str.getClass();
                atmcVar.b = 1 | atmcVar.b;
                atmcVar.c = str;
                createBuilder.copyOnWrite();
                atmc atmcVar2 = (atmc) createBuilder.instance;
                atmcVar2.b |= 2;
                atmcVar2.d = i2;
                atmc atmcVar3 = (atmc) createBuilder.build();
                aong aongVar = (aong) apxfVar.toBuilder();
                aongVar.e(atmb.b, atmcVar3);
                aongVar.copyOnWrite();
                apxf apxfVar2 = (apxf) aongVar.instance;
                apxfVar2.b &= -2;
                apxfVar2.c = apxf.a.c;
                apxfVar = (apxf) aongVar.build();
            }
        }
        Dialog dialog = this.aE;
        if (dialog != null) {
            dialog.dismiss();
            this.aE = null;
        }
        this.c.c(apxfVar, hashMap);
    }

    @Override // defpackage.hwh
    public final void aV() {
        Dialog dialog = new Dialog(C(), R.style.ReelEditToolsLoadingDialog);
        this.aE = dialog;
        dialog.setCanceledOnTouchOutside(false);
        this.aE.setContentView(R.layout.reel_loading_dialog);
        this.aE.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: htn
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int i2 = htu.ax;
                return i == 4;
            }
        });
        if (this.am != null) {
            dn k = mN().k();
            k.m(this.am);
            k.a();
        }
        this.aE.show();
    }

    public final void aW() {
        if (this.al == null) {
            akap akapVar = this.at;
            akapVar.e(a);
            akapVar.d(az);
            akapVar.a = acsb.b(31571);
            akapVar.b = acsb.c(31563);
            akapVar.c = acsb.c(31570);
            akapVar.d = acsb.c(31639);
            akapVar.b(R.string.reel_permission_allow_access_description);
            akapVar.c(R.string.reel_permission_open_settings_description);
            this.al = akapVar.a();
        }
        this.al.aG(this);
        this.al.aH(new ContextThemeWrapper(C(), R.style.ReelTheme_NoActionBar_FullScreen_Dark));
        aN(this.al, "permissionRequestFragment");
    }

    public final void aX() {
        bue e;
        if (!bd() || (e = mN().e(R.id.reel_container)) == null || (e instanceof akar)) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(qR(), this.aj.a() == gng.DARK ? R.style.Themed_YouTube_Dark_AppCompat : R.style.Themed_YouTube_Light_AppCompat_Light);
        acra mM = e instanceof acqz ? ((acqz) e).mM() : null;
        if (mM != null) {
            mM.n(new acqx(this.ap.n));
            apmh apmhVar = this.ap.h;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            mM.n(new acqx(apmgVar.t));
            apmh apmhVar2 = this.ap.i;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            mM.n(new acqx(apmgVar2.t));
        }
        ajdf.o(contextThemeWrapper, this.ap, this.c, mM, false, new htt(this), null, null);
    }

    @Override // defpackage.hwh
    public final void aY(aqdt aqdtVar) {
        this.ap = aqdtVar;
        aX();
    }

    @Override // defpackage.hve
    public final void aZ() {
        aO(false);
        htw htwVar = this.ar;
        if (htwVar != null) {
            htwVar.c();
        }
    }

    public final boolean ba() {
        return Build.VERSION.SDK_INT >= 23 && akai.f(C(), a);
    }

    @Override // defpackage.hve
    public final boolean bb() {
        return this.aK;
    }

    final boolean bd() {
        View view;
        if (!av() || this.s || this.H || !ar() || !at() || C() == null || (view = this.O) == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = rect.width();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = width;
        double d2 = displayMetrics.widthPixels;
        Double.isNaN(d2);
        return d > d2 * 0.1d;
    }

    public final boolean be() {
        ce e = mN().e(R.id.reel_container);
        if (e instanceof htl) {
            ((htl) e).aL();
            return true;
        }
        if (e instanceof hvc) {
            hvc hvcVar = (hvc) e;
            if (hvcVar.am.d) {
                hvcVar.aY();
            } else if (hvcVar.ak.j) {
                hvcVar.e();
            } else if (hvcVar.an.d) {
                hvcVar.h();
            } else {
                hwg hwgVar = hvcVar.aj;
                if (hwgVar.i) {
                    hwgVar.d();
                } else {
                    htz htzVar = hvcVar.al;
                    if (htzVar.c) {
                        htzVar.d();
                    } else {
                        hvcVar.af.aF(hvcVar.d.g());
                    }
                }
                hvcVar.bf();
            }
            return true;
        }
        if (e instanceof hwt) {
            ((hwt) e).a.aM();
            return true;
        }
        if (!(e instanceof akar)) {
            return false;
        }
        ((akar) e).q();
        return true;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        avcy avcyVar = this.aF;
        bundle.putByteArray("camera_swazzle_effects_settings_key", avcyVar != null ? avcyVar.toByteArray() : null);
        avxs avxsVar = this.aG;
        bundle.putByteArray("camera_kazoo_effects_settings_key", avxsVar != null ? avxsVar.toByteArray() : null);
        avxs avxsVar2 = this.aH;
        bundle.putByteArray("edit_kazoo_effects_settings_key", avxsVar2 != null ? avxsVar2.toByteArray() : null);
        aqdt aqdtVar = this.ap;
        if (aqdtVar != null) {
            bundle.putByteArray("block reel_creation_key", aqdtVar.toByteArray());
        }
        apxf apxfVar = this.d.e;
        bundle.putByteArray("reel_handler_edit_video_endpoint", apxfVar != null ? apxfVar.toByteArray() : null);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (Build.VERSION.SDK_INT < 23) {
            etx.T(C(), R.string.reel_not_supported);
            htw htwVar = this.ar;
            if (htwVar != null) {
                htwVar.c();
            }
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            byte[] byteArray = bundle2.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.aC = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
                } catch (aoob unused) {
                }
            }
            this.aI = bundle2.getBoolean("modify_window_fullscreen_mode");
            this.aJ = bundle2.getBoolean("SWIPE_TO_CAMERA_ENABLED");
        }
        if (bc(this.aC)) {
            return;
        }
        etx.T(C(), R.string.reel_camera_server_error);
        htw htwVar2 = this.ar;
        if (htwVar2 != null) {
            htwVar2.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htu.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final ContentResolver o() {
        return C().getContentResolver();
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C().setRequestedOrientation(1);
    }

    @Override // defpackage.ibp
    public final ibq q() {
        return this.ai;
    }

    public final acra r() {
        if (!bd()) {
            return null;
        }
        ce e = mN().e(R.id.reel_container);
        if (e instanceof htl) {
            return ((htl) e).c;
        }
        return null;
    }

    @Override // defpackage.hve
    public final void s() {
        aS();
    }
}
