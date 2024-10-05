package defpackage;

import android.view.View;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ruq implements Comparator {
    final /* synthetic */ Map a;

    public ruq(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        int i = (view.getLayoutParams() instanceof rwk ? ((rwk) view.getLayoutParams()).b : 0) - (view2.getLayoutParams() instanceof rwk ? ((rwk) view2.getLayoutParams()).b : 0);
        return i != 0 ? i : ((Integer) this.a.get(view)).intValue() - ((Integer) this.a.get(view2)).intValue();
    }
}
