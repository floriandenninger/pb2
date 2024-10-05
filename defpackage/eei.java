package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eei {
    private final efz a;
    private final eed b;
    private Boolean c;

    public eei(efz efzVar, eed eedVar) {
        this.a = efzVar;
        this.b = eedVar;
    }

    public final nqm a() {
        ayaw.j(this.c, Boolean.class);
        return new eek(this.a, this.b, this.c);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
