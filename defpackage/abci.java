package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abci {
    public final asay a;
    public List b;
    public Object c;
    private List d;
    private List e;

    public abci(asay asayVar) {
        this.a = asayVar;
    }

    private static final List c(Object[] objArr, amml ammlVar) {
        List q = amru.q();
        if (objArr != null && (objArr.length) > 0) {
            q = new ArrayList();
            for (Object obj : objArr) {
                q.addAll((Collection) ammlVar.apply(obj));
            }
        }
        return q;
    }

    public final List a() {
        if (this.d == null) {
            this.b = new ArrayList();
            this.d = c((asbd[]) this.a.c.toArray(new asbd[0]), new amml() { // from class: abch
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    return adyu.dC((asbd) obj, abci.this.b);
                }
            });
        }
        return this.d;
    }

    public final List b() {
        if (this.e == null) {
            this.e = c((asaz[]) this.a.d.toArray(new asaz[0]), aard.j);
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abci) {
            abci abciVar = (abci) obj;
            int size = a().size();
            int size2 = b().size();
            if (size == abciVar.a().size() && size2 == abciVar.b().size() && a().equals(abciVar.a()) && b().equals(abciVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a().isEmpty() ? 0 : a().hashCode()) + 527) * 31) + (b().isEmpty() ? 0 : b().hashCode());
    }
}
