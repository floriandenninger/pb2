package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class balt extends balu {
    private final int b;
    private final bajp c;

    public balt(bajj bajjVar, bajp bajpVar, bajp bajpVar2) {
        super(bajjVar, bajpVar);
        if (!bajpVar2.g()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int e = (int) (bajpVar2.e() / this.a);
        this.b = e;
        if (e >= 2) {
            this.c = bajpVar2;
            return;
        }
        throw new IllegalArgumentException("The effective range must be at least 2");
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.balu, defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.c;
    }
}
