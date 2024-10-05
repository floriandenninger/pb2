package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eut extends eur {
    private final LinkedHashSet b;

    public eut(azrw azrwVar, int i, boolean z, boolean z2, String str) {
        super(azrwVar, i, z, z2, str);
        this.b = new LinkedHashSet();
    }

    @Override // defpackage.eur
    protected final int a() {
        return this.b.size();
    }

    @Override // defpackage.eur, defpackage.euw
    public final void b(eux euxVar) {
        super.b(euxVar);
        this.b.remove(euxVar);
    }

    @Override // defpackage.eur, defpackage.euw
    public final void c(List list) {
        super.c(list);
        if (!list.isEmpty() || this.b.isEmpty()) {
            return;
        }
        list.add((eux) this.b.iterator().next());
    }

    @Override // defpackage.eur, defpackage.euw
    public final void d(eux euxVar, String str, Object obj, boolean z) {
        super.d(euxVar, str, obj, z);
        this.b.remove(euxVar);
        this.b.add(euxVar);
    }
}
