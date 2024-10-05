package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysr implements ayrv {
    final Comparator a;

    public aysr(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = (List) obj;
        Collections.sort(list, this.a);
        return list;
    }
}
