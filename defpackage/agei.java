package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agei implements agej {
    private volatile agej a = null;

    @Override // defpackage.agej
    public final agna a() {
        throw null;
    }

    @Override // defpackage.agej
    public final agna b() {
        throw null;
    }

    @Override // defpackage.agej
    public final agna c() {
        throw null;
    }

    @Override // defpackage.agej
    public final File d() {
        throw null;
    }

    @Override // defpackage.agej
    public final File e(String str) {
        throw null;
    }

    @Override // defpackage.amnv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized List get() {
        if (this.a != null) {
            return ((ageh) this.a).get();
        }
        return Collections.emptyList();
    }

    @Override // defpackage.agej
    public final synchronized List g() {
        if (this.a != null) {
            return this.a.g();
        }
        return Collections.emptyList();
    }

    public final synchronized void h(agej agejVar) {
        this.a = agejVar;
    }
}
