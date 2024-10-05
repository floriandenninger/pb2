package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acit extends vw {
    private final Context d;
    private final List e;

    public acit(Context context, List list) {
        this.d = context;
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.vw
    public final /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new wv(new aclj(this.d));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aclj acljVar = (aclj) wvVar.a;
        auyv auyvVar = (auyv) this.e.get(i);
        aqyg aqygVar4 = null;
        if ((auyvVar.b & 1) == 0) {
            acljVar.a.setText("");
            acljVar.b.setText("");
            acljVar.setContentDescription(null);
            return;
        }
        auyu auyuVar = auyvVar.c;
        if (auyuVar == null) {
            auyuVar = auyu.a;
        }
        TextView textView = acljVar.a;
        if ((auyuVar.b & 2) != 0) {
            aqygVar = auyuVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = acljVar.b;
        if ((auyuVar.b & 4) != 0) {
            aqygVar2 = auyuVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        String string = acljVar.getContext().getString(R.string.lc_statistic_item_cd);
        if ((auyuVar.b & 2) != 0) {
            aqygVar3 = auyuVar.c;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        CharSequence i2 = ajcq.i(aqygVar3);
        if ((auyuVar.b & 4) != 0 && (aqygVar4 = auyuVar.d) == null) {
            aqygVar4 = aqyg.a;
        }
        CharSequence i3 = ajcq.i(aqygVar4);
        if (i2 == null || i3 == null) {
            return;
        }
        acljVar.setContentDescription(String.format(string, i2, i3));
    }
}
