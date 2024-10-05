package defpackage;

import android.graphics.Path;
import android.graphics.PathEffect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sah extends rwc {
    public final Path e;
    public final Path f;
    public final Path g;
    public final Path h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public PathEffect m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public sak r;
    private final rxd s;
    private final rxd t;

    /* JADX WARN: Type inference failed for: r0v5, types: [rwz, rxd] */
    public sah() {
        super(new rxe());
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new Path();
        this.s = this.c;
        this.t = new rxg();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(boolean r30, android.graphics.Path r31, defpackage.rxd r32, int r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sah.e(boolean, android.graphics.Path, rxd, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [rwz, rxd] */
    /* JADX WARN: Type inference failed for: r0v1, types: [rxd] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.rwc
    public final synchronized void c(rze rzeVar, rze rzeVar2, sba sbaVar, saw sawVar, boolean z) {
        ?? r0 = this.c;
        rxd rxdVar = z ? this.s : this.t;
        if (rxdVar != r0) {
            rxdVar.b(r0.a());
            this.c = rxdVar;
            r0 = rxdVar;
        }
        if (rzeVar != null) {
            r0.c((int) rzeVar.c());
        }
        super.c(rzeVar, rzeVar2, sbaVar, sawVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [rwz, rxd] */
    public final synchronized void d(View view) {
        if (this.d) {
            int paddingLeft = view.getPaddingLeft();
            int width = view.getWidth() - view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int height = view.getHeight() - view.getPaddingBottom();
            this.e.rewind();
            ?? r11 = this.c;
            int l = r11.l();
            if (this.k && l > 0) {
                e(false, this.e, r11, paddingLeft, width, paddingTop, height);
            }
            this.h.rewind();
            this.f.rewind();
            if (this.q != 1) {
                for (int i = 0; i < l; i++) {
                    float round = Math.round(r11.h(i));
                    if (r11.r(i) != null) {
                        float round2 = Math.round(r11.j(i));
                        if (round >= paddingLeft && round <= width && round2 >= paddingTop && round2 <= height) {
                            this.f.addCircle(round, round2, this.n, Path.Direction.CW);
                        }
                    }
                }
            }
            this.g.rewind();
            if (this.o && l > 0) {
                e(true, this.g, r11, paddingLeft, width, paddingTop, height);
                this.g.close();
            }
            this.d = false;
        }
    }
}
