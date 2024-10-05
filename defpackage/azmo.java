package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmo extends ayqj {
    final ayqm a;
    final TimeUnit b;
    final ayqi c;

    public azmo(ayqm ayqmVar, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = ayqmVar;
        this.b = timeUnit;
        this.c = ayqiVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        aysd aysdVar = new aysd();
        ayqkVar.se(aysdVar);
        this.a.Z(new azmn(this, aysdVar, ayqkVar));
    }
}
