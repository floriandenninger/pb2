package defpackage;

import android.os.Build;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afje {
    public static final amnv a = advx.q;
    public static final amnv b = advx.o;
    public static final amnv c = advx.n;
    public static final amnv d = advx.p;
    public static final afjd e = new afjd(amvs.a, 0);
    public static final afjc f = new afjc(amvs.a, 0);

    public static boolean a(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, amnv amnvVar) {
        aquz aquzVar = playerConfigModel.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.bp && ((Boolean) amnvVar.get()).booleanValue() && videoStreamingData.s && !videoStreamingData.v;
    }

    public static afjc b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar, amnv amnvVar) {
        Set a2;
        if (!playerConfigModel.av() || !playerConfigModel.aD() || !videoStreamingData.r() || (!afhsVar.aM(playerConfigModel.W()) && (!playerConfigModel.aC() || !((Boolean) amnvVar.get()).booleanValue()))) {
            if (!playerConfigModel.av() || !videoStreamingData.v()) {
                if (h(videoStreamingData, playerConfigModel, afhsVar, amnvVar)) {
                    return new afjc(f(afhsVar, playerConfigModel, videoStreamingData), 5);
                }
                if (i(videoStreamingData, playerConfigModel, afhsVar)) {
                    return new afjc(f(afhsVar, playerConfigModel, videoStreamingData), 2);
                }
                if (afhsVar.G() || videoStreamingData.D()) {
                    a2 = aaoq.a();
                } else {
                    a2 = new HashSet(aaoq.a());
                    a2.remove(Integer.valueOf(aaoq.aR));
                }
                return new afjc(a2, 2);
            }
            return new afjc(aaoq.x(), 7);
        }
        return new afjc(aaoq.s(), 6);
    }

    public static afjd c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar, amnv amnvVar) {
        aapa ar;
        aapa ar2;
        if (afhsVar.W()) {
            int i = videoStreamingData.z;
            boolean z = videoStreamingData.x;
            if (i != 3 && !z && !videoStreamingData.v && ((ar2 = afhsVar.ar()) == aapa.DEFAULT || ar2 == aapa.AV1_MEDIA_CODEC_HW)) {
                Set W = playerConfigModel.W();
                Set X = playerConfigModel.X();
                if (Build.VERSION.SDK_INT >= 29 && afhsVar.aI("av1_profile_main_10_supported", "video/av01", false, W, X, 4096) && afhsVar.aT(i)) {
                    return new afjd(aaoq.l(), 3);
                }
            }
        }
        if (l(videoStreamingData, playerConfigModel, afhsVar)) {
            return new afjd(aaoq.z(), 3);
        }
        if (n(videoStreamingData, playerConfigModel, afhsVar)) {
            return new afjd(aaoq.z(), 2);
        }
        if (!m(videoStreamingData, playerConfigModel, afhsVar, amnvVar)) {
            if (videoStreamingData.s && !videoStreamingData.v) {
                aapa ar3 = afhsVar.ar();
                boolean z2 = true;
                if ((ar3 != aapa.DEFAULT || !afhsVar.z()) && ar3 != aapa.AV1_MEDIA_CODEC_HW && !videoStreamingData.D()) {
                    z2 = false;
                }
                Set W2 = playerConfigModel.W();
                Set X2 = playerConfigModel.X();
                if (z2 && afhsVar.aH(W2, X2)) {
                    return new afjd(aaoq.d(), 3);
                }
            }
            if (!a(playerConfigModel, videoStreamingData, c)) {
                if (!videoStreamingData.s || videoStreamingData.v || ((((ar = afhsVar.ar()) != aapa.DEFAULT || !afhsVar.y()) && ar != aapa.AV1_MEDIA_CODEC && !videoStreamingData.D()) || !afhsVar.aG(playerConfigModel.W()))) {
                    Set d2 = d(afhsVar, videoStreamingData);
                    if (o(videoStreamingData, playerConfigModel, afhsVar)) {
                        return new afjd(d2, 3);
                    }
                    if (q(videoStreamingData, playerConfigModel, afhsVar)) {
                        return new afjd(d2, 2);
                    }
                    if (p(videoStreamingData, playerConfigModel, afhsVar, amnvVar)) {
                        return new afjd(d2, 4);
                    }
                    return g(videoStreamingData, playerConfigModel, afhsVar) ? new afjd(e(afhsVar, videoStreamingData), 2) : e;
                }
                return new afjd(aaoq.d(), 2);
            }
            return new afjd(aaoq.d(), 8);
        }
        return new afjd(aaoq.z(), 4);
    }

    public static Set d(afhs afhsVar, VideoStreamingData videoStreamingData) {
        HashSet hashSet = new HashSet(aaoq.y());
        if (!afhsVar.V(afhsVar.p.a.a.Y(axzc.g).B())) {
            hashSet.removeAll((Set) aaoq.by.get());
        }
        if ((afhsVar.I() && afhsVar.K()) || videoStreamingData.D()) {
            return hashSet;
        }
        hashSet.remove(Integer.valueOf(aaoq.B));
        return hashSet;
    }

    public static Set e(afhs afhsVar, VideoStreamingData videoStreamingData) {
        HashSet hashSet = new HashSet(aaoq.p());
        if ((afhsVar.I() && afhsVar.H()) || videoStreamingData.D()) {
            return hashSet;
        }
        hashSet.remove(Integer.valueOf(aaoq.aA));
        return hashSet;
    }

    static Set f(afhs afhsVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (afhsVar.G() || videoStreamingData.D()) {
            return aaoq.u(playerConfigModel.aY());
        }
        HashSet hashSet = new HashSet(aaoq.u(playerConfigModel.aY()));
        hashSet.remove(Integer.valueOf(aaoq.T));
        return hashSet;
    }

    public static boolean g(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar) {
        if (!videoStreamingData.u) {
            return false;
        }
        aapa ar = afhsVar.ar();
        if (ar == aapa.DEFAULT || ar == aapa.H264_MEDIA_CODEC) {
            return afhsVar.aK(playerConfigModel.W());
        }
        return false;
    }

    public static boolean h(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar, amnv amnvVar) {
        int aW;
        return ((playerConfigModel.aK() && (aW = anaf.aW(afhsVar.p().q)) != 0 && aW == 5) || videoStreamingData.D()) && videoStreamingData.s() && ((Boolean) amnvVar.get()).booleanValue();
    }

    public static boolean i(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar) {
        int aW;
        return ((playerConfigModel.aK() && (aW = anaf.aW(afhsVar.p().q)) != 0 && aW == 3) || videoStreamingData.D()) && videoStreamingData.s() && afhsVar.aM(playerConfigModel.W());
    }

    public static boolean j(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar, amnv amnvVar) {
        return q(videoStreamingData, playerConfigModel, afhsVar) || o(videoStreamingData, playerConfigModel, afhsVar) || p(videoStreamingData, playerConfigModel, afhsVar, amnvVar) || m(videoStreamingData, playerConfigModel, afhsVar, amnvVar) || l(videoStreamingData, playerConfigModel, afhsVar) || n(videoStreamingData, playerConfigModel, afhsVar);
    }

    public static boolean k(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afhs afhsVar, amnv amnvVar) {
        return m(videoStreamingData, playerConfigModel, afhsVar, amnvVar) || l(videoStreamingData, playerConfigModel, afhsVar) || n(videoStreamingData, playerConfigModel, afhsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3.aE == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r2 = r5.W();
        r5 = r5.X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r6.aT(r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r4.v != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r6.aO(r2, r5) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (r2 == defpackage.aapa.VP9_MEDIA_CODEC_HW) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean l(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r4, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r5, defpackage.afhs r6) {
        /*
            int r0 = r4.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L3c
            boolean r2 = r4.v
            if (r2 != 0) goto L3c
            aapa r2 = r6.ar()
            aapa r3 = defpackage.aapa.DEFAULT
            if (r2 != r3) goto L1e
            atyi r3 = r5.c
            aquz r3 = r3.e
            if (r3 != 0) goto L1a
            aquz r3 = defpackage.aquz.b
        L1a:
            boolean r3 = r3.aE
            if (r3 != 0) goto L22
        L1e:
            aapa r3 = defpackage.aapa.VP9_MEDIA_CODEC_HW
            if (r2 != r3) goto L3c
        L22:
            java.util.Set r2 = r5.W()
            java.util.Set r5 = r5.X()
            boolean r0 = r6.aT(r0)
            if (r0 == 0) goto L3c
            boolean r4 = r4.v
            if (r4 != 0) goto L3c
            boolean r4 = r6.aO(r2, r5)
            if (r4 == 0) goto L3c
            r4 = 1
            return r4
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.l(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r4.aH() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r5.m == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 25) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r5.e.getConfiguration().isScreenWideColorGamut() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r3 = (defpackage.awvr) r5.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if ((r3.b & 1024) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r3 = r3.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r3 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r3 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r3.contains("EGL_KHR_gl_colorspace") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r3.contains("EGL_EXT_gl_colorspace_display_p3") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r5.f.b(new defpackage.eou(r3, 20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (((java.lang.Boolean) r6.get()).booleanValue() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0026, code lost:
    
        if (r3 == defpackage.aapa.VP9_LIBVPX_GL) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean m(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afhs r5, defpackage.amnv r6) {
        /*
            int r0 = r3.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L8c
            boolean r3 = r3.v
            if (r3 != 0) goto L8c
            aapa r3 = r5.ar()
            aapa r0 = defpackage.aapa.DEFAULT
            if (r3 != r0) goto L24
            atyi r0 = r4.c
            aquz r0 = r0.e
            if (r0 != 0) goto L1a
            aquz r0 = defpackage.aquz.b
        L1a:
            boolean r0 = r0.aD
            if (r0 == 0) goto L24
            boolean r4 = r4.aH()
            if (r4 != 0) goto L28
        L24:
            aapa r4 = defpackage.aapa.VP9_LIBVPX_GL
            if (r3 != r4) goto L8c
        L28:
            boolean r3 = r5.m
            if (r3 == 0) goto L2d
            goto L8c
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            r0 = 1
            if (r3 > r4) goto L35
            goto L7f
        L35:
            android.content.res.Resources r3 = r5.e
            android.content.res.Configuration r3 = r3.getConfiguration()
            boolean r3 = r3.isScreenWideColorGamut()
            if (r3 == 0) goto L7f
            ywr r3 = r5.f
            aooy r3 = r3.c()
            awvr r3 = (defpackage.awvr) r3
            int r4 = r3.b
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L52
            boolean r3 = r3.s
            goto L7d
        L52:
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.eglGetDisplay(r1)
            r4 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r3 = android.opengl.EGL14.eglQueryString(r3, r4)
            if (r3 == 0) goto L70
            java.lang.String r4 = "EGL_KHR_gl_colorspace"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L70
            java.lang.String r4 = "EGL_EXT_gl_colorspace_display_p3"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L70
            r3 = 1
            goto L71
        L70:
            r3 = 0
        L71:
            ywr r4 = r5.f
            eou r5 = new eou
            r2 = 20
            r5.<init>(r3, r2)
            r4.b(r5)
        L7d:
            if (r3 == 0) goto L8c
        L7f:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8c
            return r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.m(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs, amnv):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r2.aF == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r3 = r4.W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.aT(r0) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5.aO(r3, defpackage.amvs.a) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0020, code lost:
    
        if (r3 == defpackage.aapa.VP9_MEDIA_CODEC) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afhs r5) {
        /*
            int r0 = r3.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L36
            boolean r3 = r3.v
            if (r3 != 0) goto L36
            aapa r3 = r5.ar()
            aapa r2 = defpackage.aapa.DEFAULT
            if (r3 != r2) goto L1e
            atyi r2 = r4.c
            aquz r2 = r2.e
            if (r2 != 0) goto L1a
            aquz r2 = defpackage.aquz.b
        L1a:
            boolean r2 = r2.aF
            if (r2 != 0) goto L22
        L1e:
            aapa r2 = defpackage.aapa.VP9_MEDIA_CODEC
            if (r3 != r2) goto L36
        L22:
            java.util.Set r3 = r4.W()
            boolean r4 = r5.aT(r0)
            if (r4 == 0) goto L36
            amvs r4 = defpackage.amvs.a
            boolean r3 = r5.aO(r3, r4)
            if (r3 == 0) goto L36
            r3 = 1
            return r3
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r1.ap == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean o(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r2, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r3, defpackage.afhs r4) {
        /*
            boolean r0 = r2.t
            if (r0 == 0) goto L38
            aapa r0 = r4.ar()
            boolean r2 = r2.v
            aapa r1 = defpackage.aapa.DEFAULT
            if (r0 != r1) goto L20
            boolean r1 = r3.j
            if (r1 == 0) goto L20
            if (r2 == 0) goto L24
            atyi r1 = r3.c
            aquz r1 = r1.e
            if (r1 != 0) goto L1c
            aquz r1 = defpackage.aquz.b
        L1c:
            boolean r1 = r1.ap
            if (r1 != 0) goto L24
        L20:
            aapa r1 = defpackage.aapa.VP9_MEDIA_CODEC_HW
            if (r0 != r1) goto L38
        L24:
            java.util.Set r0 = r3.W()
            java.util.Set r3 = r3.X()
            if (r2 == 0) goto L33
            boolean r2 = r4.aN(r0, r3)
            goto L37
        L33:
            boolean r2 = r4.aQ(r0, r3)
        L37:
            return r2
        L38:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.o(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r5.aK(r4.W()) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean p(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afhs r5, defpackage.amnv r6) {
        /*
            boolean r0 = r3.t
            r1 = 0
            if (r0 == 0) goto L73
            boolean r0 = r3.v
            if (r0 != 0) goto L73
            boolean r0 = r3.u
            if (r0 != 0) goto L1f
            boolean r0 = r3.t()
            if (r0 == 0) goto L14
            goto L1f
        L14:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L1f:
            aapa r0 = r5.ar()
            aapa r2 = defpackage.aapa.DEFAULT
            if (r0 != r2) goto L2d
            boolean r2 = r4.aG()
            if (r2 != 0) goto L5f
        L2d:
            int r0 = r0.ordinal()
            r2 = 5
            if (r0 == r2) goto L5f
            r2 = 6
            if (r0 == r2) goto L5f
            int r0 = r4.s()
            int r0 = r3.a(r0)
            int r2 = r5.f()
            if (r0 <= r2) goto L5f
            atyi r0 = r4.c
            aquz r0 = r0.e
            if (r0 != 0) goto L4d
            aquz r0 = defpackage.aquz.b
        L4d:
            boolean r0 = r0.O
            if (r0 == 0) goto L73
            boolean r3 = r3.u
            if (r3 == 0) goto L5f
            java.util.Set r3 = r4.W()
            boolean r3 = r5.aK(r3)
            if (r3 != 0) goto L73
        L5f:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L73
            boolean r3 = r5.aR()
            if (r3 == 0) goto L73
            r3 = 1
            return r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.p(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs, amnv):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r2.I != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (r2.H == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean q(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afhs r5) {
        /*
            boolean r0 = r3.t
            if (r0 == 0) goto L6a
            aapa r0 = r5.ar()
            boolean r1 = r3.v
            aapa r2 = defpackage.aapa.DEFAULT
            if (r0 != r2) goto L2d
            boolean r2 = r4.j
            if (r2 == 0) goto L2d
            if (r1 == 0) goto L21
            atyi r2 = r4.c
            aquz r2 = r2.e
            if (r2 != 0) goto L1c
            aquz r2 = defpackage.aquz.b
        L1c:
            boolean r2 = r2.I
            if (r2 == 0) goto L2d
            goto L56
        L21:
            atyi r2 = r4.c
            aquz r2 = r2.e
            if (r2 != 0) goto L29
            aquz r2 = defpackage.aquz.b
        L29:
            boolean r2 = r2.H
            if (r2 != 0) goto L56
        L2d:
            aapa r2 = defpackage.aapa.VP9_MEDIA_CODEC
            if (r0 == r2) goto L56
            boolean r0 = r3.u
            if (r0 != 0) goto L3b
            boolean r0 = r3.t()
            if (r0 == 0) goto L56
        L3b:
            atyi r0 = r4.c
            aquz r0 = r0.e
            if (r0 != 0) goto L43
            aquz r0 = defpackage.aquz.b
        L43:
            boolean r0 = r0.f98J
            if (r0 == 0) goto L6a
            boolean r3 = r3.u
            if (r3 == 0) goto L56
            java.util.Set r3 = r4.W()
            boolean r3 = r5.aK(r3)
            if (r3 == 0) goto L56
            goto L6a
        L56:
            java.util.Set r3 = r4.W()
            if (r1 == 0) goto L63
            amvs r4 = defpackage.amvs.a
            boolean r3 = r5.aN(r3, r4)
            goto L69
        L63:
            amvs r4 = defpackage.amvs.a
            boolean r3 = r5.aQ(r3, r4)
        L69:
            return r3
        L6a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afje.q(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afhs):boolean");
    }
}
