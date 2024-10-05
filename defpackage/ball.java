package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ball extends bajp implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final bajr d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ball(bajr bajrVar) {
        if (bajrVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.d = bajrVar;
    }

    @Override // defpackage.bajp
    public int a(long j, long j2) {
        return aynu.w(d(j, j2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((bajp) obj).e();
        long e2 = e();
        if (e2 == e) {
            return 0;
        }
        return e2 < e ? -1 : 1;
    }

    @Override // defpackage.bajp
    public final bajr f() {
        return this.d;
    }

    @Override // defpackage.bajp
    public final boolean h() {
        return true;
    }

    public final String toString() {
        String str = this.d.m;
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append("DurationField[");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
