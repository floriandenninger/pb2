package defpackage;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ten implements tej {
    final /* synthetic */ tdu a;
    final /* synthetic */ DecimalFormat b;
    private final /* synthetic */ int c;

    public ten(tdu tduVar, DecimalFormat decimalFormat, int i) {
        this.c = i;
        this.a = tduVar;
        this.b = decimalFormat;
    }

    @Override // defpackage.tej
    public final String a(Map map) {
        if (this.c != 0) {
            if (map.get(this.a) instanceof Double) {
                return this.b.format(map.get(this.a));
            }
            return null;
        }
        Iterable P = rwh.P(map.get(this.a));
        if (P == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = P.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.format((Number) it.next()));
        }
        return TextUtils.join(",", arrayList);
    }
}
