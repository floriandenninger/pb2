package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jvw implements ykl {
    final /* synthetic */ jvx a;
    private final String b;
    private final String c;

    public jvw(jvx jvxVar, String str, String str2) {
        this.a = jvxVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(String.valueOf(exc));
        afsi.b(2, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (((aile) obj2).c - 1 != 2) {
            return;
        }
        this.a.d.m(this.c, this.b, null, false);
    }
}
