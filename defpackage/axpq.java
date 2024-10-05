package defpackage;

import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpq implements apo {
    private final Set a;
    private final apo b;
    private final ant c;

    public axpq(bue bueVar, Bundle bundle, Set set, apo apoVar, efn efnVar) {
        this.a = set;
        this.b = apoVar;
        this.c = new axpo(bueVar, bundle, efnVar);
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        if (this.a.contains(cls.getName())) {
            return this.c.a(cls);
        }
        return this.b.a(cls);
    }
}
