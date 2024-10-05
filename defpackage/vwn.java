package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwn extends oyx {
    private final vwz a;
    private final vyf b;
    private final vym c;
    private final long d;
    private long e;
    private boolean f;

    public vwn(Context context, vwz vwzVar, vyf vyfVar) {
        this.a = vwzVar;
        vyfVar.getClass();
        this.b = vyfVar;
        this.c = ((vyg) vyfVar).c;
        Resources resources = context.getResources();
        this.d = (resources.getDimension(R.dimen.preview_renderer_focus_area_width) / resources.getDisplayMetrics().widthPixels) * ((float) r4.a.g);
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
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void g(long j) {
        oxk oxkVar = this.a.n;
        if ((oxkVar == null || !oxkVar.o()) && Math.abs(j - this.e) >= 1000) {
            vya g = this.c.g(j, true);
            if (g == null) {
                g = this.c.i(j);
            }
            if (g != null) {
                boolean z = ((vyg) this.b).a.g(j) == g.a;
                vwz vwzVar = this.a;
                g.c();
                vwzVar.post(new vwx(vwzVar, g, z));
                g.d();
            }
            if (this.f) {
                this.f = false;
                if (j == 0) {
                    return;
                }
            }
            vyf vyfVar = this.b;
            long j2 = this.d / 2;
            long j3 = j - j2;
            long j4 = j + j2;
            vxw vxwVar = (vxw) ((vyg) vyfVar).b.a;
            if (vxwVar != null) {
                vxwVar.d.b(j3, j4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean j() {
        this.f = true;
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
        this.e = j;
    }
}
