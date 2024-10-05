package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitt {
    public final List a = new ArrayList();
    public Long b;
    public aesh c;
    public aesh d;

    public final void a(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.a.addAll(list);
    }

    public final void b(long j) {
        if (this.b == null) {
            this.b = Long.valueOf(j);
        }
    }
}
