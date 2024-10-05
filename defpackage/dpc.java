package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dpc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public dpc() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public dpc(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dpc a(dpc dpcVar) {
        return new dpc(this.a + dpcVar.a, this.b + dpcVar.b, this.c + dpcVar.c, this.d + dpcVar.d, dpcVar.e + this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dpc dpcVar = (dpc) obj;
            if (this.a == dpcVar.a && this.b == dpcVar.b && this.c == dpcVar.c && this.d == dpcVar.d && this.e == dpcVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 961) + this.c) * 961) + this.d) * 961) + this.e;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        StringBuilder sb = new StringBuilder(263);
        sb.append("ChangeSetStats{mEffectiveChangesCount=");
        sb.append(i);
        sb.append(", mInsertSingleCount=");
        sb.append(i2);
        sb.append(", mInsertRangeCount=0, mDeleteSingleCount=");
        sb.append(i3);
        sb.append(", mDeleteRangeCount=0, mUpdateSingleCount=");
        sb.append(i4);
        sb.append(", mUpdateRangeCount=0, mMoveCount=");
        sb.append(i5);
        sb.append('}');
        return sb.toString();
    }
}
