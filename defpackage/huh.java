package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class huh implements amml {
    public final /* synthetic */ hur a;
    private final /* synthetic */ int b;

    public /* synthetic */ huh(hur hurVar, int i) {
        this.b = i;
        this.a = hurVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            hur hurVar = this.a;
            aone builder = ((idr) obj).toBuilder();
            boolean z = hurVar.B;
            builder.copyOnWrite();
            ((idr) builder.instance).d = z;
            return (idr) builder.build();
        }
        hur hurVar2 = this.a;
        idr idrVar = (idr) obj;
        if (hurVar2.b.c() == null) {
            return idrVar;
        }
        hurVar2.b.c().b();
        aone builder2 = idrVar.toBuilder();
        String b = hurVar2.b.c().b();
        boolean z2 = hurVar2.H;
        builder2.copyOnWrite();
        idr idrVar2 = (idr) builder2.instance;
        aoot aootVar = idrVar2.r;
        if (!aootVar.b) {
            idrVar2.r = aootVar.a();
        }
        idrVar2.r.put(b, Boolean.valueOf(z2));
        return (idr) builder2.build();
    }
}
