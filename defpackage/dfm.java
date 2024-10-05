package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfm extends axkr {
    private dfa a;

    public dfm() {
        super("trak");
    }

    public final deq l() {
        for (deb debVar : i()) {
            if (debVar instanceof deq) {
                return (deq) debVar;
            }
        }
        return null;
    }

    public final dfa m() {
        des n;
        dfa dfaVar = this.a;
        if (dfaVar != null) {
            return dfaVar;
        }
        deq l = l();
        if (l == null || (n = l.n()) == null) {
            return null;
        }
        dfa l2 = n.l();
        this.a = l2;
        return l2;
    }

    public final dfn n() {
        for (deb debVar : i()) {
            if (debVar instanceof dfn) {
                return (dfn) debVar;
            }
        }
        return null;
    }
}
