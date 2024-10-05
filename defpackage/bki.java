package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bki extends bkk {
    public final long a;
    public final List b;
    public final List c;

    public bki(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final bki a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            bki bkiVar = (bki) this.c.get(i2);
            if (bkiVar.d == i) {
                return bkiVar;
            }
        }
        return null;
    }

    public final bkj b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            bkj bkjVar = (bkj) this.b.get(i2);
            if (bkjVar.d == i) {
                return bkjVar;
            }
        }
        return null;
    }

    public final void c(bki bkiVar) {
        this.c.add(bkiVar);
    }

    public final void d(bkj bkjVar) {
        this.b.add(bkjVar);
    }

    @Override // defpackage.bkk
    public final String toString() {
        String g = g(this.d);
        String arrays = Arrays.toString(this.b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
        int length = String.valueOf(g).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(g);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
