package defpackage;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdx {
    public final mec a;
    public final LinearLayoutManager b;
    public aone c;
    private final ajpd d;
    private final ajox e;
    private final RecyclerView f;
    private final LinearLayout g;
    private final boolean h;
    private final Integer i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [ajos, java.lang.Object] */
    public mdx(Activity activity, LinearLayout linearLayout, mec mecVar, ajoy ajoyVar, ajvb ajvbVar, aaea aaeaVar, boolean z, acra acraVar, Integer num) {
        float dimension;
        ajpd ajpdVar = new ajpd();
        this.d = ajpdVar;
        RecyclerView recyclerView = new RecyclerView(activity);
        this.f = recyclerView;
        this.a = mecVar;
        this.h = z;
        this.i = num;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.chip_bar_chips_container);
        this.g = linearLayout2;
        fyd fydVar = new fyd(activity.getResources().getDimensionPixelSize(R.dimen.chip_padding));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.b = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, activity.getResources().getDimensionPixelSize(R.dimen.bar_container_height)));
        int dimension2 = (int) activity.getResources().getDimension(R.dimen.bar_padding);
        int dimension3 = (int) activity.getResources().getDimension(R.dimen.chips_padding_end);
        if (evr.L(aaeaVar)) {
            dimension = activity.getResources().getDimension(R.dimen.chips_padding_start);
        } else {
            dimension = activity.getResources().getDimension(R.dimen.recycler_view_start_padding);
        }
        recyclerView.setPadding((int) dimension, dimension2, dimension3, dimension2);
        recyclerView.setClipToPadding(false);
        recyclerView.setContentDescription(activity.getResources().getString(R.string.accessibility_search_results_chip_bar_content_description));
        recyclerView.setImportantForAccessibility(1);
        linearLayout2.addView(recyclerView);
        ajox b = ajoyVar.b(ajvbVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.e = b;
        b.h(ajpdVar);
        recyclerView.aB(fydVar);
        recyclerView.aD(new mdv(mecVar));
        b.rU(new mdu(acraVar, 0));
        if (z || linearLayout2.getChildCount() <= 2) {
            return;
        }
        linearLayout2.removeViewAt(1);
    }

    public final boolean a(aone aoneVar) {
        Integer num;
        int i = 0;
        if (aoneVar == null) {
            return false;
        }
        this.c = aoneVar;
        this.f.ac(this.e);
        this.d.clear();
        for (aptk aptkVar : Collections.unmodifiableList(((aptj) aoneVar.instance).b)) {
            int i2 = aptkVar.b;
            if (i2 == 91394224) {
                ajpd ajpdVar = this.d;
                aptg aptgVar = (aptg) aptkVar.c;
                int size = ((aptj) aoneVar.instance).b.size() - 1;
                apxf apxfVar = aptgVar.g;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
                    aone builder = aptgVar.toBuilder();
                    aong aongVar = (aong) apxfVar.toBuilder();
                    aonk aonkVar = SearchEndpointOuterClass.searchEndpoint;
                    aong aongVar2 = (aong) ((aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint)).toBuilder();
                    aongVar2.e(aunm.b, true);
                    aongVar2.e(aunm.c, Boolean.valueOf(!aptgVar.i));
                    aongVar2.e(aunm.d, Integer.valueOf(size));
                    aongVar2.e(aunm.e, Integer.valueOf(i));
                    aongVar.e(aonkVar, (aunn) aongVar2.build());
                    apxf apxfVar2 = (apxf) aongVar.build();
                    builder.copyOnWrite();
                    aptg aptgVar2 = (aptg) builder.instance;
                    apxfVar2.getClass();
                    aptgVar2.g = apxfVar2;
                    aptgVar2.b |= 16;
                    aptgVar = (aptg) builder.build();
                }
                ajpdVar.add(aptgVar);
            } else if (i2 == 65153809) {
                this.d.add((apmg) aptkVar.c);
            }
            i++;
        }
        if (this.g.getChildCount() > 2) {
            this.g.removeViewAt(1);
        }
        if (this.h && (num = this.i) != null) {
            this.f.aa(num.intValue());
        }
        return true;
    }
}
