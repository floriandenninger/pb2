package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqv implements ajom {
    final ajpd a;
    public ajok b;
    private final ViewGroup c;
    private final TextView d;
    private final ajnw e;
    private final mqu f;
    private final aaea g;
    private final Resources h;
    private int i;

    public mqv(Context context, ajoy ajoyVar, akbu akbuVar, fte fteVar, final jgp jgpVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = context.getResources();
        this.g = aaeaVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.mysubs_content_filter, (ViewGroup) null, false);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title_text);
        this.f = new mqu(viewGroup, fteVar.d(null, R.layout.mysubs_sort_filter_item_header, R.layout.mysubs_sort_filter_spinner_contents), akbuVar);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.button_container);
        recyclerView.af(new LinearLayoutManager(0));
        ajpa ajpaVar = new ajpa();
        final ajyb ajybVar = new ajyb() { // from class: mqt
            @Override // defpackage.ajyb
            public final Map a() {
                mqv mqvVar = mqv.this;
                HashMap hashMap = new HashMap(2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("menu_as_bottom_sheet", true);
                hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
                hashMap.put("sectionListController", mqvVar.b.c("sectionListController"));
                return hashMap;
            }
        };
        final byte[] bArr4 = null;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        ajpaVar.f(apmg.class, new ajoq(ajybVar, bArr4, bArr5, bArr6) { // from class: mqs
            public final /* synthetic */ ajyb a;

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup2) {
                jgp jgpVar2 = jgp.this;
                ajyb ajybVar2 = this.a;
                frg e = jgpVar2.e(null, null, R.layout.mysubs_content_filter_button);
                e.a.d = ajybVar2;
                return e;
            }
        });
        ajox a = ajoyVar.a(ajpaVar);
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        a.h(ajpdVar);
        ajnw ajnwVar = new ajnw();
        this.e = ajnwVar;
        a.rU(ajnwVar);
        recyclerView.ac(a);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        atlw atlwVar;
        atlw atlwVar2;
        atlv atlvVar = (atlv) obj;
        this.b = ajokVar;
        this.e.a = ajokVar.a;
        this.a.clear();
        for (apmh apmhVar : atlvVar.d) {
            if (apmhVar != null && (1 & apmhVar.b) != 0) {
                ajpd ajpdVar = this.a;
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                ajpdVar.add(apmgVar);
            }
        }
        if (evr.N(this.g) && this.h.getConfiguration().orientation == 1) {
            this.i = yjk.K(this.h.getDisplayMetrics(), 16);
            ViewGroup viewGroup = this.c;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, this.c.getPaddingRight(), this.i);
        } else {
            ViewGroup viewGroup2 = this.c;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 0, this.c.getPaddingRight(), 0);
        }
        if (atlvVar.b == 1) {
            aqygVar = (aqyg) atlvVar.c;
        } else {
            aqygVar = aqyg.a;
        }
        auwh auwhVar = null;
        if (!TextUtils.isEmpty(ajcq.b(aqygVar))) {
            this.d.setText(ajcq.b(atlvVar.b == 1 ? (aqyg) atlvVar.c : null));
            this.d.setVisibility(0);
            this.f.a(this.b, null, null);
            return;
        }
        mqu mquVar = this.f;
        if (atlvVar.b == 6) {
            atlwVar = (atlw) atlvVar.c;
        } else {
            atlwVar = atlw.a;
        }
        if ((atlwVar.b & 1) != 0) {
            if (atlvVar.b == 6) {
                atlwVar2 = (atlw) atlvVar.c;
            } else {
                atlwVar2 = atlw.a;
            }
            auwhVar = atlwVar2.c;
            if (auwhVar == null) {
                auwhVar = auwh.a;
            }
        }
        atlu atluVar = atlvVar.e;
        if (atluVar == null) {
            atluVar = atlu.a;
        }
        mquVar.a(ajokVar, auwhVar, atluVar);
        this.d.setVisibility(8);
    }
}
