package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListPopupWindow;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajwn extends ajva {
    private final FrameLayout a;
    private final Context h;

    public ajwn(Context context, aahd aahdVar, ajvb ajvbVar, ajoy ajoyVar, lru lruVar, aalw aalwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2) {
        super(context, aahdVar, ajvbVar, ajoyVar, lruVar, aalwVar, aoaeVar, null, null);
        this.h = context;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.ajva
    public void a(atdc atdcVar, View view, Object obj, acra acraVar) {
        ajpd ajpdVar = this.c;
        ListPopupWindow i = i();
        ajpdVar.clear();
        ajpdVar.addAll(akbc.j(atdcVar, obj, this.g, this.d));
        this.e = obj;
        this.f = acraVar;
        i.setWidth((int) whu.t(this.h, whu.v(this.h, this.b, this.a), this.h.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp)));
        i.setDropDownGravity(8388661);
        i.setAnchorView(view);
        i.show();
    }
}
