package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctq implements ctj {
    private final /* synthetic */ int a;

    public ctq(int i) {
        this.a = i;
    }

    @Override // defpackage.ctj
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.ctj
    public final /* synthetic */ Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }

    @Override // defpackage.ctj
    public final /* synthetic */ int a(Object obj) {
        if (this.a == 0) {
            return ((int[]) obj).length;
        }
        return ((byte[]) obj).length;
    }
}
