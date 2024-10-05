package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scu implements aogh, sdn {
    private static final Size p = new Size(1280, 720);
    public final Context a;
    public final sem b;
    public final scv c;
    public final aogo d;
    public final sct e;
    public final sfh f;
    public final Executor g;
    public aogg h;
    public aoge i;
    public Size j;
    public Size k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    public scu(Context context, sem semVar, Executor executor, aogo aogoVar, sct sctVar) {
        Size size = p;
        this.l = -1;
        this.m = -1;
        this.a = context;
        this.g = anaf.E(executor);
        this.b = semVar;
        semVar.c();
        this.c = new scv((amru) scw.a(context, 0).map(opb.i).orElse(amru.q()), size);
        this.d = aogoVar;
        this.e = sctVar;
        this.f = new sfh(executor);
    }

    public final void a() {
        this.o = false;
        this.j = null;
        this.l = -1;
        this.b.b();
        final aoge aogeVar = this.i;
        if (aogeVar != null) {
            aogeVar.a.k.post(new Runnable() { // from class: aofx
                @Override // java.lang.Runnable
                public final void run() {
                    aoge.this.a.e(null, 0, 0);
                }
            });
            aoge aogeVar2 = this.i;
            aogd aogdVar = aogeVar2.a;
            if (aogdVar != null) {
                aogdVar.i();
                try {
                    aogeVar2.a.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("ExternalTextureConv", valueOf.length() != 0 ? "thread was unexpectedly interrupted: ".concat(valueOf) : new String("thread was unexpectedly interrupted: "));
                    throw new RuntimeException(e);
                }
            }
            this.i = null;
        }
    }

    public final void b(final Runnable runnable) {
        this.f.b(new sfg() { // from class: scm
            @Override // defpackage.sfg
            public final anhy a() {
                final scu scuVar = scu.this;
                final Runnable runnable2 = runnable;
                return anfq.h(anaf.T(new anfy() { // from class: sco
                    @Override // defpackage.anfy
                    public final anhy a() {
                        Size size;
                        scu scuVar2 = scu.this;
                        Runnable runnable3 = runnable2;
                        if (scuVar2.f.c()) {
                            return anaf.O(null);
                        }
                        runnable3.run();
                        if (!scuVar2.n || (size = scuVar2.k) == null || scuVar2.m == -1) {
                            return anaf.O(null);
                        }
                        if (scuVar2.o) {
                            if (size.equals(scuVar2.j)) {
                                int i = scuVar2.m;
                                if (i != scuVar2.l) {
                                    scuVar2.i.a(i);
                                    scuVar2.l = scuVar2.m;
                                }
                                return anaf.O(null);
                            }
                            scuVar2.a();
                        }
                        scuVar2.i = new aoge(scuVar2.d.c);
                        scuVar2.i.a(scuVar2.m);
                        scuVar2.l = scuVar2.m;
                        aogg aoggVar = scuVar2.h;
                        if (aoggVar != null) {
                            scuVar2.i.c(aoggVar);
                        }
                        sev sevVar = ((sdy) scuVar2.e).k;
                        if (sevVar != null) {
                            sevVar.e.a.f(sex.CAMERA_INIT);
                        }
                        scuVar2.j = scuVar2.k;
                        scuVar2.o = true;
                        sem semVar = scuVar2.b;
                        final Size size2 = scuVar2.j;
                        final sel selVar = (sel) semVar;
                        if (selVar.b == null) {
                            return anaf.N(new IllegalStateException("Camera not initialized or no valid camera was found."));
                        }
                        selVar.b();
                        if (size2.getWidth() <= size2.getHeight()) {
                            size2 = new Size(size2.getHeight(), size2.getWidth());
                        }
                        final SettableFuture f = SettableFuture.f();
                        final SettableFuture f2 = SettableFuture.f();
                        selVar.c = f;
                        selVar.d = f2;
                        return aci.c(new aeu() { // from class: seh
                            @Override // defpackage.aeu
                            public final Object a(aes aesVar) {
                                return sel.this.a(f, f2, size2, aesVar);
                            }
                        });
                    }
                }, scuVar.g), new amml() { // from class: scn
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        scu scuVar2 = scu.this;
                        final SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                        if (surfaceTexture == null) {
                            return null;
                        }
                        final aoge aogeVar = scuVar2.i;
                        if (aogeVar == null) {
                            surfaceTexture.release();
                            return null;
                        }
                        final int width = scuVar2.j.getWidth();
                        final int height = scuVar2.j.getHeight();
                        if (width == 0 || height == 0) {
                            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
                        }
                        aogeVar.a.k.post(new Runnable() { // from class: aofy
                            @Override // java.lang.Runnable
                            public final void run() {
                                aoge aogeVar2 = aoge.this;
                                SurfaceTexture surfaceTexture2 = surfaceTexture;
                                int i = width;
                                int i2 = height;
                                aogd aogdVar = aogeVar2.a;
                                aogdVar.e(surfaceTexture2, i, i2);
                                int[] iArr = new int[1];
                                GLES20.glGenTextures(1, iArr, 0);
                                aogdVar.a.attachToGLContext(iArr[0]);
                            }
                        });
                        sev sevVar = ((sdy) scuVar2.e).k;
                        if (sevVar == null) {
                            return null;
                        }
                        sevVar.e.a.e(sex.CAMERA_INIT);
                        return null;
                    }
                }, scuVar.g);
            }
        });
    }

    @Override // defpackage.aogh
    public final void c(aogg aoggVar) {
        throw null;
    }

    public final void d() {
        this.f.b(new sfg() { // from class: sck
            @Override // defpackage.sfg
            public final anhy a() {
                final scu scuVar = scu.this;
                return anaf.S(new Callable() { // from class: scs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        scu scuVar2 = scu.this;
                        scuVar2.n = false;
                        scuVar2.a();
                        return null;
                    }
                }, scuVar.g);
            }
        });
    }
}
