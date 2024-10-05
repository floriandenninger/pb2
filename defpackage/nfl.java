package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfl extends nbz {
    private final TextView A;
    private final TextView B;
    private final TextView C;
    private final TextView D;

    public nfl(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, false, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.title);
        this.B = (TextView) view2.findViewById(R.id.advertiser);
        this.C = (TextView) view2.findViewById(R.id.price);
        this.D = (TextView) view2.findViewById(R.id.description);
    }

    @Override // defpackage.nbz, defpackage.nby
    public final void i(acra acraVar, Object obj, auhm auhmVar, atlt atltVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        super.i(acraVar, obj, auhmVar, atltVar);
        aqyg aqygVar3 = null;
        if ((auhmVar.b & 128) != 0) {
            aqygVar = auhmVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((auhmVar.b & 32) != 0) {
            aqygVar2 = auhmVar.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((auhmVar.b & 16) != 0 && (aqygVar3 = auhmVar.g) == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        boolean z = auhmVar.u;
        whu.G(this.B, b);
        if (TextUtils.isEmpty(b2)) {
            this.A.setMaxLines(2);
            this.C.setVisibility(8);
        } else {
            this.A.setMaxLines(1);
            whu.G(this.C, b2);
        }
        if (!z || TextUtils.isEmpty(b3)) {
            this.D.setMaxLines(0);
            this.D.setVisibility(8);
        } else {
            this.D.setMaxLines(3);
            whu.G(this.D, b3);
        }
    }
}
