package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kyz implements ykl {
    final /* synthetic */ kza a;
    private final String b;

    public kyz(kza kzaVar, String str) {
        this.a = kzaVar;
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
            this.a.c = bool;
        }
    }
}
