package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vgu implements anfz {
    public final /* synthetic */ vgz a;
    public final /* synthetic */ anfz b;
    public final /* synthetic */ Executor c;
    private final /* synthetic */ int d;

    public /* synthetic */ vgu(vgz vgzVar, anfz anfzVar, Executor executor, int i) {
        this.d = i;
        this.a = vgzVar;
        this.b = anfzVar;
        this.c = executor;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.d != 0) {
            vgz vgzVar = this.a;
            return vgzVar.b.j(this.b, this.c);
        }
        vgz vgzVar2 = this.a;
        return vgzVar2.b.j(this.b, this.c);
    }
}
