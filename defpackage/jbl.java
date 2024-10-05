package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbl extends ablm {
    private final ajkj r;

    public jbl(Context context, abjt abjtVar, aahd aahdVar, ajjz ajjzVar, ajut ajutVar, abji abjiVar, abjr abjrVar, acpk acpkVar, abhc abhcVar, ajsd ajsdVar, ajyw ajywVar, abht abhtVar, abge abgeVar, zaw zawVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, ajjzVar.b(), abjtVar, aahdVar, ajutVar, abjiVar, abjrVar, acpkVar, abhcVar, ajsdVar, ajywVar, abhtVar, abgeVar, zawVar, null, null, null, null);
        this.r = new ajkj(ajjzVar.b(), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajos, java.lang.Object] */
    @Override // defpackage.ablm, defpackage.ajom
    public final void b(ajos ajosVar) {
        abji abjiVar = this.n;
        abjiVar.f.b(abjiVar.b.get());
        abjiVar.f = null;
        abjiVar.i = null;
        abjiVar.h = false;
        yhe yheVar = this.m;
        if (yheVar != null) {
            yheVar.b(ajosVar);
        }
        this.k.a();
        this.l.a();
        this.r.a();
    }

    @Override // defpackage.ablm
    public final void d(avgg avggVar) {
        this.r.k(avggVar);
    }

    @Override // defpackage.ablm
    public final void e() {
        if (this.g || this.h) {
            this.f.setEnabled(false);
            this.f.setTextColor(wbs.W(this.e, R.attr.ytTextPrimaryInverse).orElse(0));
            this.f.setBackgroundColor(wbs.W(this.e, R.attr.ytIconDisabled).orElse(0));
        } else {
            this.f.setEnabled(true);
            this.f.setTextColor(aih.d(this.e, R.color.yt_white1));
            m();
        }
    }
}
