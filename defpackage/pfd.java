package defpackage;

import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfd implements pfe {
    private final byte[] a = new byte[8];
    private final Stack b = new Stack();
    private final pfg c = new pfg();
    private int d;
    private int e;
    private long f;
    private pfh g;

    private final long d(pbw pbwVar, int i) {
        pbwVar.h(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    @Override // defpackage.pfe
    public final void a() {
        this.d = 0;
        this.b.clear();
        this.c.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:157:0x0363. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08e0 A[LOOP:0: B:5:0x000e->B:375:0x08e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v34 */
    @Override // defpackage.pfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.pbw r44) {
        /*
            Method dump skipped, instructions count: 2464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfd.b(pbw):boolean");
    }

    @Override // defpackage.pfe
    public final void c(pfh pfhVar) {
        this.g = pfhVar;
    }
}
