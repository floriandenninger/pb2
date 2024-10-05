package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.opengl.GLES20;
import com.google.android.libraries.video.media.VideoMetaData;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import javax.microedition.khronos.egl.EGL10;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxz extends Thread {
    public volatile Exception b;
    private final Context c;
    private final VideoMetaData d;
    private final int e;
    private final int f;
    private final vut g;
    private final vum h;
    private final PriorityBlockingQueue i;
    private final vuq j;
    private final vvf k;
    private volatile boolean l;
    private vxs m;
    private ByteBuffer[] o;
    private boolean p;
    private vuu q;
    private vur r;
    private final MediaCodec.BufferInfo n = new MediaCodec.BufferInfo();
    public final CountDownLatch a = new CountDownLatch(1);

    public vxz(Context context, VideoMetaData videoMetaData, int i, int i2, PriorityBlockingQueue priorityBlockingQueue, vut vutVar, vum vumVar, vuq vuqVar) {
        this.c = context;
        this.d = videoMetaData;
        this.e = i;
        this.f = i2;
        this.i = priorityBlockingQueue;
        this.g = vutVar;
        this.h = vumVar;
        this.j = vuqVar;
        this.k = new vvf(vuqVar);
        setName("Extractor Thread");
    }

    private final void b() {
        vxs vxsVar = this.m;
        if (vxsVar != null) {
            vxu vxuVar = (vxu) vxsVar;
            vcp.d(vxuVar.d != EGL10.EGL_NO_DISPLAY);
            GLES20.glDeleteProgram(vxuVar.l);
            vxuVar.l = 0;
            vxuVar.c.eglDestroySurface(vxuVar.d, vxuVar.f);
            vxuVar.c.eglDestroyContext(vxuVar.d, vxuVar.e);
            vxuVar.c.eglMakeCurrent(vxuVar.d, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            vxuVar.c.eglTerminate(vxuVar.d);
            vxuVar.d = EGL10.EGL_NO_DISPLAY;
            vxuVar.e = EGL10.EGL_NO_CONTEXT;
            vxuVar.f = EGL10.EGL_NO_SURFACE;
            vxuVar.s.release();
            vxuVar.s = null;
            vxuVar.r.release();
            vxuVar.r = null;
            this.m = null;
        }
        vuu vuuVar = this.q;
        if (vuuVar != null) {
            vuuVar.c();
            this.q = null;
        }
    }

    private final void c() {
        vur vurVar = this.r;
        if (vurVar != null) {
            if (this.p) {
                try {
                    vurVar.f();
                } catch (IllegalStateException e) {
                    vtv.c("IllegalStateException while stopping decoder", e);
                }
                this.p = false;
            }
            this.r.c();
            this.r = null;
        }
    }

    private final boolean d(vxv vxvVar) {
        vxv vxvVar2 = (vxv) this.i.peek();
        return vxvVar2 != null && vxvVar2.a > vxvVar.a;
    }

    public final synchronized void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        interrupt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0379, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x038b, code lost:
    
        throw new java.lang.Exception(java.lang.String.format("Decoder failed with status %d", java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03b0 A[Catch: all -> 0x0440, TRY_ENTER, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x0027, B:6:0x002c, B:9:0x0030, B:13:0x003e, B:14:0x004d, B:17:0x0051, B:45:0x03b0, B:46:0x03b5, B:47:0x03b7, B:190:0x03d8, B:207:0x03fa, B:208:0x03ff, B:209:0x0404, B:214:0x03f0, B:215:0x03f5, B:203:0x0405, B:235:0x043a, B:236:0x043f, B:232:0x0424, B:226:0x0426, B:225:0x0437, B:28:0x0078, B:31:0x0095, B:33:0x00a7, B:34:0x00b2, B:36:0x00b5, B:37:0x00c5, B:180:0x03c6, B:181:0x03cb, B:184:0x00ac, B:20:0x005b, B:21:0x005f, B:195:0x0073, B:200:0x03e4, B:43:0x03ab, B:175:0x03c0, B:176:0x03c3, B:188:0x03ce, B:192:0x03e0, B:212:0x03e9, B:4:0x0002, B:231:0x041d, B:224:0x0430), top: B:3:0x0002, inners: #0, #3, #5, #15, #16, #18, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a7 A[Catch: all -> 0x0394, TRY_LEAVE, TryCatch #13 {all -> 0x0394, blocks: (B:40:0x00d0, B:50:0x00d9, B:53:0x00f1, B:55:0x00f9, B:57:0x00ff, B:60:0x012e, B:61:0x0119, B:63:0x0133, B:65:0x013e, B:103:0x0151, B:104:0x0158, B:126:0x01b0, B:128:0x02f5, B:68:0x0315, B:92:0x039c, B:96:0x03a7, B:70:0x031d, B:72:0x0321, B:74:0x0327, B:76:0x032b, B:81:0x033b, B:83:0x033e, B:129:0x02f9, B:132:0x0399, B:139:0x030a, B:143:0x030b, B:146:0x0358, B:161:0x0377, B:163:0x037a, B:164:0x038b), top: B:39:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a4  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxz.run():void");
    }
}
