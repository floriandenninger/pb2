package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjp implements fxh, zar {
    public gjo a;
    public final gjn b;
    private final gop c;
    private int d;
    private int e;

    public gjp(Activity activity, gop gopVar) {
        gjn gjnVar = new gjn(activity);
        this.e = 0;
        this.b = gjnVar;
        this.c = gopVar;
        e(activity.getResources().getConfiguration());
    }

    public final int a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r6.e == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r7) {
        /*
            r6 = this;
            gjn r0 = r6.b
            boolean r1 = r0.b
            r2 = 4
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2f
            boolean r1 = r0.e()
            if (r1 == 0) goto L2f
            android.app.Activity r0 = r0.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "show_rotation_suggestions"
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r5)
            if (r0 != r5) goto L2f
            if (r7 != r3) goto L28
            int r7 = r6.e
            if (r7 == r5) goto L26
            r7 = 2
            goto L28
        L26:
            r7 = 0
            goto L2f
        L28:
            if (r7 != r2) goto L2f
            int r0 = r6.e
            if (r0 != r3) goto L2f
            goto L26
        L2f:
            gop r0 = r6.c
            boolean r0 = r0.isInMultiWindowMode()
            if (r5 != r0) goto L38
            r7 = 0
        L38:
            r0 = -1
            if (r7 == r3) goto L72
            r1 = 3
            if (r7 == r1) goto L94
            if (r7 == r2) goto L49
            r1 = 5
            if (r7 == r1) goto L6b
            gjn r1 = r6.b
            r1.d(r0)
            goto L9c
        L49:
            gjn r1 = r6.b
            boolean r1 = r1.e()
            if (r1 != 0) goto L6b
            gjn r1 = r6.b
            int r1 = r1.c
            boolean r1 = defpackage.etx.s(r1)
            if (r1 == 0) goto L6b
            gjn r1 = r6.b
            int r2 = r1.c
            int r1 = r1.a()
            if (r2 != r1) goto L6b
            gjn r7 = r6.b
            r7.d(r0)
            goto L9d
        L6b:
            gjn r0 = r6.b
            r1 = 6
            r0.d(r1)
            goto L9c
        L72:
            gjn r1 = r6.b
            boolean r1 = r1.e()
            if (r1 != 0) goto L94
            gjn r1 = r6.b
            int r1 = r1.c
            boolean r1 = defpackage.etx.t(r1)
            if (r1 == 0) goto L94
            gjn r1 = r6.b
            int r2 = r1.c
            int r1 = r1.a()
            if (r2 != r1) goto L94
            gjn r7 = r6.b
            r7.d(r0)
            goto L9d
        L94:
            r6.e = r5
            gjn r0 = r6.b
            r1 = 7
            r0.d(r1)
        L9c:
            r4 = r7
        L9d:
            r6.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjp.d(int):void");
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        if (this.b.a.getRequestedOrientation() == -1) {
            this.e = configuration.orientation;
        }
    }

    @Override // defpackage.zar
    public final void lI(boolean z, int i) {
        gjo gjoVar;
        gjo gjoVar2;
        gjn gjnVar = this.b;
        int i2 = gjnVar.c;
        gjnVar.lI(z, i);
        if (this.b.e()) {
            return;
        }
        int i3 = this.b.c;
        if (i2 == 2) {
            if (i3 == 1) {
                int i4 = this.d;
                if (i4 == 4) {
                    d(0);
                    return;
                } else {
                    if (i4 != 5 || (gjoVar2 = this.a) == null) {
                        return;
                    }
                    gjoVar2.g(1);
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && i3 == 2) {
            int i5 = this.d;
            if (i5 == 2) {
                d(0);
            } else {
                if (i5 != 3 || (gjoVar = this.a) == null) {
                    return;
                }
                gjoVar.g(2);
            }
        }
    }

    @Override // defpackage.zar
    public final void lJ(boolean z, int i) {
        this.b.lI(z, i);
        lI(z, i);
    }
}
