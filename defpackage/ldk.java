package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ldk extends ajpc {
    protected final Context a;
    protected final Resources b;
    protected final ajuw c;
    protected final ajjz d;
    protected final ajoi e;
    protected final ajut f;
    protected final View g;
    protected final WrappingTextViewForClarifyBox h;
    protected final TextView i;
    protected final ImageView j;
    protected final Handler k;
    private final ImageView l;
    private final View m;
    private final View n;

    public ldk(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, Handler handler, ajut ajutVar, int i, ViewGroup viewGroup) {
        this.a = context;
        this.b = context.getResources();
        this.c = ajuwVar;
        this.d = ajjzVar;
        this.k = handler;
        this.f = ajutVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.g = inflate;
        this.e = new ajoi(aahdVar, inflate);
        this.l = (ImageView) inflate.findViewById(R.id.clarification_image);
        this.m = inflate.findViewById(R.id.contextual_menu_anchor);
        this.h = (WrappingTextViewForClarifyBox) inflate.findViewById(R.id.clarification_text);
        this.i = (TextView) inflate.findViewById(R.id.source_text);
        this.j = (ImageView) inflate.findViewById(R.id.open_in_new_icon);
        this.n = inflate.findViewById(R.id.bottom_separator);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        List<aqyi> emptyList;
        aptm aptmVar = (aptm) obj;
        ajoi ajoiVar = this.e;
        acra acraVar = ajokVar.a;
        atdc atdcVar = null;
        if ((aptmVar.b & 8) != 0) {
            apxfVar = aptmVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        int i = aptmVar.c;
        if (i == 2) {
            this.d.h(this.l, (avgg) aptmVar.d);
            this.l.setColorFilter((ColorFilter) null);
        } else if (i == 12) {
            ImageView imageView = this.l;
            ajut ajutVar = this.f;
            arfr b = arfr.b(((arfs) aptmVar.d).c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
            this.l.setColorFilter(wbs.W(this.a, R.attr.ytIconActiveOther).orElse(0));
        }
        atdf atdfVar = aptmVar.g;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        boolean z = true;
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = aptmVar.g;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar2 = atdfVar2.c;
            if (atdcVar2 == null) {
                atdcVar2 = atdc.a;
            }
            atdcVar = atdcVar2;
        }
        this.c.e(this.g, this.m, atdcVar, aptmVar, ajokVar.a);
        if ((aptmVar.b & 1) != 0) {
            aqyg aqygVar = aptmVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            emptyList = aqygVar.c;
        } else {
            emptyList = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (aqyi aqyiVar : emptyList) {
            for (String str : aqyiVar.c.split(" ", -1)) {
                if (aqyiVar.d) {
                    i2 += str.length() + 1;
                }
                arrayList.add(str);
            }
        }
        f(aptmVar);
        int aw = anaf.aw(aptmVar.i);
        if (aw != 0 && aw == 4) {
            z = false;
        }
        this.i.getViewTreeObserver().addOnPreDrawListener(new ldj(this, z, i2, arrayList));
        if (this.n == null) {
            return;
        }
        yny.z(this.n, yny.k(ajokVar.c("clarify_box_no_bottom") != Boolean.TRUE ? this.b.getDimensionPixelOffset(R.dimen.clarification_box_bottom_margin) : 0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aptm) obj).m.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(aptm aptmVar) {
        TextView textView = this.i;
        aqyg aqygVar = aptmVar.h;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        whu.I(this.j, this.i.getVisibility() == 0);
    }

    public void g(int i, boolean z) {
        int i2;
        final boolean z2;
        int dimensionPixelOffset = this.b.getDimensionPixelOffset(R.dimen.clarification_box_open_in_new_icon_padding_start);
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        final RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        ArrayDeque arrayDeque = new ArrayDeque();
        if (!z || i < 0) {
            arrayDeque.add(yny.t(16));
            arrayDeque.add(yny.t(8));
            arrayDeque.add(yny.j(18, R.id.clarification_text));
            arrayDeque.add(yny.j(3, R.id.clarification_text));
            i2 = 0;
        } else {
            arrayDeque.add(yny.j(16, R.id.contextual_menu_anchor));
            arrayDeque.add(yny.j(8, R.id.clarification_text));
            arrayDeque.add(yny.t(18));
            arrayDeque.add(yny.t(3));
            i2 = i + this.b.getDimensionPixelOffset(R.dimen.clarification_box_wiki_link_padding_start);
        }
        arrayDeque.add(yny.q(dimensionPixelOffset + i2));
        final boolean a = yny.E(arrayDeque).a(layoutParams2);
        boolean C = yny.C(layoutParams, yny.r(-i2));
        if (a) {
            z2 = C;
        } else if (!C) {
            return;
        } else {
            z2 = true;
        }
        this.k.post(new Runnable() { // from class: ldh
            @Override // java.lang.Runnable
            public final void run() {
                ldk ldkVar = ldk.this;
                boolean z3 = a;
                RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
                boolean z4 = z2;
                RelativeLayout.LayoutParams layoutParams4 = layoutParams;
                if (z3) {
                    ldkVar.i.setLayoutParams(layoutParams3);
                }
                if (z4) {
                    ldkVar.j.setLayoutParams(layoutParams4);
                }
            }
        });
    }
}
