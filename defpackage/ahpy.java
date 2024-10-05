package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahpy implements ahpw {
    private final acsl a;
    private final apxf b;
    private final apxf c;

    public ahpy(acsl acslVar, apxf apxfVar, apxf apxfVar2) {
        this.a = acslVar;
        this.b = apxfVar;
        this.c = apxfVar2;
    }

    @Override // defpackage.ahpw
    public final /* bridge */ /* synthetic */ ahpx a(ahpe ahpeVar) {
        acsl acslVar = this.a;
        if (acslVar != null) {
            ahpeVar.l(acslVar, this.b, this.c);
        }
        ahpeVar.p(ahpeVar.v(this.c));
        return new ahpz(this.a, this.c);
    }

    @Override // defpackage.ahpw
    public final ahqo b() {
        return ahqo.NEW;
    }
}
