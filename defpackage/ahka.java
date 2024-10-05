package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahka extends afko implements pkd, bgv {
    private final GLSurfaceView i;
    private final ahkb j;

    public ahka(Context context) {
        super(context);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.i = gLSurfaceView;
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLWindowSurfaceFactory(new ahhh(context));
        ahkb ahkbVar = new ahkb(new ahod(context), new Handler(new Handler.Callback() { // from class: ahjz
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                afkx afkxVar;
                ahka ahkaVar = ahka.this;
                if (message.what != 3 || (afkxVar = ahkaVar.g) == null) {
                    return false;
                }
                afkxVar.e();
                return true;
            }
        }));
        this.j = ahkbVar;
        gLSurfaceView.setRenderer(ahkbVar);
        gLSurfaceView.setRenderMode(0);
        addView(gLSurfaceView);
        this.b = this;
        this.c = this;
    }

    @Override // defpackage.afky
    public final aflb C() {
        return aflb.GL_VPX;
    }

    @Override // defpackage.afkl
    public final void D() {
        ahkb ahkbVar = this.j;
        ahkx ahkxVar = ahkbVar.a;
        if (ahkxVar != null) {
            ahkxVar.b();
            ahkbVar.a = null;
        }
        ahny ahnyVar = ahkbVar.d;
        if (ahnyVar != null) {
            ahnyVar.i();
            ahkbVar.d = null;
        }
        ahkn ahknVar = ahkbVar.b;
        if (ahknVar != null) {
            ahknVar.k();
            ahkbVar.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void H() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void I() {
    }

    @Override // defpackage.afkr, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        G(this.i, i3 - i, i4 - i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.i, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    @Override // defpackage.bgv
    public final void rH(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ahkb ahkbVar = this.j;
        ahkn ahknVar = ahkbVar.b;
        if (ahknVar != null) {
            ahknVar.rH(videoDecoderOutputBuffer);
            ahkbVar.c = true;
        } else {
            videoDecoderOutputBuffer.release();
        }
        this.i.requestRender();
    }

    @Override // defpackage.pkd
    public final void rI(VpxOutputBuffer vpxOutputBuffer) {
        ahkb ahkbVar = this.j;
        ahkn ahknVar = ahkbVar.b;
        if (ahknVar != null) {
            ahknVar.rI(vpxOutputBuffer);
            ahkbVar.c = true;
        } else {
            vpxOutputBuffer.release();
        }
        this.i.requestRender();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.i.setVisibility(i);
        super.setVisibility(i);
    }
}
