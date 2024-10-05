package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.webrtc.LibaomAv1Decoder;
import org.webrtc.LibvpxVp8Decoder;
import org.webrtc.LibvpxVp9Decoder;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkj implements VideoDecoderFactory {
    private final VideoDecoderFactory a;

    public axkj(baog baogVar) {
        axjm axjmVar = new axjm();
        axjmVar.a = amkq.y(baogVar);
        this.a = new axjo(axjmVar.a, amrv.b(axjmVar.b), axjmVar.c.g());
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder libaomAv1Decoder;
        String name = videoCodecInfo.getName();
        axjl axjlVar = null;
        if (name.equalsIgnoreCase("VP8")) {
            libaomAv1Decoder = new LibvpxVp8Decoder();
        } else if (name.equalsIgnoreCase("VP9") && LibvpxVp9Decoder.nativeIsSupported()) {
            libaomAv1Decoder = new LibvpxVp9Decoder();
        } else {
            libaomAv1Decoder = (name.equalsIgnoreCase("AV1") && LibaomAv1Decoder.nativeIsSupported()) ? new LibaomAv1Decoder() : null;
        }
        VideoDecoderFactory videoDecoderFactory = this.a;
        try {
            axio h = awxt.h(videoCodecInfo.a);
            axjo axjoVar = (axjo) videoDecoderFactory;
            boolean contains = axjoVar.b.contains(h);
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
            axjn b = axjoVar.b(h);
            if (!b.b) {
                String valueOf = String.valueOf(videoCodecInfo.a);
                Logging.b("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Unsupported decoder: ".concat(valueOf) : new String("Unsupported decoder: "));
            } else {
                axjlVar = new axjl(b.c, h, b.d, b.f, axjoVar.a, contains);
            }
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(videoCodecInfo.a);
            Logging.c("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Unknown codec type: ".concat(valueOf2) : new String("Unknown codec type: "), e);
        }
        if (axjlVar == null || libaomAv1Decoder == null) {
            return axjlVar != null ? axjlVar : libaomAv1Decoder;
        }
        return new VideoDecoderFallback(libaomAv1Decoder, axjlVar);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo videoCodecInfo;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        if (LibaomAv1Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("AV1", new HashMap()));
        }
        linkedHashSet.addAll(Arrays.asList((VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()])));
        VideoDecoderFactory videoDecoderFactory = this.a;
        ArrayList arrayList2 = new ArrayList();
        amxd listIterator = axkb.a.listIterator();
        while (listIterator.hasNext()) {
            axio axioVar = (axio) listIterator.next();
            axjn b = ((axjo) videoDecoderFactory).b(axioVar);
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
                arrayList2.add(videoCodecInfo);
            }
        }
        linkedHashSet.addAll(Arrays.asList((VideoCodecInfo[]) arrayList2.toArray(new VideoCodecInfo[arrayList2.size()])));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
