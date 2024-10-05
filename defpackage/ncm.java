package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncm extends nby {
    private final TextView x;

    public ncm(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, false, ajywVar, akbdVar, null, null, null, null, null);
        this.x = (TextView) view2.findViewById(R.id.website);
    }

    @Override // defpackage.nby
    public final void j(acra acraVar, Object obj, auhp auhpVar, atlt atltVar) {
        aqyg aqygVar;
        super.j(acraVar, obj, auhpVar, atltVar);
        if ((auhpVar.b & 4) != 0) {
            aqygVar = auhpVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(this.x, ajcq.b(aqygVar));
    }
}
