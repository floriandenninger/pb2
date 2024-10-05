package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amwp extends amwr implements amtt {
    private static final long serialVersionUID = 0;

    public amwp(amtt amttVar) {
        super(amttVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amwr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final amtt b() {
        return (amtt) super.b();
    }

    @Override // defpackage.amtt
    public final List e(Object obj) {
        throw null;
    }

    @Override // defpackage.amtt
    public final List f(Object obj) {
        List f;
        synchronized (this.g) {
            f = b().f(obj);
        }
        return f;
    }
}
