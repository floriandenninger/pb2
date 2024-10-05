package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azwy extends azwj {
    private long b;
    public azzi d;
    private boolean e;

    private static final long k(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Thread c();

    public final void e(azwt azwtVar) {
        azzi azziVar = this.d;
        if (azziVar == null) {
            azziVar = new azzi();
            this.d = azziVar;
        }
        Object[] objArr = azziVar.a;
        int i = azziVar.c;
        objArr[i] = azwtVar;
        int length = objArr.length;
        int i2 = (i + 1) & (length - 1);
        azziVar.c = i2;
        int i3 = azziVar.b;
        if (i2 == i3) {
            Object[] objArr2 = new Object[length + length];
            aype.j(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = azziVar.a;
            int length2 = objArr3.length;
            int i4 = azziVar.b;
            aype.j(objArr3, objArr2, length2 - i4, 0, i4, 4);
            azziVar.a = objArr2;
            azziVar.b = 0;
            azziVar.c = length;
        }
    }

    public final void f(boolean z) {
        this.b += k(z);
        if (z) {
            return;
        }
        this.e = true;
    }

    protected void g() {
        throw null;
    }

    public final boolean h() {
        return this.b >= k(true);
    }

    public final void j() {
        long k = this.b - k(true);
        this.b = k;
        if (k > 0) {
            return;
        }
        boolean z = azwq.a;
        if (this.e) {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean i() {
        azzi azziVar = this.d;
        if (azziVar == null) {
            return false;
        }
        int i = azziVar.b;
        azwt azwtVar = null;
        if (i != azziVar.c) {
            ?? r3 = azziVar.a;
            ?? r6 = r3[i];
            r3[i] = 0;
            azziVar.b = (i + 1) & (r3.length - 1);
            if (r6 == 0) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            azwtVar = r6;
        }
        azwt azwtVar2 = azwtVar;
        if (azwtVar2 == null) {
            return false;
        }
        azwtVar2.run();
        return true;
    }
}
