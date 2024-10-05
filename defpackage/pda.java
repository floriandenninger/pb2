package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pda extends pdc {
    public final long a;
    public final List b;
    public final List c;

    public pda(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final pda a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pda pdaVar = (pda) this.c.get(i2);
            if (pdaVar.aQ == i) {
                return pdaVar;
            }
        }
        return null;
    }

    public final pdb b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            pdb pdbVar = (pdb) this.b.get(i2);
            if (pdbVar.aQ == i) {
                return pdbVar;
            }
        }
        return null;
    }

    public final void c(pda pdaVar) {
        this.c.add(pdaVar);
    }

    public final void d(pdb pdbVar) {
        this.b.add(pdbVar);
    }

    @Override // defpackage.pdc
    public final String toString() {
        String g = g(this.aQ);
        String arrays = Arrays.toString(this.b.toArray(new pdb[0]));
        String arrays2 = Arrays.toString(this.c.toArray(new pda[0]));
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
