package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rva extends rwh {
    final /* synthetic */ rvd a;

    public rva(rvd rvdVar) {
        this.a = rvdVar;
    }

    @Override // defpackage.rwh
    public final boolean c() {
        if (this.a.h != rvc.DESCRIBE || !this.a.i.contains(rvc.EXPLORE)) {
            return false;
        }
        this.a.e(rvc.EXPLORE);
        return true;
    }
}
