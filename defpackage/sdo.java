package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdo {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/rendering/GLViewManager");
    public final GLSurfaceView b;
    public final aogf c;
    public final aogg d;
    public final sdn e;
    final SurfaceHolder.Callback f;
    public sev g;

    public sdo(Context context, aogo aogoVar, sdn sdnVar) {
        this.e = sdnVar;
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.b = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(aogoVar.d);
        gLSurfaceView.setEGLContextFactory(new sdk(aogoVar));
        aogf aogfVar = new aogf();
        this.c = aogfVar;
        if (aogfVar.c == 0) {
            aogfVar.d = 3553;
            gLSurfaceView.setRenderer(aogfVar);
            gLSurfaceView.setRenderMode(0);
            sdm sdmVar = new sdm(this);
            this.f = sdmVar;
            gLSurfaceView.getHolder().addCallback(sdmVar);
            this.d = new aogg() { // from class: sdj
                @Override // defpackage.aogg
                public final void a(TextureFrame textureFrame) {
                    sdo sdoVar = sdo.this;
                    TextureFrame textureFrame2 = (TextureFrame) sdoVar.c.g.getAndSet(textureFrame);
                    if (textureFrame2 != null && (textureFrame == null || textureFrame2.getTextureName() != textureFrame.getTextureName())) {
                        textureFrame2.release();
                    }
                    sdoVar.b.requestRender();
                    sev sevVar = sdoVar.g;
                    if (sevVar != null) {
                        sby sbyVar = sevVar.e.b;
                        amnp amnpVar = sbyVar.a;
                        if (!amnpVar.a) {
                            for (int i = 0; i < Math.min(1800, sbyVar.d); i++) {
                                sbyVar.c.set(i, 0);
                            }
                            sbyVar.d = 0;
                            sbz sbzVar = sbyVar.b;
                            sbzVar.b = 0;
                            sbzVar.c = 0;
                            sbzVar.d = 0;
                            sbzVar.e = 0;
                            for (int i2 = 0; i2 < 60; i2++) {
                                sbzVar.a.set(i2, 0);
                            }
                            sbyVar.a.f();
                            return;
                        }
                        int a2 = (int) amnpVar.a(TimeUnit.MILLISECONDS);
                        sbyVar.a.e();
                        sbyVar.a.f();
                        ArrayList arrayList = sbyVar.c;
                        int i3 = sbyVar.d;
                        Integer valueOf = Integer.valueOf(a2);
                        arrayList.set(i3 % 1800, valueOf);
                        sbyVar.d++;
                        sbz sbzVar2 = sbyVar.b;
                        if (sbzVar2.d == sbzVar2.e && sbzVar2.b > 0) {
                            sbzVar2.a();
                        }
                        sbzVar2.a.set(sbzVar2.d, valueOf);
                        sbzVar2.b++;
                        sbzVar2.c += a2;
                        sbzVar2.d = (sbzVar2.d + 1) % 60;
                        while (sbzVar2.c > 2000) {
                            sbzVar2.a();
                        }
                    }
                }
            };
            return;
        }
        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
    }
}
