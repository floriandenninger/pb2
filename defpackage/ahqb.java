package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahqb implements ahpx {
    private final ahqa a;
    private final acsl b;

    public ahqb(ahqa ahqaVar, acsl acslVar) {
        this.a = ahqaVar;
        this.b = acslVar;
    }

    @Override // defpackage.ahpx
    public final ahpy a(apxf apxfVar) {
        return new ahpy(this.b, this.a.a, apxfVar);
    }

    @Override // defpackage.ahpx
    public final ahqo b() {
        return ahqo.LOGGED_NEW_SCREEN;
    }

    @Override // defpackage.ahpx
    public final ahqs c() {
        return new ahqs(this.b, null);
    }

    @Override // defpackage.ahpx
    public final apxf d() {
        return this.a.a;
    }

    @Override // defpackage.ahpx
    public final Optional e(ahdv ahdvVar) {
        return Optional.of(new ahps(this.b, ahdvVar.b(), ahdvVar.d()));
    }
}
