package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojc implements flm {
    public final fln a;
    public boolean b;
    public fhd c;
    private final okf d;
    private final FullscreenExitController e;
    private final fgq f;
    private final azrw g;
    private final adlt h;
    private final gju i;
    private final Set j = new HashSet();
    private final fcv k;
    private final kch l;
    private final aadw m;

    public ojc(okf okfVar, FullscreenExitController fullscreenExitController, fgq fgqVar, kch kchVar, azrw azrwVar, fln flnVar, gju gjuVar, adlt adltVar, fcv fcvVar, aadw aadwVar) {
        this.d = okfVar;
        this.e = fullscreenExitController;
        this.f = fgqVar;
        this.l = kchVar;
        this.g = azrwVar;
        this.h = adltVar;
        this.i = gjuVar;
        this.k = fcvVar;
        this.m = aadwVar;
        this.a = flnVar;
    }

    public final void a(nnh nnhVar) {
        this.j.add(nnhVar);
    }

    public final void d(nnh nnhVar) {
        this.j.remove(nnhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0107 A[LOOP:0: B:17:0x0101->B:19:0x0107, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c A[LOOP:1: B:39:0x0166->B:41:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.fhd r13, j$.util.Optional r14) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojc.e(fhd, j$.util.Optional):void");
    }

    @Override // defpackage.flm
    public final void kG() {
        this.b = false;
    }

    @Override // defpackage.flm
    public final void kH() {
        this.b = true;
        fhd fhdVar = this.c;
        if (fhdVar != null) {
            fhdVar.a.h();
            e(fhdVar, Optional.empty());
        }
    }
}
