package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzu extends aixi {
    final /* synthetic */ ahzv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzu(ahzv ahzvVar, long j, long j2) {
        super(j, j2, 1, 1, null);
        this.a = ahzvVar;
    }

    @Override // defpackage.aixi
    protected final void a() {
        this.a.c = false;
    }

    @Override // defpackage.aixi
    public final void b(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.a.c = false;
        } else {
            this.a.c = true;
            this.a.a();
        }
    }
}
