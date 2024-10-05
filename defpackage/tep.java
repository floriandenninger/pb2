package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tep implements tej {
    final /* synthetic */ tdu a;
    final /* synthetic */ int[] b;

    public tep(tdu tduVar, int[] iArr) {
        this.a = tduVar;
        this.b = iArr;
    }

    @Override // defpackage.tej
    public final String a(Map map) {
        if (!(map.get(this.a) instanceof Double)) {
            return null;
        }
        double doubleValue = ((Double) map.get(this.a)).doubleValue() * 100.0d;
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.b;
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = 1;
            if (i2 == 0) {
                if (doubleValue > 0.0d) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i3 = 0;
                arrayList.add(Integer.valueOf(i3));
            } else {
                if (doubleValue >= i2) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i3 = 0;
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return TextUtils.join(",", arrayList);
    }
}
