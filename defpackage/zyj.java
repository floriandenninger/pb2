package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyj implements TextureView.SurfaceTextureListener, vwq, vsz, oxj {
    public final vuq a;
    public final zqt b;
    public Uri c;
    public vsy d;
    public int e;
    public vwm f;
    public zyi g;
    public Track h;
    private volatile boolean i;
    private final VideoWithPreviewView j;
    private final vwl k;
    private final Object l;
    private final vwu m;
    private oyx n;
    private oyx o;
    private vuz p;
    private long q;
    private final int r;
    private final boolean s;
    private final int t;
    private vyf u;
    private final zqt v;

    public zyj(VideoWithPreviewView videoWithPreviewView, vwl vwlVar, Track track, long j, int i, boolean z, int i2) {
        vuq vuqVar = new vuq();
        this.a = vuqVar;
        this.l = new Object();
        vwu vwuVar = new vwu(vuqVar);
        this.m = vwuVar;
        this.q = -1L;
        zqt zyhVar = new zyh();
        this.v = zyhVar;
        videoWithPreviewView.getClass();
        this.j = videoWithPreviewView;
        vwlVar.getClass();
        this.k = vwlVar;
        this.h = track;
        this.q = j;
        this.t = i;
        this.s = z;
        videoWithPreviewView.o = this;
        i2 = i2 == 1 ? !zrs.D() ? 0 : 1 : i2;
        this.r = i2;
        zyhVar = i2 == 1 ? new zrs(videoWithPreviewView.getContext().getApplicationContext(), new zyf(this), null) : zyhVar;
        this.b = zyhVar;
        zyhVar.m();
        videoWithPreviewView.p = zyhVar.k();
        vwuVar.a.add(this);
    }

    private final void q(oxh oxhVar) {
        int i = this.a.a;
        int i2 = i > 1 ? 3 : 5;
        int i3 = this.e;
        if (i3 < i2) {
            StringBuilder sb = new StringBuilder(86);
            sb.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - retry: ");
            sb.append(i3 + 1);
            sb.append(" of ");
            sb.append(i2);
            zga.b(sb.toString());
            f();
            this.j.postDelayed(new zye(this, 0), this.e * 100);
        } else if (i > 1) {
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - try reduce decoders to: ");
            sb2.append(i - 1);
            zga.b(sb2.toString());
            f();
            this.a.c(new zyg(this), Integer.MAX_VALUE);
        } else {
            zga.b("ExoPlayer: onPlayerError: maybeRetryEnablePlayback - unable to play");
            r(oxhVar);
        }
        this.e++;
    }

    private final void r(oxh oxhVar) {
        this.j.j.setVisibility(0);
        this.k.setVisibility(4);
        zyi zyiVar = this.g;
        if (zyiVar != null) {
            zyiVar.aJ(oxhVar);
        }
    }

    private final void s() {
        vwm vwmVar = this.f;
        if (this.p == null || vwmVar == null) {
            return;
        }
        vwmVar.p(false);
        vwmVar.k(this.p, 1001, Long.valueOf(this.d.g() + this.d.n()));
        vwmVar.p(true);
    }

    private final void t() {
        this.b.h();
        vxb a = this.b.a();
        if (a != null) {
            this.k.j(a);
        }
    }

    private final void u() {
        try {
            oyx oyxVar = this.o;
            float f = 0.0f;
            if (oyxVar != null) {
                oyxVar.k(1, Float.valueOf(this.d.F() ? 0.0f : 1.0f - this.d.e()));
            }
            vuz vuzVar = this.p;
            if (vuzVar != null) {
                if (!this.d.F()) {
                    f = this.d.e();
                }
                vuzVar.k(1, Float.valueOf(f));
            }
        } catch (oxh e) {
            zga.d("Couldn't update audio volume.", e);
        }
    }

    @Override // defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
    }

    @Override // defpackage.vsz
    public final void b(vsy vsyVar, int i) {
        if (i == 0 || i == 3) {
            s();
        } else if (i == 4 || i == 5) {
            u();
        }
    }

    @Override // defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
    }

    @Override // defpackage.vwq
    public final void d() {
        this.j.post(new zye(this, 1));
    }

    public final long e() {
        vwm vwmVar = this.f;
        return (vwmVar == null || vwmVar.a() == 1) ? this.q : this.f.c();
    }

    public final void f() {
        synchronized (this.l) {
            this.m.c();
            if (this.f != null) {
                this.q = e();
                this.f.a.h();
                this.f = null;
                this.i = false;
            }
            this.n = null;
            this.o = null;
            this.b.h();
        }
    }

    public final void g() {
        synchronized (this.l) {
            this.f = new vwm();
            this.i = false;
            this.f.e(this);
            this.k.n(this.f);
            i();
            long j = this.q;
            if (j != -1) {
                this.f.j(j);
                this.q = -1L;
            }
            h();
            VideoWithPreviewView videoWithPreviewView = this.j;
            vwm vwmVar = this.f;
            oxk oxkVar = videoWithPreviewView.n;
            if (oxkVar != vwmVar) {
                if (oxkVar != null) {
                    oxkVar.i(videoWithPreviewView);
                }
                videoWithPreviewView.n = vwmVar;
                oxk oxkVar2 = videoWithPreviewView.n;
                if (oxkVar2 != null) {
                    videoWithPreviewView.s(oxkVar2.a());
                    videoWithPreviewView.n.e(videoWithPreviewView);
                } else {
                    videoWithPreviewView.s(5);
                }
            }
        }
    }

    public final void h() {
        vxb a;
        oyr oxoVar;
        yjk.f();
        if (this.c == null || this.f == null || !this.m.g() || this.i) {
            return;
        }
        this.i = true;
        Context applicationContext = this.j.getContext().getApplicationContext();
        if (!this.d.b.b) {
            if (this.s) {
                oxoVar = new pcg(this.c, new pfv(applicationContext, pgz.l(applicationContext, "VideoMPEG")), new pft(65536), 16777216, new pbz[0]);
            } else {
                oxoVar = new oxo(applicationContext, this.c);
            }
            vwu vwuVar = this.m;
            this.n = new vws(vwuVar, applicationContext, oxoVar, new Handler(Looper.getMainLooper()), new vwr(vwuVar.h));
            this.o = new oxt(oxoVar, oxv.a);
        } else {
            try {
                this.b.n(MediaStore.Images.Media.getBitmap(applicationContext.getContentResolver(), this.c));
            } catch (IOException e) {
                zga.d("error retrieving image from uri", e);
            }
            this.n = new oxg();
            this.o = new oxg();
        }
        oyx[] oyxVarArr = {this.n, this.o, new vwj(this.k), new vwn(applicationContext, this.j, this.u), new oxg()};
        if (this.h != null) {
            oyr oyrVar = null;
            if (this.s) {
                oyrVar = new pcg(this.h.d, new pfv(applicationContext, pgz.l(applicationContext, "AudioMPEG")), new pft(65536), 1310720, new pbz[0]);
            } else {
                pfv pfvVar = new pfv(applicationContext, pgz.l(applicationContext, "AudioMPEG"));
                int d = new vuh(applicationContext).d(this.h.d);
                if (d == 1) {
                    oyrVar = new pcg(this.h.d, pfvVar, new pft(65536), 1310720, new pcx());
                } else if (d == 2) {
                    oyrVar = new pcg(this.h.d, pfvVar, new pft(65536), 1310720, new pdm());
                } else if (d == 3 || d == 4) {
                    oyrVar = new oxo(applicationContext, this.h.d);
                } else {
                    zyi zyiVar = this.g;
                    if (zyiVar != null) {
                        zyiVar.aF();
                    }
                }
            }
            if (oyrVar != null) {
                vuz vuzVar = new vuz(oyrVar);
                this.p = vuzVar;
                oyxVarArr[4] = vuzVar;
                s();
            }
        }
        amkq.N(true);
        vwm vwmVar = this.f;
        vwmVar.c = 5;
        vwmVar.a.g(oyxVarArr);
        if (p()) {
            amkq.N((this.f == null || this.n == null) ? false : true);
            if (this.b.j() && (a = this.b.a()) != null) {
                this.k.e(a);
            }
        } else {
            SurfaceTexture surfaceTexture = this.j.h.getSurfaceTexture();
            if (surfaceTexture != null) {
                j(surfaceTexture, false);
            }
        }
        vsy vsyVar = this.d;
        if (vsyVar != null) {
            this.b.d(Math.min((!vsyVar.b.b ? r0.h() / (((float) this.d.b.g) / 1000000.0f) : 30.0f) * 0.85f, 24.0f));
            u();
        }
    }

    final void i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(4);
        this.m.e(this.f, arrayList);
    }

    public final void j(SurfaceTexture surfaceTexture, boolean z) {
        if (this.f == null || this.n == null) {
            return;
        }
        Surface surface = surfaceTexture != null ? new Surface(surfaceTexture) : null;
        if (z) {
            this.f.a.f(this.n, 1, surface);
        } else {
            this.f.k(this.n, 1, surface);
        }
    }

    public final void n(vsy vsyVar, Uri uri, vyf vyfVar) {
        yjk.f();
        vsy vsyVar2 = this.d;
        if (vsyVar2 != null) {
            vsyVar2.u(this);
        }
        vwm vwmVar = this.f;
        if (vwmVar != null) {
            vwmVar.a.n();
            this.n = null;
        }
        if (this.i) {
            this.i = false;
            this.m.c();
            i();
            this.f.j(vsyVar.m());
            if (p()) {
                t();
            }
        }
        this.d = vsyVar;
        this.c = uri;
        this.u = vyfVar;
        if (vsyVar != null) {
            VideoMetaData videoMetaData = vsyVar.b;
            if (videoMetaData.d <= 1920 && videoMetaData.e <= 1080 && this.a.a < this.t) {
                zga.l(String.format(Locale.getDefault(), "Increase media codec permits to %d (make:%s, model:%s, osVersion:%s)", Integer.valueOf(this.t), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE));
                this.a.b(this.t);
            }
            vsyVar.q(this);
            double b = vsyVar.b();
            double c = vsyVar.c();
            double d = vsyVar.d();
            double a = vsyVar.a();
            double k = videoMetaData.k();
            Double.isNaN(k);
            double d2 = k * ((1.0d - b) - c);
            double j = videoMetaData.j();
            Double.isNaN(j);
            double d3 = j * ((1.0d - d) - a);
            double d4 = d2 / d3;
            if (this.r == 1) {
                this.j.r((float) d4);
            } else {
                this.j.r(videoMetaData.a());
            }
            double d5 = 360.0d;
            if (d2 < 360.0d) {
                d3 = 360.0d / d4;
                d2 = 360.0d;
            }
            if (d3 < 360.0d) {
                d2 = d4 * 360.0d;
            } else {
                d5 = d3;
            }
            this.b.c((int) Math.round(Math.max(d2, d5)));
            if (this.r != 0) {
                double b2 = (vsyVar.b() + (1.0d - vsyVar.c())) / 2.0d;
                double d6 = (vsyVar.d() + (1.0d - vsyVar.a())) / 2.0d;
                boolean z = Math.abs(vsyVar.d()) < 0.01d && Math.abs(vsyVar.a()) < 0.01d;
                boolean z2 = Math.abs(vsyVar.b()) < 0.01d && Math.abs(vsyVar.c()) < 0.01d;
                amkq.E(Math.abs(b2 + (-0.5d)) < 0.01d);
                amkq.E(Math.abs(d6 + (-0.5d)) < 0.01d);
                amkq.E(z || z2);
                amkq.E(vsyVar.b() >= 0.0d);
                amkq.E(vsyVar.c() >= 0.0d);
                amkq.E(vsyVar.d() >= 0.0d);
                amkq.E(vsyVar.a() >= 0.0d);
                this.b.g(vsyVar.b.a());
            }
        }
        h();
    }

    public final void o() {
        this.m.a.remove(this);
        if (this.b != null) {
            t();
            this.b.i();
        }
        vsy vsyVar = this.d;
        if (vsyVar != null) {
            vsyVar.u(this);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (p()) {
            this.b.e(surfaceTexture, i, i2);
        } else {
            j(surfaceTexture, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (p()) {
            this.b.o();
            return false;
        }
        j(surfaceTexture, true);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.r != 1 || i <= 0 || i2 <= 0) {
            return;
        }
        this.b.f(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean p() {
        return this.r == 1;
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
        if (oxhVar.getCause() instanceof oxz) {
            zga.b("ExoPlayer: onPlayerError: DecoderInitializationException - attempt retry");
            q(oxhVar);
            return;
        }
        Throwable cause = oxhVar.getCause();
        if (cause instanceof IllegalStateException) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if ((cause instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"))) {
                zga.n("ExoPlayer: onPlayerError: MediaCodec exception - attempt retry", oxhVar);
                q(oxhVar);
                return;
            }
        }
        r(oxhVar);
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        if (i == 4) {
            this.e = 0;
        }
    }
}
