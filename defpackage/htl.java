package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.RecordButtonView;
import com.google.android.apps.youtube.app.extensions.reel.util.ReelPresetTracker;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htl extends hsp implements View.OnClickListener, zng, zob, hvy, znd, acqz, zmu {
    private static final zxm aC;
    int a;
    public vgz aA;
    public axze aB;
    private boolean aD;
    private int aE;
    private aqac aF;
    private CountDownTimer aG;
    private boolean aJ;
    private RecordButtonView aK;
    private View aL;
    private ImageView aM;
    private ViewGroup aN;
    private ChooseFilterView aO;
    private ChooseFilterView aP;
    private View aQ;
    private hsz aR;
    private hsz aS;
    private hsy aT;
    private ReelPresetTracker aU;
    private ImageView aV;
    private znl aW;
    private ImageView aX;
    private zoa aY;
    private View aZ;
    public hza ae;
    public zxk af;
    public boolean ah;
    public hrv ak;
    public File al;
    public CameraView am;
    public hvz an;
    public boolean ao;
    public ProgressBar ap;
    public ImageView aq;
    public int ar;
    public ImageView as;
    public FrameLayout at;
    public FrameLayout au;
    public ConstraintLayout av;
    public FrameLayout aw;
    public TextView ax;
    public zwy ay;
    public aadw az;
    public htj b;
    private View ba;
    private ImageView bb;
    private CameraFocusOverlay bc;
    private zwh bd;
    private ImageView be;
    private ObjectAnimator bf;
    private ObjectAnimator bg;
    private ObjectAnimator bh;
    private int bi;
    private htk bj;
    private apxf bk;
    public acra c;
    public aaea d;
    public axpg e;
    final ayqw ag = new ayqw();
    private final zsq aH = ztd.j();
    public float ai = 0.0f;
    public boolean aj = true;
    private boolean aI = false;
    private int bl = 0;
    private final Runnable bm = new htf(this);

    static {
        zxl zxlVar = new zxl();
        zxlVar.a = 3;
        amru u = amru.u(zwt.GALLERY, zwt.IMAGE, zwt.VIDEO, zwt.FOLDER);
        if (u != null) {
            zxlVar.b = u;
            Integer num = zxlVar.a;
            if (num == null || zxlVar.b == null) {
                StringBuilder sb = new StringBuilder();
                if (zxlVar.a == null) {
                    sb.append(" fileType");
                }
                if (zxlVar.b == null) {
                    sb.append(" albumTypeList");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            aC = new zxm(num.intValue(), zxlVar.b);
            return;
        }
        throw new NullPointerException("Null albumTypeList");
    }

    static final ChooseFilterView aV(View view) {
        return (ChooseFilterView) view.findViewById(R.id.choose_filter_view);
    }

    static final ChooseFilterView aW(View view) {
        return (ChooseFilterView) view.findViewById(R.id.choose_preset_view);
    }

    public static htl aX(int i, int i2, aqac aqacVar, zto ztoVar, zum zumVar, boolean z, apxf apxfVar) {
        if (i != 0) {
            i = 1;
        }
        amkq.F(true, "startCameraSelection must be one of @StartCameraSelection values");
        htl htlVar = new htl();
        Bundle bundle = new Bundle();
        bundle.putInt("VIDEO_TIME_LIMIT_MSECS", i2);
        bundle.putBoolean("MIRROR_FRONT_CAMERA", true);
        bundle.putInt("START_CAMERA_SELECTION", i);
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        if (aqacVar != null) {
            bundle.putByteArray("COMMENT_STICKER_RENDERER_KEY", aqacVar.toByteArray());
        }
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z);
        htlVar.aM(ztoVar);
        htlVar.aP(zumVar);
        htlVar.af(bundle);
        return htlVar;
    }

    private final void aY() {
        htk htkVar = this.bj;
        if (htkVar == null || htkVar.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.bj.cancel(true);
        this.bj = null;
    }

    private final void aZ(int i) {
        this.am.C(i);
    }

    private final void ba() {
        if (this.am.J()) {
            this.aX.setVisibility(0);
        } else {
            this.aX.setVisibility(8);
        }
    }

    private final boolean bb(avwx avwxVar) {
        ReelPresetTracker reelPresetTracker;
        return (!avwx.EFFECT_SUBPACKAGE_ID_PRESET.equals(avwxVar) || (reelPresetTracker = this.aU) == null || reelPresetTracker.e) ? false : true;
    }

    private final ViewPropertyAnimator bc(boolean z) {
        this.aZ.animate().cancel();
        return this.aZ.animate().translationY(z ? 0.0f : -qX().getDimension(R.dimen.reel_camera_time_limit_progress_bar_header_layout_height)).setDuration(250L);
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        if (this.ag.b) {
            return;
        }
        this.ag.qc();
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        if (this.am.I()) {
            aZ(1);
            htj htjVar = this.b;
            if (htjVar != null) {
                ((htu) htjVar).C().getWindow().clearFlags(128);
            }
            bc(true).start();
            this.aZ.setVisibility(0);
            this.bb.setEnabled(true);
            this.aV.setEnabled(true);
            if (!this.ah) {
                this.aq.setVisibility(0);
            }
            this.aV.setVisibility(0);
            this.aR.c();
            this.aS.c();
            this.aj = true;
            RecordButtonView recordButtonView = this.aK;
            recordButtonView.clearAnimation();
            recordButtonView.setContentDescription(recordButtonView.getResources().getString(R.string.reel_camera_start_record));
            yny.z(recordButtonView.a, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_width_v2), (int) recordButtonView.getResources().getDimension(R.dimen.reel_camera_record_button_layout_height_v2)), ViewGroup.LayoutParams.class);
            yny.z(recordButtonView.c, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height)), ViewGroup.LayoutParams.class);
            gfw.C(recordButtonView.a.getBackground(), 0);
            gfw.C(recordButtonView.c.getProgressDrawable(), 0);
            hsy hsyVar = this.aT;
            hsyVar.r = false;
            if (hsyVar.d()) {
                hsyVar.a(false);
            } else if (hsyVar.a) {
                hsyVar.e.setTranslationY(0.0f);
                hsyVar.g.setTranslationY(0.0f);
                View view = hsyVar.f;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            View view2 = hsyVar.k;
            if (view2 != null) {
                ChooseFilterView chooseFilterView = hsyVar.c;
                if (chooseFilterView != null) {
                    chooseFilterView.h(view2);
                }
                ChooseFilterView chooseFilterView2 = hsyVar.d;
                if (chooseFilterView2 != null) {
                    chooseFilterView2.h(hsyVar.k);
                }
            }
            this.bl = 0;
            ba();
            mr();
            if (this.a > 0) {
                CountDownTimer countDownTimer = this.aG;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                ProgressBar progressBar = this.ap;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
            }
        }
        this.am.B();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        int i = this.aE;
        if (i == 0) {
            this.am.w();
        } else if (i == 1) {
            this.am.x(1);
        } else if (i == 2) {
            this.am.x(0);
        } else {
            throw new AssertionError(i);
        }
        this.aE = 0;
        Bundle bundle = this.m;
        if (bundle != null) {
            bundle.putInt("START_CAMERA_SELECTION", 0);
        }
    }

    @Override // defpackage.zng
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zom aF() {
        return hwx.a(C());
    }

    final zsl aG() {
        return this.aH.g();
    }

    public final void aH(boolean z) {
        ObjectAnimator objectAnimator = this.bf;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.bf.end();
        }
        ObjectAnimator objectAnimator2 = this.bg;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.bg.end();
        }
        FrameLayout frameLayout = this.at;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = true != z ? 0.0f : 1.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, fArr).setDuration(250L);
        this.bf = duration;
        duration.addListener(new htg(this, z, 1));
        FrameLayout frameLayout2 = this.au;
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 0.0f : this.bi;
        this.bg = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr2).setDuration(250L);
        this.bf.start();
        this.bg.start();
    }

    public final void aI(RecordingInfo recordingInfo, boolean z) {
        if (recordingInfo == null || this.b == null) {
            return;
        }
        wcy.W(this.aK);
        htu htuVar = (htu) this.b;
        htuVar.C().getWindow().clearFlags(128);
        htuVar.d.a(recordingInfo, !z ? 1 : 0);
    }

    public final void aJ(Bitmap bitmap, final boolean z) {
        if (C() == null) {
            zga.l("editPhoto called after Activity destroyed.");
            return;
        }
        Bitmap w = gfw.w(bitmap);
        File file = new File(aF().a, String.valueOf(wcy.Q(System.currentTimeMillis())).concat(".jpeg"));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.toString()));
            w.compress(Bitmap.CompressFormat.JPEG, 92, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (IOException e) {
            zga.d("error writing image file", e);
            etx.T(qR(), R.string.reel_camera_error_creating_image);
        }
        zsl aG = aG();
        final RecordingInfo recordingInfo = new RecordingInfo(file.toString(), true, w.getWidth(), w.getHeight(), 5000L, true, z, z ? null : aG.b, z ? null : aG.c, bb(aG.c));
        C().runOnUiThread(new Runnable() { // from class: hte
            @Override // java.lang.Runnable
            public final void run() {
                htl.this.aI(recordingInfo, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aK() {
        if (this.bl != 1) {
            return;
        }
        this.bl = 2;
        int max = Math.max(1000, ViewConfiguration.getLongPressTimeout());
        zmv zmvVar = this.am.g;
        long c = zmvVar != null ? zmvVar.c() : 0L;
        if (this.am.I() && c >= max) {
            amkq.N(this.al != null);
            aZ(0);
        } else {
            CameraView cameraView = this.am;
            if (cameraView.m == null) {
                cameraView.m = this;
            }
            if (cameraView.I()) {
                aZ(1);
            }
        }
        aY();
        if (this.a > 0) {
            CountDownTimer countDownTimer = this.aG;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
                this.aG.cancel();
            }
            ProgressBar progressBar = this.ap;
            if (progressBar != null) {
                progressBar.setProgress(0);
            }
        }
        this.c.t();
    }

    public final void aL() {
        if (this.at.getVisibility() == 0) {
            aH(false);
            return;
        }
        if (this.aT.d()) {
            this.aT.a(false);
            return;
        }
        if (aS()) {
            aQ(false);
            this.c.u(new acqx(acsb.c(121663)), null);
            return;
        }
        htj htjVar = this.b;
        if (htjVar != null) {
            ((htu) htjVar).ar.c();
            aY();
        }
    }

    public final void aM(zto ztoVar) {
        this.aH.h(ztoVar);
    }

    public final void aN(htj htjVar) {
        this.b = htjVar;
        zwh zwhVar = this.bd;
        if (zwhVar != null) {
            zwhVar.ae = htjVar;
        }
    }

    @Override // defpackage.zmu
    public final void aO(zog zogVar, int i) {
        RecordingInfo recordingInfo;
        if (zogVar == null) {
            recordingInfo = null;
        } else {
            zsl aG = aG();
            String file = this.al.toString();
            int i2 = zogVar.a;
            int i3 = zogVar.b;
            long j = zogVar.c;
            String str = aG.b;
            avwx avwxVar = aG.c;
            recordingInfo = new RecordingInfo(file, true, i2, i3, j, false, false, str, avwxVar, bb(avwxVar));
        }
        if (i != 0) {
            File file2 = this.al;
            if (file2 != null) {
                file2.delete();
                return;
            }
            return;
        }
        aI(recordingInfo, false);
    }

    public final void aP(zum zumVar) {
        this.aH.i(zumVar);
    }

    public final void aQ(boolean z) {
        if (aT()) {
            ObjectAnimator objectAnimator = this.bh;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.bh.end();
            }
            ConstraintLayout constraintLayout = this.av;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : this.bi;
            ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) property, fArr).setDuration(250L);
            this.bh = duration;
            duration.addListener(new htg(this, z, 0));
            this.bh.start();
            return;
        }
        this.av.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aR() {
        if (this.am.H() && this.bl == 0) {
            this.c.I(3, new acqx(acsb.c(18043)), null);
            this.c.u(new acqx(acsb.c(18044)), null);
            if (!wcy.U()) {
                wcy.T(C(), R.string.reel_camera_no_external_storage);
                return;
            }
            if (wcy.O() >= 5242880) {
                if (this.am.M()) {
                    this.am.postDelayed(this.bm, ((zok) this.e.get()).a());
                } else {
                    this.bm.run();
                }
                this.bl = 1;
                return;
            }
            wcy.T(C(), R.string.reel_camera_out_of_space);
        }
    }

    public final boolean aS() {
        return this.av.getVisibility() == 0;
    }

    public final boolean aT() {
        return this.au.getVisibility() == 0 || aS();
    }

    @Override // defpackage.zng
    public final void b() {
        if (this.am.R() != null) {
            float f = r0.a / r0.b;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f2 = i;
            float f3 = i2;
            if (f >= f2 / f3) {
                i = (int) (f3 * f);
            } else {
                i2 = (int) (f2 / f);
            }
            this.am.t(i, i2);
            yny.z(this.bc, yny.y(i, i2), ViewGroup.LayoutParams.class);
        }
        if (this.bj == null) {
            htk htkVar = new htk(this);
            this.bj = htkVar;
            htkVar.execute(new Void[0]);
        }
    }

    @Override // defpackage.zob
    public final void c() {
        if (this.am.I()) {
            return;
        }
        float f = this.ai;
        if (f <= 0.0f || f >= 1.0f) {
            this.aT.b(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
        }
    }

    @Override // defpackage.zng
    public final void d() {
    }

    @Override // defpackage.zob
    public final void e(float f, float f2) {
        CameraView cameraView = this.am;
        CameraFocusOverlay cameraFocusOverlay = this.bc;
        cameraFocusOverlay.getClass();
        cameraView.k(f, f2, new zno(cameraFocusOverlay, 1));
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return this.bk;
    }

    @Override // defpackage.acri
    protected final asht ky() {
        return null;
    }

    @Override // defpackage.ce
    public final void lZ() {
        this.aW.h();
        super.lZ();
    }

    @Override // defpackage.acri
    public final acra mM() {
        return this.c;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.a = bundle2.getInt("VIDEO_TIME_LIMIT_MSECS");
            this.aD = bundle2.getBoolean("MIRROR_FRONT_CAMERA");
            this.aE = bundle2.getInt("START_CAMERA_SELECTION");
            bundle2.getBoolean("SWIPE_TO_CAMERA_ENABLED");
            byte[] byteArray = bundle2.getByteArray("COMMENT_STICKER_RENDERER_KEY");
            if (byteArray != null) {
                try {
                    this.aF = (aqac) aonm.parseFrom(aqac.a, byteArray, aomw.b());
                } catch (aoob e) {
                    zga.d("Error parsing comment sticker renderer.", e);
                }
            }
            byte[] byteArray2 = bundle2.getByteArray("navigation_endpoint");
            if (byteArray2 != null) {
                try {
                    this.bk = (apxf) aonm.parseFrom(apxf.a, byteArray2, aomw.b());
                } catch (aoob unused) {
                }
            }
        }
        asvu asvuVar = this.az.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        this.aI = asvuVar.bU;
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CountDownTimer countDownTimer;
        ImageView imageView;
        boolean z;
        axbv axbvVar;
        axbv axbvVar2;
        super.mg(layoutInflater, viewGroup, bundle);
        this.aJ = this.ak.l();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.reel_camera_fragment_v2, viewGroup, false);
        this.ar = wcy.N(C());
        this.bc = (CameraFocusOverlay) viewGroup2.findViewById(R.id.reel_camera_focus_overlay);
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.reel_camera_view);
        this.am = cameraView;
        cameraView.i(this);
        this.am.setOnTouchListener(new hwl(C(), this, this.am));
        CameraView cameraView2 = this.am;
        cameraView2.r = this.aD;
        cameraView2.u(5);
        this.am.q(this.ar);
        this.aK = (RecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        hvz hvzVar = new hvz(this, this.aK, false, false);
        this.an = hvzVar;
        this.aK.setOnTouchListener(hvzVar);
        this.aK.findViewById(R.id.reel_camera_record_button_touch_area).setContentDescription(O(R.string.reel_camera_take_photo_or_record_video_button));
        this.aL = viewGroup2.findViewById(R.id.reel_camera_effects_container);
        this.aM = (ImageView) viewGroup2.findViewById(R.id.reel_camera_presets_button);
        this.aO = aV(viewGroup2);
        if (this.aB.v()) {
            aV(viewGroup2).g = true;
            aV(viewGroup2).d();
            aW(viewGroup2).d();
        }
        this.aP = aW(viewGroup2);
        this.aV = (ImageView) viewGroup2.findViewById(R.id.reel_camera_flashlight_on_off);
        this.aW = new hta(C(), this.am, this.aV, this.c);
        this.aX = (ImageView) viewGroup2.findViewById(R.id.reel_switch_camera_button);
        this.aY = new zoa(C(), this.am, this.aX, this.c, null);
        ba();
        ProgressBar progressBar = (ProgressBar) viewGroup2.findViewById(R.id.reel_camera_circle_time_limit_progress_bar);
        this.ap = progressBar;
        if (this.a <= 0) {
            progressBar.setVisibility(8);
        }
        int i = this.a;
        if (i <= 0) {
            countDownTimer = null;
        } else {
            if (this.aG == null) {
                this.aG = new hth(this, i);
            }
            countDownTimer = this.aG;
        }
        this.aG = countDownTimer;
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.reel_camera_gallery_button);
        this.aq = imageView2;
        imageView2.setOnClickListener(this);
        this.aZ = viewGroup2.findViewById(R.id.reel_camera_header);
        this.ba = viewGroup2.findViewById(R.id.reel_camera_bottom_bar);
        ImageView imageView3 = (ImageView) viewGroup2.findViewById(R.id.reel_camera_close);
        this.bb = imageView3;
        imageView3.setOnClickListener(this);
        this.c.n(new acqx(acsb.c(18043)));
        this.c.w(new acqx(acsb.c(18043)), null);
        if (this.aX.getVisibility() == 0) {
            this.c.n(new acqx(acsb.c(18045)));
            this.c.w(new acqx(acsb.c(18045)), null);
        }
        this.c.n(new acqx(acsb.c(36852)));
        this.c.w(new acqx(acsb.c(36852)), null);
        this.c.n(new acqx(acsb.c(22156)));
        this.c.w(new acqx(acsb.c(22156)), null);
        this.c.n(new acqx(acsb.c(52926)));
        this.c.w(new acqx(acsb.c(52926)), null);
        this.c.n(new acqx(acsb.c(53010)));
        this.c.w(new acqx(acsb.c(53010)), null);
        this.c.n(new acqx(acsb.c(18044)));
        this.c.w(new acqx(acsb.c(18044)), null);
        new hti().execute(this);
        if (this.aI) {
            imageView = (ImageView) viewGroup2.findViewById(R.id.gallery_close_button);
        } else {
            imageView = (ImageView) viewGroup2.findViewById(R.id.reel_gallery_back);
        }
        this.as = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView4 = (ImageView) viewGroup2.findViewById(R.id.album_list_header_back_arrow);
        this.be = imageView4;
        imageView4.setOnClickListener(this);
        this.at = (FrameLayout) viewGroup2.findViewById(R.id.reel_gallery_header);
        this.au = (FrameLayout) viewGroup2.findViewById(R.id.reel_media_grid_fragment_container);
        this.av = (ConstraintLayout) viewGroup2.findViewById(R.id.album_list_fragment_container);
        this.aw = (FrameLayout) viewGroup2.findViewById(R.id.reel_camera_view_container);
        Display defaultDisplay = ((WindowManager) qR().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.y;
        this.bi = i2;
        this.au.setTranslationY(i2);
        this.at.setVisibility(8);
        this.au.setVisibility(8);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.comment_sticker_panel);
        this.aN = viewGroup3;
        aqac aqacVar = this.aF;
        if (aqacVar != null) {
            final hza hzaVar = this.ae;
            hyz hyzVar = new hyz() { // from class: htc
                @Override // defpackage.hyz
                public final void a(axdk axdkVar) {
                    ((htu) htl.this.b).ao = axdkVar;
                }
            };
            viewGroup3.getClass();
            hzaVar.e = viewGroup3;
            hzaVar.f = hyzVar;
            aone createBuilder = axbv.a.createBuilder();
            aqyg aqygVar = aqacVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            String obj = ajcq.b(aqygVar).toString();
            createBuilder.copyOnWrite();
            axbv axbvVar3 = (axbv) createBuilder.instance;
            obj.getClass();
            axbvVar3.b |= 2;
            axbvVar3.d = obj;
            aqyg aqygVar2 = aqacVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            if (!ammx.e(ajcq.b(aqygVar2).toString())) {
                aqyg aqygVar3 = aqacVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                String obj2 = ajcq.b(aqygVar3).toString();
                createBuilder.copyOnWrite();
                axbv axbvVar4 = (axbv) createBuilder.instance;
                obj2.getClass();
                axbvVar4.b |= 4;
                axbvVar4.e = obj2;
            } else {
                avgg avggVar = aqacVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                String uri = ahbw.B(avggVar).toString();
                createBuilder.copyOnWrite();
                axbv axbvVar5 = (axbv) createBuilder.instance;
                uri.getClass();
                axbvVar5.b |= 8;
                axbvVar5.f = uri;
                aqyg aqygVar4 = aqacVar.e;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                String obj3 = ajcq.b(aqygVar4).toString();
                createBuilder.copyOnWrite();
                axbv axbvVar6 = (axbv) createBuilder.instance;
                obj3.getClass();
                axbvVar6.b |= 4;
                axbvVar6.e = obj3;
            }
            if ((aqacVar.b & 8) != 0) {
                zpa zpaVar = hza.l;
                avww b = avww.b(aqacVar.f);
                if (b == null) {
                    b = avww.COMMENT_STICKER_SOURCE_UNKNOWN;
                }
                axbw axbwVar = (axbw) zpaVar.d(b);
                createBuilder.copyOnWrite();
                axbv axbvVar7 = (axbv) createBuilder.instance;
                axbvVar7.h = axbwVar.e;
                axbvVar7.b |= 32;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(axbx.COMMENT_NORMAL);
            arrayList.add(axbx.COMMENT_LIGHT);
            aone createBuilder2 = axbu.b.createBuilder();
            createBuilder2.copyOnWrite();
            axbu axbuVar = (axbu) createBuilder2.instance;
            aonu aonuVar = axbuVar.e;
            if (!aonuVar.c()) {
                axbuVar.e = aonm.mutableCopy(aonuVar);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                axbuVar.e.g(((axbx) it.next()).d);
            }
            axbx axbxVar = hza.a;
            createBuilder2.copyOnWrite();
            axbu axbuVar2 = (axbu) createBuilder2.instance;
            axbuVar2.d = axbxVar.d;
            axbuVar2.c |= 1;
            createBuilder.copyOnWrite();
            axbv axbvVar8 = (axbv) createBuilder.instance;
            axbu axbuVar3 = (axbu) createBuilder2.build();
            axbuVar3.getClass();
            axbvVar8.g = axbuVar3;
            axbvVar8.b |= 16;
            axdj j = axdk.j();
            aone createBuilder3 = axdi.a.createBuilder();
            createBuilder3.copyOnWrite();
            axdi axdiVar = (axdi) createBuilder3.instance;
            axbv axbvVar9 = (axbv) createBuilder.build();
            axbvVar9.getClass();
            axdiVar.d = axbvVar9;
            axdiVar.c = 4;
            j.copyOnWrite();
            ((axdk) j.instance).F((axdi) createBuilder3.build());
            hzaVar.g = (axdk) j.build();
            hzaVar.d(hza.a);
            hzaVar.i = viewGroup3.findViewById(R.id.comment_sticker_panel_warning_background);
            hzaVar.j = viewGroup3.findViewById(R.id.comment_sticker_panel_warning_text);
            ((ViewGroup) viewGroup3.findViewById(R.id.comment_sticker_container)).addView(hzaVar.h);
            hzaVar.h.setOnTouchListener(hzaVar);
            axdi i3 = hzaVar.g.i();
            if (i3.c == 4) {
                axbvVar = (axbv) i3.d;
            } else {
                axbvVar = axbv.a;
            }
            if ((axbvVar.b & 8) == 0) {
                ((ImageView) hzaVar.h.findViewById(R.id.author_avatar)).setVisibility(8);
                hzaVar.k = new View.OnLayoutChangeListener() { // from class: hyt
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                        hza hzaVar2 = hza.this;
                        if (i5 - i7 == 0 || i4 - i6 == 0) {
                            return;
                        }
                        hzaVar2.h.removeOnLayoutChangeListener(hzaVar2.k);
                        hzaVar2.e();
                    }
                };
                hzaVar.h.addOnLayoutChangeListener(hzaVar.k);
            } else {
                axdi i4 = hzaVar.g.i();
                if (i4.c == 4) {
                    axbvVar2 = (axbv) i4.d;
                } else {
                    axbvVar2 = axbv.a;
                }
                hzaVar.b.i((ImageView) hzaVar.h.findViewById(R.id.author_avatar), wbs.aj(axbvVar2.f), hzaVar.c);
            }
        }
        this.aR = new hsz(this.aL, this.c, acsb.c(10719));
        if (this.aB.v()) {
            this.aR.a = true;
        }
        this.aS = new hsz(this.aM, this.c, acsb.c(56205));
        this.aQ = viewGroup2.findViewById(R.id.effect_pending_indicator);
        this.aT = new hsy(this.aO, this.aP, this.aH, this.ba, this.aK, this.aN.findViewById(R.id.comment_sticker_container), this.aL, this.aM, this.aQ, this.c);
        aaea aaeaVar = this.d;
        arfd a = aaeaVar != null ? aaeaVar.a() : null;
        if (a != null) {
            avuj avujVar = a.h;
            if (avujVar == null) {
                avujVar = avuj.a;
            }
            if (avujVar.i && this.aL != null && this.aO != null) {
                this.am.Q();
                this.am.s(this.aH);
                this.am.f = this.aJ;
                this.aL.setOnClickListener(this);
                this.aO.e(((ztd) this.aH).k(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE), this);
                this.aO.m(this.aR);
                ImageView imageView5 = this.aM;
                if (imageView5 != null && this.aP != null) {
                    imageView5.setOnClickListener(this);
                    ztk k = ((ztd) this.aH).k(avwx.EFFECT_SUBPACKAGE_ID_PRESET);
                    this.aP.e(k, this);
                    this.aP.m(this.aS);
                    final ReelPresetTracker reelPresetTracker = new ReelPresetTracker(this, k, this.aA);
                    this.X.b(reelPresetTracker);
                    k.b(new zte() { // from class: hxu
                        @Override // defpackage.zfi
                        public final void a(Object obj4) {
                            ReelPresetTracker.this.l((zor) obj4);
                        }
                    });
                    k.a(new zsn() { // from class: hxt
                        @Override // defpackage.zfi
                        public final void a(Object obj4) {
                            ReelPresetTracker.this.j((FilterMapTable$FilterDescriptor) obj4);
                        }
                    });
                    aaea aaeaVar2 = this.d;
                    arfd a2 = aaeaVar2 != null ? aaeaVar2.a() : null;
                    if (a2 != null) {
                        avxn avxnVar = a2.s;
                        if (avxnVar == null) {
                            avxnVar = avxn.a;
                        }
                        if (avxnVar.d) {
                            z = true;
                            reelPresetTracker.h = z;
                            this.aU = reelPresetTracker;
                        }
                    }
                    z = false;
                    reelPresetTracker.h = z;
                    this.aU = reelPresetTracker;
                }
            }
        }
        wcy.R(this.aw);
        viewGroup2.findViewById(R.id.album_select_gallery_header).setVisibility(true != this.aI ? 8 : 0);
        viewGroup2.findViewById(R.id.reel_gallery_old_header).setVisibility(true != this.aI ? 0 : 8);
        if (this.aI) {
            TextView textView = (TextView) viewGroup2.findViewById(R.id.select_album_button);
            this.ax = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: htb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    htl htlVar = htl.this;
                    dd mN = htlVar.mN();
                    zxf zxfVar = (zxf) mN.f("ALBUM_LIST_FRAGMENT_TAG");
                    if (zxfVar == null) {
                        zxfVar = new zxf();
                        dn k2 = mN.k();
                        k2.q(R.id.album_list_fragment_container, zxfVar, "ALBUM_LIST_FRAGMENT_TAG");
                        k2.a();
                        mN.aa();
                        htlVar.c.n(new acqx(acsb.c(121662)));
                        htlVar.c.w(new acqx(acsb.c(121662)), null);
                        htlVar.c.n(new acqx(acsb.c(121667)));
                        htlVar.c.w(new acqx(acsb.c(121667)), null);
                        htlVar.c.n(new acqx(acsb.c(121664)));
                        htlVar.c.w(new acqx(acsb.c(121664)), null);
                        htlVar.c.n(new acqx(acsb.c(121665)));
                        htlVar.c.w(new acqx(acsb.c(121665)), null);
                        htlVar.c.n(new acqx(acsb.c(121667)));
                        htlVar.c.w(new acqx(acsb.c(121667)), null);
                    }
                    htlVar.ay = (zwy) ((RecyclerView) zxfVar.O.findViewById(R.id.album_list_recycler_view)).m;
                    htlVar.aQ(true);
                    htlVar.c.I(3, new acqx(acsb.c(121662)), null);
                    htlVar.c.u(new acqx(acsb.c(121667)), null);
                    htlVar.c.u(new acqx(acsb.c(121664)), null);
                    if (htlVar.ay.f) {
                        htlVar.c.u(new acqx(acsb.c(121665)), null);
                    }
                    if (htlVar.ay.g) {
                        htlVar.c.u(new acqx(acsb.c(121666)), null);
                    }
                }
            });
            this.ag.d(this.af.a().ax(new ayrs() { // from class: htd
                @Override // defpackage.ayrs
                public final void a(Object obj4) {
                    htl htlVar = htl.this;
                    htlVar.c.u(new acqx(acsb.c(121663)), null);
                    htlVar.ax.setText(((zwv) obj4).d);
                    htlVar.aQ(false);
                }
            }));
        }
        return viewGroup2;
    }

    @Override // defpackage.zob
    public final void mi() {
        this.aY.e();
    }

    @Override // defpackage.zob
    public final void mj(int i) {
        if (i == 4) {
            this.aT.a(this.am.I());
        }
    }

    @Override // defpackage.hvy
    public final void mk() {
        this.aj = false;
        RecordButtonView recordButtonView = this.aK;
        gfw.D(recordButtonView.a.getBackground());
        gfw.D(recordButtonView.c.getProgressDrawable());
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        yny.z(recordButtonView.c, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_height)), ViewGroup.LayoutParams.class);
        this.am.m();
        aR();
    }

    @Override // defpackage.hvy
    public final /* synthetic */ void ml() {
    }

    @Override // defpackage.hvy
    public final void mm() {
        RecordButtonView recordButtonView = this.aK;
        gfw.C(recordButtonView.a.getBackground(), 200);
        gfw.C(recordButtonView.c.getProgressDrawable(), 200);
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        yny.z(recordButtonView.a, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height)), ViewGroup.LayoutParams.class);
        yny.z(recordButtonView.c, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height)), ViewGroup.LayoutParams.class);
        aK();
    }

    @Override // defpackage.zng
    public final void mn() {
        CountDownTimer countDownTimer;
        if (this.a > 0 && (countDownTimer = this.aG) != null) {
            countDownTimer.start();
        }
        this.bb.setEnabled(false);
        this.aV.setEnabled(false);
        this.aq.setVisibility(4);
        this.aR.b();
        this.aS.b();
        this.aT.a(true);
        hsy hsyVar = this.aT;
        if (hsyVar.k != null) {
            ChooseFilterView chooseFilterView = hsyVar.c;
            if (chooseFilterView != null) {
                chooseFilterView.h(null);
            }
            ChooseFilterView chooseFilterView2 = hsyVar.d;
            if (chooseFilterView2 != null) {
                chooseFilterView2.h(null);
            }
            hsyVar.k.setVisibility(8);
        }
        this.aV.setVisibility(4);
        bc(false).start();
        RecordButtonView recordButtonView = this.aK;
        TransitionManager.beginDelayedTransition(recordButtonView.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200L)));
        yny.z(recordButtonView.a, yny.y((int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width), (int) recordButtonView.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height)), ViewGroup.LayoutParams.class);
        this.aK.setContentDescription(qX().getString(R.string.reel_camera_stop_record));
        ba();
    }

    @Override // defpackage.zob
    public final void mo(float f) {
        this.am.j(f);
    }

    @Override // defpackage.hvy
    public final /* synthetic */ void mp(float f, float f2) {
    }

    @Override // defpackage.hvy
    public final void mq(float f) {
        this.am.o(f);
    }

    @Override // defpackage.zng
    public final void mr() {
        ci C = C();
        if (C == null) {
            return;
        }
        WindowManager.LayoutParams attributes = C.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        C.getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zng
    public final void ms() {
        WindowManager.LayoutParams attributes = C().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        C().getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.bb) {
            this.c.I(3, new acqx(acsb.c(22156)), null);
            this.aT.a(false);
            aL();
            return;
        }
        if (view == this.aq) {
            if (this.aI) {
                final zxk zxkVar = this.af;
                final zxm zxmVar = aC;
                ayqx ayqxVar = zxkVar.h;
                if (ayqxVar != null && !ayqxVar.e()) {
                    ayrz.c((AtomicReference) zxkVar.h);
                }
                zxkVar.h = ayqj.C(new Callable() { // from class: zxj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zxk.this.a.c(zxmVar.a);
                    }
                }).M(azre.b(zxkVar.g)).I(azre.b(zxkVar.f)).W(new ayrs() { // from class: zxh
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        zxk zxkVar2 = zxk.this;
                        amru amruVar = zxmVar.b;
                        amru o = amru.o((List) obj);
                        zxc zxcVar = zxkVar2.b;
                        amrp f = amru.f();
                        int i = ((amvj) amruVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            final zwt zwtVar = (zwt) amruVar.get(i2);
                            if (zwtVar == zwt.FOLDER) {
                                aypy T = aypy.T(o);
                                zcz zczVar = zcz.j;
                                int i3 = aypn.a;
                                aysw.c(i3, "bufferSize");
                                azih azihVar = new azih(T, zczVar, i3);
                                ayrv ayrvVar = aynu.l;
                                List list = (List) azihVar.P(new zcz(9)).av().X();
                                Collections.sort(list, new unt(7));
                                f.j(list);
                            } else {
                                ayrw ayrwVar = (ayrw) zxc.a.get(zwtVar);
                                final String string = zxcVar.c.getResources().getString(((Integer) zxc.b.get(zwtVar)).intValue());
                                ammv ammvVar = (ammv) aypy.T(o).L(ayrwVar).av().G(new ayrv() { // from class: zwz
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        zwt zwtVar2 = zwt.this;
                                        String str = string;
                                        List list2 = (List) obj2;
                                        Map map = zxc.a;
                                        if (list2.isEmpty()) {
                                            return amlr.a;
                                        }
                                        zwu a = zwv.a();
                                        a.b(zwtVar2);
                                        a.a = ammv.j((DeviceLocalFile) list2.get(0));
                                        a.b = amlr.a;
                                        a.d(str);
                                        a.c(list2.size());
                                        return ammv.j(a.a());
                                    }
                                }).X();
                                if (ammvVar.h()) {
                                    f.h((zwv) ammvVar.c());
                                }
                            }
                        }
                        amru g = f.g();
                        zxkVar2.c.c(o);
                        zxkVar2.d.c(g);
                        if (g.isEmpty()) {
                            return;
                        }
                        zxkVar2.e.c((zwv) g.get(0));
                    }
                }, zxi.a);
            }
            dd mN = mN();
            zwh zwhVar = (zwh) mN.f("MEDIA_GRID_FRAGMENT_TAG");
            this.bd = zwhVar;
            if (zwhVar == null) {
                this.bd = zwh.s(3, true, this.aI);
                dn k = mN.k();
                k.q(R.id.reel_media_grid_fragment_container, this.bd, "MEDIA_GRID_FRAGMENT_TAG");
                k.a();
                mN.aa();
                this.c.n(new acqx(acsb.c(121663)));
                this.c.w(new acqx(acsb.c(121663)), null);
            }
            this.bd.ae = this.b;
            this.c.u(new acqx(acsb.c(121663)), null);
            aH(true);
            return;
        }
        if (view == this.as) {
            this.c.I(3, new acqx(acsb.c(121663)), null);
            aH(false);
            return;
        }
        if (view == this.be) {
            this.c.I(3, new acqx(acsb.c(121667)), null);
            this.c.u(new acqx(acsb.c(121663)), null);
            aQ(false);
            return;
        }
        View view2 = this.aL;
        if (view2 != null && view == view2) {
            ChooseFilterView chooseFilterView = this.aO;
            if (chooseFilterView == null || chooseFilterView.f) {
                this.aT.a(false);
                return;
            } else {
                this.aT.b(avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE);
                return;
            }
        }
        ImageView imageView = this.aM;
        if (imageView == null || view != imageView) {
            return;
        }
        ChooseFilterView chooseFilterView2 = this.aP;
        if (chooseFilterView2 == null || chooseFilterView2.f) {
            this.aT.a(false);
        } else {
            this.aT.b(avwx.EFFECT_SUBPACKAGE_ID_PRESET);
        }
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(36850);
    }
}
