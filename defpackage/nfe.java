package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfe extends nbz {
    private final TextView A;
    private boolean B;

    public nfe(Context context, ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, boolean z2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, ajutVar, ajuwVar, view, view2, z, z2, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.website);
    }

    private final void v(int i, int i2) {
        u(this.d, i);
        u(this.e, i2);
        u(this.A, i2);
    }

    private final void w(Spanned spanned) {
        whu.G(this.A, spanned);
    }

    @Override // defpackage.nbw
    public final void d(acra acraVar, Object obj, augy augyVar, atlt atltVar) {
        aqyg aqygVar;
        k(acraVar, obj, augyVar, atltVar, null);
        if ((augyVar.b & 1024) != 0) {
            aqygVar = augyVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        w(ajcq.b(aqygVar));
    }

    @Override // defpackage.nbz, defpackage.nby
    public final void k(acra acraVar, Object obj, augy augyVar, atlt atltVar, Integer num) {
        aqyg aqygVar;
        super.k(acraVar, obj, augyVar, atltVar, num);
        if ((augyVar.b & 1024) != 0) {
            aqygVar = augyVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        w(ajcq.b(aqygVar));
    }

    @Override // defpackage.nbz
    protected final void q() {
        super.q();
        v(2, 1);
        this.B = true;
        t(16);
    }

    @Override // defpackage.nbz
    protected final void s() {
        super.s();
        if (this.B) {
            v(1, 2);
            this.B = false;
        }
        r();
    }

    @Deprecated
    public nfe(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(null, ajjzVar, ajutVar, ajuwVar, view, view2, z, false, ajywVar, akbdVar, null, null, null, null, null);
    }
}
