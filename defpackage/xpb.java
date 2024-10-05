package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpb implements ajol {
    private final xpa a;

    public xpb(xpa xpaVar) {
        this.a = xpaVar;
    }

    public static xpa b(Map map) {
        xov xovVar = (xov) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xov.class);
        return xovVar != null ? xovVar.e() : (xpa) yjj.u(map, "commentThreadMutator", xpa.class);
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f("commentThreadMutator", this.a);
    }
}
