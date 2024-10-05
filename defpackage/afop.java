package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afop extends vw {
    public List d = new ArrayList();
    public afol e;
    private final LayoutInflater f;
    private final afon g;

    public afop(LayoutInflater layoutInflater, afon afonVar) {
        this.f = layoutInflater;
        this.g = afonVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new afor(this.f.inflate(R.layout.metadataeditor_location_search_item, viewGroup, false), this.e, this.g);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        aqyg aqygVar;
        final afor aforVar = (afor) wvVar;
        final atft atftVar = (atft) this.d.get(i);
        TextView textView = aforVar.t;
        aqyg aqygVar2 = null;
        if ((atftVar.b & 2) != 0) {
            aqygVar = atftVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = aforVar.u;
        if ((atftVar.b & 4) != 0 && (aqygVar2 = atftVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        aforVar.a.setOnClickListener(new View.OnClickListener() { // from class: afoq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                afor aforVar2 = afor.this;
                atft atftVar2 = atftVar;
                aforVar2.w.a.b(true);
                afoi afoiVar = aforVar2.v.b;
                String str = atftVar2.c;
                aqyg aqygVar3 = atftVar2.d;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                afoiVar.e(new Place(str, ajcq.b(aqygVar3).toString()));
            }
        });
    }
}
