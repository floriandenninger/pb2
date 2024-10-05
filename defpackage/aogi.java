package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aogi implements TextureFrame {
    public final int c;
    public final int d;
    public final int e;
    public long f = Long.MIN_VALUE;
    private boolean a = false;
    public boolean g = false;
    private GlSyncToken b = null;

    public aogi(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final void b() {
        synchronized (this) {
            GlSyncToken glSyncToken = this.b;
            if (glSyncToken != null) {
                glSyncToken.release();
                this.b = null;
            }
            this.a = true;
            this.g = true;
        }
    }

    public final void c() {
        synchronized (this) {
            while (this.a && this.b == null) {
                wait();
            }
            GlSyncToken glSyncToken = this.b;
            if (glSyncToken != null) {
                glSyncToken.waitOnCpu();
                this.b.release();
                this.a = false;
                this.b = null;
            }
        }
    }

    public final void finalize() {
        GlSyncToken glSyncToken = this.b;
        if (glSyncToken != null) {
            glSyncToken.release();
            this.b = null;
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.e;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.f;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.d;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public void release() {
        synchronized (this) {
            this.a = false;
            this.g = false;
            notifyAll();
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            GlSyncToken glSyncToken2 = this.b;
            if (glSyncToken2 != null) {
                glSyncToken2.release();
            }
            this.b = glSyncToken;
            this.g = false;
            notifyAll();
        }
    }
}
