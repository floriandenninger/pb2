package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kxt implements ykl {
    final /* synthetic */ kxu a;
    private final String b;

    public kxt(kxu kxuVar, String str) {
        this.a = kxuVar;
        zhq.m(str);
        this.b = str;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.d("Encountered exception when syncing playlist", exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (this.b.equals((String) obj)) {
            this.a.F = bool;
        }
    }
}
