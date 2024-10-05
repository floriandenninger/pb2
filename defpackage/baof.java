package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baof {
    public boolean a;
    public boolean b;
    public boolean c;

    private final boolean i() {
        return (this.c || this.a) && this.b;
    }

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(12324);
        arrayList.add(8);
        arrayList.add(12323);
        arrayList.add(8);
        arrayList.add(12322);
        arrayList.add(8);
        if (this.a) {
            arrayList.add(12321);
            arrayList.add(8);
        }
        arrayList.add(12352);
        arrayList.add(4);
        if (this.b) {
            arrayList.add(12339);
            arrayList.add(1);
        }
        if (this.c) {
            arrayList.add(12610);
            arrayList.add(1);
        }
        arrayList.add(12344);
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        this.b = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0350, code lost:
    
        if (r13.equals("602LV") != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x074c, code lost:
    
        if (r6 != 2) goto L486;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baof.d(java.lang.String):boolean");
    }

    public final synchronized void e() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final synchronized boolean f() {
        this.a = true;
        return i();
    }

    public final synchronized boolean g() {
        this.c = true;
        return i();
    }

    public final synchronized boolean h() {
        this.b = true;
        return i();
    }
}
