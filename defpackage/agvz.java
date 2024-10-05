package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvz extends yne {
    final /* synthetic */ agtr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvz(Class cls, agtr agtrVar) {
        super(cls);
        this.e = agtrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yne
    public final /* bridge */ /* synthetic */ void e(Binder binder) {
        aguc agucVar = (aguc) binder;
        if (agucVar != null) {
            agucVar.a.p(this.e);
        }
    }

    @Override // defpackage.yne
    protected final /* bridge */ /* synthetic */ void f(Binder binder) {
        ((aguc) binder).a.d.remove(this.e);
    }
}
