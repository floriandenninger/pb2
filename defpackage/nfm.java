package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfm extends nbz {
    private final TextView A;
    private final TextView B;
    private final TextView C;

    public nfm(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, false, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.advertiser);
        this.B = (TextView) view2.findViewById(R.id.separator);
        this.C = (TextView) view2.findViewById(R.id.price);
    }

    @Override // defpackage.nbz, defpackage.nby
    public final void i(acra acraVar, Object obj, auhm auhmVar, atlt atltVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        super.i(acraVar, obj, auhmVar, atltVar);
        aqyg aqygVar3 = null;
        if ((auhmVar.b & 32) != 0) {
            aqygVar = auhmVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((auhmVar.b & 64) != 0) {
            aqygVar2 = auhmVar.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((auhmVar.b & 128) != 0 && (aqygVar3 = auhmVar.j) == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        if (TextUtils.isEmpty(b)) {
            this.C.setVisibility(8);
            this.B.setVisibility(8);
        } else {
            whu.G(this.C, b);
            whu.G(this.B, b2);
        }
        whu.G(this.A, b3);
    }
}
