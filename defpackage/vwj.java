package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwj extends oyx {
    final /* synthetic */ vwl a;

    public vwj(vwl vwlVar) {
        this.a = vwlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final long b() {
        return -3L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final long c() {
        return -2L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final MediaFormat d(int i) {
        return MediaFormat.i(null, "application/octet-stream", -2L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void e(long j, long j2) {
        vwl vwlVar = this.a;
        vwlVar.b = j;
        if (vwlVar.c != null) {
            if (this.h == 3 && j >= vwlVar.d() * 1000) {
                this.a.c.l(false);
            }
            if (this.a.c.o()) {
                vwl vwlVar2 = this.a;
                vwlVar2.post(vwlVar2.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void g(long j) {
        vwl vwlVar = this.a;
        vwlVar.b = j;
        vwlVar.post(vwlVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean h() {
        vwl vwlVar = this.a;
        return vwlVar.b >= vwlVar.d() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final int pF() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void pG(int i, long j, boolean z) {
        this.a.b = j;
    }
}
