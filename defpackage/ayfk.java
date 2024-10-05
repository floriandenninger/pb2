package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfk {
    public final aybl a;
    public aybs b;
    public aybt c;
    final /* synthetic */ ayfp d;

    public ayfk(ayfp ayfpVar, aybl ayblVar) {
        this.d = ayfpVar;
        this.a = ayblVar;
        aybt a = ayfpVar.a.a(ayfpVar.b);
        this.c = a;
        if (a != null) {
            this.b = a.a(ayblVar);
            return;
        }
        String str = ayfpVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 182);
        sb.append("Could not find policy '");
        sb.append(str);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
