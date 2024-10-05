package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vrt extends zw {
    final /* synthetic */ ce a;
    final /* synthetic */ vru c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrt(vru vruVar, ce ceVar) {
        super(true);
        this.c = vruVar;
        this.a = ceVar;
    }

    @Override // defpackage.zw
    public final void a() {
        this.c.c.a(new awns(27).f(), this.a.O);
        if (this.c.a.a() == 0) {
            this.c.b.finish();
        } else {
            this.c.a.Z();
        }
    }
}
