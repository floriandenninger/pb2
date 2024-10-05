package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class duz implements anvn {
    static final duz a = new duz();
    private static final anvm b;

    static {
        anvl a2 = anvm.a("messagingClientEvent");
        anvr a3 = anvr.a();
        a3.a = 1;
        a2.b(a3.b());
        b = a2.a();
    }

    private duz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anvj
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        obj2.b(b, ((aoac) obj).a);
    }
}
