package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jrq implements anfz {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ jrq(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return ((agsn) obj).i().h(this.a);
        }
        if (i == 1) {
            return ((agsn) obj).m().h(this.a);
        }
        return ((agsn) obj).m().h(this.a);
    }
}
