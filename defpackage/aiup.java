package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiup {
    public static final Pair a = new Pair(null, null);
    final List b;
    final List c;
    public final List d;

    public aiup(List list, List list2, List list3) {
        amkq.O(list.size() == list2.size(), "startTimes and endTimes differ in size");
        amkq.O(list.size() == list3.size(), "startTimes and lines differ in size");
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = Collections.unmodifiableList(list3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r9 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r5 = r1;
        r1 = r0;
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r0 >= r6.b.size()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r0 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (((java.lang.Long) r6.b.get(r0)).longValue() > r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (((java.lang.Long) r6.c.get(r0)).longValue() <= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r9 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        r1 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        r1 = r0 + 1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r7, boolean r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.b
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            int r0 = java.util.Collections.binarySearch(r0, r1)
            if (r0 >= 0) goto L24
            int r0 = -r0
            int r0 = r0 + (-2)
            if (r0 < 0) goto L22
            java.util.List r1 = r6.c
            java.lang.Object r1 = r1.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L22
            goto L24
        L22:
            r7 = -1
            return r7
        L24:
            if (r9 == 0) goto L29
        L26:
            int r1 = r0 + (-1)
            goto L2b
        L29:
            int r1 = r0 + 1
        L2b:
            r5 = r1
            r1 = r0
            r0 = r5
            java.util.List r2 = r6.b
            int r2 = r2.size()
            if (r0 >= r2) goto L5b
            if (r0 < 0) goto L5b
            java.util.List r2 = r6.b
            java.lang.Object r2 = r2.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L5b
            java.util.List r2 = r6.c
            java.lang.Object r2 = r2.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L5b
            if (r9 == 0) goto L29
            goto L26
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiup.a(long, boolean):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.b.size(); i++) {
            sb.append("[");
            sb.append(this.b.get(i));
            sb.append(" - ");
            sb.append(this.c.get(i));
            sb.append(": ");
            sb.append((CharSequence) this.d.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
