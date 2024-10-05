package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kry implements ajom {
    private final ViewGroup a;
    private final axpg b;
    private final ajdw c;
    private final acra d;

    public kry(Context context, axpg axpgVar, ajdw ajdwVar, acra acraVar, ViewGroup viewGroup) {
        axpgVar.getClass();
        this.b = axpgVar;
        this.c = ajdwVar;
        acraVar.getClass();
        this.d = acraVar;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_element_layout, viewGroup, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqrf aqrfVar = (aqrf) obj;
        this.c.b(null);
        this.a.removeAllViews();
        View a = this.c.a();
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(a);
        }
        if (aqrfVar != null) {
            ajok ajokVar2 = new ajok();
            ajokVar2.g(new HashMap());
            ajokVar2.a(this.d);
            this.c.oB(ajokVar2, ajds.a(aqrfVar));
            this.a.addView(this.c.a());
        }
    }
}
