package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kns implements kig {
    public Optional a = Optional.empty();
    private final kni b;
    private boolean c;
    private boolean d;

    public kns(kni kniVar) {
        this.b = kniVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        if ((r1.d % r2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1.d < r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r5.d = r0
            if (r6 == 0) goto L29
            kni r1 = r5.b
            boolean r2 = r1.a
            if (r2 == 0) goto Lc
            goto L28
        Lc:
            int r2 = r1.b
            r3 = 1
            if (r2 == 0) goto L1b
            int r4 = r1.d
            if (r4 >= r2) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r1.a()
            goto L25
        L1b:
            int r2 = r1.c
            if (r2 == 0) goto L29
            int r4 = r1.d
            int r4 = r4 % r2
            if (r4 != 0) goto L16
            goto L17
        L25:
            if (r3 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.Optional r1 = r5.a
            knr r2 = new knr
            r2.<init>(r6, r0)
            r1.ifPresent(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kns.b(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z && this.c) {
            this.d = true;
        } else {
            b(z);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        if (z == this.c) {
            return;
        }
        this.c = z;
        if (!this.d || z) {
            return;
        }
        b(true);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}
