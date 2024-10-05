package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jxg implements ykl {
    private final agzj a;
    private final String b;
    private final String c;

    public jxg(agzj agzjVar, String str, String str2) {
        this.a = agzjVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Could not get playability result: ");
        sb.append(valueOf);
        afsi.b(2, 10, sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (((aile) obj2).c - 1 != 2) {
            return;
        }
        this.a.m(this.c, this.b, null, false);
    }
}
