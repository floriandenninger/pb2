package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fph implements ykl {
    private final fpl a;
    private final syd b;
    private final int c;

    public fph(fpl fplVar, syd sydVar, int i) {
        this.a = fplVar;
        this.b = sydVar;
        this.c = i;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.b(28, "Image zoom bytes load error");
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        fpl fplVar = this.a;
        fplVar.r = this.c;
        fplVar.q = (byte[]) obj2;
        fplVar.b();
    }
}
