package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ailh implements amml {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ ailh(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            str.getClass();
            aoot aootVar = ((awwp) obj).d;
            return Boolean.valueOf(aootVar.containsKey(str) ? ((Boolean) aootVar.get(str)).booleanValue() : false);
        }
        String str2 = this.a;
        aone builder = ((basi) obj).toBuilder();
        builder.copyOnWrite();
        ((basi) builder.instance).a().remove(str2);
        return (basi) builder.build();
    }
}
