package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbm implements saw {
    final Double a = Double.valueOf(0.0d);
    final /* synthetic */ saw b;
    final /* synthetic */ Map c;

    public sbm(saw sawVar, Map map) {
        this.b = sawVar;
        this.c = map;
    }

    @Override // defpackage.saw
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, sba sbaVar) {
        Double d = (Double) this.c.get(this.b.a(obj, i, sbaVar));
        return d != null ? d : this.a;
    }
}
