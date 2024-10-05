package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajyp implements ajom {
    private final ajyk a;
    private final View b;
    private final TextView c;
    private final acra d;

    public ajyp(Context context, acrt acrtVar, ajyk ajykVar) {
        View inflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.emoji_grid);
        recyclerView.af(new GridLayoutManager(7, null));
        recyclerView.ac(ajykVar);
        this.a = ajykVar;
        this.d = acrtVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.e = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqst aqstVar = (aqst) obj;
        this.a.d = (ajyo) ajokVar.c("CONTROLLER_KEY");
        TextView textView = this.c;
        aqyg aqygVar = aqstVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        if (aqstVar.e.size() > 0) {
            ajyk ajykVar = this.a;
            ajykVar.e = amru.o(aqstVar.e);
            ajykVar.mw();
        }
        if ((aqstVar.b & 8) == 0 || aqstVar.g.H()) {
            if ((aqstVar.b & 4) == 0) {
                return;
            }
            aota aotaVar = aqstVar.f;
            if (aotaVar == null) {
                aotaVar = aota.a;
            }
            if (aotaVar.c == 0) {
                return;
            }
        }
        ajokVar.a(this.d);
        this.d.n(new acqx(aqstVar.g));
    }
}
