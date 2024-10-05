package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajls implements cvz {
    private final ajlu a;
    private final cvz b;

    public ajls(ajlu ajluVar, cvz cvzVar) {
        this.a = ajluVar;
        this.b = cvzVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        return this.b.a(new File(zhq.h(this.a.a(((cvo) obj).b()))), i, i2, cqnVar);
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return this.a.a(((cvo) obj).b()) != null;
    }
}
