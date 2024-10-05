package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jiq implements amml {
    public final /* synthetic */ agni a;
    private final /* synthetic */ int b;

    public /* synthetic */ jiq(agni agniVar, int i) {
        this.b = i;
        this.a = agniVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return new jjl((aalc) obj, this.a, 0);
        }
        if (i == 1) {
            return new jjl((aalc) obj, this.a, 1);
        }
        if (i == 2) {
            return jke.g(this.a, (Set) obj);
        }
        return jke.g(this.a, (Set) obj);
    }
}
