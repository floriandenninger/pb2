package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrb {
    public long a;
    public final List b = Collections.synchronizedList(new ArrayList());

    public final void a(axqy axqyVar) {
        this.b.remove(axqyVar);
    }
}
