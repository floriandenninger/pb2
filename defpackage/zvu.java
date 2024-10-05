package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.gallery.GalleryNestedScrollView;
import com.google.android.youtube.R;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvu extends zvz implements View.OnClickListener, zvv, zwg, ln {
    private static final int[] al = {R.attr.actionBarSize};
    private static final acsc am = acsb.c(9700);
    private static final acsc an = acsb.c(17177);
    private static final acsc ao = acsb.c(18645);
    private static final acsc ap = acsb.c(27599);
    private static final acsc aq = acsb.c(18642);
    private static final acsc ar = acsb.c(18639);
    private static final acsc as = acsb.c(22855);
    private static final acsc at = acsb.c(18643);
    private static final acsc au = acsb.c(18640);
    private static final acsc av = acsb.c(22856);
    public View a;
    private GalleryNestedScrollView aA;
    private Class aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private ValueAnimator aH;
    public ypa ae;
    Uri ag;
    private FrameLayout aw;
    private FrameLayout ax;
    private FrameLayout ay;
    private zmq az;
    public ImageView b;
    public zvs c;
    public akai d;
    public acsg e;
    public boolean af = true;
    private boolean aI = true;
    private boolean aJ = false;
    boolean ah = false;
    public boolean ai = false;
    public boolean aj = false;
    private boolean aK = false;
    public asht ak = null;
    private final ValueAnimator.AnimatorUpdateListener aL = new zvq(this);
    private final Animator.AnimatorListener aM = new zvr(this);

    private final zvt aF(boolean z) {
        int i;
        ci C = C();
        zvt zvtVar = new zvt();
        if (!z && !this.aj) {
            zvtVar.b = new String[]{"android.permission.CAMERA"};
            i = R.string.gallery_permission_open_settings_for_camera;
        } else if (akai.h(C, 1)) {
            zvtVar.b = new String[]{"android.permission.RECORD_AUDIO"};
            i = R.string.gallery_permission_open_settings_for_microphone_secondary;
        } else {
            zvtVar.b = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            i = R.string.shorts_permission_camera_open_settings_description;
        }
        zvtVar.a = i;
        return zvtVar;
    }

    private final void aG() {
        ValueAnimator valueAnimator = this.aH;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.aH.cancel();
    }

    private final void aH() {
        this.e.d(acsb.b(18046), null, this.ak);
        acsg acsgVar = this.e;
        acsc acscVar = am;
        acsgVar.n(new acqx(acscVar));
        this.e.w(new acqx(acscVar), this.ak);
        acsg acsgVar2 = this.e;
        acsc acscVar2 = an;
        acsgVar2.n(new acqx(acscVar2));
        this.e.w(new acqx(acscVar2), this.ak);
        acsg acsgVar3 = this.e;
        acsc acscVar3 = ao;
        acsgVar3.n(new acqx(acscVar3));
        this.e.w(new acqx(acscVar3), this.ak);
        if (this.ah) {
            acsg acsgVar4 = this.e;
            acsc acscVar4 = ap;
            acsgVar4.n(new acqx(acscVar4));
            this.e.w(new acqx(acscVar4), this.ak);
        }
    }

    private final void aI() {
        if (this.aJ) {
            this.aJ = false;
            ci C = C();
            if (C == null || !zev.e(C)) {
                return;
            }
            Toast.makeText(C, qX().getString(true != aO() ? R.string.gallery_camera_launch_button_minimized_event : R.string.gallery_camera_launch_button_expanded_event), 0).show();
        }
    }

    private final void aJ(boolean z) {
        ci C = C();
        int i = 1;
        if (akai.h(C, 1)) {
            if (z || this.aj) {
                if (!akai.h(C, 2)) {
                    i = 2;
                } else if (z) {
                    aN();
                    return;
                }
            }
            aM();
            return;
        }
        acsc aP = aP(i);
        this.e.n(new acqx(aP));
        this.e.w(new acqx(aP), this.ak);
        acsc aQ = aQ(i);
        this.e.n(new acqx(aQ));
        this.e.w(new acqx(aQ), this.ak);
        String[] l = akai.l(i);
        this.d.d(l);
        if (z) {
            ac(l, i + 100);
        } else {
            ac(l, i);
        }
    }

    private final void aK(boolean z) {
        if (this.ai) {
            aJ(z);
            return;
        }
        ci C = C();
        zvt aF = aF(z);
        if (this.d.k(C, aF.b)) {
            akad.aF(aF.a).qh(this.z, "openSettingsDialog");
        } else {
            aJ(z);
        }
    }

    private final void aM() {
        ci C = C();
        zmq zmqVar = this.az;
        if (zmqVar != null) {
            zmqVar.a();
        }
        if (this.aj) {
            zvs zvsVar = this.c;
            if (zvsVar != null) {
                zvsVar.f();
                return;
            }
            return;
        }
        this.e.d(acsb.b(18248), null, this.ak);
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (Build.VERSION.SDK_INT < 29 || !akwb.d()) {
            try {
                Uri M = wcy.M(qR());
                this.ag = M;
                Uri L = wcy.L(M, qR());
                if (aij.b()) {
                    intent.setClipData(ClipData.newUri(qR().getContentResolver(), "videos", L));
                    intent.setFlags(3);
                }
                intent.putExtra("output", L);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("Error occurred while generating the camera file Uri:\n");
                sb.append(valueOf);
                zga.b(sb.toString());
                Toast.makeText(C, qX().getString(R.string.gallery_camera_open_error), 1).show();
                return;
            }
        }
        intent.putExtra("android.intent.extra.videoQuality", 1);
        this.ae.f(new wcy());
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException e2) {
            this.ag = null;
            String valueOf2 = String.valueOf(e2.toString());
            zga.b(valueOf2.length() != 0 ? "Error occurred while trying to open an activity to handle the ACTION_VIDEO_CAPTURE intent:\n".concat(valueOf2) : new String("Error occurred while trying to open an activity to handle the ACTION_VIDEO_CAPTURE intent:\n"));
            Toast.makeText(C, qX().getString(R.string.camera_not_found), 1).show();
        }
    }

    private final void aN() {
        this.aB.getClass();
        zmq zmqVar = this.az;
        if (zmqVar != null) {
            zmqVar.a();
        }
        Intent intent = new Intent(qR(), (Class<?>) this.aB);
        intent.addFlags(536870912);
        intent.putExtra("INTENT_EXTRA_REFERRER_NAME", "REFERRER_NAME_GALLERY_FRAGMENT");
        acsg acsgVar = this.e;
        acsc acscVar = ap;
        Bundle bundle = acsgVar.j.a;
        if (bundle != null && acscVar != null) {
            bundle.putInt("tracking_interaction_parent_ve", acscVar.a);
        }
        this.ae.f(new wcy());
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(C(), qX().getString(R.string.common_error_generic), 1).show();
        }
    }

    private final boolean aO() {
        return this.aA.getScrollY() <= this.aD / 2;
    }

    private static final acsc aP(int i) {
        return i == 0 ? aq : i == 1 ? ar : as;
    }

    private static final acsc aQ(int i) {
        return i == 0 ? at : i == 1 ? au : av;
    }

    private final ValueAnimator s(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(125L);
        ofFloat.addUpdateListener(this.aL);
        ofFloat.addListener(this.aM);
        ofFloat.start();
        return ofFloat;
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        if (i == 1) {
            ci C = C();
            Uri uri = this.ag;
            this.ag = null;
            this.ae.f(new wcy());
            if (i2 != -1) {
                if (i2 != 0) {
                    Toast.makeText(C, qX().getString(R.string.gallery_camera_capture_error), 1).show();
                    zga.l("Error while capturing video.");
                    return;
                } else {
                    if (this.aK) {
                        return;
                    }
                    aH();
                    return;
                }
            }
            File file = uri != null ? new File(uri.getPath()) : null;
            if (file == null || !file.exists()) {
                zga.g("File does not exist at original Uri.");
                if (intent == null || intent.getData() == null) {
                    Toast.makeText(C, qX().getString(R.string.gallery_camera_capture_error), 1).show();
                    zga.l("File for original URI doesn't exist and intent didn't return a data Uri.");
                    return;
                } else {
                    zga.g("Using Camera intent's Uri.");
                    uri = intent.getData();
                }
            }
            C.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
            zvs zvsVar = this.c;
            if (zvsVar != null) {
                if (!akwb.d()) {
                    uri = wcy.L(uri, qR());
                }
                zvsVar.h(uri, true);
                return;
            }
            return;
        }
        if (i == 2) {
            if (i2 == 0) {
                if (!this.aK) {
                    aH();
                    return;
                }
                i2 = 0;
            }
            i = 2;
        }
        super.T(i, i2, intent);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.af = true;
        this.aK = false;
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i >= 100) {
            i -= 100;
            z = true;
        } else {
            z = false;
        }
        if (akai.e(iArr)) {
            acsc aP = aP(i);
            if (aP != null) {
                this.e.I(3, new acqx(aP), this.ak);
            }
            aJ(z);
            return;
        }
        acsc aQ = aQ(i);
        if (aQ != null) {
            this.e.I(3, new acqx(aQ), this.ak);
        }
        if (this.ai && !akai.a(C(), strArr, iArr).isEmpty()) {
            akad.aF(aF(z).a).qh(this.z, "openSettingsDialog");
            return;
        }
        if (!z) {
            whu.K(C(), R.string.gallery_permissions_missing_camera_warning, 1);
        } else if (i == 1) {
            whu.K(C(), R.string.gallery_permissions_missing_camera_secondary_warning, 1);
        } else if (i == 2) {
            whu.K(C(), R.string.gallery_permissions_missing_microphone_secondary_warning, 1);
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.af = false;
    }

    @Override // defpackage.ln
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        if (!aO()) {
            if (this.aI) {
                aG();
                this.aH = s(this.a.getAlpha(), 0.0f);
                this.ay.setContentDescription(qX().getString(R.string.gallery_camera_launch_button_minimized_description));
                this.aI = false;
                this.aJ = true;
                return;
            }
            return;
        }
        if (this.aI) {
            return;
        }
        aG();
        this.aH = s(this.a.getAlpha(), 1.0f);
        if (this.ah) {
            this.ay.setContentDescription(null);
        } else {
            this.ay.setContentDescription(qX().getString(R.string.gallery_camera_launch_button_description));
        }
        this.aI = true;
        this.aJ = true;
    }

    @Override // defpackage.zwg
    public final void aL(DeviceLocalFile deviceLocalFile) {
        if (this.af) {
            return;
        }
        this.e.I(3, new acqx(ao), this.ak);
        Uri f = deviceLocalFile.f();
        zvs zvsVar = this.c;
        if (zvsVar == null || f == null) {
            return;
        }
        zvsVar.h(f, false);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("camera_file_uri", this.ag);
        Class cls = this.aB;
        if (cls != null) {
            bundle.putString("secondary_action_class_name", cls.getCanonicalName());
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            this.ag = (Uri) bundle.getParcelable("camera_file_uri");
            p(bundle.getString("secondary_action_class_name"));
        }
        this.aC = qX().getDimensionPixelSize(R.dimen.gallery_camera_minimized_height);
        this.aE = qX().getDimensionPixelSize(R.dimen.gallery_camera_chevron_icon_size);
        this.aG = qX().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        this.aF = qX().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r3 == 0) goto L20;
     */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvu.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void n() {
        this.e.I(3, new acqx(am), this.ak);
        zvs zvsVar = this.c;
        if (zvsVar != null) {
            zvsVar.g();
        }
    }

    @Override // defpackage.zvv
    public final void o() {
        if (aO()) {
            this.aA.w();
        } else {
            this.aA.v(false);
        }
        aI();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.af) {
            return;
        }
        if (!aO()) {
            if (view == this.ay) {
                this.aA.w();
                aI();
                return;
            }
            return;
        }
        if (view == this.ay || view == this.aw) {
            this.e.I(3, new acqx(an), this.ak);
            if (Build.VERSION.SDK_INT < 23) {
                aM();
                return;
            } else {
                aK(false);
                return;
            }
        }
        if (view == this.ax) {
            if (Build.VERSION.SDK_INT < 23) {
                aN();
            } else {
                aK(true);
            }
        }
    }

    public final void p(String str) {
        this.aB = null;
        if (str != null) {
            try {
                this.aB = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
        }
    }
}
