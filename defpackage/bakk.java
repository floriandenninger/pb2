package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakk implements Comparable, Serializable, bakb {
    private static final long serialVersionUID = 9386874258972L;
    public volatile int g;

    /* JADX INFO: Access modifiers changed from: protected */
    public bakk(int i) {
        this.g = i;
    }

    @Override // defpackage.bakb
    public final int a(bajr bajrVar) {
        throw null;
    }

    @Override // defpackage.bakb
    public final int b(int i) {
        if (i == 0) {
            return this.g;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // defpackage.bakb
    public final int c() {
        return 1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bakk bakkVar = (bakk) obj;
        if (bakkVar.getClass() == getClass()) {
            int i = bakkVar.g;
            int i2 = this.g;
            if (i2 > i) {
                return 1;
            }
            return i2 < i ? -1 : 0;
        }
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(bakkVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" cannot be compared to ");
        sb.append(valueOf2);
        throw new ClassCastException(sb.toString());
    }

    @Override // defpackage.bakb
    public final bajr d(int i) {
        if (i == 0) {
            return f();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public abstract bajy e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bakb)) {
            return false;
        }
        bakb bakbVar = (bakb) obj;
        return bakbVar.e() == e() && bakbVar.b(0) == this.g;
    }

    public abstract bajr f();

    public final int hashCode() {
        return ((this.g + 459) * 27) + f().hashCode();
    }
}
