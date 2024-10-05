package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwr implements cvz {
    public static final cqm a = cqm.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final cvx b;

    public cwr() {
        this(null);
    }

    public cwr(cvx cvxVar) {
        this.b = cvxVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        cvo cvoVar = (cvo) obj;
        cvx cvxVar = this.b;
        cvw b = cvw.b(cvoVar);
        Object f = cvxVar.a.f(b);
        b.a();
        cvo cvoVar2 = (cvo) f;
        if (cvoVar2 == null) {
            cvx cvxVar2 = this.b;
            cvxVar2.a.g(cvw.b(cvoVar), cvoVar);
        } else {
            cvoVar = cvoVar2;
        }
        return new cvy(cvoVar, new crf(cvoVar, ((Integer) cqnVar.b(a)).intValue()));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
