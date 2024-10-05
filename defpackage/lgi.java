package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lgi extends lgf {
    public lgi(Context context, aahd aahdVar, ajjz ajjzVar, akbf akbfVar, ajyg ajygVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, ViewGroup viewGroup, byte[] bArr) {
        super(context, aahdVar, ajjzVar, akbfVar, ajygVar, ajutVar, ftnVar, fvfVar, akbdVar, R.layout.watch_card_rich_header_vertical_layout, viewGroup, null);
    }

    @Override // defpackage.lgf
    public final void d(awcw awcwVar) {
        aqyg aqygVar;
        TextView textView = this.b;
        if ((awcwVar.b & 4) != 0) {
            aqygVar = awcwVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
    }
}
