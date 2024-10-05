package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zgs implements Iterator, j$.util.Iterator {
    final /* synthetic */ zgt a;
    private int b = 0;
    private int c;
    private zgr d;
    private zgr e;
    private Object f;
    private final zgq g;

    public zgs(zgt zgtVar, zgq zgqVar) {
        this.a = zgtVar;
        this.g = zgqVar;
        this.c = zgtVar.b;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        r0 = r4.b;
        r2 = r4.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0 >= r2.length) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r4.b = r0 + 1;
        r0 = r2[r0];
        r4.e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        r0 = r4.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r0 = r0.get();
        r4.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        r0 = r4.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r0.b == false) goto L26;
     */
    @Override // java.util.Iterator, j$.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r4 = this;
            zgr r0 = r4.e
            r1 = 1
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.lang.Object r2 = r4.f
            if (r2 != 0) goto L41
            boolean r0 = r0.b
            if (r0 == 0) goto Lf
            goto L41
        Lf:
            zgr r0 = r4.e
            if (r0 != 0) goto L2d
        L13:
            int r0 = r4.b
            zgt r2 = r4.a
            zgr[] r2 = r2.a
            int r3 = r2.length
            if (r0 >= r3) goto L26
            int r3 = r0 + 1
            r4.b = r3
            r0 = r2[r0]
            r4.e = r0
            if (r0 == 0) goto L13
        L26:
            zgr r0 = r4.e
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            return r0
        L2d:
            java.lang.Object r0 = r0.get()
            r4.f = r0
            if (r0 != 0) goto L41
            zgr r0 = r4.e
            boolean r2 = r0.b
            if (r2 == 0) goto L3c
            goto L41
        L3c:
            zgr r0 = r0.d
            r4.e = r0
            goto Lf
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgs.hasNext():boolean");
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.c != this.a.b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        zgr zgrVar = this.e;
        this.d = zgrVar;
        this.e = zgrVar.d;
        Object a = this.g.a(zgrVar);
        this.f = null;
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c != this.a.b) {
            throw new ConcurrentModificationException();
        }
        zgr zgrVar = this.d;
        if (zgrVar != null) {
            this.a.c(zgrVar);
            this.d = null;
            this.c++;
            return;
        }
        throw new IllegalStateException();
    }
}
