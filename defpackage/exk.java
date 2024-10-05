package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class exk implements ammy {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ exk(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ammy
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.equals((String) obj);
        }
        if (i != 1) {
            return i != 2 ? this.a.startsWith((String) obj) : this.a.equals((String) obj);
        }
        return this.a.equals((String) obj);
    }
}
