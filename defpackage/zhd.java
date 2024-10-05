package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhd implements zhh {
    private final Iterable a;

    public zhd(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.zhh
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((zhh) it.next()).a(layoutParams);
        }
        return z;
    }
}
