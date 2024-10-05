package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahpz implements ahpx {
    private final apxf a;
    private final acsl b;

    public ahpz(acsl acslVar, apxf apxfVar) {
        this.b = acslVar;
        this.a = apxfVar;
    }

    @Override // defpackage.ahpx
    public final ahpy a(apxf apxfVar) {
        return new ahpy(this.b, this.a, apxfVar);
    }

    @Override // defpackage.ahpx
    public final ahqo b() {
        return ahqo.NEW;
    }

    @Override // defpackage.ahpx
    public final ahqs c() {
        return ahqs.a;
    }

    @Override // defpackage.ahpx
    public final apxf d() {
        return this.a;
    }

    @Override // defpackage.ahpx
    public final Optional e(ahdv ahdvVar) {
        return Optional.of(new ahqa(this.b, ahdvVar.d()));
    }
}
