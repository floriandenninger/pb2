package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjo implements VideoDecoderFactory {
    public final amnv a;
    public final amsx b;
    private final Map c = new HashMap();
    private final amnv d = amkq.x(ajkw.c);
    private final amrv e;

    public axjo(amnv amnvVar, amrv amrvVar, amsx amsxVar) {
        Logging.a("IMCVideoDecoderFactory", "InternalMediaCodecVideoDecoderFactory ctor.");
        this.a = amnvVar;
        this.e = amrvVar;
        this.b = amsxVar;
    }

    public static axip a(axio axioVar, String str) {
        aone createBuilder = axip.a.createBuilder();
        createBuilder.copyOnWrite();
        axip axipVar = (axip) createBuilder.instance;
        axipVar.c = axioVar.g;
        axipVar.b |= 1;
        createBuilder.copyOnWrite();
        axip axipVar2 = (axip) createBuilder.instance;
        axipVar2.b |= 2;
        axipVar2.d = str;
        return (axip) createBuilder.build();
    }

    public final axjn b(axio axioVar) {
        axjn axjnVar;
        amru a;
        if (this.c.containsKey(axioVar)) {
            return (axjn) this.c.get(axioVar);
        }
        String c = axkb.c(axioVar);
        Logging.a("IMCVideoDecoderFactory", c.length() != 0 ? "Searching HW decoder for ".concat(c) : new String("Searching HW decoder for "));
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.d.get();
            if (mediaCodecInfoArr == null) {
                Logging.b("IMCVideoDecoderFactory", "Empty media codec info");
                axjnVar = axjn.a;
            } else {
                int length = mediaCodecInfoArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        axjnVar = axjn.a;
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        axip axipVar = null;
                        if (axkb.e(mediaCodecInfo, axioVar) && (a = this.e.a(axioVar)) != null) {
                            String name = mediaCodecInfo.getName();
                            String valueOf = String.valueOf(name);
                            Logging.a("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Found candidate decoder ".concat(valueOf) : new String("Found candidate decoder "));
                            int size = a.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                axip axipVar2 = (axip) a.get(i2);
                                i2++;
                                if (name.startsWith(axipVar2.d)) {
                                    String valueOf2 = String.valueOf(name);
                                    Logging.a("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Found target decoder ".concat(valueOf2) : new String("Found target decoder "));
                                    axipVar = axipVar2;
                                }
                            }
                        }
                        if (axipVar != null) {
                            String name2 = mediaCodecInfo.getName();
                            axio b = axio.b(axipVar.c);
                            if (b == null) {
                                b = axio.UNKNOWN;
                            }
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(axkb.c(b));
                                for (int i3 : capabilitiesForType.colorFormats) {
                                    String valueOf3 = String.valueOf(Integer.toHexString(i3));
                                    Logging.a("IMCVideoDecoderFactory", valueOf3.length() != 0 ? "   Color: 0x".concat(valueOf3) : new String("   Color: 0x"));
                                }
                                Integer b2 = axkb.b(axkb.b, capabilitiesForType.colorFormats);
                                if (b2 == null) {
                                    Logging.d("IMCVideoDecoderFactory", "Can not find supported color format. Only surface decoding is supported.");
                                    b2 = 0;
                                }
                                if (b == axio.H264 && (name2.startsWith("OMX.qcom.") || (Build.VERSION.SDK_INT >= 23 && name2.startsWith("OMX.Exynos.")))) {
                                    z = true;
                                }
                                axjnVar = new axjn(name2, b2.intValue(), z, axipVar);
                            } catch (IllegalArgumentException e) {
                                Logging.c("IMCVideoDecoderFactory", "Cannot retrieve decoder capabilities", e);
                                axjnVar = axjn.a;
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e2) {
            Logging.c("IMCVideoDecoderFactory", "Cannot retrieve media codec info", e2);
            axjnVar = axjn.a;
        }
        this.c.put(axioVar, axjnVar);
        String valueOf4 = String.valueOf(axjnVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 15);
        sb.append("Search result: ");
        sb.append(valueOf4);
        Logging.a("IMCVideoDecoderFactory", sb.toString());
        return axjnVar;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        try {
            axio h = awxt.h(videoCodecInfo.a);
            boolean contains = this.b.contains(h);
            String str = videoCodecInfo.a;
            String c = axkb.c(h);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + c.length());
            sb.append("createDecoder for type: ");
            sb.append(str);
            sb.append(", mime: ");
            sb.append(c);
            sb.append(", dynamic reconfig: ");
            sb.append(contains);
            Logging.a("IMCVideoDecoderFactory", sb.toString());
            axjn b = b(h);
            if (!b.b) {
                String valueOf = String.valueOf(videoCodecInfo.a);
                Logging.b("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Unsupported decoder: ".concat(valueOf) : new String("Unsupported decoder: "));
                return null;
            }
            return new axjl(b.c, h, b.d, b.f, this.a, contains);
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(videoCodecInfo.a);
            Logging.c("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Unknown codec type: ".concat(valueOf2) : new String("Unknown codec type: "), e);
            return null;
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo videoCodecInfo;
        ArrayList arrayList = new ArrayList();
        amxd listIterator = axkb.a.listIterator();
        while (listIterator.hasNext()) {
            axio axioVar = (axio) listIterator.next();
            axjn b = b(axioVar);
            if (b.b) {
                boolean z = false;
                if (axioVar == axio.H264 && b.e) {
                    z = true;
                }
                videoCodecInfo = new VideoCodecInfo(axioVar.name(), axkb.d(axioVar, z));
            } else {
                videoCodecInfo = null;
            }
            if (videoCodecInfo != null) {
                arrayList.add(videoCodecInfo);
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
