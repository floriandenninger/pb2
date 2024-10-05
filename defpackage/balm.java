package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class balm extends balk {
    public final bajh b;

    /* JADX INFO: Access modifiers changed from: protected */
    public balm(bajh bajhVar, bajj bajjVar) {
        super(bajjVar);
        if (bajhVar != null) {
            if (bajhVar.t()) {
                this.b = bajhVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.balk, defpackage.bajh
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.balk, defpackage.bajh
    public int c() {
        throw null;
    }

    @Override // defpackage.bajh
    public int d() {
        throw null;
    }

    @Override // defpackage.balk, defpackage.bajh
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.balk, defpackage.bajh
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.balk, defpackage.bajh
    public bajp p() {
        return this.b.p();
    }

    @Override // defpackage.bajh
    public bajp r() {
        return this.b.r();
    }
}
