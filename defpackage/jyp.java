package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyp implements ajvz, ypd {
    private final fka A;
    private final shf B;
    private final axzg C;
    public final jzp a;
    public final ypa b;
    public final jsk c;
    public final jvt d;
    public final fjm e;
    public final jhn f;
    public final aahv g;
    public final Executor h;
    public final Executor i;
    public final jyi j;
    public final jtz k;
    public final jqk l;
    public final CharSequence m;
    public final boolean n;
    public final jyn o = new jyn(this);
    public final yqw p;
    public final afsy q;
    public LoadingFrameLayout r;
    public RecyclerView s;
    public jzo t;
    public ajxe u;
    public ayqx v;
    public ajpd w;
    public fzr x;
    public boolean y;
    public final aadw z;

    public jyp(jzp jzpVar, ypa ypaVar, jsk jskVar, jvt jvtVar, fjm fjmVar, jhn jhnVar, aahv aahvVar, Executor executor, Executor executor2, jyi jyiVar, jtz jtzVar, yqw yqwVar, aadw aadwVar, fka fkaVar, axzg axzgVar, shf shfVar, afsy afsyVar, ajxe ajxeVar, jqk jqkVar, CharSequence charSequence, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = jzpVar;
        this.b = ypaVar;
        this.c = jskVar;
        this.d = jvtVar;
        this.e = fjmVar;
        this.f = jhnVar;
        this.h = executor;
        this.i = executor2;
        this.j = jyiVar;
        this.k = jtzVar;
        this.l = jqkVar;
        this.m = charSequence;
        this.n = z;
        this.g = aahvVar;
        this.p = yqwVar;
        this.z = aadwVar;
        this.A = fkaVar;
        this.C = axzgVar;
        this.B = shfVar;
        this.q = afsyVar;
        if (ajxeVar instanceof jyo) {
            jyo jyoVar = (jyo) ajxeVar;
            this.y = jyoVar.b;
            this.u = jyoVar.a;
        }
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("Failed to set last downloads page usage", th);
    }

    public final void a() {
        jzo jzoVar = this.t;
        LoadingFrameLayout loadingFrameLayout = this.r;
        if (jzoVar == null || loadingFrameLayout == null) {
            return;
        }
        jyi jyiVar = this.j;
        if (!jyiVar.d) {
            acsx acsxVar = jyiVar.c;
            acsxVar.getClass();
            acsxVar.c("br_r");
        }
        jzoVar.c();
        loadingFrameLayout.a();
        if (this.C.z()) {
            ynm.j(this.A.a.b(new fjv(TimeUnit.MILLISECONDS.toSeconds(this.B.c()), 0)), angq.a, jun.j);
        }
        jyi jyiVar2 = this.j;
        if (!jyiVar2.d) {
            acsx acsxVar2 = jyiVar2.c;
            acsxVar2.getClass();
            acsxVar2.c("ol");
            jyiVar2.d = true;
        }
        this.y = true;
    }

    public final void c(boolean z) {
        ajpd ajpdVar;
        fzr fzrVar;
        if (!this.n || (ajpdVar = this.w) == null || (fzrVar = this.x) == null) {
            return;
        }
        if (!z) {
            ajpdVar.remove(fzrVar);
        } else {
            if (ajpdVar.contains(fzrVar)) {
                return;
            }
            this.w.add(0, this.x);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agkl.class};
        }
        if (i == 0) {
            jzo jzoVar = this.t;
            if (jzoVar == null) {
                return null;
            }
            jzoVar.lo();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajvz
    public final ajxe ph() {
        throw null;
    }
}
