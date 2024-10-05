package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fsa implements ajom {
    private final Context a;
    private final ajut b;
    private final TextView c;

    public fsa(Context context, ajut ajutVar) {
        this.a = context;
        this.b = ajutVar;
        this.c = (TextView) View.inflate(context, R.layout.simple_list_item_1, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atda atdaVar = (atda) obj;
        this.c.setText(adyu.m0do(atdaVar));
        if (adyu.dm(atdaVar) != null) {
            TextView textView = this.c;
            ajut ajutVar = this.b;
            arfr b = arfr.b(adyu.dm(atdaVar).c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(ajutVar.a(b), 0, 0, 0);
            this.c.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelOffset(com.google.android.youtube.R.dimen.innertube_menu_padding));
        }
    }
}
