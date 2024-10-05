package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zow implements amml {
    public final /* synthetic */ zoy a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ zow(zoy zoyVar, String str, int i) {
        this.c = i;
        this.a = zoyVar;
        this.b = str;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.c == 0) {
            zoy zoyVar = this.a;
            String str = this.b;
            if (!((Boolean) obj).booleanValue()) {
                zoyVar.b.b(new wgs(str, 10), angq.a);
            }
            return null;
        }
        zoy zoyVar2 = this.a;
        String str2 = this.b;
        if (!((Boolean) obj).booleanValue()) {
            zoyVar2.b.b(new wgs(str2, 9), angq.a);
        }
        return null;
    }
}
