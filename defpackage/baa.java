package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baa {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    private final boolean g;

    public baa(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        pse.c(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.e = z;
        this.f = z2;
        this.g = psz.l(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(pts.b(i, widthAlignment) * widthAlignment, pts.b(i2, heightAlignment) * heightAlignment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r11.isFeatureSupported("secure-playback") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.baa g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12) {
        /*
            baa r7 = new baa
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L3d
            int r2 = defpackage.pts.a
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L3d
            int r2 = defpackage.pts.a
            r3 = 22
            if (r2 > r3) goto L3b
            java.lang.String r2 = defpackage.pts.d
            java.lang.String r3 = "ODROID-XU3"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2a
            java.lang.String r2 = defpackage.pts.d
            java.lang.String r3 = "Nexus 10"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3b
        L2a:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L3b
            goto L3d
        L3b:
            r5 = 1
            goto L3e
        L3d:
            r5 = 0
        L3e:
            if (r11 == 0) goto L47
            int r2 = defpackage.pts.a
            java.lang.String r2 = "tunneled-playback"
            r11.isFeatureSupported(r2)
        L47:
            if (r12 != 0) goto L58
            if (r11 == 0) goto L56
            int r12 = defpackage.pts.a
            java.lang.String r12 = "secure-playback"
            boolean r12 = r11.isFeatureSupported(r12)
            if (r12 == 0) goto L56
            goto L58
        L56:
            r6 = 0
            goto L59
        L58:
            r6 = 1
        L59:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baa.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean):baa");
    }

    private final void h(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = pts.e;
        String.valueOf(str).length();
        str2.length();
        String.valueOf(str3).length();
        String.valueOf(str4).length();
    }

    private static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final auk b(pms pmsVar, pms pmsVar2) {
        int i = true != pts.R(pmsVar.n, pmsVar2.n) ? 8 : 0;
        if (this.g) {
            if (pmsVar.v != pmsVar2.v) {
                i |= 1024;
            }
            if (!this.e && (pmsVar.s != pmsVar2.s || pmsVar.t != pmsVar2.t)) {
                i |= 512;
            }
            if (!pts.R(pmsVar.z, pmsVar2.z)) {
                i |= 2048;
            }
            String str = this.a;
            if (pts.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !pmsVar.e(pmsVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new auk(this.a, pmsVar, pmsVar2, true != pmsVar.e(pmsVar2) ? 2 : 3, 0);
            }
        } else {
            if (pmsVar.A != pmsVar2.A) {
                i |= 4096;
            }
            if (pmsVar.B != pmsVar2.B) {
                i |= 8192;
            }
            if (pmsVar.C != pmsVar2.C) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair a = bao.a(pmsVar);
                Pair a2 = bao.a(pmsVar2);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new auk(this.a, pmsVar, pmsVar2, 3, 0);
                    }
                }
            }
            if (!pmsVar.e(pmsVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new auk(this.a, pmsVar, pmsVar2, 1, 0);
            }
        }
        return new auk(this.a, pmsVar, pmsVar2, 0, i);
    }

    public final boolean c(pms pmsVar) {
        int i;
        String e;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = pmsVar.k;
        int i2 = 16;
        if (str != null && this.b != null && (e = psz.e(str)) != null) {
            if (!this.b.equals(e)) {
                String str2 = pmsVar.k;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + e.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(e);
                h(sb.toString());
            } else {
                Pair a = bao.a(pmsVar);
                if (a != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a.second).intValue();
                    if (!this.g) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] f = f();
                    if (pts.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && f.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        int i3 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i3;
                        f = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : f) {
                        if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        }
                    }
                    String str3 = pmsVar.k;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + e.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(e);
                    h(sb2.toString());
                }
            }
            return false;
        }
        if (this.g) {
            int i4 = pmsVar.s;
            if (i4 <= 0 || (i = pmsVar.t) <= 0) {
                return true;
            }
            int i5 = pts.a;
            return e(i4, i, pmsVar.u);
        }
        int i6 = pts.a;
        int i7 = pmsVar.B;
        if (i7 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                h("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                    StringBuilder sb3 = new StringBuilder(31);
                    sb3.append("sampleRate.support, ");
                    sb3.append(i7);
                    h(sb3.toString());
                }
            }
            return false;
        }
        int i8 = pmsVar.A;
        if (i8 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
        if (codecCapabilities3 == null) {
            h("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                h("channelCount.aCaps");
            } else {
                String str4 = this.a;
                String str5 = this.b;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((pts.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                    if ("audio/ac3".equals(str5)) {
                        i2 = 6;
                    } else if (!"audio/eac3".equals(str5)) {
                        i2 = 30;
                    }
                    StringBuilder sb4 = new StringBuilder(str4.length() + 59);
                    sb4.append("AssumedMaxChannelAdjustment: ");
                    sb4.append(str4);
                    sb4.append(", [");
                    sb4.append(maxInputChannelCount);
                    sb4.append(" to ");
                    sb4.append(i2);
                    sb4.append("]");
                    Log.w("MediaCodecInfo", sb4.toString());
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount >= i8) {
                    return true;
                }
                StringBuilder sb5 = new StringBuilder(33);
                sb5.append("channelCount.support, ");
                sb5.append(i8);
                h(sb5.toString());
            }
        }
        return false;
    }

    public final boolean d(pms pmsVar) {
        if (this.g) {
            return this.e;
        }
        Pair a = bao.a(pmsVar);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        if (i(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) || !"mcv5a".equals(pts.b)) && i(videoCapabilities, i2, i, d))) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.rotated, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("x");
            sb.append(d);
            String sb2 = sb.toString();
            String str = this.a;
            String str2 = this.b;
            String str3 = pts.e;
            String.valueOf(sb2).length();
            str.length();
            String.valueOf(str2).length();
            String.valueOf(str3).length();
            return true;
        }
        StringBuilder sb3 = new StringBuilder(69);
        sb3.append("sizeAndRate.support, ");
        sb3.append(i);
        sb3.append("x");
        sb3.append(i2);
        sb3.append("x");
        sb3.append(d);
        h(sb3.toString());
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.d.profileLevels;
    }

    public final String toString() {
        return this.a;
    }
}
