package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pal {
    public final int a;
    public final List b;
    public final List c;

    public pal(int i, List list, List list2) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        if (list2 == null) {
            this.c = Collections.emptyList();
        } else {
            this.c = Collections.unmodifiableList(list2);
        }
    }

    public final boolean a() {
        return !this.c.isEmpty();
    }
}
