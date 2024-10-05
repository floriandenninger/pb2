package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vwz extends FrameLayout implements TextureView.SurfaceTextureListener, oxj {
    private final Runnable a;
    private boolean b;
    private vya c;
    private long d;
    private long e;
    public final TextureView h;
    protected final ImageView i;
    public final View j;
    public View k;
    public float l;
    public int m;
    public oxk n;
    public TextureView.SurfaceTextureListener o;
    public zpt p;

    public vwz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vww(this);
        this.b = false;
        this.l = 1.7777778f;
        this.m = Integer.MAX_VALUE;
        this.e = -1L;
        LayoutInflater.from(context).inflate(R.layout.video_with_preview_view, (ViewGroup) this, true);
        TextureView textureView = (TextureView) findViewById(R.id.video_surface);
        this.h = textureView;
        textureView.setSurfaceTextureListener(this);
        this.i = (ImageView) findViewById(R.id.preview_image);
        this.j = findViewById(R.id.preview_image_error);
    }

    private static final boolean a(int i) {
        return i == 2 || i == 3;
    }

    protected abstract float d();

    protected abstract float e();

    protected abstract void i();

    protected abstract float n();

    protected abstract void o();

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if ((this.p == null || this.n == null) && this.c != null) {
            q(null, false);
        }
    }

    public abstract void p();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(vya vyaVar, boolean z) {
        vya vyaVar2 = this.c;
        if (vyaVar2 != null) {
            vyaVar2.d();
        }
        this.c = vyaVar != null ? vyaVar.c() : null;
        if (z) {
            this.d = -1L;
        } else {
            this.d = System.currentTimeMillis() + 50;
            postDelayed(this.a, 50L);
        }
        zpt zptVar = this.p;
        if (zptVar != null) {
            vya vyaVar3 = this.c;
            if (vyaVar3 == null) {
                zptVar.a(null);
            } else if (vyaVar3.f() == 2) {
                this.p.a(this.c.b().copy(Bitmap.Config.ARGB_8888, false));
            }
        } else {
            vya vyaVar4 = this.c;
            if (vyaVar4 == null) {
                this.i.setImageBitmap(null);
                this.i.setVisibility(8);
            } else if (vyaVar4.f() == 2) {
                this.i.setImageBitmap(this.c.b());
                this.i.setVisibility(0);
                float e = e();
                this.i.setPivotX(d());
                this.i.setPivotY(n());
                this.i.setScaleX(e);
                this.i.setScaleY(e);
            }
        }
        t();
    }

    public final void r(float f) {
        if (this.l != f) {
            this.l = f;
            o();
        }
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        oxk oxkVar;
        if (this.c != null && (oxkVar = this.n) != null && this.p != null && ((vwm) oxkVar).a.b(0) >= 0 && !a(i)) {
            vwm vwmVar = (vwm) this.n;
            if (!vwmVar.b && ((oxm) vwmVar.a).f == 0) {
                q(null, false);
            }
        }
        post(new vwy(this, i));
    }

    public final void s(int i) {
        this.b = a(i);
        t();
    }

    public final void t() {
        boolean z;
        if (this.k != null) {
            long currentTimeMillis = System.currentTimeMillis();
            vya vyaVar = this.c;
            boolean z2 = vyaVar == null || vyaVar.f() != 2;
            long j = this.d;
            boolean z3 = j != -1 && j < currentTimeMillis;
            if (this.b && (z2 || z3)) {
                long j2 = this.e;
                if (j2 == -1) {
                    this.e = currentTimeMillis;
                    j2 = currentTimeMillis;
                }
                long j3 = currentTimeMillis - j2;
                z = j3 > 500;
                if (!z) {
                    postDelayed(this.a, (500 - j3) + 1);
                }
            } else {
                this.e = -1L;
                z = false;
            }
            this.k.setVisibility(true != z ? 8 : 0);
        }
    }

    public final boolean u() {
        return this.m != Integer.MAX_VALUE;
    }
}
