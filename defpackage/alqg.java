package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqg implements alqo {
    private final axpg a;
    private final axpg b;
    private final axpg c;

    public alqg(axpg axpgVar, axpg axpgVar2, axpg axpgVar3) {
        this.a = axpgVar;
        this.b = axpgVar2;
        this.c = axpgVar3;
    }

    private final alqo c() {
        if (this.c.get() == null) {
            return (alqo) this.a.get();
        }
        return (alqo) this.b.get();
    }

    @Override // defpackage.alqo
    public final alsc a(alqv alqvVar) {
        return c().a(alqvVar);
    }

    @Override // defpackage.alqo
    public final Set b() {
        return c().b();
    }
}
