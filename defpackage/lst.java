package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lst implements lsy, lsx, lsw {
    @Override // defpackage.lsx
    public final void b(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
        View a = ajomVar.a();
        String string = a.getContext().getResources().getString(R.string.accessibility_list_item_drag_over, Integer.valueOf(i2 + 1));
        Context context = a.getContext();
        if (zev.e(context)) {
            zev.a(context).interrupt();
        }
        zev.c(context, a, string);
    }

    @Override // defpackage.lsy
    public final void c(ajom ajomVar, ajpd ajpdVar, int i) {
        View a = ajomVar.a();
        zev.c(a.getContext(), a, a.getContext().getResources().getString(R.string.accessibility_list_item_drag_start, Integer.valueOf(i + 1), Integer.valueOf(ajpdVar.size())));
    }

    @Override // defpackage.lsw
    public final void oD(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
        View a = ajomVar.a();
        zev.c(a.getContext(), a, a.getContext().getResources().getString(R.string.accessibility_list_item_drag_end, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1), Integer.valueOf(ajpdVar.size())));
    }
}
