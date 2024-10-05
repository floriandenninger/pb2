package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnw implements ajol {
    public acra a;
    public acsm b;

    public ajnw() {
        this(null);
    }

    public ajnw(acra acraVar) {
        this.a = acraVar;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        acra acraVar = this.a;
        if (acraVar != null) {
            ajokVar.a(acraVar);
            Optional.ofNullable(this.b);
        }
    }
}
