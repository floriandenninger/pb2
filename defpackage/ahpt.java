package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahpt implements ahpx {
    private final ahps a;
    private final acsm b;
    private final apxf c;

    public ahpt(ahps ahpsVar, acsm acsmVar, apxf apxfVar) {
        this.a = ahpsVar;
        this.b = acsmVar;
        this.c = apxfVar;
    }

    @Override // defpackage.ahpx
    public final ahpy a(apxf apxfVar) {
        ahps ahpsVar = this.a;
        return new ahpy(ahpsVar.a, ahpsVar.b, apxfVar);
    }

    @Override // defpackage.ahpx
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_PLAYER;
    }

    @Override // defpackage.ahpx
    public final ahqs c() {
        return new ahqs(this.a.a, null);
    }

    @Override // defpackage.ahpx
    public final apxf d() {
        return this.c;
    }

    @Override // defpackage.ahpx
    public final Optional e(ahdv ahdvVar) {
        return Optional.of(new ahpu(this.a.a, ahdvVar.a(), ahdvVar.d()));
    }
}
