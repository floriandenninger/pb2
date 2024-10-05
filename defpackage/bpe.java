package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpe {
    public boolean a = false;
    private List b;

    public final bpf a() {
        return new bpf(this.b, this.a);
    }

    public final void b(bou bouVar) {
        if (bouVar != null) {
            List list = this.b;
            if (list == null) {
                this.b = new ArrayList();
            } else if (list.contains(bouVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.b.add(bouVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
