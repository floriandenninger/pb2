package defpackage;

import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahot {
    public static final /* synthetic */ int a = 0;
    private static final HeadsetSelector.HeadsetInfo b = HeadsetSelector.HeadsetInfo.newInstance("Samsung", "Gear VR", "Samsung Gear VR", false);

    public static HeadsetSelector.HeadsetInfo a(Context context, ywr ywrVar) {
        int m;
        return (ahow.b(context) && (m = awxr.m(((awwl) ywrVar.c()).c)) != 0 && m == 3) ? b : HeadsetSelector.getCurrentHeadsetInfo(context);
    }

    public static List b(Context context, ywr ywrVar) {
        List recentHeadsetInfos = HeadsetSelector.getRecentHeadsetInfos(context);
        if (ahow.b(context)) {
            HeadsetSelector.HeadsetInfo headsetInfo = b;
            if (headsetInfo.equals(a(context, ywrVar))) {
                recentHeadsetInfos.add(0, headsetInfo);
            } else {
                recentHeadsetInfos.add(headsetInfo);
            }
        }
        return recentHeadsetInfos;
    }

    public static /* synthetic */ void d(Throwable th) {
        zga.d("Failed to update VR platform preference to store.", th);
    }

    public static int e(HeadsetSelector.HeadsetInfo headsetInfo) {
        if (headsetInfo == null) {
            return 0;
        }
        if (b.equals(headsetInfo)) {
            return 3;
        }
        return headsetInfo.isCardboardViewer() ? 1 : 2;
    }

    public static void f(Context context, ywr ywrVar, HeadsetSelector.HeadsetInfo headsetInfo) {
        if (!ahow.b(context) || !b.equals(headsetInfo)) {
            ynm.m(ywrVar.b(ahbz.j), ailg.b);
            HeadsetSelector.selectHeadset(context, headsetInfo);
        } else {
            ynm.m(ywrVar.b(ahbz.i), afka.s);
        }
    }
}
