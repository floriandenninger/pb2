package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agh extends agj {
    public int a;
    public afh b;

    public agh(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r0 == 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r0 == 6) goto L5;
     */
    @Override // defpackage.agj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.afk r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto Lf
            if (r0 != r4) goto Lc
        La:
            r0 = 1
            goto L16
        Lc:
            if (r0 != r3) goto L16
            goto L11
        Lf:
            if (r0 != r4) goto L13
        L11:
            r0 = 0
            goto L16
        L13:
            if (r0 != r3) goto L16
            goto La
        L16:
            boolean r7 = r6 instanceof defpackage.afh
            if (r7 == 0) goto L1e
            afh r6 = (defpackage.afh) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agh.a(afk, boolean):void");
    }

    public final void b(int i) {
        this.b.c = i;
    }

    @Override // defpackage.agj
    protected final void c() {
        afh afhVar = new afh();
        this.b = afhVar;
        this.h = afhVar;
        f();
    }
}
