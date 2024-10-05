package defpackage;

import android.text.Spanned;
import android.widget.Filter;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afoj extends Filter {
    public astx a;
    private final afok b;
    private Spanned c;
    private final aaxn d;

    public afoj(aaxn aaxnVar, afok afokVar, byte[] bArr) {
        this.d = aaxnVar;
        this.b = afokVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        aone createBuilder = arxf.a.createBuilder();
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        createBuilder.copyOnWrite();
        arxf arxfVar = (arxf) createBuilder.instance;
        charSequence2.getClass();
        arxfVar.b |= 4;
        arxfVar.e = charSequence2;
        astx astxVar = this.a;
        if (astxVar != null) {
            createBuilder.copyOnWrite();
            arxf arxfVar2 = (arxf) createBuilder.instance;
            arxfVar2.d = astxVar;
            arxfVar2.b |= 2;
        }
        aqyg aqygVar = null;
        try {
            aaxn aaxnVar = this.d;
            aasp aaspVar = aaxnVar.b;
            aaxg aaxgVar = new aaxg(aaxnVar.f, aaxnVar.a.c(), createBuilder, null, null, null);
            aaxgVar.m(aaef.b);
            arxg arxgVar = (arxg) aaspVar.d(aaxgVar);
            ArrayList arrayList = new ArrayList(arxgVar.d.size());
            Iterator it = arxgVar.d.iterator();
            while (it.hasNext()) {
                atft atftVar = (atft) ((aulq) it.next()).pX(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                if ((atftVar.b & 2) == 0) {
                    String valueOf = String.valueOf(atftVar.c);
                    zga.b(valueOf.length() != 0 ? "Empty place received: ".concat(valueOf) : new String("Empty place received: "));
                } else {
                    arrayList.add(atftVar);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arxgVar.d.size();
            if ((arxgVar.b & 2) != 0 && (aqygVar = arxgVar.e) == null) {
                aqygVar = aqyg.a;
            }
            this.c = ajcq.b(aqygVar);
            return filterResults;
        } catch (aasx e) {
            zga.d("Failed to fetch autocomplete results.", e);
            this.c = null;
            return filterResults;
        }
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults.values != null) {
            ArrayList arrayList = (ArrayList) filterResults.values;
            if (!arrayList.isEmpty()) {
                this.b.a(arrayList);
                return;
            }
            afok afokVar = this.b;
            LocationSearchView locationSearchView = (LocationSearchView) afokVar;
            locationSearchView.c.setText(this.c);
            locationSearchView.b.setVisibility(8);
            locationSearchView.c.setVisibility(0);
            return;
        }
        this.b.a(Collections.emptyList());
    }
}
