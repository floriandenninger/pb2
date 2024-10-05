package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amur extends amut {
    final /* synthetic */ Comparator a;

    public amur(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.amut
    public final Map a() {
        return new TreeMap(this.a);
    }
}
