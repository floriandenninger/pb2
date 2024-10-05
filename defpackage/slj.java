package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slj extends FrameLayout {
    public final syb a;
    private final dkp b;
    private byte[] c;
    private ayqw d;
    private boolean e;

    public slj(Context context, syb sybVar) {
        super(context);
        context.getClass();
        this.a = sybVar;
        dkp dkpVar = new dkp(context);
        this.b = dkpVar;
        super.addView(dkpVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void b() {
        ayqw ayqwVar = this.d;
        if (ayqwVar != null) {
            ayqwVar.qc();
            this.d = null;
        }
        this.b.K();
        this.b.G(null);
        this.b.y = null;
    }

    private final void c() {
        final byte[] bArr = this.c;
        if (!this.e || bArr == null) {
            return;
        }
        this.b.y = null;
        final ayqw ayqwVar = new ayqw();
        this.d = ayqwVar;
        sxw sxwVar = this.a.c;
        szf szfVar = szf.b;
        amsj amsjVar = new amsj((char[]) null, (char[]) null);
        amsjVar.w(sxv.class, new sxv("0"));
        dhe dheVar = new dhe(getContext(), this.a.b, new taz(swo.a), amsjVar, (byte[]) null, (byte[]) null, (byte[]) null);
        tac a = tae.a(dheVar);
        sxb a2 = sxc.a();
        a2.p = this.a;
        a2.a = this.b;
        a2.d = szfVar;
        a.f(a2.a());
        a.e(new szo() { // from class: sli
            @Override // defpackage.szo
            public final dha a(dhe dheVar2, sxc sxcVar) {
                slj sljVar = slj.this;
                return ((sxz) sljVar.a.a).a.a(dheVar2, sxcVar, bArr, null, ayqwVar);
            }
        });
        dho c = ComponentTree.c(dheVar, a.a());
        c.d = this.a.e;
        this.b.G(c.a());
    }

    public final void a(byte[] bArr) {
        b();
        this.c = bArr;
        c();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b();
        super.onAttachedToWindow();
        this.e = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e = false;
        b();
        super.onDetachedFromWindow();
    }
}
