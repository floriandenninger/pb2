package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class hoo implements amml {
    public abstract void a(axdk axdkVar, aqqp aqqpVar);

    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axdk axdkVar = (axdk) obj;
        aqqp a = aqqu.a();
        if (axdkVar.x()) {
            Object apply = hpd.a.apply(axdkVar.i());
            a.copyOnWrite();
            ((aqqu) a.instance).j((aqqt) apply);
        }
        if (axdkVar.w()) {
            Object apply2 = hpd.b.apply(axdkVar.f());
            a.copyOnWrite();
            ((aqqu) a.instance).i((aqqq) apply2);
        }
        if (axdkVar.z()) {
            int d = axdkVar.d();
            a.copyOnWrite();
            ((aqqu) a.instance).k(d);
        }
        if (axdkVar.v()) {
            a(axdkVar, a);
        }
        return (aqqu) a.build();
    }
}
