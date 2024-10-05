package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.livecreation.screencast.controls.VolumeIndicatorView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acei implements ComponentCallbacks {
    private final VolumeIndicatorView A;
    private final ajjz B;
    private boolean C;
    private int D;
    public final ViewGroup a;
    public final TextureView b;
    public final ImageView c;
    public final View d;
    public final View e;
    public final Context f;
    public final WindowManager g;
    public final int h;
    public final int i;
    public final int j;
    public FrameLayout m;
    public View n;
    public boolean o;
    public aceg p;
    public String q;
    public int r;
    public aceh s;
    public accy t;
    private final Drawable w;
    private final Drawable x;
    private final Drawable y;
    private final ImageView z;
    public final Rect k = new Rect();
    public final Point l = new Point();
    public int u = 1;
    public final acea v = new acea(this);

    public acei(Context context, wdm wdmVar, ajjz ajjzVar) {
        this.f = context;
        this.B = ajjzVar;
        Resources resources = context.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.screencast_controls_max_self_view_size);
        this.i = resources.getDimensionPixelSize(R.dimen.screencast_controls_min_self_view_size);
        this.j = resources.getDimensionPixelSize(R.dimen.screencast_controls_window_padding);
        this.g = (WindowManager) context.getSystemService("window");
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.self_view_window, (ViewGroup) null);
        this.a = viewGroup;
        TextureView textureView = (TextureView) viewGroup.findViewById(R.id.camera_preview_texture);
        this.b = textureView;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.default_avatar_view);
        this.c = imageView;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.preview_container);
        this.A = (VolumeIndicatorView) viewGroup.findViewById(R.id.volume_indicator);
        this.d = viewGroup.findViewById(R.id.preview_overlay);
        this.e = viewGroup.findViewById(R.id.preview_starting_background);
        n(viewGroup2);
        n(textureView);
        this.z = (ImageView) viewGroup.findViewById(R.id.preview_outline);
        this.w = aii.a(context, R.drawable.self_view_outline_active);
        this.x = aii.a(context, R.drawable.self_view_outline_inactive);
        Drawable a = aii.a(context, R.drawable.quantum_logo_avatar_circle_blue_color_144);
        this.y = a;
        imageView.setImageDrawable(a);
        wdk a2 = wdmVar.a();
        if (a2 == null || a2.e == null) {
            return;
        }
        ajjzVar.l(ahbw.B(a2.e.e()), new acef(context.getResources(), imageView, 0));
    }

    public static final String l(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0 && TextUtils.isDigitsOnly(str) && Integer.decode(str).intValue() <= 10) {
                    return str;
                }
            }
            return null;
        } catch (CameraAccessException e) {
            Log.e("SelfViewWindow", "Could not access camera", e);
            return null;
        } catch (AssertionError e2) {
            Log.e("SelfViewWindow", "Camera2 API internal error", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.e("SelfViewWindow", "Camera2 API not available", e3);
            return null;
        } catch (SecurityException e4) {
            Log.e("SelfViewWindow", "Missing permission to access camera", e4);
            return null;
        }
    }

    private static final void n(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new acec());
    }

    public final void a() {
        this.A.setEnabled(false);
        this.A.setVisibility(8);
        this.A.a();
    }

    public final void b() {
        if (acdy.n(this.u) && this.u != 3) {
            this.s.a();
            g(false);
            boolean z = this.C;
            this.A.setVisibility(0);
            this.A.setEnabled(true);
            VolumeIndicatorView volumeIndicatorView = this.A;
            volumeIndicatorView.a();
            volumeIndicatorView.a.post(volumeIndicatorView.h);
            if (z) {
                this.A.c();
            } else {
                this.A.d();
            }
            this.d.setVisibility(8);
            i();
            this.u = 3;
        }
    }

    public final void c() {
        if (acdy.n(this.u)) {
            this.A.setVisibility(8);
        }
    }

    public final void d() {
        accy accyVar = this.t;
        if (accyVar != null) {
            accyVar.l();
            this.t.b();
            this.t = null;
        }
        this.s = null;
        this.u = 1;
        this.D = 0;
        FrameLayout frameLayout = this.m;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        this.g.removeView(this.m);
    }

    public final void e(boolean z, Runnable runnable) {
        if (this.o == z) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (this.t.k.availablePermits() != 0) {
            this.o = z;
            if (z) {
                if (k() && !this.b.isShown()) {
                    this.c.setVisibility(8);
                    this.e.setVisibility(0);
                    accy accyVar = this.t;
                    if (accyVar != null && accyVar.k(this.v)) {
                        this.t.h();
                    }
                }
            } else if (k()) {
                accy accyVar2 = this.t;
                if (accyVar2 != null) {
                    amkq.F(accyVar2.f, "Camera preview helper must be initialized");
                    if (accyVar2.j) {
                        accyVar2.d.a();
                        accyVar2.c.disable();
                        accyVar2.j = false;
                        CameraCaptureSession cameraCaptureSession = accyVar2.i;
                        if (cameraCaptureSession != null) {
                            try {
                                cameraCaptureSession.stopRepeating();
                            } catch (Exception e) {
                                Log.e("CameraPreviewCtrl", "Could not disable camera preview capture session", e);
                                acea aceaVar = accyVar2.l;
                                if (aceaVar != null) {
                                    aceaVar.a(e);
                                }
                            }
                        }
                    }
                    this.t.b();
                    this.t.l();
                }
                this.e.setVisibility(8);
                this.b.setVisibility(8);
                this.c.setVisibility(0);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void f(boolean z) {
        this.C = z;
        if (this.A.isEnabled()) {
            if (z) {
                this.A.c();
            } else {
                this.A.d();
            }
        }
    }

    public final void g(boolean z) {
        this.z.setImageDrawable(z ? this.w : this.x);
    }

    public final void h(int i) {
        if (i == this.D) {
            return;
        }
        this.D = i;
        j();
        m();
    }

    public final void i() {
        if (acdy.n(this.u)) {
            this.A.setVisibility(0);
        }
    }

    public final void j() {
        int i = this.D + this.j;
        this.l.set(yjk.N(this.f) - i, yjk.L(this.f) - i);
    }

    public final boolean k() {
        return (this.q == null || this.t == null) ? false : true;
    }

    public final void m() {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i = layoutParams.x;
        int i2 = layoutParams.y;
        int i3 = layoutParams.width;
        int i4 = layoutParams.height;
        int i5 = this.l.x;
        int i6 = this.l.y;
        if ((this.r & 3) == 3 || layoutParams.x < this.j) {
            layoutParams.x = this.j;
        } else if ((this.r & 5) == 5 || layoutParams.x > i5) {
            layoutParams.x = i5;
        }
        if ((this.r & 80) == 80 || layoutParams.y < this.j) {
            layoutParams.y = this.j;
        } else if ((this.r & 48) == 48 || layoutParams.y > i6) {
            layoutParams.y = i6;
        }
        layoutParams.width = this.D;
        layoutParams.height = this.D;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) this.a.getLayoutParams();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null && frameLayout.getParent() != null) {
            WindowManager.LayoutParams layoutParams3 = (WindowManager.LayoutParams) this.m.getLayoutParams();
            int i7 = layoutParams3.x;
            int i8 = layoutParams3.y;
            int i9 = layoutParams3.width;
            int i10 = layoutParams3.height;
            layoutParams3.x = layoutParams2.x;
            layoutParams3.y = layoutParams2.y + layoutParams2.height;
            layoutParams3.width = layoutParams2.width;
            layoutParams3.height = layoutParams2.height;
            if (i7 != layoutParams3.x || i8 != layoutParams3.y || i9 != layoutParams3.width || i10 != layoutParams3.height) {
                this.g.updateViewLayout(this.m, layoutParams3);
            }
        }
        if (i == layoutParams.x && i2 == layoutParams.y && i3 == layoutParams.width && i4 == layoutParams.height) {
            return;
        }
        this.g.updateViewLayout(this.a, layoutParams);
        this.k.set(layoutParams.x, layoutParams.y, layoutParams.x + layoutParams.width, layoutParams.y + layoutParams.height);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        j();
        if (this.u == 1) {
            return;
        }
        aceh acehVar = this.s;
        if (acehVar != null) {
            acehVar.a();
        }
        if (this.a.getParent() != null) {
            m();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
