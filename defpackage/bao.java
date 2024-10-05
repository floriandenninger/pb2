package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bao {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap c = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0301 A[Catch: NumberFormatException -> 0x0311, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0311, blocks: (B:145:0x02a6, B:147:0x02b8, B:158:0x02d4, B:161:0x0301), top: B:144:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(defpackage.pms r17) {
        /*
            Method dump skipped, instructions count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bao.a(pms):android.util.Pair");
    }

    public static baa b() {
        List c2 = c("audio/raw", false, false);
        if (c2.isEmpty()) {
            return null;
        }
        return (baa) c2.get(0);
    }

    public static synchronized List c(String str, boolean z, boolean z2) {
        synchronized (bao.class) {
            bai baiVar = new bai(str, z, z2);
            HashMap hashMap = c;
            List list = (List) hashMap.get(baiVar);
            if (list != null) {
                return list;
            }
            int i = pts.a;
            ArrayList e = e(baiVar, new bam(z, z2));
            if (z && e.isEmpty() && pts.a <= 23) {
                e = e(baiVar, new bal());
                if (!e.isEmpty()) {
                    String str2 = ((baa) e.get(0)).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (pts.a < 26 && pts.b.equals("R9") && e.size() == 1 && ((baa) e.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    e.add(baa.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                }
                f(e, new ban() { // from class: bag
                    @Override // defpackage.ban
                    public final int a(Object obj) {
                        int i2 = bao.a;
                        String str3 = ((baa) obj).a;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (pts.a >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (pts.a < 32 && e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((baa) e.get(0)).a)) {
                e.add((baa) e.remove(0));
            }
            List unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(baiVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List d(List list, final pms pmsVar) {
        ArrayList arrayList = new ArrayList(list);
        f(arrayList, new ban() { // from class: baf
            @Override // defpackage.ban
            public final int a(Object obj) {
                pms pmsVar2 = pms.this;
                baa baaVar = (baa) obj;
                int i = bao.a;
                try {
                    return !baaVar.c(pmsVar2) ? 0 : 1;
                } catch (baj unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0171 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:60:0x0139, B:64:0x0144, B:68:0x0157, B:70:0x015d, B:71:0x0164, B:73:0x016d, B:75:0x0190, B:98:0x0199, B:109:0x0171, B:111:0x0181, B:113:0x0189, B:114:0x0161), top: B:59:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:60:0x0139, B:64:0x0144, B:68:0x0157, B:70:0x015d, B:71:0x0164, B:73:0x016d, B:75:0x0190, B:98:0x0199, B:109:0x0171, B:111:0x0181, B:113:0x0189, B:114:0x0161), top: B:59:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:60:0x0139, B:64:0x0144, B:68:0x0157, B:70:0x015d, B:71:0x0164, B:73:0x016d, B:75:0x0190, B:98:0x0199, B:109:0x0171, B:111:0x0181, B:113:0x0189, B:114:0x0161), top: B:59:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:60:0x0139, B:64:0x0144, B:68:0x0157, B:70:0x015d, B:71:0x0164, B:73:0x016d, B:75:0x0190, B:98:0x0199, B:109:0x0171, B:111:0x0181, B:113:0x0189, B:114:0x0161), top: B:59:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190 A[Catch: Exception -> 0x01be, TryCatch #2 {Exception -> 0x01be, blocks: (B:60:0x0139, B:64:0x0144, B:68:0x0157, B:70:0x015d, B:71:0x0164, B:73:0x016d, B:75:0x0190, B:98:0x0199, B:109:0x0171, B:111:0x0181, B:113:0x0189, B:114:0x0161), top: B:59:0x0139 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList e(defpackage.bai r17, defpackage.bak r18) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bao.e(bai, bak):java.util.ArrayList");
    }

    private static void f(List list, final ban banVar) {
        Collections.sort(list, new Comparator() { // from class: bah
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ban banVar2 = ban.this;
                int i = bao.a;
                return banVar2.a(obj2) - banVar2.a(obj);
            }
        });
    }

    private static void g(MediaCodecInfo mediaCodecInfo) {
        if (pts.a >= 29) {
            mediaCodecInfo.isSoftwareOnly();
            return;
        }
        String c2 = amkq.c(mediaCodecInfo.getName());
        if (c2.startsWith("arc.") || c2.startsWith("omx.google.") || c2.startsWith("omx.ffmpeg.")) {
            return;
        }
        if ((c2.startsWith("omx.sec.") && c2.contains(".sw.")) || c2.equals("omx.qcom.video.decoder.hevcswvdec") || c2.startsWith("c2.android.") || c2.startsWith("c2.google.") || c2.startsWith("omx.")) {
            return;
        }
        c2.startsWith("c2.");
    }
}
