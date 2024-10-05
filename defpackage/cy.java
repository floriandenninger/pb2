package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cy implements aac {
    final /* synthetic */ dd a;
    private final /* synthetic */ int b;

    public cy(dd ddVar, int i) {
        this.b = i;
        this.a = ddVar;
    }

    @Override // defpackage.aac
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ActivityResult activityResult = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = fragmentManager$LaunchedFragmentInfo.a;
            int i2 = fragmentManager$LaunchedFragmentInfo.b;
            ce b = this.a.a.b(str);
            if (b == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            b.T(i2, activityResult.a, activityResult.b);
            return;
        }
        if (i == 1) {
            ActivityResult activityResult2 = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo2 == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str2 = fragmentManager$LaunchedFragmentInfo2.a;
            int i3 = fragmentManager$LaunchedFragmentInfo2.b;
            ce b2 = this.a.a.b(str2);
            if (b2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                return;
            }
            b2.T(i3, activityResult2.a, activityResult2.b);
            return;
        }
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            iArr[i4] = true != ((Boolean) arrayList.get(i4)).booleanValue() ? -1 : 0;
        }
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo3 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str3 = fragmentManager$LaunchedFragmentInfo3.a;
        int i5 = fragmentManager$LaunchedFragmentInfo3.b;
        ce b3 = this.a.a.b(str3);
        if (b3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
            return;
        }
        b3.Y(i5, strArr, iArr);
    }
}
