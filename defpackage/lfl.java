package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfl implements ajom {
    public apxf a;
    private final View b;
    private final TextView c;

    public lfl(Context context, final aahd aahdVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown_view_all, viewGroup, false);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.view_all);
        this.c = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: lfj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lfl lflVar = lfl.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = lflVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        lfk lfkVar = (lfk) obj;
        whu.G(this.c, ajcq.b(lfkVar.a));
        this.a = lfkVar.b;
    }
}
