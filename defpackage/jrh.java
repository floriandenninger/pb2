package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrh extends ajpc {
    public final ftg a;
    public ajok b;
    private final fhz c;
    private final ViewGroup d;
    private final ViewGroup e;
    private final ViewGroup f;
    private final Spinner g;
    private final jrg h;
    private final TextView i;
    private final ajyf j;
    private final TextView k;

    public jrh(Context context, fhz fhzVar, ajyg ajygVar, akbd akbdVar) {
        this.c = fhzVar;
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.client_sorting_section_header, (ViewGroup) null);
        this.d = viewGroup;
        Spinner spinner = (Spinner) from.inflate(R.layout.sort_filter, viewGroup, false);
        this.g = spinner;
        ftg i = fav.i(spinner, spinner, R.layout.sort_filter_spinner_contents, R.layout.sort_filter_item_header, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        this.a = i;
        this.h = new jrg(this);
        spinner.setAdapter((SpinnerAdapter) i);
        TextView textView = (TextView) viewGroup.findViewById(R.id.right_button);
        this.i = textView;
        this.j = ajygVar.a(textView);
        this.e = (ViewGroup) viewGroup.findViewById(R.id.left_view);
        this.f = (ViewGroup) viewGroup.findViewById(R.id.right_view);
        this.k = (TextView) viewGroup.findViewById(R.id.header_title);
        akbdVar.b(spinner, akbdVar.a(spinner, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.d(this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        apuv apuvVar = (apuv) obj;
        this.b = ajokVar;
        ftg ftgVar = this.a;
        apmg apmgVar = null;
        if ((apuvVar.b & 1) != 0) {
            aqygVar = apuvVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        ftgVar.b = ajcq.b(aqygVar);
        TextView textView = this.k;
        aqyg aqygVar2 = apuvVar.g;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar2));
        this.e.removeView(this.g);
        this.f.removeView(this.g);
        if (this.k.getVisibility() == 0) {
            this.f.addView(this.g);
        } else {
            this.e.addView(this.g);
        }
        this.g.setOnItemSelectedListener(null);
        ftg ftgVar2 = this.a;
        aony aonyVar = apuvVar.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = aonyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new jrf((aput) it.next()));
        }
        ftgVar2.a(arrayList);
        int i = 0;
        while (true) {
            if (i >= apuvVar.d.size()) {
                i = 0;
                break;
            } else if (((aput) apuvVar.d.get(i)).d) {
                break;
            } else {
                i++;
            }
        }
        this.h.a = i;
        this.g.setSelection(i, false);
        this.g.setOnItemSelectedListener(this.h);
        acra acraVar = ajokVar.a;
        if (apuvVar.f.size() != 0) {
            Iterator it2 = apuvVar.f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                apmh apmhVar = (apmh) it2.next();
                if ((apmhVar.b & 1) != 0) {
                    apmgVar = apmhVar.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                }
            }
        }
        if (apmgVar != null) {
            this.j.e(R.dimen.text_button_icon_padding);
            this.j.g();
            this.j.b(apmgVar, acraVar);
        } else {
            this.i.setVisibility(8);
        }
        this.c.b(this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apuv) obj).e.I();
    }
}
