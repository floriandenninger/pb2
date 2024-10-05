package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpk {
    public final zpw a;
    public long b;
    public long c;
    public zfi d;
    public long e = -1;
    public long f = Long.MIN_VALUE;
    public boolean g;
    private zpd h;

    public zpk(zpw zpwVar) {
        this.a = zpwVar;
        b();
    }

    private final void c(String str) {
        if (this.g) {
            zga.c("PresetFilterDebug", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(arz arzVar, zpe zpeVar, int i, int i2) {
        try {
            if (this.h == null) {
                this.h = zpd.a();
            }
            this.h.c(arzVar, zpeVar, i, i2);
            zpeVar.i();
        } catch (RuntimeException e) {
            c("DrishtiGlInOut:copyOutputToViewShader failed: ");
            zga.d("copyTextureFrameToTarget: copyOutputToViewShader failed: ", e);
            this.h = null;
        }
        GLES20.glFinish();
        c("DrishtiGlInOut:copyTextureFrameToTarget");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = Long.MIN_VALUE;
        this.c = Long.MIN_VALUE;
    }
}
