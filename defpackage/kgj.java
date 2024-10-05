package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgj extends aicz {
    public int a;
    private final int j;
    private kgi k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kgj(android.content.Context r7, defpackage.acra r8, defpackage.aidb r9, defpackage.axpg r10, defpackage.aadw r11, defpackage.axzg r12, byte[] r13, byte[] r14) {
        /*
            r6 = this;
            r10.getClass()
            kgh r4 = new kgh
            r13 = 0
            r4.<init>(r10, r13)
            aadw r12 = r12.b
            apwy r12 = r12.b()
            aqvj r12 = r12.C
            if (r12 != 0) goto L15
            aqvj r12 = defpackage.aqvj.a
        L15:
            r0 = 45358198(0x2b41c76, double:2.24099274E-316)
            boolean r14 = r12.a(r0)
            if (r14 == 0) goto L48
            aoot r12 = r12.b
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            boolean r0 = r12.containsKey(r14)
            if (r0 == 0) goto L42
            java.lang.Object r12 = r12.get(r14)
            aqvk r12 = (defpackage.aqvk) r12
            int r14 = r12.b
            r0 = 1
            if (r14 != r0) goto L3d
            java.lang.Object r12 = r12.c
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r13 = r12.booleanValue()
        L3d:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            goto L4c
        L42:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L48:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
        L4c:
            boolean r5 = r12.booleanValue()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            apwy r8 = r11.b()
            asvu r8 = r8.e
            if (r8 != 0) goto L61
            asvu r8 = defpackage.asvu.a
        L61:
            boolean r8 = r8.cd
            if (r8 != 0) goto L68
            r10.get()
        L68:
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2131168947(0x7f070eb3, float:1.795221E38)
            int r8 = r8.getDimensionPixelSize(r9)
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165389(0x7f0700cd, float:1.7944994E38)
            int r7 = r7.getDimensionPixelSize(r9)
            r6.j = r7
            int r7 = r7 - r8
            r6.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgj.<init>(android.content.Context, acra, aidb, axpg, aadw, axzg, byte[], byte[]):void");
    }

    @Override // defpackage.aicz
    protected final int a() {
        return this.j + this.h;
    }

    @Override // defpackage.aicz
    protected final int b() {
        return this.a + this.h;
    }

    @Override // defpackage.aicz
    protected final void c(RecyclerView recyclerView) {
        recyclerView.s = true;
        kgi kgiVar = new kgi(this);
        this.k = kgiVar;
        recyclerView.addOnLayoutChangeListener(kgiVar);
    }
}
