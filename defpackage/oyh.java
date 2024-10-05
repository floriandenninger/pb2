package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oyh {
    private static final Map a;

    static {
        new oxf("OMX.google.raw.decoder", null);
        a = new HashMap();
    }

    public static synchronized List a(String str, boolean z) {
        oye oyfVar;
        synchronized (oyh.class) {
            oyc oycVar = new oyc(str, z);
            Map map = a;
            List list = (List) map.get(oycVar);
            if (list != null) {
                return list;
            }
            if (pgz.a >= 21) {
                oyfVar = new oyg(z);
            } else {
                oyfVar = new oyf();
            }
            List b = b(oycVar, oyfVar);
            if (z && b.isEmpty() && pgz.a >= 21 && pgz.a <= 23) {
                b = b(oycVar, new oyf());
                if (!b.isEmpty()) {
                    String str2 = ((oxf) b.get(0)).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List unmodifiableList = Collections.unmodifiableList(b);
            map.put(oycVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static List b(oyc oycVar, oye oyeVar) {
        oyc oycVar2 = oycVar;
        oye oyeVar2 = oyeVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = oycVar2.a;
            int a2 = oyeVar.a();
            boolean d = oyeVar.d();
            int i = 0;
            while (i < a2) {
                MediaCodecInfo b = oyeVar2.b(i);
                String name = b.getName();
                if (!b.isEncoder() && ((d || !name.endsWith(".secure")) && ((pgz.a >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((pgz.a >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && ((pgz.a >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(pgz.b)) && ((pgz.a != 16 || pgz.b == null || !"OMX.qcom.audio.decoder.mp3".equals(name) || (!"dlxu".equals(pgz.b) && !"protou".equals(pgz.b) && !"ville".equals(pgz.b) && !"villeplus".equals(pgz.b) && !"villec2".equals(pgz.b) && !pgz.b.startsWith("gee") && !"C6602".equals(pgz.b) && !"C6603".equals(pgz.b) && !"C6606".equals(pgz.b) && !"C6616".equals(pgz.b) && !"L36h".equals(pgz.b) && !"SO-02E".equals(pgz.b))) && ((pgz.a != 16 || !"OMX.qcom.audio.decoder.aac".equals(name) || (!"C1504".equals(pgz.b) && !"C1505".equals(pgz.b) && !"C1604".equals(pgz.b) && !"C1605".equals(pgz.b))) && ((pgz.a > 19 || pgz.b == null || ((!pgz.b.startsWith("d2") && !pgz.b.startsWith("serrano") && !pgz.b.startsWith("jflte") && !pgz.b.startsWith("santos")) || !"samsung".equals(pgz.c) || !name.equals("OMX.SEC.vp8.dec"))) && (pgz.a > 19 || pgz.b == null || !pgz.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)))))))))) {
                    String[] supportedTypes = b.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = b.getCapabilitiesForType(str2);
                                boolean c = oyeVar2.c(str, capabilitiesForType);
                                if ((d && oycVar2.b == c) || (!d && !oycVar2.b)) {
                                    arrayList.add(new oxf(name, capabilitiesForType));
                                } else if (!d && c) {
                                    arrayList.add(new oxf(String.valueOf(name).concat(".secure"), capabilitiesForType));
                                    return arrayList;
                                }
                            } catch (Exception e) {
                                if (pgz.a <= 23 && !arrayList.isEmpty()) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 46);
                                    sb.append("Skipping codec ");
                                    sb.append(name);
                                    sb.append(" (failed to query capabilities)");
                                    Log.e("MediaCodecUtil", sb.toString());
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(str2).length());
                                    sb2.append("Failed to query codec ");
                                    sb2.append(name);
                                    sb2.append(" (");
                                    sb2.append(str2);
                                    sb2.append(")");
                                    Log.e("MediaCodecUtil", sb2.toString());
                                    throw e;
                                }
                            }
                        }
                        i2++;
                        oycVar2 = oycVar;
                        oyeVar2 = oyeVar;
                    }
                }
                i++;
                oycVar2 = oycVar;
                oyeVar2 = oyeVar;
            }
            return arrayList;
        } catch (Exception e2) {
            throw new oyd(e2);
        }
    }
}
