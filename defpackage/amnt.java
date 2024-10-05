package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnt {
    final boolean[] a = new boolean[256];
    public final Set b;

    public amnt(Set set) {
        this.b = set;
        for (int i = 0; i < 256; i++) {
            this.a[i] = this.b.contains(Integer.valueOf(i));
        }
    }
}
