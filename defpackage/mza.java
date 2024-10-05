package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mza extends ajpc {
    public final aahd a;
    public final oja b;
    public final mzg c;
    public final aahv d;
    public aqzb e;
    public final View f;
    private final LayoutInflater g;
    private final myt h;
    private final myx i;
    private acra j;
    private final TextView k;
    private final LinearLayout l;
    private final LinearLayout m;
    private final TextView n;
    private final Button o;
    private final Button p;
    private final Button q;
    private final Button r;
    private final List s;
    private final ViewGroup t;

    public mza(Context context, aahd aahdVar, oja ojaVar, mzg mzgVar, aahv aahvVar, myt mytVar, myx myxVar) {
        LayoutInflater from = LayoutInflater.from(context);
        this.g = from;
        this.a = aahdVar;
        this.b = ojaVar;
        this.c = mzgVar;
        this.d = aahvVar;
        this.h = mytVar;
        this.i = myxVar;
        final int i = 0;
        View inflate = from.inflate(R.layout.formfill_form, (ViewGroup) null, false);
        this.f = inflate;
        this.l = (LinearLayout) inflate.findViewById(R.id.prefill_communication_container);
        this.k = (TextView) inflate.findViewById(R.id.instructions);
        this.m = (LinearLayout) inflate.findViewById(R.id.input_fields);
        this.n = (TextView) inflate.findViewById(R.id.disclaimer);
        Button button = (Button) inflate.findViewById(R.id.close_button);
        this.o = button;
        Button button2 = (Button) inflate.findViewById(R.id.submit_button);
        this.p = button2;
        Button button3 = (Button) inflate.findViewById(R.id.pre_submit_button);
        this.q = button3;
        Button button4 = (Button) inflate.findViewById(R.id.primary_cta_button);
        this.r = button4;
        final int i2 = 1;
        final int i3 = 2;
        this.s = Arrays.asList(button2, button3, button4);
        this.t = (ViewGroup) inflate.findViewById(R.id.lockup_holder);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: myz
            public final /* synthetic */ mza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                if (i4 == 0) {
                    mza mzaVar = this.a;
                    aulq aulqVar = mzaVar.e.s;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar2 = mzaVar.e.s;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                        View view2 = (View) mzaVar.f.getParent();
                        while (view2 != null && view2.getId() != R.id.results) {
                            view2 = (View) view2.getParent();
                        }
                        if (mzaVar.j((RecyclerView) view2, apmgVar)) {
                            mzaVar.g(apmgVar, true);
                            mzaVar.h(apmgVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i4 != 1) {
                    mza mzaVar2 = this.a;
                    aulq aulqVar3 = mzaVar2.e.n;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar4 = mzaVar2.e.n;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        apmg apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
                        if (mzaVar2.j(mzaVar2.f(), apmgVar2)) {
                            ((DefaultWatchPanelViewController) mzaVar2.b.a).e.l();
                            mzaVar2.g(apmgVar2, true);
                            mzaVar2.h(apmgVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                mza mzaVar3 = this.a;
                aqzb aqzbVar = mzaVar3.e;
                if (aqzbVar != null) {
                    aulq aulqVar5 = aqzbVar.m;
                    if (aulqVar5 == null) {
                        aulqVar5 = aulq.a;
                    }
                    if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar6 = mzaVar3.e.m;
                        if (aulqVar6 == null) {
                            aulqVar6 = aulq.a;
                        }
                        apmg apmgVar3 = (apmg) aulqVar6.pX(ButtonRendererOuterClass.buttonRenderer);
                        if ((apmgVar3.b & 32768) != 0) {
                            aahd aahdVar2 = mzaVar3.a;
                            apxf apxfVar = apmgVar3.p;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar2.c(apxfVar, null);
                        }
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: myz
            public final /* synthetic */ mza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                if (i4 == 0) {
                    mza mzaVar = this.a;
                    aulq aulqVar = mzaVar.e.s;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar2 = mzaVar.e.s;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                        View view2 = (View) mzaVar.f.getParent();
                        while (view2 != null && view2.getId() != R.id.results) {
                            view2 = (View) view2.getParent();
                        }
                        if (mzaVar.j((RecyclerView) view2, apmgVar)) {
                            mzaVar.g(apmgVar, true);
                            mzaVar.h(apmgVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i4 != 1) {
                    mza mzaVar2 = this.a;
                    aulq aulqVar3 = mzaVar2.e.n;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar4 = mzaVar2.e.n;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        apmg apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
                        if (mzaVar2.j(mzaVar2.f(), apmgVar2)) {
                            ((DefaultWatchPanelViewController) mzaVar2.b.a).e.l();
                            mzaVar2.g(apmgVar2, true);
                            mzaVar2.h(apmgVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                mza mzaVar3 = this.a;
                aqzb aqzbVar = mzaVar3.e;
                if (aqzbVar != null) {
                    aulq aulqVar5 = aqzbVar.m;
                    if (aulqVar5 == null) {
                        aulqVar5 = aulq.a;
                    }
                    if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar6 = mzaVar3.e.m;
                        if (aulqVar6 == null) {
                            aulqVar6 = aulq.a;
                        }
                        apmg apmgVar3 = (apmg) aulqVar6.pX(ButtonRendererOuterClass.buttonRenderer);
                        if ((apmgVar3.b & 32768) != 0) {
                            aahd aahdVar2 = mzaVar3.a;
                            apxf apxfVar = apmgVar3.p;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar2.c(apxfVar, null);
                        }
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: myy
            /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r17) {
                /*
                    Method dump skipped, instructions count: 392
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.myy.onClick(android.view.View):void");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: myz
            public final /* synthetic */ mza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                if (i4 == 0) {
                    mza mzaVar = this.a;
                    aulq aulqVar = mzaVar.e.s;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar2 = mzaVar.e.s;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                        View view2 = (View) mzaVar.f.getParent();
                        while (view2 != null && view2.getId() != R.id.results) {
                            view2 = (View) view2.getParent();
                        }
                        if (mzaVar.j((RecyclerView) view2, apmgVar)) {
                            mzaVar.g(apmgVar, true);
                            mzaVar.h(apmgVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i4 != 1) {
                    mza mzaVar2 = this.a;
                    aulq aulqVar3 = mzaVar2.e.n;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar4 = mzaVar2.e.n;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        apmg apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
                        if (mzaVar2.j(mzaVar2.f(), apmgVar2)) {
                            ((DefaultWatchPanelViewController) mzaVar2.b.a).e.l();
                            mzaVar2.g(apmgVar2, true);
                            mzaVar2.h(apmgVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                mza mzaVar3 = this.a;
                aqzb aqzbVar = mzaVar3.e;
                if (aqzbVar != null) {
                    aulq aulqVar5 = aqzbVar.m;
                    if (aulqVar5 == null) {
                        aulqVar5 = aulq.a;
                    }
                    if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar6 = mzaVar3.e.m;
                        if (aulqVar6 == null) {
                            aulqVar6 = aulq.a;
                        }
                        apmg apmgVar3 = (apmg) aulqVar6.pX(ButtonRendererOuterClass.buttonRenderer);
                        if ((apmgVar3.b & 32768) != 0) {
                            aahd aahdVar2 = mzaVar3.a;
                            apxf apxfVar = apmgVar3.p;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar2.c(apxfVar, null);
                        }
                    }
                }
            }
        });
    }

    private final void k(aulq aulqVar, Button button) {
        aqyg aqygVar;
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        button.setVisibility(0);
        for (Button button2 : this.s) {
            if (!button2.equals(button)) {
                button2.setVisibility(8);
            }
        }
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        button.setText(ajcq.b(aqygVar));
        this.j.u(new acqx(apmgVar.t), null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mzg mzgVar = this.c;
        mzgVar.c.clear();
        mzgVar.f.removeAllViews();
        ViewGroup viewGroup = this.h.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.i.b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c5 A[SYNTHETIC] */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mza.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqzb) obj).o.I();
    }

    public final RecyclerView f() {
        nqp nqpVar = ((DefaultWatchPanelViewController) this.b.a).e;
        return (RecyclerView) nqpVar.b(nqpVar.i()).oO().findViewById(R.id.results);
    }

    public final void g(apmg apmgVar, boolean z) {
        Map map;
        if ((apmgVar.b & 16384) != 0) {
            if (z) {
                aqzb aqzbVar = this.e;
                mzg mzgVar = this.c;
                aone createBuilder = asht.a.createBuilder();
                ashq ashqVar = ashq.a;
                asgz asgzVar = asgz.a;
                for (mzf mzfVar : mzgVar.c) {
                    ashqVar = mzfVar.a.c(ashqVar);
                    asgzVar = mzfVar.a.b(asgzVar);
                }
                aone createBuilder2 = ashd.a.createBuilder();
                createBuilder2.copyOnWrite();
                ashd ashdVar = (ashd) createBuilder2.instance;
                asgzVar.getClass();
                ashdVar.d = asgzVar;
                ashdVar.c = 6;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashd ashdVar2 = (ashd) createBuilder2.build();
                ashdVar2.getClass();
                ashtVar.t = ashdVar2;
                ashtVar.c |= 1024;
                createBuilder.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder.instance;
                ashqVar.getClass();
                ashtVar2.n = ashqVar;
                ashtVar2.b |= 131072;
                map = acrc.h(aqzbVar, (asht) createBuilder.build());
            } else {
                map = null;
            }
            aahd aahdVar = this.a;
            apxf apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, map);
        }
    }

    public final void h(apmg apmgVar) {
        if ((apmgVar.b & 8192) != 0) {
            Map i = acrc.i(this.e, false);
            i.put("FORM_RESULTS_ARG", this.c.a());
            mzg mzgVar = this.c;
            ArrayList arrayList = new ArrayList();
            for (mzf mzfVar : mzgVar.c) {
                if (mzfVar.a.h()) {
                    aqzc aqzcVar = mzfVar.b;
                    if ((aqzcVar.b & 8) != 0) {
                        apxf apxfVar = aqzcVar.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        arrayList.add(apxfVar);
                    }
                }
            }
            i.put("SUBMIT_COMMANDS_ARG", arrayList);
            aahd aahdVar = this.a;
            apxf apxfVar2 = apmgVar.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.c(apxfVar2, i);
        }
    }

    public final boolean j(final RecyclerView recyclerView, apmg apmgVar) {
        mzg mzgVar = this.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final View view = null;
        boolean z = false;
        for (mzf mzfVar : mzgVar.c) {
            mzc mzcVar = mzfVar.a;
            mzb e = mzcVar.e(mzfVar.b.e);
            mzcVar.g(!e.a);
            if (!e.a) {
                aqzc aqzcVar = mzfVar.b;
                if ((aqzcVar.b & 16) != 0) {
                    apxf apxfVar = aqzcVar.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    arrayList.add(apxfVar);
                }
                apxf apxfVar2 = e.b;
                if (apxfVar2 != null) {
                    arrayList.add(apxfVar2);
                }
                ashb ashbVar = e.c;
                if (ashbVar != null) {
                    arrayList2.add(ashbVar);
                }
                if (view == null) {
                    view = mzcVar.a();
                }
                z = true;
            }
        }
        if (view != null) {
            view.requestFocus();
            if (recyclerView != null) {
                recyclerView.postDelayed(new Runnable() { // from class: mzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        RecyclerView recyclerView2 = recyclerView;
                        Rect rect = new Rect();
                        view2.getDrawingRect(rect);
                        recyclerView2.offsetDescendantRectToMyCoords(view2, rect);
                        recyclerView2.ai(0, rect.top);
                    }
                }, 100L);
            }
        }
        mze mzeVar = new mze(!z, amru.o(arrayList), amru.o(arrayList2));
        boolean z2 = mzeVar.a;
        if (!z2) {
            this.a.d(mzeVar.b, null);
            aahd aahdVar = this.a;
            apxf apxfVar3 = this.e.p;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar.c(apxfVar3, null);
            if (this.j != null && !mzeVar.c.isEmpty()) {
                acra acraVar = this.j;
                acqx acqxVar = new acqx(apmgVar.t);
                amru amruVar = mzeVar.c;
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashd.a.createBuilder();
                aone createBuilder3 = ashc.a.createBuilder();
                createBuilder3.aq(amruVar);
                createBuilder2.copyOnWrite();
                ashd ashdVar = (ashd) createBuilder2.instance;
                ashc ashcVar = (ashc) createBuilder3.build();
                ashcVar.getClass();
                ashdVar.d = ashcVar;
                ashdVar.c = 1;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashd ashdVar2 = (ashd) createBuilder2.build();
                ashdVar2.getClass();
                ashtVar.t = ashdVar2;
                ashtVar.c |= 1024;
                acraVar.I(3, acqxVar, (asht) createBuilder.build());
                return false;
            }
        }
        return z2;
    }
}
