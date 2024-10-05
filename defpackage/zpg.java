package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpg {
    public final Looper a;
    public final Thread b;
    public boolean c;
    public zpe d;
    public String e;
    public String f;
    private boolean g;

    public zpg() {
        HandlerThread handlerThread = new HandlerThread("zpg");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.a = looper;
        this.b = looper.getThread();
        new Handler(looper).post(new Runnable() { // from class: zpf
            @Override // java.lang.Runnable
            public final void run() {
                zpg zpgVar = zpg.this;
                try {
                    zpgVar.d = zpe.m(2, 2);
                    zpgVar.d.e();
                    zpe.h(zpgVar.d);
                    zpgVar.e = GLES20.glGetString(7937);
                    zpgVar.f = GLES20.glGetString(7938);
                } catch (RuntimeException e) {
                    zga.f("GlDeviceInfo", "Failed to init GL", e);
                }
                try {
                    zpe.f();
                } catch (RuntimeException e2) {
                    zga.f("GlDeviceInfo", "focusNone failed: ", e2);
                }
                try {
                    zpe zpeVar = zpgVar.d;
                    if (zpeVar != null) {
                        zpeVar.g();
                    }
                } catch (RuntimeException e3) {
                    zga.f("GlDeviceInfo", "FilterRenderTarget.release failed: ", e3);
                }
                synchronized (zpgVar.b) {
                    zpgVar.c = true;
                    zpgVar.b.notifyAll();
                    zpgVar.a.quit();
                }
            }
        });
    }

    public final void a() {
        synchronized (this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            while (this.b.isAlive() && !this.c && !this.g) {
                try {
                    this.b.wait(500L);
                } catch (InterruptedException unused) {
                    zga.m("GlDeviceInfo", "Wait interrupted");
                }
                if (System.currentTimeMillis() - currentTimeMillis >= 500) {
                    zga.m("GlDeviceInfo", "Wait for GlDeviceInfo timed out");
                    this.g = true;
                }
            }
        }
    }
}
