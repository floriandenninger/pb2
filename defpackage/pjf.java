package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjf extends pjh {
    public final long a;
    public final List b;
    public final List c;

    public pjf(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final pjf a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pjf pjfVar = (pjf) this.c.get(i2);
            if (pjfVar.d == i) {
                return pjfVar;
            }
        }
        return null;
    }

    public final pjg b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            pjg pjgVar = (pjg) this.b.get(i2);
            if (pjgVar.d == i) {
                return pjgVar;
            }
        }
        return null;
    }

    @Override // defpackage.pjh
    public final String toString() {
        String e = e(this.d);
        String arrays = Arrays.toString(this.b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
        int length = String.valueOf(e).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(e);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
