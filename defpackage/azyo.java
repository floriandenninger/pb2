package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyo extends azzt implements azyq {
    public final azyf a;
    public final azvs b;

    public azyo(azyf azyfVar, azvs azvsVar) {
        this.a = azyfVar;
        this.b = azvsVar;
    }

    @Override // defpackage.azyq
    public final /* synthetic */ Object a() {
        return azyi.b;
    }

    @Override // defpackage.azyq
    public final void b(Object obj) {
        this.a.b = obj;
        this.b.a();
    }

    public final void c(azyr azyrVar) {
        if (((azvt) this.b).o(false) != null) {
            this.a.b = azyrVar;
            this.b.a();
        }
    }

    @Override // defpackage.azyq
    public final baac d() {
        azvs azvsVar = this.b;
        azyh azyhVar = this.a.a;
        if (((azvt) azvsVar).o(true) == null) {
            return null;
        }
        boolean z = azwq.a;
        return azvu.a;
    }

    @Override // defpackage.azzt
    public final String toString() {
        return azul.a("ReceiveHasNext@", azth.h(this));
    }

    public azyo() {
    }
}
