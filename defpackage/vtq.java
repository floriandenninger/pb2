package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtq implements Runnable {
    final /* synthetic */ vts a;
    private final /* synthetic */ int b;

    public vtq(vts vtsVar, int i) {
        this.b = i;
        this.a = vtsVar;
    }

    public /* synthetic */ vtq(vts vtsVar, int i, byte[] bArr) {
        this.b = i;
        this.a = vtsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture;
        if (this.b == 0) {
            Looper.prepare();
            synchronized (this) {
                this.a.h = new Handler();
                this.a.i = Looper.myLooper();
                this.a.j(1);
            }
            try {
                this.a.h();
                e = null;
            } catch (IOException e) {
                e = e;
            }
            if (e == null) {
                synchronized (this) {
                    this.a.j(2);
                    vtr vtrVar = this.a.c;
                    if (vtrVar != null) {
                        vtn vtnVar = ((vtj) vtrVar).a;
                        vte vteVar = vtnVar.d;
                        if (vteVar != null && vtnVar.c != null) {
                            vteVar.e();
                            vts vtsVar = vtnVar.c;
                            synchronized (vtsVar) {
                                if (vtsVar.a == 2) {
                                    vtsVar.j(3);
                                }
                            }
                        }
                        vtnVar.c(new IllegalStateException("Frame Processing requested from unstarted Encoder"));
                    }
                }
                Looper.loop();
                this.a.j(4);
                Handler handler = this.a.h;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                vtr vtrVar2 = this.a.c;
                if (vtrVar2 != null) {
                    ((vtj) vtrVar2).a.b();
                }
            }
            synchronized (this) {
                vts vtsVar2 = this.a;
                vtsVar2.h = null;
                vtsVar2.j(5);
            }
            vts vtsVar3 = this.a;
            vtt vttVar = vtsVar3.f;
            if (vttVar != null) {
                vttVar.a();
                vtu vtuVar = vtsVar3.g;
                if (vtuVar != null) {
                    vtuVar.b();
                }
                vttVar.b();
                vys vysVar = vtsVar3.r;
                if (vysVar != null && (surfaceTexture = vysVar.a.e) != null) {
                    surfaceTexture.release();
                    vysVar.a.e = null;
                }
            }
            vtsVar3.g = null;
            vtsVar3.f = null;
            vtsVar3.n = null;
            vtr vtrVar3 = this.a.c;
            if (vtrVar3 != null) {
                vtrVar3.a(e);
                return;
            }
            return;
        }
        vts vtsVar4 = this.a;
        if (vtsVar4.l > vtsVar4.m) {
            vtt vttVar2 = vtsVar4.f;
            if (vttVar2 != null) {
                vtsVar4.e(vttVar2);
            } else {
                vtv.b("VideoEncoder: targetSurface unexpectedly null while encoding final frame");
            }
        }
        vtv.a("VideoEncoder: Quit encode thread");
        Looper looper = vtsVar4.i;
        looper.getClass();
        looper.quit();
    }
}
