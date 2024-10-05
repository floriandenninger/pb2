package defpackage;

import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgm {
    public auoa b;
    public int c = -1;
    public final Map a = new WeakHashMap();

    public final lgl a(auoa auoaVar) {
        if ((auoaVar.b & 2) != 0) {
            return (lgl) this.a.get(mcy.I(auoaVar));
        }
        return null;
    }
}
