package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxd implements cqp {
    private final cqp a;
    private final Resources b;

    public cxd(Resources resources, cqp cqpVar) {
        did.ap(resources);
        this.b = resources;
        did.ap(cqpVar);
        this.a = cqpVar;
    }

    @Override // defpackage.cqp
    public final ctd a(Object obj, int i, int i2, cqn cqnVar) {
        return cyj.f(this.b, this.a.a(obj, i, i2, cqnVar));
    }

    @Override // defpackage.cqp
    public final boolean b(Object obj, cqn cqnVar) {
        return this.a.b(obj, cqnVar);
    }
}
