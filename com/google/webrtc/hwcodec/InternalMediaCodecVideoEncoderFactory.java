package com.google.webrtc.hwcodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import defpackage.acnc;
import defpackage.ajkw;
import defpackage.amkq;
import defpackage.amnv;
import defpackage.amru;
import defpackage.amrv;
import defpackage.amrz;
import defpackage.amxd;
import defpackage.aone;
import defpackage.axin;
import defpackage.axio;
import defpackage.axiq;
import defpackage.axjz;
import defpackage.axka;
import defpackage.axkb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InternalMediaCodecVideoEncoderFactory implements VideoEncoderFactory {
    public static final List a = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private final Map b = new HashMap();
    private final amnv c = amkq.x(ajkw.d);
    private final amnv d;
    private final boolean e;
    private final amrv f;
    private final amrz g;
    private final acnc h;

    public InternalMediaCodecVideoEncoderFactory(amnv amnvVar, boolean z, acnc acncVar, amrv amrvVar, amrz amrzVar, byte[] bArr) {
        Logging.a("IMCVideoEncoderFactory", "InternalMediaCodecVideoEncoderFactory ctor");
        this.d = amnvVar;
        this.e = z;
        this.h = acncVar;
        this.f = amrvVar;
        this.g = amrzVar;
    }

    public static int a(axio axioVar) {
        axio axioVar2 = axio.UNKNOWN;
        axin axinVar = axin.NONE;
        int ordinal = axioVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return 100;
        }
        if (ordinal == 3 || ordinal == 4) {
            return 20;
        }
        if (ordinal == 5) {
            return 100;
        }
        int i = axioVar.g;
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unsupported VideoCodecType ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static axiq b(axio axioVar, String str, axin axinVar) {
        aone createBuilder = axiq.a.createBuilder();
        createBuilder.copyOnWrite();
        axiq axiqVar = (axiq) createBuilder.instance;
        axiqVar.c = axioVar.g;
        axiqVar.b |= 1;
        createBuilder.copyOnWrite();
        axiq axiqVar2 = (axiq) createBuilder.instance;
        axiqVar2.b |= 2;
        axiqVar2.d = str;
        createBuilder.copyOnWrite();
        axiq axiqVar3 = (axiq) createBuilder.instance;
        axiqVar3.e = axinVar.d;
        axiqVar3.b |= 16;
        int a2 = a(axioVar);
        createBuilder.copyOnWrite();
        axiq axiqVar4 = (axiq) createBuilder.instance;
        axiqVar4.b |= 32;
        axiqVar4.f = a2;
        createBuilder.copyOnWrite();
        axiq axiqVar5 = (axiq) createBuilder.instance;
        axiqVar5.b |= 64;
        axiqVar5.g = 0;
        createBuilder.copyOnWrite();
        axiq.a((axiq) createBuilder.instance);
        return (axiq) createBuilder.build();
    }

    public static axjz c() {
        return new axjz();
    }

    private final axka d(axio axioVar) {
        axka axkaVar;
        amru a2;
        if (this.b.containsKey(axioVar)) {
            return (axka) this.b.get(axioVar);
        }
        String c = axkb.c(axioVar);
        Logging.a("IMCVideoEncoderFactory", c.length() != 0 ? "Searching HW encoder for ".concat(c) : new String("Searching HW encoder for "));
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c.get();
            if (mediaCodecInfoArr == null) {
                Logging.b("IMCVideoEncoderFactory", "Empty codec info");
                axkaVar = axka.a;
            } else {
                int length = mediaCodecInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        axkaVar = axka.a;
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
                    if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                        axiq axiqVar = null;
                        if (axkb.e(mediaCodecInfo, axioVar) && (a2 = this.f.a(axioVar)) != null) {
                            String name = mediaCodecInfo.getName();
                            String valueOf = String.valueOf(name);
                            Logging.a("IMCVideoEncoderFactory", valueOf.length() != 0 ? "Found candidate encoder ".concat(valueOf) : new String("Found candidate encoder "));
                            int size = a2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                axiq axiqVar2 = (axiq) a2.get(i2);
                                i2++;
                                if (name.startsWith(axiqVar2.d)) {
                                    String valueOf2 = String.valueOf(name);
                                    Logging.a("IMCVideoEncoderFactory", valueOf2.length() != 0 ? "Found target encoder ".concat(valueOf2) : new String("Found target encoder "));
                                    axiqVar = axiqVar2;
                                }
                            }
                        }
                        if (axiqVar != null) {
                            String name2 = mediaCodecInfo.getName();
                            axio b = axio.b(axiqVar.c);
                            if (b == null) {
                                b = axio.UNKNOWN;
                            }
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(axkb.c(b));
                                axkaVar = new axka(name2, axkb.b(axkb.d, capabilitiesForType.colorFormats), axkb.b(axkb.c, capabilitiesForType.colorFormats), axiqVar, b == axio.H264 && Build.VERSION.SDK_INT >= 23 && name2.startsWith("OMX.Exynos."));
                            } catch (IllegalArgumentException e) {
                                Logging.e("IMCVideoEncoderFactory", "Cannot retrieve encoder capabilities.", e);
                                axkaVar = axka.a;
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e2) {
            Logging.c("IMCVideoEncoderFactory", "Cannot retrieve encoder codec info", e2);
            axkaVar = axka.a;
        }
        this.b.put(axioVar, axkaVar);
        String valueOf3 = String.valueOf(axkaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 15);
        sb.append("Search result: ");
        sb.append(valueOf3);
        Logging.a("IMCVideoEncoderFactory", sb.toString());
        return axkaVar;
    }

    private static native boolean nativeIsSameH264Profile(Map map, Map map2);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r5 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    @Override // org.webrtc.VideoEncoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoCodecInfo[] getImplementations() {
        VideoCodecInfo[] supportedCodecs;
        supportedCodecs = getSupportedCodecs();
        return supportedCodecs;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        amxd listIterator = axkb.a.listIterator();
        while (listIterator.hasNext()) {
            axio axioVar = (axio) listIterator.next();
            axka d = d(axioVar);
            if (!d.b) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (axioVar == axio.H264 && d.g) {
                    arrayList3.add(new VideoCodecInfo(axioVar.name(), axkb.d(axioVar, true)));
                }
                arrayList3.add(new VideoCodecInfo(axioVar.name(), axkb.d(axioVar, false)));
                arrayList = arrayList3;
            }
            arrayList2.addAll(arrayList);
        }
        return (VideoCodecInfo[]) arrayList2.toArray(new VideoCodecInfo[arrayList2.size()]);
    }
}
