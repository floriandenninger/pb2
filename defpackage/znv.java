package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.RotateLayout;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.youtube.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class znv extends znz implements View.OnClickListener, zng, zob, zmu {
    public static final int[] a = {0, 90, 270};
    private View aA;
    private ValueAnimator aB;
    private zol aC;
    private CameraFocusOverlay aD;
    CameraView ae;
    public FrameLayout af;
    public GalleryCameraRecordButtonView ag;
    public ImageView ah;
    public ImageView ai;
    public AnimatorSet aj;
    public long ak;
    public View al;
    public View am;
    public RotateLayout an;
    public TextView ao;
    public Handler ap;
    OrientationEventListener aq;
    public ImageView as;
    public int at;
    public zvn au;
    private znl aw;
    private zoa ax;
    private Timer ay;
    private ImageView az;
    public acsg b;
    public axpg c;
    public zao d;
    public asht e;
    private int av = 6;
    public int ar = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float aG(boolean r5, boolean r6) {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.af
            android.content.res.Resources r0 = r0.getResources()
            boolean r1 = defpackage.wcy.V(r0)
            r2 = 2131166466(0x7f070502, float:1.7947178E38)
            r3 = 0
            if (r5 != 0) goto L12
            if (r1 == 0) goto L16
        L12:
            if (r5 == 0) goto L2f
            if (r1 == 0) goto L2e
        L16:
            if (r6 == 0) goto L25
            android.view.View r5 = r4.am
            int r5 = r5.getHeight()
            int r5 = -r5
            int r6 = r0.getDimensionPixelSize(r2)
            int r3 = r5 - r6
        L25:
            android.widget.FrameLayout r5 = r4.af
            int r5 = r5.getWidth()
            int r5 = r5 + r3
        L2c:
            float r5 = (float) r5
            goto L3e
        L2e:
            r1 = 0
        L2f:
            if (r6 == 0) goto L36
            int r5 = r0.getDimensionPixelSize(r2)
            goto L2c
        L36:
            android.view.View r5 = r4.am
            int r5 = r5.getHeight()
            int r5 = -r5
            goto L2c
        L3e:
            if (r1 == 0) goto L41
            float r5 = -r5
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znv.aG(boolean, boolean):float");
    }

    private final int aH() {
        int identifier = qX().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return qX().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void aI(int i) {
        Timer timer = this.ay;
        if (timer != null) {
            timer.cancel();
            this.ay = null;
        }
        this.ap.removeCallbacksAndMessages(null);
        this.ae.C(i);
    }

    private final void aJ() {
        aL(true);
        this.ao.setText(q(0L));
        this.az.setVisibility(4);
        this.as.setEnabled(true);
        this.ah.setEnabled(true);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.ag;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_X, galleryCameraRecordButtonView.e);
        ofFloat.setDuration(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_Y, galleryCameraRecordButtonView.e);
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_X, 1.0f);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_Y, 1.0f);
        ofFloat4.setDuration(300L);
        ofFloat.addListener(new znx(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        galleryCameraRecordButtonView.f.start();
        this.ag.setContentDescription(qX().getString(R.string.upload_edit_camera_start_record));
        aK();
    }

    private final void aK() {
        if (this.ae.J()) {
            this.ai.setVisibility(0);
        } else {
            this.ai.setVisibility(8);
        }
    }

    private final void aL(boolean z) {
        int i = this.an.a;
        if (i == 90 || i == 270) {
            ValueAnimator valueAnimator = this.aB;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.al.getWidth(), o(this.al.getResources(), !z ? 1 : 0));
            this.aB = ofInt;
            ofInt.addUpdateListener(new znn(this, 0));
            this.aB.addListener(new zns(this, z));
            this.aB.setDuration(250L);
            this.aB.start();
            return;
        }
        ImageView imageView = this.as;
        int i2 = true != z ? 4 : 0;
        imageView.setVisibility(i2);
        this.ah.setVisibility(i2);
    }

    public static Property p(int i) {
        return (i == 90 || i == 270) ? View.TRANSLATION_X : View.TRANSLATION_Y;
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        if (this.ae.I()) {
            aI(1);
            aJ();
        }
        this.ae.B();
        this.aq.disable();
        zol zolVar = this.aC;
        zolVar.a.setNavigationBarColor(zolVar.b);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.ae.w();
        if (this.aq == null) {
            this.aq = new znt(this, C());
        }
        this.aq.enable();
    }

    @Override // defpackage.zng
    public final void a() {
    }

    @Override // defpackage.zmu
    public final void aO(zog zogVar, int i) {
        if (zogVar != null) {
            if (this.au == null || i != 0) {
                return;
            }
            wcy.W(this.ag);
            zvn zvnVar = this.au;
            amkq.N(zvnVar.b != null);
            amkq.N(zvnVar.a > 0);
            amkq.N(zvnVar.c != null);
            amkq.N(zvnVar.d != null);
            amkq.N(true);
            Uri uri = null;
            if (zvnVar.c.renameTo(zvnVar.d)) {
                int i2 = zogVar.a;
                int i3 = zogVar.b;
                long j = zogVar.c;
                ContentValues contentValues = new ContentValues(8);
                contentValues.put("title", zvnVar.b);
                contentValues.put("_display_name", zvnVar.d.getName());
                contentValues.put("datetaken", Long.valueOf(zvnVar.a));
                contentValues.put("date_modified", Long.valueOf(zvnVar.a / 1000));
                contentValues.put("mime_type", "video/mp4");
                contentValues.put("_data", zvnVar.d.toString());
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append("x");
                sb.append(i3);
                contentValues.put("resolution", sb.toString());
                contentValues.put("duration", Long.valueOf(j));
                try {
                    uri = zvnVar.e.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } catch (Exception e) {
                    zga.d("Failed to add video to media store.", e);
                }
            } else {
                zvnVar.a();
            }
            if (uri == null) {
                GalleryActivity galleryActivity = zvnVar.e;
                Toast.makeText(galleryActivity, galleryActivity.getResources().getString(R.string.gallery_camera_capture_error), 1).show();
            }
            if (uri != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 2);
                zvnVar.e.c(uri, 902, bundle);
            }
            zvnVar.c();
            return;
        }
        zvn zvnVar2 = this.au;
        if (zvnVar2 != null) {
            zvnVar2.a();
            zvnVar2.c();
        }
        aJ();
        Toast makeText = Toast.makeText(C(), R.string.camera_recording_time_too_short_click_to_record, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    @Override // defpackage.zng
    public final void b() {
        if (this.ae.R() != null) {
            float f = r0.a / r0.b;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int aH = displayMetrics.heightPixels + aH();
            float f2 = i;
            float f3 = aH;
            float f4 = f2 / f3;
            if (f <= f4) {
                i = (int) (f3 * f);
            } else {
                aH = (int) (f2 / f);
            }
            this.ae.t(i, aH);
            zat c = this.d.c();
            if (c.d() > 0) {
                this.af.setBackgroundColor(qX().getColor(R.color.yt_black_pure));
                this.aA.setVisibility(0);
                yny.z(this.aA, yny.n(c.d()), ViewGroup.LayoutParams.class);
                this.aC.b(qX().getColor(R.color.yt_black_pure));
                r(c);
            } else if (f <= f4) {
                this.aA.setVisibility(8);
                this.aC.b(this.af.getResources().getColor(R.color.gallery_camera_navigation_bar_semi_transparent_background));
            } else {
                this.af.setBackgroundColor(qX().getColor(R.color.yt_black_pure));
                this.aA.setVisibility(0);
                this.aC.b(qX().getColor(R.color.yt_black_pure));
            }
            yny.B(this.aD, i, aH);
        }
    }

    @Override // defpackage.zob
    public final void c() {
    }

    @Override // defpackage.zng
    public final void d() {
    }

    @Override // defpackage.zob
    public final void e(float f, float f2) {
        CameraView cameraView = this.ae;
        CameraFocusOverlay cameraFocusOverlay = this.aD;
        cameraFocusOverlay.getClass();
        cameraView.k(f, f2, new zno(cameraFocusOverlay, 0));
    }

    @Override // defpackage.ce
    public final void lZ() {
        this.aw.h();
        super.lZ();
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.av = bundle2.getInt("TARGET_VIDEO_QUALITY");
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.b.d(acsb.b(50625), null, this.e);
        Resources qX = qX();
        int aH = aH();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.gallery_camera_fragment, viewGroup, false);
        this.af = (FrameLayout) viewGroup2.findViewById(R.id.camera_layout);
        this.at = wcy.N(C());
        CameraView cameraView = (CameraView) viewGroup2.findViewById(R.id.camera_view);
        this.ae = cameraView;
        cameraView.i(this);
        this.ae.setOnTouchListener(new zoe(C(), this));
        CameraView cameraView2 = this.ae;
        cameraView2.r = false;
        cameraView2.u(this.av);
        CameraView cameraView3 = this.ae;
        int i2 = this.av;
        if (i2 == 4) {
            i = 2500000;
        } else if (i2 == 5) {
            i = 5000000;
        } else {
            if (i2 != 6) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown video quality ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            i = 8000000;
        }
        cameraView3.l = i;
        cameraView3.q(this.at);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = (GalleryCameraRecordButtonView) viewGroup2.findViewById(R.id.record_button_view);
        this.ag = galleryCameraRecordButtonView;
        galleryCameraRecordButtonView.setOnClickListener(this);
        yny.z(this.ag, yny.k(qX.getDimensionPixelSize(R.dimen.gallery_camera_record_button_bottom_padding) + aH), ViewGroup.MarginLayoutParams.class);
        this.ah = (ImageView) viewGroup2.findViewById(R.id.flashlight_on_off);
        this.aw = new znm(C(), this.ae, this.ah, this.b, this.e);
        this.ai = (ImageView) viewGroup2.findViewById(R.id.switch_camera_button);
        yny.z(this.ai, yny.k(qX.getDimensionPixelSize(R.dimen.camera_switch_camera_button_margin_bottom) + aH), ViewGroup.MarginLayoutParams.class);
        this.ax = new zoa(C(), this.ae, this.ai, this.b, this.e);
        aK();
        TextView textView = (TextView) viewGroup2.findViewById(R.id.record_duration_text);
        this.ao = textView;
        textView.setText(q(0L));
        this.ap = new znu(new WeakReference(this));
        this.al = viewGroup2.findViewById(R.id.camera_header);
        this.am = viewGroup2.findViewById(R.id.camera_header_container);
        this.an = (RotateLayout) viewGroup2.findViewById(R.id.camera_header_rotate);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.camera_close);
        this.as = imageView;
        imageView.setOnClickListener(this);
        this.aD = (CameraFocusOverlay) viewGroup2.findViewById(R.id.camera_focus_overlay);
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.record_blink_view);
        this.az = imageView2;
        ((AnimationDrawable) imageView2.getBackground()).start();
        this.aA = viewGroup2.findViewById(R.id.top_blocker);
        zol zolVar = new zol(C().getWindow(), viewGroup2);
        this.aC = zolVar;
        if (!zolVar.d || !zolVar.c) {
            zolVar.d = true;
            zolVar.c = true;
            zolVar.removeMessages(0);
            zolVar.a();
        }
        this.b.n(new acqx(acsb.c(18043)));
        this.b.w(new acqx(acsb.c(18043)), this.e);
        if (this.ai.getVisibility() == 0) {
            this.b.n(new acqx(acsb.c(18045)));
            this.b.w(new acqx(acsb.c(18045)), this.e);
        }
        this.b.n(new acqx(acsb.c(36852)));
        this.b.w(new acqx(acsb.c(36852)), this.e);
        this.b.n(new acqx(acsb.c(22156)));
        this.b.w(new acqx(acsb.c(22156)), this.e);
        this.b.n(new acqx(acsb.c(18044)));
        this.b.w(new acqx(acsb.c(18044)), this.e);
        this.d.h(this.af, 7);
        return viewGroup2;
    }

    @Override // defpackage.zob
    public final void mi() {
        this.ax.e();
    }

    @Override // defpackage.zob
    public final void mj(int i) {
    }

    @Override // defpackage.zng
    public final void mn() {
        this.ay = new Timer();
        this.ak = System.currentTimeMillis();
        this.ao.setText(q(0L));
        this.az.setVisibility(0);
        this.ay.scheduleAtFixedRate(new znq(this), 0L, 100L);
        this.as.setEnabled(false);
        this.ah.setEnabled(false);
        aL(false);
        GalleryCameraRecordButtonView galleryCameraRecordButtonView = this.ag;
        AnimatorSet animatorSet = galleryCameraRecordButtonView.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            galleryCameraRecordButtonView.f.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_X, 1.0f);
        ofFloat.setDuration(400L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.b, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_Y, 1.0f);
        ofFloat2.setDuration(400L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_X, galleryCameraRecordButtonView.d);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(galleryCameraRecordButtonView.a, (Property<ImageView, Float>) GalleryCameraRecordButtonView.SCALE_Y, galleryCameraRecordButtonView.d);
        ofFloat4.setDuration(300L);
        ofFloat.addListener(new znw(galleryCameraRecordButtonView));
        galleryCameraRecordButtonView.f = new AnimatorSet();
        galleryCameraRecordButtonView.f.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        galleryCameraRecordButtonView.f.start();
        this.ag.setContentDescription(qX().getString(R.string.upload_edit_camera_stop_record));
        aK();
    }

    @Override // defpackage.zob
    public final void mo(float f) {
        this.ae.j(f);
    }

    @Override // defpackage.zng
    public final void mr() {
        if (C() == null || C().getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = C().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        C().getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zng
    public final void ms() {
        if (C() == null || C().getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = C().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        C().getWindow().setAttributes(attributes);
    }

    public final float n(int i, boolean z) {
        if (i == 180) {
            return this.af.getHeight() + (z ? -this.am.getHeight() : 0);
        }
        if (i == 270) {
            return aG(false, z);
        }
        if (i == 90) {
            return aG(true, z);
        }
        if (z) {
            return 0.0f;
        }
        return -this.am.getHeight();
    }

    public final int o(Resources resources, int i) {
        int width;
        int width2 = this.ao.getWidth();
        if (i == 0) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_max_gap);
            width = dimensionPixelSize + dimensionPixelSize + this.as.getWidth() + this.ah.getWidth();
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.gallery_camera_header_landscape_button_min_gap);
            width = dimensionPixelSize2 + dimensionPixelSize2;
        }
        return width2 + width;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File file;
        if (view != this.ag.c) {
            if (view == this.as) {
                this.b.I(3, new acqx(acsb.c(22156)), this.e);
                zvn zvnVar = this.au;
                if (zvnVar != null) {
                    zvnVar.b();
                    return;
                }
                return;
            }
            return;
        }
        if (this.ae.I()) {
            if (this.ae.I()) {
                this.b.I(3, new acqx(acsb.c(18044)), this.e);
                aI(0);
                return;
            }
            return;
        }
        if (this.ae.H()) {
            this.b.I(3, new acqx(acsb.c(18043)), this.e);
            if (!wcy.U()) {
                wcy.T(C(), R.string.camera_no_external_storage);
                return;
            }
            if (wcy.O() < 5242880) {
                wcy.T(C(), R.string.camera_out_of_space);
                return;
            }
            zvn zvnVar2 = this.au;
            if (zvnVar2 != null) {
                zvnVar2.e.getWindow().addFlags(128);
                zvnVar2.e.d.f(new wcy());
                Context applicationContext = zvnVar2.e.getApplicationContext();
                File file2 = GalleryActivity.a(applicationContext).a;
                Uri M = wcy.M(applicationContext);
                zvnVar2.a = System.currentTimeMillis();
                zvnVar2.d = new File(M.getPath());
                amkq.N(zvnVar2.d.getName().endsWith(".mp4"));
                File file3 = zvnVar2.d;
                file3.getClass();
                String name = file3.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                }
                zvnVar2.b = name;
                if (file2 != null) {
                    String str = zvnVar2.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                    sb.append(str);
                    sb.append(".mp4.tmp");
                    file = new File(file2, sb.toString());
                } else {
                    String valueOf = String.valueOf(zvnVar2.d);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
                    sb2.append(valueOf);
                    sb2.append(".tmp");
                    file = new File(sb2.toString());
                }
                zvnVar2.c = file;
                Runnable runnable = new Runnable() { // from class: znp
                    @Override // java.lang.Runnable
                    public final void run() {
                        znv znvVar = znv.this;
                        znvVar.ag.setOnClickListener(znvVar);
                        if (znvVar.at()) {
                            CameraView cameraView = znvVar.ae;
                            zvn zvnVar3 = znvVar.au;
                            amkq.N(zvnVar3.c != null);
                            cameraView.z(new zmg(zvnVar3.c), ((znvVar.ar - znvVar.at) + 360) % 360, znvVar);
                        }
                    }
                };
                if (this.ae.M()) {
                    this.ag.setOnClickListener(null);
                    this.ae.postDelayed(runnable, ((zok) this.c.get()).a());
                } else {
                    runnable.run();
                }
            }
        }
    }

    public final String q(long j) {
        return vlu.h(C(), R.string.camera_timer_template, j);
    }

    public final void r(zat zatVar) {
        int i = this.ar;
        int i2 = 0;
        if ((i == 0 || i == 180) && zatVar.d() > 0) {
            i2 = zatVar.d();
        }
        yny.z(this.an, yny.v(i2), ViewGroup.MarginLayoutParams.class);
    }
}
