package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraFeatureDescriptionView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsPresetTracker;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.youtube.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hel extends hdn implements View.OnClickListener, hev, acqz, zmu, zmt, hmf, hnl {
    public static final long a = TimeUnit.DAYS.toSeconds(7);
    public MultiSegmentCameraProgressIndicator aA;
    public YouTubeTextView aB;
    public YouTubeTextView aC;
    public hcq aD;
    public hfh aE;
    public int aF;
    public ShortsZoomSlider aG;
    public View aH;
    public hfa aI;
    public hfj aJ;
    public View aK;
    public ImageView aL;
    View aM;
    View aN;
    public hgh aO;
    public CameraFocusOverlay aP;
    public View aQ;
    public ImageView aR;
    public boolean aU;
    public apxf aV;
    public boolean aW;
    public boolean aX;
    public het aY;
    public hgb aZ;
    public acra ae;
    public axpg af;
    public hrv ag;
    public gni ah;
    public hos ai;
    public hmg aj;
    public hlo ak;
    public hmw al;
    public hoj am;
    public hrq an;
    public aahd ao;
    public hoz ap;
    public hkz aq;
    public Executor ar;
    public Executor as;
    public hng at;
    public hnd au;
    public Context av;
    public how aw;
    public hdt ax;
    public CameraView ay;
    public ShortsRecordButtonView az;
    int b;
    private TextView bA;
    private ShortsCameraFeatureDescriptionView bB;
    private View bC;
    private View bD;
    private FrameLayout bE;
    private ImageView bF;
    private View bG;
    private View bH;
    private YouTubeTextView bI;
    private View bJ;
    private View bK;
    private int bL;
    private boolean bM;
    private hda bN;
    private FrameLayout bO;
    private hej bP;
    private boolean bQ;
    private boolean bR;
    private String bS;
    private boolean bT;
    private boolean bU;
    private boolean bV;
    private boolean bW;
    private boolean bX;
    private boolean bY;
    private hkq bZ;
    public FrameLayout ba;
    public hds bb;
    public boolean bc;
    String bd;
    public hov be;
    public hfp bg;
    public vgz bh;
    public jqr bi;
    public jlb bj;
    private boolean bk;
    private int bl;
    private View bo;
    private EditorButtonView bp;
    private EditorButtonView bq;
    private EditorButtonView br;
    private SegmentedControl bs;
    private hey bt;
    private EditorButtonView bu;
    private EditorButtonView bv;
    private EditorButtonView bw;
    private EditorButtonView bx;
    private ChooseFilterView by;
    private hsz bz;
    public int c;
    private hfi ca;
    private hnq cc;
    private Button cd;
    private zob ce;
    private hoh cf;
    private zng cg;
    private hga ch;
    private heg ci;
    private heg cj;
    private heg ck;
    private heg cl;
    private heg cm;
    private heg cn;
    private heg co;
    public int d;
    public hei e;
    private final zsq bm = ztd.j();
    private asht bn = asht.a;
    public boolean aS = false;
    public int aT = -1;
    private final ayqw cb = new ayqw();
    public int bf = 0;

    public static hel aY(boolean z, apxf apxfVar) {
        amkq.F(true, "startCameraSelection must be one of @StartCameraSelection values");
        hel helVar = new hel();
        Bundle bundle = new Bundle();
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", 0);
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        bundle.putBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY", z);
        helVar.af(bundle);
        return helVar;
    }

    private final hga aZ() {
        if (this.ch == null) {
            this.ch = new hdz(this);
        }
        return this.ch;
    }

    private final zng ba() {
        if (this.cg == null) {
            this.cg = new hef(this);
        }
        return this.cg;
    }

    private final void bb(boolean z) {
        hfp hfpVar = this.bg;
        hfpVar.d = hfpVar.a.b(asmn.LATENCY_ACTION_SHORTS_EDIT);
        how howVar = this.aw;
        if (howVar == null) {
            zga.b("Null project state when transitioning to editor - cannot create composed video");
            return;
        }
        if (this.e == null) {
            zga.b("Null listener can't receive composed video");
            return;
        }
        ammv d = howVar.d();
        if (d.h()) {
            hei heiVar = this.e;
            hmc hmcVar = (hmc) heiVar;
            hmcVar.C().getWindow().clearFlags(128);
            hmcVar.aF(true == z ? 2 : 1);
            aL();
        }
    }

    private final void bc() {
        hmg hmgVar;
        how howVar = this.aw;
        if (howVar != null) {
            howVar.v();
        }
        if (this.aW && (hmgVar = this.aj) != null) {
            hmgVar.b();
            if (hmgVar.d) {
                hmgVar.d();
            }
        }
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.aA;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.d(0);
            this.aA.c();
        }
    }

    private final void bd() {
        this.aK.setVisibility(4);
        this.bD.setVisibility(4);
        this.bC.setVisibility(4);
        this.az.setVisibility(4);
        this.az.setContentDescription(null);
        this.bE.setVisibility(4);
        if (this.aW) {
            this.bJ.setVisibility(8);
        }
        this.bt.c();
        ShortsZoomSlider shortsZoomSlider = this.aG;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.d(false);
            this.aG.c();
        }
        this.bG.setVisibility(4);
    }

    private final void be() {
        this.az.setVisibility(0);
        this.az.c();
        this.bE.setVisibility(0);
        this.ax.b(true);
        if (this.aW) {
            this.bJ.setVisibility(0);
        }
        ShortsZoomSlider shortsZoomSlider = this.aG;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.d(zev.e(qR()));
        }
    }

    private final void bf(boolean z) {
        boolean J2 = this.ay.J();
        boolean d = jqr.d(this.bE, J2);
        fhe.H(this.bE, J2);
        if (d && z) {
            hfq a2 = this.bi.a(acsb.c(96641));
            a2.h(J2);
            a2.g();
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.aO.b();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.aA;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.c();
        }
        if (this.ay.I()) {
            aU(1);
            hei heiVar = this.e;
            if (heiVar != null) {
                ((hmc) heiVar).C().getWindow().clearFlags(128);
            }
            aV();
        }
        hfh hfhVar = this.aE;
        if (hfhVar != null) {
            hfhVar.i(false);
        }
        ShortsZoomSlider shortsZoomSlider = this.aG;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.c();
        }
        this.ay.B();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (!aX()) {
            aR(true);
        } else {
            aR(false);
        }
        int i = 2;
        if (zxo.e(C(), 1)) {
            int i2 = this.bl;
            if (i2 == 0) {
                this.ay.w();
            } else if (i2 == 1) {
                this.ay.x(1);
            } else if (i2 == 2) {
                this.ay.x(0);
            } else {
                throw new AssertionError(i2);
            }
            this.bl = 0;
            Bundle bundle = this.m;
            if (bundle != null) {
                bundle.putInt("START_CAMERA_SELECTION", 0);
            }
            aG();
            hej hejVar = new hej(this);
            this.bP = hejVar;
            hejVar.execute(new Void[0]);
        }
        ShortsRecordButtonView shortsRecordButtonView = this.az;
        Animator animator = shortsRecordButtonView.b;
        if (animator != null && animator.isRunning()) {
            shortsRecordButtonView.b.cancel();
        }
        shortsRecordButtonView.o = false;
        shortsRecordButtonView.m = false;
        shortsRecordButtonView.p = false;
        shortsRecordButtonView.j.setCornerRadius(shortsRecordButtonView.e);
        shortsRecordButtonView.g.setScaleX(1.0f);
        shortsRecordButtonView.g.setScaleY(1.0f);
        shortsRecordButtonView.g.setTranslationX(0.0f);
        shortsRecordButtonView.g.setTranslationY(0.0f);
        shortsRecordButtonView.h.setScaleX(1.0f);
        shortsRecordButtonView.h.setScaleY(1.0f);
        shortsRecordButtonView.h.setTranslationX(0.0f);
        shortsRecordButtonView.h.setTranslationY(0.0f);
        shortsRecordButtonView.d(shortsRecordButtonView.c, shortsRecordButtonView.k);
        if (this.ck == null) {
            this.ck = new heg(this);
        }
        heg hegVar = this.ck;
        jqr jqrVar = this.bi;
        ShortsRecordButtonView shortsRecordButtonView2 = this.az;
        autm autmVar = this.ag.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        hfa hfaVar = new hfa(hegVar, jqrVar, shortsRecordButtonView2, autmVar.d, null, null);
        this.aI = hfaVar;
        this.az.setOnTouchListener(hfaVar.a);
        this.aI.d = true;
        ShortsZoomSlider shortsZoomSlider = this.aG;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.d(zev.e(qR()));
        }
        hfp hfpVar = this.bg;
        acsx acsxVar = hfpVar.b;
        if (acsxVar != null) {
            acsxVar.c("aft");
            hfpVar.b = null;
            hfpVar.e = null;
        }
        this.ay.postDelayed(new hdx(this, i), 1000L);
    }

    public final void aF() {
        anhy O;
        hda hdaVar = this.bN;
        if (hdaVar != null) {
            aok aokVar = hdaVar.b;
            String str = hdaVar.m;
            vgz vgzVar = hdaVar.q;
            int i = 0;
            if (ammx.e(str) || "COLLAPSED_MODE_DO_NOT_PERSIST_LABELS".equals(str)) {
                O = anaf.O(false);
            } else if ("COLLAPSED_MODE_PERSIST_LABELS_3X".equals(str)) {
                O = anfq.h(anfq.h(vgzVar.a(), gbr.n, angq.a), gbr.m, angq.a);
            } else {
                O = anaf.O(false);
            }
            ynm.n(aokVar, O, ept.k, new hcx(hdaVar, i));
        }
    }

    public final void aG() {
        hej hejVar = this.bP;
        if (hejVar == null || hejVar.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.bP.cancel(true);
        this.bP = null;
    }

    public final void aH() {
        if (this.aZ.I()) {
            return;
        }
        how howVar = this.aw;
        if (howVar == null || !howVar.D()) {
            this.ai.e();
            aZ().b(false);
        } else {
            this.aZ.G();
        }
    }

    public final void aI() {
        bd();
        this.aM.setVisibility(4);
    }

    public final void aJ() {
        this.aM.setEnabled(false);
        fhe.J(this.bo);
        this.ax.b(false);
    }

    public final void aK() {
        ShortsZoomSlider shortsZoomSlider = this.aG;
        int i = 0;
        View[] viewArr = shortsZoomSlider != null ? new View[]{this.bH, this.bG, shortsZoomSlider, this.bC, this.az, this.aK, this.bD} : new View[]{this.bH, this.bG, this.bC, this.az, this.aK, this.bD};
        if (Build.VERSION.SDK_INT < 22) {
            return;
        }
        int length = viewArr.length;
        View view = null;
        while (i < length) {
            View view2 = viewArr[i];
            if (view != null) {
                int id = view.getId();
                if (id != -1) {
                    view2.setAccessibilityTraversalAfter(id);
                } else {
                    throw new IllegalStateException("Cannot specify traversal order for views without ids");
                }
            }
            i++;
            view = view2;
        }
    }

    public final void aL() {
        this.bi.b(acsb.b(96639)).a();
        this.aS = false;
        this.ax.c = false;
    }

    public final void aM(String str) {
        how howVar = this.aw;
        if (howVar != null) {
            howVar.p();
            this.bd = str;
        }
    }

    public final void aN(int i) {
        how howVar = this.aw;
        if (howVar != null) {
            synchronized (howVar.b) {
                howVar.i = i;
                howVar.A();
                howVar.z();
            }
        }
    }

    @Override // defpackage.zmu
    public final void aO(zog zogVar, int i) {
        ShortsZoomSlider shortsZoomSlider = this.aG;
        if (shortsZoomSlider != null) {
            shortsZoomSlider.e(false);
        }
        if (i == 0) {
            if (this.aW) {
                this.aj.b();
            }
            wcy.S(this.az, R.string.shorts_a11y_recording_ended);
            try {
            } catch (IllegalStateException e) {
                afsi.c(2, 6, "[ShortsCreation][Android][Camera]Could not commit segment", e);
                bc();
            }
            if (zogVar != null) {
                how howVar = this.aw;
                if (howVar != null) {
                    if (howVar.m() != null) {
                        how howVar2 = this.aw;
                        aone createBuilder = avwj.a.createBuilder();
                        aone createBuilder2 = avwm.a.createBuilder();
                        float f = zogVar.d;
                        createBuilder2.copyOnWrite();
                        avwm avwmVar = (avwm) createBuilder2.instance;
                        avwmVar.b |= 1;
                        avwmVar.c = f;
                        createBuilder.copyOnWrite();
                        avwj avwjVar = (avwj) createBuilder.instance;
                        avwm avwmVar2 = (avwm) createBuilder2.build();
                        avwmVar2.getClass();
                        avwjVar.c = avwmVar2;
                        avwjVar.b |= 1;
                        if (this.aF != -1) {
                            aone createBuilder3 = avwk.a.createBuilder();
                            aoms b = aoqx.b(this.aF);
                            createBuilder3.copyOnWrite();
                            avwk avwkVar = (avwk) createBuilder3.instance;
                            b.getClass();
                            avwkVar.c = b;
                            avwkVar.b |= 1;
                            createBuilder.copyOnWrite();
                            avwj avwjVar2 = (avwj) createBuilder.instance;
                            avwk avwkVar2 = (avwk) createBuilder3.build();
                            avwkVar2.getClass();
                            avwjVar2.d = avwkVar2;
                            avwjVar2.b |= 2;
                        }
                        boolean z = this.bX;
                        createBuilder.copyOnWrite();
                        avwj avwjVar3 = (avwj) createBuilder.instance;
                        avwjVar3.b |= 4;
                        avwjVar3.e = z;
                        int i2 = zogVar.e;
                        createBuilder.copyOnWrite();
                        avwj avwjVar4 = (avwj) createBuilder.instance;
                        avwjVar4.f = i2 - 1;
                        avwjVar4.b |= 16;
                        howVar2.t(zogVar, (avwj) createBuilder.build(), fkc.v(this.bm.g(), this.bZ), this.aU);
                        this.az.f();
                        this.aI.c = false;
                        if (this.ap.c()) {
                            aV();
                            return;
                        } else {
                            bb(true);
                            return;
                        }
                    }
                    throw new IllegalStateException("Capture completed with no pending segment");
                }
                throw new IllegalStateException("Capture completed with null Project State");
            }
            throw new IllegalStateException("Capture completed with null VideoMetadata");
        }
        bc();
    }

    public final void aP() {
        be();
        this.aM.setVisibility(0);
    }

    public final void aQ(int i) {
        this.aA.e(i);
        this.aE.n.setMax(i);
        this.ap.c = i;
        EditorButtonView editorButtonView = this.bq;
        if (editorButtonView != null) {
            if (i == this.b) {
                editorButtonView.a(R.drawable.ic_15s);
                this.bq.setContentDescription(this.av.getString(R.string.shorts_a11y_record_15s));
            } else if (i == this.d) {
                editorButtonView.a(R.drawable.ic_60s);
                this.bq.setContentDescription(this.av.getString(R.string.shorts_a11y_record_60s));
            }
        }
        aW();
    }

    public final void aR(boolean z) {
        if (at()) {
            if (z) {
                this.ba.setVisibility(0);
                hfq a2 = this.bi.a(acsb.c(107535));
                a2.h(true);
                a2.a();
                bd();
                return;
            }
            this.ba.setVisibility(8);
            be();
        }
    }

    public final void aS(final int i, boolean z) {
        if (this.ay.H() && this.bf == 0 && this.aT == -1) {
            if (!this.ap.c()) {
                bb(true);
                return;
            }
            if (!wcy.U()) {
                wcy.T(C(), R.string.reel_camera_no_external_storage);
                return;
            }
            if (wcy.O() < 5242880) {
                wcy.T(C(), R.string.reel_camera_out_of_space);
                return;
            }
            ShortsRecordButtonView shortsRecordButtonView = this.az;
            boolean z2 = false;
            shortsRecordButtonView.n = false;
            shortsRecordButtonView.o = false;
            shortsRecordButtonView.m = false;
            Animator animator = shortsRecordButtonView.b;
            if (animator != null && animator.isRunning()) {
                shortsRecordButtonView.b.end();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shortsRecordButtonView.h, "scaleX", 1.0f, 1.1412036f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shortsRecordButtonView.h, "scaleY", 1.0f, 1.1412036f);
            ofFloat2.setDuration(100L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shortsRecordButtonView.g, "scaleX", 1.0f, 0.9f);
            ofFloat3.setDuration(100L);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(shortsRecordButtonView.g, "scaleY", 1.0f, 0.9f);
            ofFloat4.setDuration(100L);
            ofFloat4.setInterpolator(new LinearInterpolator());
            ofFloat2.addUpdateListener(new hww(shortsRecordButtonView, shortsRecordButtonView.k, shortsRecordButtonView.l));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            shortsRecordButtonView.b = animatorSet;
            shortsRecordButtonView.b.addListener(new hwv(shortsRecordButtonView));
            shortsRecordButtonView.b.start();
            if (z) {
                this.aI.c = true;
                this.az.e();
            } else {
                this.aF = -1;
            }
            hcq hcqVar = this.aD;
            if (hcqVar != null && hcqVar.b.getVisibility() == 0 && hcqVar.b.getDrawable() != null) {
                z2 = true;
            }
            this.bX = z2;
            if (this.ay.M()) {
                this.ay.postDelayed(new Runnable() { // from class: hdy
                    @Override // java.lang.Runnable
                    public final void run() {
                        hel.this.aT(i);
                    }
                }, ((zok) this.af.get()).a());
            } else {
                aT(i);
            }
            this.bf = 1;
        }
    }

    public final void aT(int i) {
        hex a2;
        if (etx.S(this)) {
            how howVar = this.aw;
            File i2 = howVar != null ? howVar.i() : null;
            if (i2 == null) {
                wcy.T(C(), R.string.reel_camera_no_external_storage);
                return;
            }
            hei heiVar = this.e;
            if (heiVar != null) {
                ((hmc) heiVar).C().getWindow().addFlags(128);
            }
            hey heyVar = this.bt;
            if (heyVar != null && (a2 = heyVar.a()) != null) {
                CameraView cameraView = this.ay;
                float f = a2.a;
                synchronized (cameraView.h) {
                    zmv zmvVar = cameraView.g;
                    if (zmvVar == null) {
                        zga.b("Recorder not setup yet.");
                    } else {
                        zmvVar.r = f;
                    }
                }
                if (this.aW) {
                    this.aj.e(1.0f / a2.a);
                }
            }
            this.ay.A(new zmg(i2), (360 - this.bL) % 360, this.ap.b(), i, this);
        }
    }

    public final void aU(int i) {
        if (this.ay.I()) {
            this.ay.C(i);
        } else {
            this.aT = i;
        }
    }

    public final void aV() {
        EditorButtonView editorButtonView;
        this.aM.setEnabled(true);
        fhe.I(this.bo);
        this.ax.b(true);
        if (this.aX && (editorButtonView = this.bp) != null) {
            editorButtonView.setVisibility(0);
        }
        if (this.aW) {
            this.bH.setVisibility(0);
        }
        this.bf = 0;
        bf(true);
        ba().mr();
    }

    public final void aW() {
        EditorButtonView editorButtonView;
        boolean c = this.ap.c();
        this.bE.setEnabled(c);
        this.bF.setEnabled(c);
        if (this.aX && (editorButtonView = this.bp) != null) {
            editorButtonView.setEnabled(c);
        }
        this.br.setEnabled(c);
        if (this.aW) {
            this.bH.setEnabled(c);
            this.bv.setEnabled(c);
        }
        this.bu.setEnabled(c);
        if (this.aW) {
            hoz hozVar = this.ap;
            if (hozVar.d > 0) {
                this.bv.setEnabled(false);
                this.cc.e(false);
            } else {
                this.bv.setEnabled(hozVar.c >= this.b);
                this.cc.e(true);
            }
        }
        hds hdsVar = this.bb;
        boolean z = this.bc;
        int i = this.ap.d;
        int i2 = this.c;
        EditorButtonView editorButtonView2 = hdsVar.c;
        if (editorButtonView2 == null) {
            return;
        }
        if (z || i > i2) {
            editorButtonView2.setVisibility(8);
            hdsVar.d.a(acsb.c(120988)).d();
        } else {
            editorButtonView2.setVisibility(0);
            hdsVar.d.a(acsb.c(120988)).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aX() {
        return zxo.e(C(), 1) && zxo.e(C(), 2);
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return this.aV;
    }

    @Override // defpackage.acri
    protected final asht ky() {
        if (this.bY) {
            if (this.an.e == null) {
                afsi.b(1, 12, "[ShortsCreation][Android][Camera]Frontend id not available for logging");
                return this.bn;
            }
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = asil.a.createBuilder();
            aone createBuilder3 = asij.a.createBuilder();
            String str = this.an.e;
            str.getClass();
            createBuilder3.copyOnWrite();
            asij asijVar = (asij) createBuilder3.instance;
            asijVar.b = 1 | asijVar.b;
            asijVar.c = str;
            asij asijVar2 = (asij) createBuilder3.build();
            createBuilder2.copyOnWrite();
            asil asilVar = (asil) createBuilder2.instance;
            asijVar2.getClass();
            asilVar.g = asijVar2;
            asilVar.b |= 32;
            asil asilVar2 = (asil) createBuilder2.build();
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            asilVar2.getClass();
            ashtVar.B = asilVar2;
            ashtVar.c |= 262144;
            this.bn = (asht) createBuilder.build();
        }
        return this.bn;
    }

    @Override // defpackage.ce
    public final void lZ() {
        hnq hnqVar = this.cc;
        if (hnqVar != null) {
            hnqVar.d();
        }
        hmw hmwVar = this.al;
        if (hmwVar != null) {
            hmwVar.j = null;
            hmg hmgVar = hmwVar.c;
            pny pnyVar = hmwVar.e;
            pom pomVar = hmgVar.k;
            if (pomVar != null) {
                pomVar.D(pnyVar);
            }
        }
        if (this.aW) {
            this.am.q();
            hmg hmgVar2 = this.aj;
            hmgVar2.k.D(hmgVar2.b);
            pom pomVar2 = hmgVar2.k;
            pomVar2.e.G(hmgVar2.c);
            hmgVar2.k.w();
            hmgVar2.e = false;
            hmgVar2.d = false;
        }
        this.cb.qc();
        super.lZ();
    }

    @Override // defpackage.acri
    public final acra mM() {
        return this.ae;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("CURRENT_MUSIC_ID_KEY", this.bd);
        hcq hcqVar = this.aD;
        if (hcqVar != null) {
            bundle.putBoolean("ALIGN_MODE_ACTIVED_KEY", hcqVar.c);
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.bW = this.ag.l();
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.bk = bundle2.getBoolean("MIRROR_FRONT_CAMERA");
            this.bl = bundle2.getInt("START_CAMERA_SELECTION");
            this.bM = bundle2.getBoolean("SHOULD_ANIMATE_TOOLBAR_LABELS_KEY");
            byte[] byteArray = bundle2.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.aV = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
                } catch (aoob unused) {
                }
            }
        }
        hlo hloVar = this.ak;
        zsq zsqVar = this.bm;
        ztd ztdVar = (ztd) zsqVar;
        if (ztdVar.a == null && ztdVar.b == null) {
            zsqVar.i(hloVar.a);
            ztdVar.y = hloVar.g;
        }
        int a2 = this.ag.a();
        this.b = a2;
        this.c = a2 + 500;
        autm autmVar = this.ag.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        int i = autmVar.q;
        if (i <= 0) {
            i = 60000;
        }
        this.d = i;
        this.bY = this.ag.h();
        this.bi = new jqr(this.ae);
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        EditorButtonView editorButtonView;
        super.mg(layoutInflater, viewGroup, bundle);
        autm autmVar = this.ag.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        this.aW = autmVar.b;
        autm autmVar2 = this.ag.a.a().z;
        if (autmVar2 == null) {
            autmVar2 = autm.a;
        }
        this.bQ = autmVar2.e;
        autm autmVar3 = this.ag.a.a().z;
        if (autmVar3 == null) {
            autmVar3 = autm.a;
        }
        this.bU = autmVar3.l;
        autm autmVar4 = this.ag.a.a().z;
        if (autmVar4 == null) {
            autmVar4 = autm.a;
        }
        this.bT = autmVar4.p;
        this.aX = this.ag.p();
        this.bR = ((Boolean) this.ag.b.a.a.Y(axyz.a).B().aB()).booleanValue();
        this.bS = (String) this.ag.b.a.a.Y(akuo.s).B().aB();
        autm autmVar5 = this.ag.a.a().z;
        if (autmVar5 == null) {
            autmVar5 = autm.a;
        }
        this.aU = autmVar5.c;
        this.bV = ((Boolean) this.ag.b.a.a.Y(akuo.t).B().aB()).booleanValue();
        if (bundle != null) {
            this.bd = bundle.getString("CURRENT_MUSIC_ID_KEY");
        }
        ViewGroup viewGroup2 = this.bR ? (ViewGroup) layoutInflater.inflate(R.layout.shorts_camera_fragment_v4, viewGroup, false) : (ViewGroup) layoutInflater.inflate(R.layout.shorts_camera_fragment_v2, viewGroup, false);
        this.av = new ContextThemeWrapper(qR(), this.ah.a() == gng.DARK ? R.style.ShortsTheme_AppCompat_FullScreen_Dark : R.style.ShortsTheme_AppCompat_FullScreen_Light);
        ci C = C();
        this.bL = wcy.N(C);
        this.aP = (CameraFocusOverlay) viewGroup2.findViewById(R.id.reel_camera_focus_overlay);
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.reel_camera_view);
        this.ay = cameraView;
        cameraView.i(ba());
        CameraView cameraView2 = this.ay;
        if (this.ce == null) {
            this.ce = new hed(this);
        }
        cameraView2.setOnTouchListener(new hwl(C, this.ce, this.ay));
        CameraView cameraView3 = this.ay;
        final int i2 = 1;
        cameraView3.s = true;
        cameraView3.r = this.bk;
        cameraView3.u(5);
        this.ay.q(this.bL);
        CameraView cameraView4 = this.ay;
        cameraView4.u = true;
        if (this.cm == null) {
            this.cm = new heg(this);
        }
        cameraView4.A = this.cm;
        CameraView cameraView5 = this.ay;
        cameraView5.n = this;
        if (this.ci == null) {
            this.ci = new heg(this);
        }
        cameraView5.y = this.ci;
        this.ay.v = this.bV;
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.camera_permissions_container);
        this.ba = frameLayout;
        this.cd = (Button) frameLayout.findViewById(R.id.camera_allow_access_button);
        View findViewById = this.ba.findViewById(R.id.shorts_camera_permissions_close_button);
        this.aN = findViewById;
        findViewById.setOnClickListener(this);
        this.bA = (TextView) viewGroup2.findViewById(R.id.swipe_effect_text_view);
        this.bB = (ShortsCameraFeatureDescriptionView) viewGroup2.findViewById(R.id.shorts_camera_feature_description_view);
        this.bo = viewGroup2.findViewById(R.id.fadeable_view_container);
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = (MultiSegmentCameraProgressIndicator) viewGroup2.findViewById(R.id.progress_indicator);
        this.aA = multiSegmentCameraProgressIndicator;
        multiSegmentCameraProgressIndicator.e(this.ap.c);
        this.az = (ShortsRecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        this.bH = viewGroup2.findViewById(R.id.shorts_camera_music_button);
        this.bI = (YouTubeTextView) viewGroup2.findViewById(R.id.camera_recording_tooltip);
        this.bJ = viewGroup2.findViewById(R.id.shorts_camera_music_button_layout);
        this.aQ = viewGroup2.findViewById(R.id.camera_scrim_overlay);
        this.aR = (ImageView) viewGroup2.findViewById(R.id.camera_align_overlay);
        this.bw = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_align_button);
        View findViewById2 = viewGroup2.findViewById(R.id.loading_spinner_container);
        this.bK = findViewById2;
        findViewById2.setOnTouchListener(gpm.a);
        this.aO = new hgh(this.bK);
        this.bG = viewGroup2.findViewById(R.id.shorts_camera_toolbar);
        this.bu = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_timer_button);
        View findViewById3 = viewGroup2.findViewById(R.id.shorts_countdown_timer_container);
        Context context = this.av;
        EditorButtonView editorButtonView2 = this.bu;
        jqr jqrVar = this.bi;
        if (this.cl == null) {
            this.cl = new heg(this);
        }
        this.aE = new hfh(context, C, editorButtonView2, findViewById3, jqrVar, this.cl, this.ap, this.aj, this.al, this.ag, this.aW, null, null);
        this.br = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_speed_button);
        this.bs = (SegmentedControl) viewGroup2.findViewById(R.id.reel_camera_speed_control);
        this.aC = (YouTubeTextView) viewGroup2.findViewById(R.id.shorts_camera_speed_text);
        hey heyVar = new hey(C, this.br, this.bs, this.bi, null);
        this.bt = heyVar;
        heyVar.c = this;
        this.ap.e = heyVar.b;
        if (this.aU) {
            hcq hcqVar = new hcq(C, this.bw, this.aR, this.as, this.ar, this.bi, !this.bR, null);
            this.aD = hcqVar;
            if (bundle != null) {
                hcqVar.a(bundle.getBoolean("ALIGN_MODE_ACTIVED_KEY"));
            }
        }
        if (this.bQ) {
            ShortsZoomSlider shortsZoomSlider = (ShortsZoomSlider) viewGroup2.findViewById(R.id.shorts_zoom_slider);
            this.aG = shortsZoomSlider;
            if (this.cj == null) {
                this.cj = new heg(this);
            }
            shortsZoomSlider.g = this.cj;
            this.aG.f = this.bi;
        }
        if (this.bU) {
            hfi hfiVar = new hfi(this.av, C.getSupportFragmentManager(), this.bi, null);
            this.ca = hfiVar;
            if (this.co == null) {
                this.co = new heg(this);
            }
            hfiVar.a = this.co;
        }
        View findViewById4 = viewGroup2.findViewById(R.id.shorts_camera_undo_button_delegate);
        this.bC = findViewById4;
        findViewById4.setOnClickListener(this);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.shorts_flip_button);
        this.bE = frameLayout2;
        this.bF = ((EditorButtonView) frameLayout2).b;
        this.aJ = new hfj(C, this.ay, frameLayout2, this.ae, this.bn);
        this.aK = viewGroup2.findViewById(R.id.reel_camera_gallery_button_delegate);
        this.aL = (ImageView) viewGroup2.findViewById(R.id.reel_camera_gallery_button);
        this.bD = viewGroup2.findViewById(R.id.shorts_camera_next_button_delegate);
        this.aH = viewGroup2.findViewById(R.id.shorts_camera_redo_button_delegate);
        bf(false);
        this.aK.setOnClickListener(this);
        this.bD.setOnClickListener(this);
        this.aH.setOnClickListener(this);
        this.ax = new hdt(this.aw, this.ap, this.bU, this.bi, this.bG, this.bC, this.bD, this.aK, null);
        View findViewById5 = viewGroup2.findViewById(R.id.shorts_camera_close_button);
        this.aM = findViewById5;
        findViewById5.setOnClickListener(this);
        new heh().execute(this);
        this.bO = (FrameLayout) viewGroup2.findViewById(R.id.reel_camera_view_container);
        if (this.aX || this.bT) {
            this.ay.Q();
            this.ay.s(this.bm);
            this.ay.f = this.bW;
        }
        if (this.aX) {
            this.bp = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_preset_filter_button);
            ztk k = ((ztd) this.bm).k(avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
            ChooseFilterView chooseFilterView = (ChooseFilterView) LayoutInflater.from(this.av).inflate(R.layout.choose_preset_bottom_sheet_layout, (ViewGroup) null);
            this.by = chooseFilterView;
            chooseFilterView.e(k, this);
            hsz hszVar = new hsz(this.bp, this.ae, null);
            this.bz = hszVar;
            this.by.m(hszVar);
            ChooseFilterView chooseFilterView2 = this.by;
            acra acraVar = this.ae;
            chooseFilterView2.l(acraVar, new zxn(acraVar));
            final ShortsPresetTracker shortsPresetTracker = new ShortsPresetTracker(this, k, this.bh);
            this.X.b(shortsPresetTracker);
            k.b(new zte() { // from class: hlc
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    ShortsPresetTracker.this.l((zor) obj);
                }
            });
            k.a(new zsn() { // from class: hlb
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    ShortsPresetTracker.this.j((FilterMapTable$FilterDescriptor) obj);
                }
            });
            hkz hkzVar = this.aq;
            EditorButtonView editorButtonView3 = this.bp;
            CameraView cameraView6 = this.ay;
            ChooseFilterView chooseFilterView3 = this.by;
            TextView textView = this.bA;
            jqr jqrVar2 = this.bi;
            ArrayList arrayList = new ArrayList(Arrays.asList(this.bo, this.aA, this.az));
            Context context2 = this.av;
            hkzVar.f = (ShortsIntensitySliderView) LayoutInflater.from(context2).inflate(R.layout.shorts_intensity_slider_view, (ViewGroup) null);
            hkzVar.c(cameraView6, chooseFilterView3, textView, jqrVar2, arrayList, context2);
            hkzVar.c = editorButtonView3;
            hkzVar.d = acsb.c(96645);
            EditorButtonView editorButtonView4 = hkzVar.c;
            if (editorButtonView4 != null) {
                editorButtonView4.setOnClickListener(new hku(hkzVar));
            }
            k.a(new hkv(hkzVar, 0));
            hkzVar.k = k;
            hkzVar.i = acsb.c(122656);
            k.a(new hkv(hkzVar, i2));
            this.bx = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_green_screen_button);
            this.bZ = new hkq();
            CamcorderProfile h = this.ay.h(true);
            if (h != null) {
                this.aY = new het(new ArrayList(Arrays.asList(this.bo, this.aA, this.az)), this.bx, Math.min(h.videoFrameWidth, h.videoFrameHeight), Math.max(h.videoFrameWidth, h.videoFrameHeight), this.bi, !this.bR, this.av, C, this.bZ, this.as, this.ar, null);
                final hkq hkqVar = this.bZ;
                vgz vgzVar = this.bh;
                hkqVar.b("");
                k.a(new zsn() { // from class: hkm
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        hkq hkqVar2 = hkq.this;
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
                        if (filterMapTable$FilterDescriptor == null) {
                            return;
                        }
                        hkqVar2.f = filterMapTable$FilterDescriptor;
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = hkqVar2.f;
                        if (filterMapTable$FilterDescriptor2.b) {
                            synchronized (filterMapTable$FilterDescriptor2.e) {
                                filterMapTable$FilterDescriptor2.e.add(hkqVar2);
                            }
                            return;
                        }
                        hkqVar2.a();
                    }
                });
                hkqVar.j = vgzVar;
                vgz vgzVar2 = hkqVar.j;
                if (vgzVar2 != null) {
                    ynm.n(C, vgzVar2.a(), ept.q, new zfi() { // from class: hkl
                        @Override // defpackage.zfi
                        public final void a(Object obj) {
                            hkq hkqVar2 = hkq.this;
                            idr idrVar = (idr) obj;
                            if (idrVar != null) {
                                hkqVar2.b = idrVar.q;
                                hkqVar2.i = true;
                                hkqVar2.h();
                                hkqVar2.c();
                                hko hkoVar = hkqVar2.h;
                                if (hkoVar != null) {
                                    hkoVar.a(hkqVar2.b);
                                }
                            }
                        }
                    });
                }
                het hetVar = this.aY;
                if (this.cn == null) {
                    this.cn = new heg(this);
                }
                hetVar.t = this.cn;
            }
            EditorButtonView editorButtonView5 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_retouch_button);
            EditorButtonView editorButtonView6 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_top_relight_button);
            EditorButtonView editorButtonView7 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_bottom_relight_button);
            EditorButtonView editorButtonView8 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_top_flash_button);
            EditorButtonView editorButtonView9 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_bottom_flash_button);
            if (editorButtonView6 != null && editorButtonView7 != null && editorButtonView5 != null) {
                hkt hktVar = new hkt(editorButtonView5, editorButtonView6, editorButtonView7, editorButtonView8, editorButtonView9, this.bB, this.ay, this.av, C, this.bZ, this.bi, null);
                hktVar.g.p(hktVar);
                hktVar.k = 1 == hktVar.g.g();
                hktVar.c();
                hktVar.b();
            }
        }
        hrq hrqVar = this.an;
        String str = hrqVar.e;
        if (str != null) {
            if (hrqVar.f) {
                hrqVar.d.y(str, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_CAMERA);
            } else {
                hrqVar.c.d(str, null, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_CAMERA);
            }
        }
        hfq a2 = this.bi.a(acsb.c(99211));
        a2.h(true);
        a2.a();
        hfq a3 = this.bi.a(acsb.c(96642));
        a3.j(this.bC);
        a3.a();
        hfq a4 = this.bi.a(acsb.c(96650));
        a4.j(this.aH);
        a4.a();
        boolean z = this.bD.getVisibility() == 0;
        hfq a5 = this.bi.a(acsb.c(96644));
        a5.h(z && this.bD.isEnabled());
        a5.a();
        hfq a6 = this.bi.a(acsb.c(98531));
        a6.h(z && !this.bD.isEnabled());
        a6.a();
        hfq a7 = this.bi.a(acsb.c(96652));
        a7.h(!z);
        a7.a();
        hfq a8 = this.bi.a(acsb.c(96643));
        a8.h(true);
        a8.a();
        this.bi.a(acsb.c(96640)).a();
        hfq a9 = this.bi.a(acsb.c(96638));
        a9.h(true);
        a9.a();
        this.bi.a(acsb.c(22156)).a();
        this.bi.a(acsb.c(98571)).a();
        if (this.aW) {
            hfq a10 = this.bi.a(acsb.c(96651));
            a10.h(true);
            a10.a();
            this.bi.a(acsb.c(115550)).a();
            this.bi.a(acsb.c(115549)).a();
        }
        if (this.aX) {
            hfq a11 = this.bi.a(acsb.c(96646));
            a11.h(true);
            a11.a();
        }
        this.bi.a(acsb.c(115552)).a();
        this.bi.a(acsb.c(115551)).a();
        if (this.bQ) {
            this.bi.a(ShortsZoomSlider.a()).a();
        }
        this.bi.a(acsb.c(120988)).a();
        this.bi.a(acsb.c(115119)).a();
        if (this.bU) {
            hfq a12 = this.bi.a(acsb.c(121257));
            a12.h(true);
            a12.a();
        }
        if (!this.bR) {
            hfq a13 = this.bi.a(acsb.c(96641));
            a13.h(this.ay.J());
            a13.a();
            hfq a14 = this.bi.a(acsb.c(96648));
            a14.h(true);
            a14.a();
            hfq a15 = this.bi.a(acsb.c(96647));
            a15.h(true);
            a15.a();
            if (this.aX) {
                hfq a16 = this.bi.a(acsb.c(96645));
                a16.h(true);
                a16.a();
                hfq a17 = this.bi.a(acsb.c(127070));
                a17.j(this.bx);
                a17.a();
                this.bi.a(acsb.c(126353)).a();
                this.bi.a(acsb.c(126352)).a();
            }
            if (this.aW) {
                this.bi.a(acsb.c(107611)).a();
            }
            if (this.aU) {
                hfq a18 = this.bi.a(acsb.c(96649));
                a18.j(this.bw);
                a18.a();
            }
        }
        this.aS = true;
        this.ax.c = true;
        this.bq = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_duration_button);
        this.bb = new hds(this.av, this.bI, this.bq, this.bi, null);
        hmi hmiVar = this.ag.g() ? this.au : this.aj;
        if (this.aW) {
            EditorButtonView editorButtonView10 = (EditorButtonView) viewGroup2.findViewById(R.id.shorts_camera_trim_music_button);
            this.bv = editorButtonView10;
            hoj hojVar = this.am;
            long j = this.b;
            if (this.cf == null) {
                this.cf = new hee(this);
            }
            hojVar.w(editorButtonView10, j, j, this.cf, this.bi, acsb.c(107611), false, hmiVar, this.ag.g() ? this.au : this.at, this.aV);
            this.al.f();
            this.al.j = new heg(this);
            hnq b = this.bj.b(this.bH, this.ae, acsb.c(96651), true);
            this.cc = b;
            b.a();
            this.cc.e(true);
            final int i3 = 0;
            this.cb.d(this.al.b().ax(new ayrs(this) { // from class: hdw
                public final /* synthetic */ hel a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    hcq hcqVar2;
                    if (i3 == 0) {
                        hel helVar = this.a;
                        ammv ammvVar = (ammv) obj;
                        if (ammvVar.h()) {
                            String k2 = ((ShortsCreationSelectedTrack) ammvVar.c()).k();
                            if (!k2.equals(helVar.bd)) {
                                helVar.aM(k2);
                            }
                            helVar.bc = true;
                            helVar.ai.b().r((ShortsCreationSelectedTrack) ammvVar.c());
                            if (((ShortsCreationSelectedTrack) ammvVar.c()).d().h()) {
                                int min = Math.min(((Long) ((ShortsCreationSelectedTrack) ammvVar.c()).d().c()).intValue(), helVar.b);
                                final hds hdsVar = helVar.bb;
                                if (min < helVar.ap.c) {
                                    long seconds = TimeUnit.MILLISECONDS.toSeconds(min);
                                    hdsVar.d.a(acsb.c(115119)).e();
                                    hdsVar.b.animate().cancel();
                                    final float dimension = hdsVar.a.getResources().getDimension(R.dimen.shorts_camera_recording_tooltip_margin_top);
                                    hdsVar.b.setText(hdsVar.a.getResources().getString(R.string.shorts_recording_tooltip_time_x, Integer.valueOf((int) seconds)));
                                    hdsVar.b.setTranslationY(-dimension);
                                    hdsVar.b.setAlpha(0.0f);
                                    hdsVar.b.setVisibility(0);
                                    hdsVar.b.animate().translationY(0.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: hdp
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            hds.this.b.animate().translationY(-dimension).setStartDelay(5000L).setDuration(500L).start();
                                        }
                                    }).start();
                                    hdsVar.b.animate().alpha(1.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: hdo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            hds.this.b.animate().alpha(0.0f).setStartDelay(5000L).setDuration(500L).start();
                                        }
                                    }).start();
                                }
                                helVar.aN(min);
                                return;
                            }
                            return;
                        }
                        helVar.aM(null);
                        helVar.bc = false;
                        helVar.ai.b().y();
                        helVar.aN(helVar.b);
                        return;
                    }
                    hel helVar2 = this.a;
                    how howVar = (how) ((hpa) obj);
                    howVar.getClass();
                    if (amkq.b(howVar, helVar2.aw)) {
                        return;
                    }
                    if (helVar2.aU && (hcqVar2 = helVar2.aD) != null) {
                        hcqVar2.a.setOnClickListener(hcqVar2);
                        hcqVar2.d = howVar;
                        hcqVar2.d(true);
                    }
                    helVar2.aw = howVar;
                    if (helVar2.aA != null) {
                        if (helVar2.be == null) {
                            helVar2.be = new heb(helVar2);
                        }
                        howVar.g = new WeakReference(helVar2.be);
                        howVar.B();
                        howVar.A();
                    }
                    hdt hdtVar = helVar2.ax;
                    if (hdtVar != null) {
                        hdtVar.b = howVar;
                    }
                    het hetVar2 = helVar2.aY;
                    if (hetVar2 != null) {
                        hetVar2.p = howVar;
                    }
                    hpa b2 = helVar2.ai.b();
                    if (helVar2.aW && b2 != null && b2.c().h()) {
                        helVar2.al.m((axet) b2.c().c());
                    }
                }
            }));
        }
        this.bq.setOnClickListener(this);
        this.aB = (YouTubeTextView) viewGroup2.findViewById(R.id.shorts_camera_duration_text);
        aQ(this.ap.c);
        this.cb.d(this.ai.c().L(gsv.d).ax(new ayrs(this) { // from class: hdw
            public final /* synthetic */ hel a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hcq hcqVar2;
                if (i2 == 0) {
                    hel helVar = this.a;
                    ammv ammvVar = (ammv) obj;
                    if (ammvVar.h()) {
                        String k2 = ((ShortsCreationSelectedTrack) ammvVar.c()).k();
                        if (!k2.equals(helVar.bd)) {
                            helVar.aM(k2);
                        }
                        helVar.bc = true;
                        helVar.ai.b().r((ShortsCreationSelectedTrack) ammvVar.c());
                        if (((ShortsCreationSelectedTrack) ammvVar.c()).d().h()) {
                            int min = Math.min(((Long) ((ShortsCreationSelectedTrack) ammvVar.c()).d().c()).intValue(), helVar.b);
                            final hds hdsVar = helVar.bb;
                            if (min < helVar.ap.c) {
                                long seconds = TimeUnit.MILLISECONDS.toSeconds(min);
                                hdsVar.d.a(acsb.c(115119)).e();
                                hdsVar.b.animate().cancel();
                                final float dimension = hdsVar.a.getResources().getDimension(R.dimen.shorts_camera_recording_tooltip_margin_top);
                                hdsVar.b.setText(hdsVar.a.getResources().getString(R.string.shorts_recording_tooltip_time_x, Integer.valueOf((int) seconds)));
                                hdsVar.b.setTranslationY(-dimension);
                                hdsVar.b.setAlpha(0.0f);
                                hdsVar.b.setVisibility(0);
                                hdsVar.b.animate().translationY(0.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: hdp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hds.this.b.animate().translationY(-dimension).setStartDelay(5000L).setDuration(500L).start();
                                    }
                                }).start();
                                hdsVar.b.animate().alpha(1.0f).setStartDelay(0L).setDuration(500L).withEndAction(new Runnable() { // from class: hdo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hds.this.b.animate().alpha(0.0f).setStartDelay(5000L).setDuration(500L).start();
                                    }
                                }).start();
                            }
                            helVar.aN(min);
                            return;
                        }
                        return;
                    }
                    helVar.aM(null);
                    helVar.bc = false;
                    helVar.ai.b().y();
                    helVar.aN(helVar.b);
                    return;
                }
                hel helVar2 = this.a;
                how howVar = (how) ((hpa) obj);
                howVar.getClass();
                if (amkq.b(howVar, helVar2.aw)) {
                    return;
                }
                if (helVar2.aU && (hcqVar2 = helVar2.aD) != null) {
                    hcqVar2.a.setOnClickListener(hcqVar2);
                    hcqVar2.d = howVar;
                    hcqVar2.d(true);
                }
                helVar2.aw = howVar;
                if (helVar2.aA != null) {
                    if (helVar2.be == null) {
                        helVar2.be = new heb(helVar2);
                    }
                    howVar.g = new WeakReference(helVar2.be);
                    howVar.B();
                    howVar.A();
                }
                hdt hdtVar = helVar2.ax;
                if (hdtVar != null) {
                    hdtVar.b = howVar;
                }
                het hetVar2 = helVar2.aY;
                if (hetVar2 != null) {
                    hetVar2.p = howVar;
                }
                hpa b2 = helVar2.ai.b();
                if (helVar2.aW && b2 != null && b2.c().h()) {
                    helVar2.al.m((axet) b2.c().c());
                }
            }
        }));
        wcy.R(this.bO);
        if (!this.aX || (editorButtonView = this.bp) == null) {
            i = 0;
        } else {
            i = 0;
            editorButtonView.setVisibility(0);
        }
        this.br.setVisibility(i);
        if (this.aW) {
            this.bH.setVisibility(i);
        }
        this.bu.setVisibility(i);
        this.aZ = new hgb(this.av, mN(), aZ(), R.drawable.yt_outline_trash_can_black_24, R.string.shorts_camera_close_confirmation_reshoot, R.drawable.yt_outline_arrow_in_black_24, R.string.shorts_camera_close_confirmation_exit);
        this.cd.setOnClickListener(new View.OnClickListener() { // from class: hdv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = hel.this.e;
                hmc hmcVar = (hmc) obj;
                hdx hdxVar = new hdx(hmcVar.p(), 4);
                acra q = hmcVar.q();
                zxo a19 = zxo.a((ce) obj, hmc.b);
                a19.a = q;
                a19.b = acsb.c(107535);
                a19.c = hdxVar;
                a19.d = new hlx(hmcVar, q, 1);
                a19.c();
                hmcVar.as = a19;
            }
        });
        this.aM.sendAccessibilityEvent(8);
        aK();
        hek hekVar = new hek(this, viewGroup2);
        hekVar.a.setAccessibilityDelegate(hekVar);
        if (this.bR) {
            this.bN = new hda(this, this.bi, this.bh, this.bS, this.bG, new View[]{this.aM, this.aK, this.bD, this.bC, this.aH, this.az, this.bq, this.bJ, this.bs}, null);
            if (this.bM) {
                aF();
            }
        }
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.aN || this.ba.getVisibility() != 0) {
            if (view == this.aM || view == this.aN) {
                this.bi.a(acsb.c(96638)).b();
                aH();
                return;
            }
            if (view == this.aK) {
                hfi hfiVar = this.ca;
                if (hfiVar != null) {
                    hfiVar.G();
                    this.bi.a(acsb.c(121257)).b();
                    return;
                }
                hei heiVar = this.e;
                if (heiVar != null) {
                    hmc hmcVar = (hmc) heiVar;
                    hmcVar.aM(jqr.c(hmcVar.q(), hmcVar.ao, 96652));
                    return;
                }
                return;
            }
            if (view == this.bC) {
                this.bi.a(acsb.c(96642)).b();
                final View view2 = this.bC;
                if (view2 != null) {
                    final Interpolator o = jg.o(0.2f, 0.0f, 0.6f, 1.0f);
                    view2.animate().cancel();
                    view2.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).setInterpolator(o).withEndAction(new Runnable() { // from class: zzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view3 = view2;
                            view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).setInterpolator(o).start();
                        }
                    }).start();
                }
                how howVar = this.aw;
                if (howVar != null) {
                    synchronized (howVar.b) {
                        if (howVar.D()) {
                            howVar.e.push((axey) howVar.d.remove(r1.size() - 1));
                            howVar.z();
                            howVar.B();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (view == this.aH) {
                this.bi.a(acsb.c(96650)).b();
                how howVar2 = this.aw;
                if (howVar2 != null) {
                    synchronized (howVar2.b) {
                        if (howVar2.C()) {
                            howVar2.d.add((axey) howVar2.e.pop());
                            howVar2.z();
                            howVar2.B();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (view == this.bD) {
                bb(false);
                return;
            }
            if (view == this.bq) {
                this.bi.a(acsb.c(120988)).b();
                if (this.ap.c == this.b) {
                    hds.a(this.aB, this.av.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.d))), this.av);
                    aN(this.d);
                } else {
                    hds.a(this.aB, this.av.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.b))), this.av);
                    aN(this.b);
                }
            }
        }
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(96639);
    }

    @Override // defpackage.hnl
    public final hoj q() {
        return this.am;
    }
}
