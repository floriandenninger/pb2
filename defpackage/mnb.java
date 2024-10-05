package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnb extends kwy {
    private final ajop o;
    private final ajoi p;
    private jxu q;
    private final ohx r;

    public mnb(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar, ohx ohxVar, ohg ohgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, ajjzVar, ajuwVar, R.layout.compact_playlist_item, ajutVar, null, ohgVar, null, null, null, null, null, null);
        this.o = gmaVar;
        this.r = ohxVar;
        gmaVar.c(this.c);
        this.p = new ajoi(aahdVar, gmaVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.o).b;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.p.c();
        jxu jxuVar = this.q;
        if (jxuVar != null) {
            jxuVar.o.cancel(false);
            jxuVar.c.m(jxuVar);
            fjl fjlVar = jxuVar.i;
            if (fjlVar != null) {
                jxuVar.e.b(fjlVar);
            }
            whu.I(jxuVar.g, true);
            TypedValue typedValue = new TypedValue();
            jxuVar.h.setTextColor(jxuVar.a.getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true) ? jxuVar.a.getResources().getColor(typedValue.resourceId) : -1);
            TextView textView = jxuVar.h;
            textView.setTypeface(textView.getTypeface(), 0);
            whu.I(jxuVar.h, false);
            ajop ajopVar = jxuVar.k;
            if (ajopVar != null) {
                ajopVar.d(jxuVar.d);
            }
            jxuVar.j = null;
            jxuVar.k = null;
            jxuVar.l = null;
            jxuVar.m = null;
            jxuVar.n = null;
            this.q = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024e  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.oB(ajok, java.lang.Object):void");
    }
}
