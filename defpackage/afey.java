package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afey implements affa {
    public static final amrz a = amrz.m("audio/mp4a-latm", aosx.AAC, "audio/opus", aosx.OPUS, "audio/webm", aosx.OPUS);
    public static final amrz b = amrz.o("video/av01", aosy.AV1, "video/avc", aosy.H264, "video/x-vnd.on2.vp9", aosy.VP9, "video/3gpp", aosy.MPEG4, "video/webm", aosy.VP9);
    public static final amsx c = amsx.s(60, 30);
    public static final amru d;
    public static final amru e;
    private static final afex f;
    private final amnv g = amkq.x(new amnv() { // from class: afew
        @Override // defpackage.amnv
        public final Object get() {
            MediaCodecInfo.CodecCapabilities capabilitiesForType;
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            String[] strArr;
            MediaCodecInfo.CodecCapabilities capabilitiesForType2;
            MediaCodecInfo.AudioCapabilities audioCapabilities;
            amrz amrzVar = afey.a;
            aone createBuilder = ovn.a.createBuilder();
            amrp f2 = amru.f();
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (afey.a.containsKey(str) && (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType(str)) != null && (audioCapabilities = capabilitiesForType2.getAudioCapabilities()) != null) {
                        Integer upper = audioCapabilities.getBitrateRange().getUpper();
                        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        aone createBuilder2 = ovk.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        ovk ovkVar = (ovk) createBuilder2.instance;
                        ovkVar.b |= 2;
                        ovkVar.d = maxInputChannelCount;
                        aosx aosxVar = (aosx) afey.a.get(str);
                        createBuilder2.copyOnWrite();
                        ovk ovkVar2 = (ovk) createBuilder2.instance;
                        ovkVar2.c = aosxVar.m;
                        ovkVar2.b |= 1;
                        if (upper != null) {
                            int intValue = upper.intValue();
                            createBuilder2.copyOnWrite();
                            ovk ovkVar3 = (ovk) createBuilder2.instance;
                            ovkVar3.b |= 4;
                            ovkVar3.e = intValue;
                        }
                        f2.h((ovk) createBuilder2.build());
                    }
                }
            }
            amru g = f2.g();
            createBuilder.copyOnWrite();
            ovn ovnVar = (ovn) createBuilder.instance;
            aony aonyVar = ovnVar.c;
            if (!aonyVar.c()) {
                ovnVar.c = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) g, (List) ovnVar.c);
            amrp f3 = amru.f();
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            for (int i = 0; i < length; i++) {
                MediaCodecInfo mediaCodecInfo2 = codecInfos[i];
                String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = supportedTypes[i2];
                    if (afey.b.containsKey(str2) && (capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str2)) != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                        Integer upper2 = videoCapabilities.getBitrateRange().getUpper();
                        amxd listIterator = afey.c.listIterator();
                        while (listIterator.hasNext()) {
                            int intValue2 = ((Integer) listIterator.next()).intValue();
                            aone createBuilder3 = ovm.a.createBuilder();
                            MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                            aosy aosyVar = (aosy) afey.b.get(str2);
                            createBuilder3.copyOnWrite();
                            int i3 = length;
                            ovm ovmVar = (ovm) createBuilder3.instance;
                            ovmVar.c = aosyVar.l;
                            ovmVar.b |= 1;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar2 = (ovm) createBuilder3.instance;
                            ovmVar2.b |= 1024;
                            ovmVar2.m = intValue2;
                            if (upper2 != null) {
                                int intValue3 = upper2.intValue();
                                createBuilder3.copyOnWrite();
                                ovm ovmVar3 = (ovm) createBuilder3.instance;
                                strArr = supportedTypes;
                                ovmVar3.b |= 2048;
                                ovmVar3.n = intValue3;
                            } else {
                                strArr = supportedTypes;
                            }
                            ammw a2 = afey.a(videoCapabilities, intValue2, afey.d);
                            ammw a3 = afey.a(videoCapabilities, intValue2, afey.e);
                            int i4 = ((afex) a2.a).b;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar4 = (ovm) createBuilder3.instance;
                            int i5 = length2;
                            ovmVar4.b |= 4;
                            ovmVar4.e = i4;
                            int i6 = ((afex) a2.a).a;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar5 = (ovm) createBuilder3.instance;
                            ovmVar5.b |= 8;
                            ovmVar5.f = i6;
                            int i7 = ((afex) a2.b).b;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar6 = (ovm) createBuilder3.instance;
                            ovmVar6.b |= 16;
                            ovmVar6.g = i7;
                            int i8 = ((afex) a2.b).a;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar7 = (ovm) createBuilder3.instance;
                            ovmVar7.b |= 32;
                            ovmVar7.h = i8;
                            int i9 = ((afex) a3.a).b;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar8 = (ovm) createBuilder3.instance;
                            ovmVar8.b |= 64;
                            ovmVar8.i = i9;
                            int i10 = ((afex) a3.a).a;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar9 = (ovm) createBuilder3.instance;
                            ovmVar9.b |= 128;
                            ovmVar9.j = i10;
                            int i11 = ((afex) a3.b).b;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar10 = (ovm) createBuilder3.instance;
                            ovmVar10.b |= 256;
                            ovmVar10.k = i11;
                            int i12 = ((afex) a3.b).a;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar11 = (ovm) createBuilder3.instance;
                            ovmVar11.b |= 512;
                            ovmVar11.l = i12;
                            if (Build.VERSION.SDK_INT >= 29) {
                                boolean isHardwareAccelerated = mediaCodecInfo2.isHardwareAccelerated();
                                createBuilder3.copyOnWrite();
                                ovm ovmVar12 = (ovm) createBuilder3.instance;
                                ovmVar12.b |= 2;
                                ovmVar12.d = isHardwareAccelerated;
                            }
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                            aone createBuilder4 = ovl.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            ovl ovlVar = (ovl) createBuilder4.instance;
                            ovlVar.b |= 16;
                            ovlVar.e = isFeatureSupported;
                            createBuilder4.copyOnWrite();
                            ovl ovlVar2 = (ovl) createBuilder4.instance;
                            ovlVar2.b |= 1;
                            ovlVar2.c = isFeatureSupported;
                            createBuilder4.copyOnWrite();
                            ovl ovlVar3 = (ovl) createBuilder4.instance;
                            ovlVar3.b |= 2;
                            ovlVar3.d = isFeatureSupported;
                            createBuilder3.copyOnWrite();
                            ovm ovmVar13 = (ovm) createBuilder3.instance;
                            ovl ovlVar4 = (ovl) createBuilder4.build();
                            ovlVar4.getClass();
                            ovmVar13.o = ovlVar4;
                            ovmVar13.b |= 4096;
                            f3.h((ovm) createBuilder3.build());
                            codecInfos = mediaCodecInfoArr;
                            length = i3;
                            supportedTypes = strArr;
                            length2 = i5;
                        }
                    }
                    i2++;
                    codecInfos = codecInfos;
                    length = length;
                    supportedTypes = supportedTypes;
                    length2 = length2;
                }
            }
            amru g2 = f3.g();
            createBuilder.copyOnWrite();
            ovn ovnVar2 = (ovn) createBuilder.instance;
            aony aonyVar2 = ovnVar2.b;
            if (!aonyVar2.c()) {
                ovnVar2.b = aonm.mutableCopy(aonyVar2);
            }
            aolo.addAll((Iterable) g2, (List) ovnVar2.b);
            return (ovn) createBuilder.build();
        }
    });

    static {
        amru A = amru.A(afex.a(8192, 8192), afex.a(7680, 4320), afex.a(3840, 2160), afex.a(2560, 1440), afex.a(1920, 1080), afex.a(1280, 720), afex.a(960, 540), afex.a(854, 480), afex.a(640, 360), afex.a(426, 240), afex.a(256, 144), afex.a(128, 72), new afex[0]);
        d = A;
        amrp h = amru.h(((amvj) A).c);
        int i = ((amvj) A).c;
        for (int i2 = 0; i2 < i; i2++) {
            afex afexVar = (afex) A.get(i2);
            h.h(afex.a(afexVar.b, afexVar.a));
        }
        e = h.g();
        f = afex.a(0, 0);
    }

    public static ammw a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, amru amruVar) {
        int i2 = ((amvj) amruVar).c;
        afex afexVar = null;
        afex afexVar2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            afex afexVar3 = (afex) amruVar.get(i3);
            if (videoCapabilities.areSizeAndRateSupported(afexVar3.a, afexVar3.b, i)) {
                if (afexVar == null) {
                    afexVar = afexVar3;
                    afexVar2 = afexVar;
                } else {
                    afexVar2 = afexVar3;
                }
            }
        }
        if (afexVar == null) {
            afexVar = f;
        }
        if (afexVar2 == null) {
            afexVar2 = f;
        }
        return ammw.a(afexVar, afexVar2);
    }

    @Override // defpackage.affa
    public final amnv b() {
        return this.g;
    }
}
