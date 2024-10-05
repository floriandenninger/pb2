package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyz {
    public final vtf a;

    public vyz(vyy vyyVar) {
        String str;
        Float f;
        bbr bbrVar;
        vrx vrxVar;
        bgw bgwVar;
        vrw vrwVar;
        vyw vywVar;
        vyv vyvVar;
        Boolean bool;
        Handler handler = new Handler(vyyVar.a.getMainLooper());
        vrx vrxVar2 = new vrx(null);
        vrw vrwVar2 = new vrw();
        vyv vyvVar2 = new vyv(vyyVar.e, vyyVar.g, handler, null);
        vyt vytVar = new vyt(handler, vrxVar2, vyvVar2);
        vtl vtlVar = new vtl();
        vtlVar.c(0.0f);
        vtlVar.c = 5000000;
        vtlVar.f = 128000;
        vtlVar.b(0);
        vtlVar.a(0);
        vtlVar.i = Float.valueOf(1.0f);
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        if (eGLContext == null) {
            vtlVar.j = EGL14.EGL_NO_CONTEXT;
        } else {
            vtlVar.j = eGLContext;
        }
        vtlVar.r = null;
        vtlVar.m = vum.a;
        String str2 = vyyVar.b;
        if (str2 != null) {
            vtlVar.a = str2;
            vtlVar.a(1);
            vtlVar.b(44100);
            vtlVar.d = 1280;
            vtlVar.e = 720;
            vtlVar.o = 91;
            vtlVar.c(30.0f);
            vtlVar.k = vrwVar2;
            vtlVar.l = vrxVar2;
            vtlVar.s = vyvVar2;
            if (vytVar.g == null) {
                vytVar.g = new vys(vytVar);
            }
            vtlVar.p = vytVar.g;
            vtlVar.r = new vyo(new vyp(vyyVar.d));
            vtlVar.q = vyyVar.f;
            vtlVar.n = new vtk(vtlVar);
            vyv vyvVar3 = vtlVar.s;
            if (vyvVar3 == null || (str = vtlVar.a) == null || (f = vtlVar.b) == null || vtlVar.c == null || vtlVar.d == null || vtlVar.e == null || vtlVar.o == 0 || vtlVar.f == null || vtlVar.g == null || vtlVar.h == null || vtlVar.i == null || vtlVar.m == null || vtlVar.n == null) {
                StringBuilder sb = new StringBuilder();
                if (vtlVar.s == null) {
                    sb.append(" eventListener");
                }
                if (vtlVar.a == null) {
                    sb.append(" outputPath");
                }
                if (vtlVar.b == null) {
                    sb.append(" videoTargetFrameRate");
                }
                if (vtlVar.c == null) {
                    sb.append(" videoBitRate");
                }
                if (vtlVar.d == null) {
                    sb.append(" videoUnrotatedOutputWidth");
                }
                if (vtlVar.e == null) {
                    sb.append(" videoUnrotatedOutputHeight");
                }
                if (vtlVar.o == 0) {
                    sb.append(" videoOutputOrientation");
                }
                if (vtlVar.f == null) {
                    sb.append(" audioBitRate");
                }
                if (vtlVar.g == null) {
                    sb.append(" audioOutputSampleRate");
                }
                if (vtlVar.h == null) {
                    sb.append(" audioOutputNumChannels");
                }
                if (vtlVar.i == null) {
                    sb.append(" outputSpeedAdjustment");
                }
                if (vtlVar.m == null) {
                    sb.append(" mediaCodecFactory");
                }
                if (vtlVar.n == null) {
                    sb.append(" mediaMuxerFactory");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            vtn vtnVar = new vtn(vyvVar3, vtlVar.p, vtlVar.q, str, f.floatValue(), vtlVar.c.intValue(), vtlVar.d.intValue(), vtlVar.e.intValue(), vtlVar.o, vtlVar.f.intValue(), vtlVar.g.intValue(), vtlVar.h.intValue(), vtlVar.i.floatValue(), vtlVar.j, vtlVar.r, vtlVar.k, vtlVar.l, vtlVar.m, vtlVar.n);
            this.a = vtnVar;
            vst b = vsw.b();
            Context context = vyyVar.a;
            if (context != null) {
                b.a = context;
                bbr bbrVar2 = vyyVar.c;
                if (bbrVar2 != null) {
                    b.b = bbrVar2;
                    b.c = vrxVar2;
                    b.d = vrxVar2;
                    b.e = vrwVar2;
                    b.g = new vyw(vtnVar);
                    b.h = vyvVar2;
                    b.a(true);
                    Context context2 = b.a;
                    if (context2 == null || (bbrVar = b.b) == null || (vrxVar = b.c) == null || (bgwVar = b.d) == null || (vrwVar = b.e) == null || (vywVar = b.g) == null || (vyvVar = b.h) == null || (bool = b.f) == null) {
                        StringBuilder sb3 = new StringBuilder();
                        if (b.a == null) {
                            sb3.append(" context");
                        }
                        if (b.b == null) {
                            sb3.append(" mediaSource");
                        }
                        if (b.c == null) {
                            sb3.append(" videoTextureManager");
                        }
                        if (b.d == null) {
                            sb3.append(" videoFrameMetadataListener");
                        }
                        if (b.e == null) {
                            sb3.append(" audioBufferManager");
                        }
                        if (b.g == null) {
                            sb3.append(" audioListener");
                        }
                        if (b.h == null) {
                            sb3.append(" sourceEventListener");
                        }
                        if (b.f == null) {
                            sb3.append(" forceAudioOutput");
                        }
                        String valueOf2 = String.valueOf(sb3);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                        sb4.append("Missing required properties:");
                        sb4.append(valueOf2);
                        throw new IllegalStateException(sb4.toString());
                    }
                    vsw vswVar = new vsw(context2, bbrVar, vrxVar, bgwVar, vrwVar, vywVar, vyvVar, bool.booleanValue());
                    vyvVar2.a = vtnVar;
                    vyvVar2.b = vswVar;
                    vytVar.c = vtnVar;
                    vytVar.d = vswVar;
                    return;
                }
                throw new NullPointerException("Null mediaSource");
            }
            throw new NullPointerException("Null context");
        }
        throw new NullPointerException("Null outputPath");
    }
}
