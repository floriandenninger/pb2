package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajyx implements ajom {
    private final ajzc a;
    private final View b;
    private final TextView c;
    private final acra d;

    public ajyx(Context context, acrt acrtVar, ajzc ajzcVar) {
        this.d = acrtVar;
        View inflate = View.inflate(context, R.layout.emoji_picker_category, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.category_name);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.emoji_grid);
        recyclerView.af(new GridLayoutManager(7, null));
        recyclerView.ac(ajzcVar);
        this.a = ajzcVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.d = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqsw aqswVar = (aqsw) obj;
        ajzc ajzcVar = this.a;
        apxf apxfVar = aqswVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajzcVar.e = apxfVar;
        TextView textView = this.c;
        aqyg aqygVar = aqswVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        if (aqswVar.e.size() > 0) {
            ajzc ajzcVar2 = this.a;
            ajzcVar2.d = amru.o(aqswVar.e);
            ajzcVar2.mw();
        }
        if ((aqswVar.b & 64) == 0 || aqswVar.h.H()) {
            if ((aqswVar.b & 32) == 0) {
                return;
            }
            aota aotaVar = aqswVar.g;
            if (aotaVar == null) {
                aotaVar = aota.a;
            }
            if (aotaVar.c == 0) {
                return;
            }
        }
        ajokVar.a(this.d);
        this.d.n(new acqx(aqswVar.h));
    }
}
