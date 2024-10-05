package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeez {
    public final aeet c;
    public final afhs d;
    private final afkn e;
    private final ysy f;
    private final afkg g;
    private static final uo h = new uo(16);
    public static final amsx a = amvs.a;
    public static final amsx b = amvs.a;

    public aeez(aeet aeetVar, afkn afknVar, ysy ysyVar, afhs afhsVar, afkg afkgVar) {
        afki.a(aeetVar);
        this.c = aeetVar;
        afki.a(afknVar);
        this.e = afknVar;
        afki.a(ysyVar);
        this.f = ysyVar;
        afki.a(afhsVar);
        this.d = afhsVar;
        this.g = afkgVar;
    }

    public static int a(aeex aeexVar, int i, int i2, float f, boolean z) {
        int i3 = aeexVar.b;
        if (!z) {
            return i3;
        }
        int g = (int) (FormatStreamModel.g(i, i2) / f);
        return FormatStreamModel.O(g) ? Math.min(g, i3) : i3;
    }

    public static int b(aeex aeexVar, int i, int i2, float f, boolean z) {
        int i3 = aeexVar.c;
        if (!z) {
            return i3;
        }
        int g = (int) (FormatStreamModel.g(i, i2) / f);
        return FormatStreamModel.O(g) ? Math.max(g, i3) : i3;
    }

    @Deprecated
    public static List d(Collection collection, Set set, String str) {
        if (set == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            return arrayList;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (set.contains(Integer.valueOf(formatStreamModel.e()))) {
                arrayList.add(formatStreamModel);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                FormatStreamModel formatStreamModel2 = (FormatStreamModel) it2.next();
                if (str.equals(formatStreamModel2.v())) {
                    arrayList.add(formatStreamModel2);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(long j, int i, aeex aeexVar, PlayerConfigModel playerConfigModel, boolean z, int i2) {
        return aeexVar.d() || z || !playerConfigModel.V().contains(Integer.valueOf(i2)) || j + ((long) i) <= playerConfigModel.K();
    }

    public static boolean f(int i, int i2, int i3, int i4, float f) {
        if (i3 <= 0 || i * f <= i3) {
            return i4 <= 0 || ((float) i2) * f <= ((float) i4);
        }
        return false;
    }

    public static boolean g(int i, ysy ysyVar, int i2) {
        return i > i2 && ysyVar.i();
    }

    public static aanb[] h(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            String q = formatStreamModel.q();
            String p = formatStreamModel.p();
            if (!TextUtils.isEmpty(q) && !TextUtils.isEmpty(p) && !hashMap.containsKey(q)) {
                hashMap.put(q, new aanb(q, p, false));
            }
        }
        aanb[] aanbVarArr = (aanb[]) hashMap.values().toArray(new aanb[0]);
        Arrays.sort(aanbVarArr);
        return aanbVarArr;
    }

    public static FormatStreamModel j(List list, aeex aeexVar, ysy ysyVar, PlayerConfigModel playerConfigModel, afhs afhsVar, int i, int i2, int i3, float f, float f2, int i4, avzr avzrVar) {
        int length;
        int i5;
        if (list.isEmpty()) {
            return null;
        }
        float f3 = avzrVar == avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY ? f2 : f;
        FormatStreamModel[] formatStreamModelArr = (FormatStreamModel[]) list.toArray(new FormatStreamModel[0]);
        Arrays.sort(formatStreamModelArr, h);
        int a2 = a(aeexVar, i2, i3, f3, false);
        if (avzr.VIDEO_QUALITY_SETTING_DATA_SAVER.equals(avzrVar)) {
            a2 = Math.min(a2, afhsVar.b());
        }
        int length2 = formatStreamModelArr.length - 1;
        int i6 = 0;
        while (true) {
            length = formatStreamModelArr.length;
            if (i6 >= length) {
                break;
            }
            if (formatStreamModelArr[i6].d() <= a2) {
                length2 = i6;
                break;
            }
            i6++;
        }
        int b2 = b(aeexVar, i2, i3, f3, false);
        while (true) {
            length--;
            if (length < 0) {
                i5 = 0;
                break;
            }
            if (formatStreamModelArr[length].d() >= b2) {
                i5 = length;
                break;
            }
        }
        if (length2 < i5) {
            for (int i7 = length2; i7 <= i5; i7++) {
                FormatStreamModel formatStreamModel = formatStreamModelArr[i7];
                if (f(formatStreamModel.i(), formatStreamModel.d(), i2, i3, f3) && e(formatStreamModel.f, i, aeexVar, playerConfigModel, false, i4)) {
                    if (!g(formatStreamModel.d(), ysyVar, afhsVar.aq())) {
                        return formatStreamModel;
                    }
                }
            }
            return formatStreamModelArr[i5];
        }
        return formatStreamModelArr[length2];
    }

    private static void k(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (formatStreamModel.H()) {
                hashSet.add(Integer.valueOf(formatStreamModel.f()));
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        int intValue = ((Integer) Collections.min(hashSet)).intValue();
        while (it2.hasNext()) {
            FormatStreamModel formatStreamModel2 = (FormatStreamModel) it2.next();
            if (!formatStreamModel2.H() && formatStreamModel2.f() >= intValue) {
                it2.remove();
            }
        }
    }

    private static void l(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int f = ((FormatStreamModel) it.next()).f();
            if (f == -1 || f > i) {
                it.remove();
            }
        }
    }

    private final boolean m(String str) {
        return str != null && str.equals(this.d.at());
    }

    private final VideoQuality[] n(List list, String str, aeex aeexVar) {
        HashMap hashMap = new HashMap();
        if (this.d.ak() && !m(str)) {
            ArrayList arrayList = new ArrayList(list);
            k(arrayList);
            list = arrayList;
        }
        for (FormatStreamModel formatStreamModel : list) {
            int f = formatStreamModel.f();
            String u = formatStreamModel.u();
            if (f != -1 && !TextUtils.isEmpty(u) && (aeexVar == null || aeexVar.a(f) == 0)) {
                if (!hashMap.containsKey(u) || formatStreamModel.J()) {
                    hashMap.put(u, formatStreamModel);
                }
            }
        }
        VideoQuality[] videoQualityArr = new VideoQuality[hashMap.size()];
        Iterator it = hashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel2 = (FormatStreamModel) ((Map.Entry) it.next()).getValue();
            videoQualityArr[i] = new VideoQuality(formatStreamModel2.f(), formatStreamModel2.u(), formatStreamModel2.J());
            i++;
        }
        afhs afhsVar = this.d;
        Arrays.sort(videoQualityArr, (afhsVar.o().g || afhsVar.h.f()) ? Collections.reverseOrder() : null);
        return videoQualityArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x04bf, code lost:
    
        if (r14 < Integer.MAX_VALUE) goto L229;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aeeu c(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r30, java.util.Collection r31, defpackage.aees r32, java.util.Set r33, java.util.Set r34, int r35, int r36, java.lang.String r37, defpackage.aesa r38, defpackage.amsx r39) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeez.c(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.util.Collection, aees, java.util.Set, java.util.Set, int, int, java.lang.String, aesa, amsx):aeeu");
    }

    public final VideoQuality[] i(List list, String str) {
        return n(list, str, null);
    }
}
