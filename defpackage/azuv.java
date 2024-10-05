package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azuv implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public azuv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azsk iterator() {
        return new azsk(this.a, this.b, 1);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof azuv) {
            if (b() && ((azuv) obj).b()) {
                return true;
            }
            azuv azuvVar = (azuv) obj;
            if (this.a == azuvVar.a && this.b == azuvVar.b) {
                int i = azuvVar.c;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
