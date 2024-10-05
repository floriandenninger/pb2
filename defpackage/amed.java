package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amed implements apo {
    private final Set a;
    private final apo b;
    private final ant c;

    public amed(ce ceVar, apo apoVar, Set set, efm efmVar) {
        this.a = set;
        this.b = apoVar;
        this.c = new ameb(ceVar, ceVar.m, efmVar);
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        if (this.a.contains(cls.getName())) {
            return this.c.a(cls);
        }
        return this.b.a(cls);
    }
}
