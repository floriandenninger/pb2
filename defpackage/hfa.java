package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfa implements hvy {
    public final hvz a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final View e;
    private final boolean f;
    private final int g;
    private final int h;
    private final Runnable i;
    private final Handler j = new Handler();
    private boolean k;
    private float l;
    private final jqr m;
    private final heg n;

    public hfa(final heg hegVar, final jqr jqrVar, View view, boolean z, byte[] bArr, byte[] bArr2) {
        this.n = hegVar;
        this.m = jqrVar;
        this.a = new hvz(this, view, true, true);
        this.e = view;
        this.f = z;
        this.g = view.getResources().getDimensionPixelSize(R.dimen.shorts_record_button_zoom_in_slop_threshold);
        this.h = view.getResources().getDimensionPixelSize(R.dimen.shorts_record_button_zoom_out_slop_threshold);
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        this.i = new Runnable(jqrVar, hegVar, bArr3, bArr4) { // from class: hez
            public final /* synthetic */ jqr b;
            public final /* synthetic */ heg c;

            @Override // java.lang.Runnable
            public final void run() {
                hfa hfaVar = hfa.this;
                jqr jqrVar2 = this.b;
                heg hegVar2 = this.c;
                hfaVar.b = true;
                jqrVar2.a(acsb.c(96643)).i(1025);
                ShortsZoomSlider shortsZoomSlider = hegVar2.a.aG;
                if (shortsZoomSlider != null) {
                    shortsZoomSlider.e(true);
                }
            }
        };
    }

    private final void f() {
        this.j.removeCallbacks(this.i);
        this.b = false;
    }

    private final void g() {
        hel helVar = this.n.a;
        if (helVar.bf == 1 && helVar.aw != null) {
            helVar.az.f();
            helVar.bf = 2;
            helVar.aU(0);
            helVar.aG();
        }
        this.c = false;
    }

    @Override // defpackage.hvy
    public final void mk() {
        f();
        if (this.c) {
            g();
            return;
        }
        this.k = false;
        heg hegVar = this.n;
        hel helVar = hegVar.a;
        if (helVar.bf == 0) {
            helVar.ay.m();
            hel helVar2 = hegVar.a;
            helVar2.aS(helVar2.ap.a(), false);
        }
        this.c = true;
        this.j.postDelayed(this.i, ViewConfiguration.getLongPressTimeout());
    }

    @Override // defpackage.hvy
    public final void ml() {
        f();
        if (this.c) {
            this.m.a(acsb.c(96643)).f();
            g();
        }
    }

    @Override // defpackage.hvy
    public final void mm() {
        if (this.b) {
            g();
        } else {
            if (this.c) {
                heg hegVar = this.n;
                hegVar.a.az.e();
                ShortsZoomSlider shortsZoomSlider = hegVar.a.aG;
                if (shortsZoomSlider != null) {
                    shortsZoomSlider.f(false, 0);
                }
            }
            this.m.a(acsb.c(96643)).b();
        }
        f();
    }

    @Override // defpackage.hvy
    public final void mp(float f, float f2) {
        float max;
        Camera.Parameters j;
        if (this.c) {
            ShortsRecordButtonView shortsRecordButtonView = this.n.a.az;
            shortsRecordButtonView.h.setTranslationX(f);
            shortsRecordButtonView.h.setTranslationY(f2);
            float hypot = (float) Math.hypot(f, f2);
            float f3 = shortsRecordButtonView.f;
            if (hypot >= f3 && !shortsRecordButtonView.p) {
                ShortsRecordButtonView.a(shortsRecordButtonView.g, 0.0f, 0.0f);
                shortsRecordButtonView.p = true;
            } else if (hypot < f3) {
                if (shortsRecordButtonView.p) {
                    ShortsRecordButtonView.a(shortsRecordButtonView.g, f, f2);
                    shortsRecordButtonView.p = false;
                } else {
                    shortsRecordButtonView.g.setTranslationX(f);
                    shortsRecordButtonView.g.setTranslationY(f2);
                }
            }
            if (this.f) {
                if (!this.k) {
                    float f4 = -this.g;
                    if (f2 <= f4) {
                        this.k = true;
                        this.l = f4;
                    } else {
                        if (f2 < this.h || !this.b) {
                            return;
                        }
                        this.k = true;
                        this.l = f2;
                    }
                }
                float f5 = this.l;
                if (f2 <= f5) {
                    max = Math.min(1.0f, Math.max(0.0f, (-(f2 - f5)) / (this.e.getTop() - this.e.getHeight())));
                } else {
                    float f6 = ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).bottomMargin;
                    max = Math.max(-1.0f, Math.min(0.0f, (-(f2 - f5)) / Math.max(f6, ((this.e.getHeight() / 2.0f) + f6) - this.l)));
                }
                this.m.a(acsb.c(96640)).f();
                CameraView cameraView = this.n.a.ay;
                Camera a = cameraView.x.a();
                if (a == null || (j = cameraView.x.j(a)) == null || !j.isZoomSupported()) {
                    return;
                }
                if (cameraView.k < 0) {
                    cameraView.k = j.getZoom();
                }
                int maxZoom = j.getMaxZoom();
                cameraView.v(a, j, CameraView.f(max, max >= 0.0f ? maxZoom : Math.max(Math.round(maxZoom * 0.15f), cameraView.k), cameraView.k), maxZoom, false);
            }
        }
    }

    @Override // defpackage.hvy
    public final void mq(float f) {
        if (this.f) {
            return;
        }
        this.m.a(acsb.c(96640)).f();
        this.n.a.ay.o(f);
    }
}
