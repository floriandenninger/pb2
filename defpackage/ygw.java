package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ClientActionEndpointOuterClass$ClientActionEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygw extends ajpc {
    public final Context a;
    public final LinearLayout b;
    public final ImageView c;
    public awgt d;
    private final aahd e;
    private final LinearLayout f;
    private final LinearLayout g;
    private final LinearLayout h;
    private final TextView i;
    private final View j;
    private final View k;
    private final ygv l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final TextView o;
    private int p;
    private List q;
    private ajok r;

    /* JADX WARN: Type inference failed for: r7v1, types: [ajos, java.lang.Object] */
    public ygw(Context context, final aahd aahdVar, ajvb ajvbVar) {
        this.a = context;
        aahdVar.getClass();
        this.e = aahdVar;
        this.p = 0;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_offers_list_layout, (ViewGroup) null);
        this.f = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.collapsed_offers);
        this.m = linearLayout2;
        this.n = (LinearLayout) linearLayout.findViewById(R.id.expanded_offers);
        this.i = (TextView) linearLayout.findViewById(R.id.offer_info_header);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.expand_button);
        this.c = imageView;
        this.j = linearLayout.findViewById(R.id.separator);
        this.k = linearLayout.findViewById(R.id.expanded_separator);
        this.h = (LinearLayout) linearLayout.findViewById(R.id.visible_additional_info_list_container);
        this.b = (LinearLayout) linearLayout.findViewById(R.id.additional_offer_info_list_container);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: ygs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ygw ygwVar = ygw.this;
                ygwVar.g();
                ygwVar.h();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ygt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                ygw ygwVar = ygw.this;
                aahd aahdVar2 = aahdVar;
                if (ygwVar.c.isSelected()) {
                    ygwVar.j();
                    ygwVar.c.setSelected(false);
                } else {
                    ygwVar.f(wcy.l(ygwVar.d.i, aahdVar2), R.layout.ypc_offers_list_additional_offer_info_text, ygwVar.b);
                    ygwVar.c.setSelected(true);
                }
                ImageView imageView2 = ygwVar.c;
                if (imageView2.isSelected()) {
                    string = ygwVar.a.getString(R.string.load_less_label);
                } else {
                    string = ygwVar.a.getString(R.string.load_more_label);
                }
                imageView2.setContentDescription(string);
            }
        });
        this.g = (LinearLayout) linearLayout.findViewById(R.id.single_ypc_offers);
        this.l = new ygv(context, ajvbVar.get());
        this.o = (TextView) linearLayout2.findViewById(R.id.more_offer_info_header);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.p = 0;
        this.l.e(this.g);
        this.n.removeAllViews();
        List list = this.q;
        if (list != null) {
            list.clear();
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        ArrayList arrayList;
        this.d = (awgt) obj;
        this.r = ajokVar;
        this.g.removeAllViews();
        amru j = wcy.j(this.d);
        for (int i = 0; i < j.size(); i++) {
            awgq awgqVar = (awgq) j.get(i);
            if (awgqVar != null) {
                this.g.addView(this.l.c(this.l.d(this.r), awgqVar));
            }
        }
        LinearLayout linearLayout = this.g;
        whu.I(linearLayout, linearLayout.getChildCount() > 0);
        awgm k = wcy.k(this.d);
        awgm k2 = wcy.k(this.d);
        aqyg aqygVar = null;
        if (k2 == null || k2.e.size() == 0) {
            arrayList = null;
        } else {
            aony<awgp> aonyVar = k2.e;
            arrayList = new ArrayList(aonyVar.size());
            for (awgp awgpVar : aonyVar) {
                if ((awgpVar.b & 1) != 0) {
                    awgq awgqVar2 = awgpVar.c;
                    if (awgqVar2 == null) {
                        awgqVar2 = awgq.a;
                    }
                    arrayList.add(awgqVar2);
                }
            }
        }
        this.q = arrayList;
        if (k == null || arrayList == null) {
            whu.I(this.o, false);
            whu.I(this.n, false);
            whu.I(this.m, false);
            whu.I(this.k, false);
        } else {
            if (this.p == 0) {
                this.p = true != k.c ? 2 : 1;
            }
            TextView textView = this.o;
            if ((k.b & 2) != 0 && (aqygVar = k.d) == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, aahk.a(aqygVar, new aahd() { // from class: ygu
                @Override // defpackage.aahd
                public final /* synthetic */ void a(apxf apxfVar) {
                    aahc.a(this, apxfVar);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void b(List list) {
                    aahc.b(this, list);
                }

                @Override // defpackage.aahd
                public final void c(apxf apxfVar, Map map) {
                    ygw ygwVar = ygw.this;
                    ClientActionEndpointOuterClass$ClientActionEndpoint clientActionEndpointOuterClass$ClientActionEndpoint = (ClientActionEndpointOuterClass$ClientActionEndpoint) apxfVar.pX(ClientActionEndpointOuterClass$ClientActionEndpoint.clientActionEndpoint);
                    if ((clientActionEndpointOuterClass$ClientActionEndpoint.b & 1) != 0) {
                        aptq aptqVar = clientActionEndpointOuterClass$ClientActionEndpoint.c;
                        if (aptqVar == null) {
                            aptqVar = aptq.a;
                        }
                        if ((aobq.aM(aptqVar.b) != 0 ? r3 : 1) - 1 != 2) {
                            return;
                        }
                        ygwVar.g();
                        ygwVar.h();
                    }
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void d(List list, Map map) {
                    aahc.c(this, list, map);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void e(List list, Object obj2) {
                    aahc.d(this, list, obj2);
                }
            }, false));
            int i2 = this.p;
            if (i2 == 2) {
                g();
                h();
            } else if (i2 == 1) {
                whu.I(this.m, true);
                whu.I(this.o, true);
                whu.I(this.n, false);
                whu.I(this.k, true);
                this.p = 1;
            }
        }
        f(wcy.l(this.d.g, this.e), R.layout.ypc_visible_additional_info_text, this.h);
        aqyg aqygVar2 = this.d.h;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (TextUtils.isEmpty(b)) {
            whu.I(this.i, false);
            whu.I(this.c, false);
            whu.I(this.b, false);
            whu.I(this.j, false);
            return;
        }
        whu.G(this.i, b);
        CharSequence[] l = wcy.l(this.d.i, this.e);
        if (l == null || l.length == 0) {
            whu.I(this.c, false);
            whu.I(this.b, false);
            return;
        }
        whu.I(this.c, true);
        whu.I(this.b, true);
        if (this.c.isSelected()) {
            f(wcy.l(this.d.i, this.e), R.layout.ypc_offers_list_additional_offer_info_text, this.b);
        } else {
            j();
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awgt) obj).j.I();
    }

    public final void f(CharSequence[] charSequenceArr, int i, LinearLayout linearLayout) {
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            whu.I(linearLayout, false);
            return;
        }
        whu.I(linearLayout, true);
        int i2 = 0;
        while (i2 < charSequenceArr.length) {
            if (i2 >= linearLayout.getChildCount()) {
                View.inflate(this.a, i, linearLayout);
            }
            whu.G((TextView) linearLayout.getChildAt(i2), charSequenceArr[i2]);
            i2++;
        }
        while (i2 < linearLayout.getChildCount()) {
            whu.I(linearLayout.getChildAt(i2), false);
            i2++;
        }
    }

    public final void g() {
        this.n.removeAllViews();
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                awgq awgqVar = (awgq) this.q.get(i);
                if (awgqVar != null) {
                    this.n.addView(this.l.c(this.l.d(this.r), awgqVar));
                }
            }
        }
    }

    public final void h() {
        whu.I(this.m, false);
        whu.I(this.o, false);
        whu.I(this.n, true);
        whu.I(this.k, false);
        this.p = 2;
    }

    public final void j() {
        whu.I(this.b, false);
    }
}
