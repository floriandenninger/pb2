package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amsm extends ampg implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient amrz b;
    final transient int c;

    public amsm(amrz amrzVar, int i) {
        this.b = amrzVar;
        this.c = i;
    }

    @Override // defpackage.amup
    public final int g() {
        throw null;
    }

    @Override // defpackage.ampc
    public final /* bridge */ /* synthetic */ Collection h() {
        return new amsl(this);
    }

    @Override // defpackage.ampc
    public final Map k() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ampc
    public final Set l() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.amup
    @Deprecated
    public final void m() {
        throw null;
    }

    @Override // defpackage.amup
    public final boolean o(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.ampc, defpackage.amup
    @Deprecated
    public final boolean p(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ampc, defpackage.amup
    public final /* bridge */ /* synthetic */ Collection q() {
        throw null;
    }

    @Override // defpackage.ampc, defpackage.amup
    public final /* synthetic */ Map r() {
        return this.b;
    }

    @Override // defpackage.ampc, defpackage.amup
    public final /* bridge */ /* synthetic */ Set s() {
        throw null;
    }

    @Override // defpackage.ampc
    public final boolean t(Object obj) {
        return obj != null && super.t(obj);
    }
}
