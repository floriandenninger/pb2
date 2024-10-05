package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsf extends amru {
    final /* synthetic */ amru a;

    public amsf(amru amruVar) {
        this.a = amruVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
