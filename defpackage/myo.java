package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myo extends ajpc {
    public final aahd a;
    public aqyz b;
    public aqyp c;
    public final TextView d;
    public final TextView e;
    private final LayoutInflater f;
    private final ajjz g;
    private final aahv h;
    private acra i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final TextView s;
    private final TextView t;
    private final Button u;
    private final Button v;

    public myo(Context context, aahd aahdVar, ajjz ajjzVar, aahv aahvVar) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f = from;
        this.a = aahdVar;
        this.g = ajjzVar;
        this.h = aahvVar;
        this.b = null;
        View inflate = from.inflate(R.layout.formfill_confirmation, (ViewGroup) null, false);
        this.j = inflate;
        this.k = (ImageView) inflate.findViewById(R.id.title_image);
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.description);
        this.n = (TextView) inflate.findViewById(R.id.confirmation_main_title);
        this.o = (ImageView) inflate.findViewById(R.id.information_destination_icon);
        this.p = (TextView) inflate.findViewById(R.id.information_destination_title);
        this.q = (TextView) inflate.findViewById(R.id.information_destination_description);
        this.r = (ImageView) inflate.findViewById(R.id.contact_info_icon);
        this.s = (TextView) inflate.findViewById(R.id.contact_info_title);
        this.t = (TextView) inflate.findViewById(R.id.contact_info_description);
        this.d = (TextView) inflate.findViewById(R.id.contact_info_description_phone);
        this.e = (TextView) inflate.findViewById(R.id.contact_info_description_email);
        Button button = (Button) inflate.findViewById(R.id.back_button);
        this.u = button;
        Button button2 = (Button) inflate.findViewById(R.id.submit_button);
        this.v = button2;
        button.setOnClickListener(new View.OnClickListener() { // from class: myl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myo myoVar = myo.this;
                aqyp aqypVar = myoVar.c;
                if (aqypVar != null) {
                    aulq aulqVar = aqypVar.n;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        aulq aulqVar2 = myoVar.c.n;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                        if ((apmgVar.b & 32768) != 0) {
                            aahd aahdVar2 = myoVar.a;
                            apxf apxfVar = apmgVar.p;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar2.c(apxfVar, null);
                        }
                        if ((apmgVar.b & 16384) != 0) {
                            aahd aahdVar3 = myoVar.a;
                            apxf apxfVar2 = apmgVar.o;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar3.a(apxfVar2);
                        }
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: mym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar;
                aqyw aqywVar;
                myo myoVar = myo.this;
                aulq aulqVar = myoVar.c.o;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    aulq aulqVar2 = myoVar.c.o;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    List<aqyv> formfillFieldResults = myoVar.b.getFormfillFieldResults();
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < formfillFieldResults.size(); i++) {
                        aqyv aqyvVar = (aqyv) formfillFieldResults.get(i);
                        aone createBuilder = dxd.a.createBuilder();
                        aone createBuilder2 = dxf.a.createBuilder();
                        if (aqyvVar.c == 4) {
                            aqywVar = (aqyw) aqyvVar.d;
                        } else {
                            aqywVar = aqyw.a;
                        }
                        String str = aqywVar.c;
                        createBuilder2.copyOnWrite();
                        dxf dxfVar = (dxf) createBuilder2.instance;
                        str.getClass();
                        dxfVar.b |= 1;
                        dxfVar.c = str;
                        createBuilder.copyOnWrite();
                        dxd dxdVar = (dxd) createBuilder.instance;
                        dxf dxfVar2 = (dxf) createBuilder2.build();
                        dxfVar2.getClass();
                        dxdVar.d = dxfVar2;
                        dxdVar.c = 4;
                        String str2 = aqyvVar.e;
                        createBuilder.copyOnWrite();
                        dxd dxdVar2 = (dxd) createBuilder.instance;
                        str2.getClass();
                        dxdVar2.b |= 1;
                        dxdVar2.e = str2;
                        boolean z = aqyvVar.f;
                        createBuilder.copyOnWrite();
                        dxd dxdVar3 = (dxd) createBuilder.instance;
                        dxdVar3.b = 2 | dxdVar3.b;
                        dxdVar3.f = z;
                        arrayList.add((dxd) createBuilder.build());
                    }
                    aony<aqyq> aonyVar = myoVar.c.m;
                    ArrayList arrayList2 = new ArrayList();
                    for (aqyv aqyvVar2 : formfillFieldResults) {
                        String str3 = aqyvVar2.e;
                        Iterator it = aonyVar.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                apxfVar = null;
                                break;
                            }
                            aqyq aqyqVar = (aqyq) it.next();
                            if (aqyqVar.d.equals(str3) && (aqyqVar.b & 8) != 0) {
                                apxfVar = aqyqVar.e;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                            }
                        }
                        if (apxfVar != null && aqyvVar2.f) {
                            arrayList2.add(apxfVar);
                        }
                    }
                    aone createBuilder3 = asht.a.createBuilder();
                    aone builder = ashq.a.toBuilder();
                    aone builder2 = asgz.a.toBuilder();
                    String h = myo.h(aonyVar, 2);
                    String h2 = myo.h(aonyVar, 4);
                    String h3 = myo.h(aonyVar, 3);
                    for (aqyv aqyvVar3 : formfillFieldResults) {
                        String str4 = aqyvVar3.e;
                        if (h == null || !h.equals(str4)) {
                            if (h2 == null || !h2.equals(str4)) {
                                if (h3 != null && h3.equals(str4) && aqyvVar3.f) {
                                    builder.copyOnWrite();
                                    ashq.b((ashq) builder.instance);
                                    builder2.copyOnWrite();
                                    asgz.b((asgz) builder2.instance);
                                }
                            } else if (aqyvVar3.f) {
                                builder.copyOnWrite();
                                ashq.c((ashq) builder.instance);
                                builder2.copyOnWrite();
                                asgz.c((asgz) builder2.instance);
                            }
                        } else if (aqyvVar3.f) {
                            builder.copyOnWrite();
                            ashq.a((ashq) builder.instance);
                            builder2.copyOnWrite();
                            asgz.a((asgz) builder2.instance);
                        }
                    }
                    for (aqyq aqyqVar2 : aonyVar) {
                        if (h == null || !h.equals(aqyqVar2.d)) {
                            if (h2 == null || !h2.equals(aqyqVar2.d)) {
                                if (h3 != null && h3.equals(aqyqVar2.d) && aqyqVar2.f) {
                                    builder.copyOnWrite();
                                    ashq.e((ashq) builder.instance);
                                    builder2.copyOnWrite();
                                    asgz.e((asgz) builder2.instance);
                                }
                            } else if (aqyqVar2.f) {
                                builder.copyOnWrite();
                                ashq.f((ashq) builder.instance);
                                builder2.copyOnWrite();
                                asgz.f((asgz) builder2.instance);
                            }
                        } else if (aqyqVar2.f) {
                            builder.copyOnWrite();
                            ashq.d((ashq) builder.instance);
                            builder2.copyOnWrite();
                            asgz.d((asgz) builder2.instance);
                        }
                    }
                    aone createBuilder4 = ashd.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    ashd ashdVar = (ashd) createBuilder4.instance;
                    asgz asgzVar = (asgz) builder2.build();
                    asgzVar.getClass();
                    ashdVar.d = asgzVar;
                    ashdVar.c = 6;
                    createBuilder3.copyOnWrite();
                    asht ashtVar = (asht) createBuilder3.instance;
                    ashd ashdVar2 = (ashd) createBuilder4.build();
                    ashdVar2.getClass();
                    ashtVar.t = ashdVar2;
                    ashtVar.c |= 1024;
                    createBuilder3.copyOnWrite();
                    asht ashtVar2 = (asht) createBuilder3.instance;
                    ashq ashqVar = (ashq) builder.build();
                    ashqVar.getClass();
                    ashtVar2.n = ashqVar;
                    ashtVar2.b |= 131072;
                    asht ashtVar3 = (asht) createBuilder3.build();
                    if ((apmgVar.b & 8192) != 0) {
                        Map i2 = acrc.i(myoVar.c, false);
                        i2.put("FORM_RESULTS_ARG", arrayList);
                        i2.put("SUBMIT_COMMANDS_ARG", arrayList2);
                        aahd aahdVar2 = myoVar.a;
                        apxf apxfVar2 = apmgVar.n;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, i2);
                    }
                    if ((apmgVar.b & 16384) != 0) {
                        Map h4 = acrc.h(myoVar.c, ashtVar3);
                        aahd aahdVar3 = myoVar.a;
                        apxf apxfVar3 = apmgVar.o;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aahdVar3.c(apxfVar3, h4);
                    }
                    if ((apmgVar.b & 32768) != 0) {
                        aahd aahdVar4 = myoVar.a;
                        apxf apxfVar4 = apmgVar.p;
                        if (apxfVar4 == null) {
                            apxfVar4 = apxf.a;
                        }
                        aahdVar4.c(apxfVar4, null);
                    }
                }
            }
        });
    }

    public static String f(List list, List list2) {
        aqyw aqywVar;
        String h = h(list2, 2);
        if (h == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqyv aqyvVar = (aqyv) it.next();
            if (h.equals(aqyvVar.e)) {
                if (aqyvVar.c == 4) {
                    aqywVar = (aqyw) aqyvVar.d;
                } else {
                    aqywVar = aqyw.a;
                }
                return aqywVar.c;
            }
        }
        return null;
    }

    public static String g(List list, List list2) {
        aqyw aqywVar;
        String h = h(list2, 4);
        if (h == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqyv aqyvVar = (aqyv) it.next();
            if (h.equals(aqyvVar.e)) {
                if (aqyvVar.c == 4) {
                    aqywVar = (aqyw) aqyvVar.d;
                } else {
                    aqywVar = aqyw.a;
                }
                return aqywVar.c;
            }
        }
        return null;
    }

    public static String h(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqyq aqyqVar = (aqyq) it.next();
            int dy = amkq.dy(aqyqVar.c);
            if (dy == 0) {
                dy = 1;
            }
            if (dy == i) {
                return aqyqVar.d;
            }
        }
        return null;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if ((this.c.b & 16384) != 0) {
            aaio c = ((aaih) this.h.c()).c();
            c.g(this.c.q);
            c.b().Q();
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        aqyg aqygVar7;
        aqyg aqygVar8;
        aqyp aqypVar = (aqyp) obj;
        aqypVar.getClass();
        if ((aqypVar.b & 16384) != 0) {
            this.b = (aqyz) this.h.c().f(aqypVar.q).g(aqyz.class).X();
        }
        if (this.b == null) {
            String valueOf = String.valueOf(aqypVar.q);
            afsi.b(2, 1, valueOf.length() != 0 ? "Lead Form Ads on Confirmation Page failed to read from Entity Store with id=".concat(valueOf) : new String("Lead Form Ads on Confirmation Page failed to read from Entity Store with id="));
            return;
        }
        final String str = aqypVar.q;
        this.h.c().h(str, false).ab(ayqr.a()).ax(new ayrs() { // from class: myn
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                myo myoVar = myo.this;
                String str2 = str;
                myoVar.b = (aqyz) ((aakz) obj2).c;
                aqyz aqyzVar = myoVar.b;
                if (aqyzVar == null) {
                    String valueOf2 = String.valueOf(str2);
                    afsi.b(2, 1, valueOf2.length() != 0 ? "Lead Form Ads on Confirmation Page failed to update from Entity Store with id=".concat(valueOf2) : new String("Lead Form Ads on Confirmation Page failed to update from Entity Store with id="));
                    return;
                }
                aqyp aqypVar2 = myoVar.c;
                if (aqypVar2 == null || !aqypVar2.k) {
                    return;
                }
                List formfillFieldResults = aqyzVar.getFormfillFieldResults();
                aony aonyVar = myoVar.c.m;
                String g = myo.g(formfillFieldResults, aonyVar);
                if (g != null) {
                    myoVar.d.setText(g);
                    myoVar.d.setVisibility(0);
                }
                String f = myo.f(formfillFieldResults, aonyVar);
                if (f != null) {
                    myoVar.e.setText(f);
                    myoVar.e.setVisibility(0);
                }
            }
        });
        this.i = ajokVar.a;
        this.c = aqypVar;
        aulq aulqVar = aqypVar.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqyg aqygVar9 = null;
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            acra acraVar = this.i;
            aulq aulqVar2 = this.c.n;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            acraVar.u(new acqx(((apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer)).t), null);
        }
        aulq aulqVar3 = this.c.o;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            acra acraVar2 = this.i;
            aulq aulqVar4 = this.c.o;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            acraVar2.u(new acqx(((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer)).t), null);
        }
        ajjz ajjzVar = this.g;
        ImageView imageView = this.k;
        avgg avggVar = this.c.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.l;
        aqyp aqypVar2 = this.c;
        if ((2 & aqypVar2.b) != 0) {
            aqygVar = aqypVar2.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.m;
        aqyp aqypVar3 = this.c;
        if ((aqypVar3.b & 4) != 0) {
            aqygVar2 = aqypVar3.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        TextView textView3 = this.n;
        aqyp aqypVar4 = this.c;
        if ((aqypVar4.b & 8) != 0) {
            aqygVar3 = aqypVar4.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView3.setText(ajcq.b(aqygVar3));
        ajjz ajjzVar2 = this.g;
        ImageView imageView2 = this.o;
        avgg avggVar2 = this.c.l;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar2.h(imageView2, avggVar2);
        TextView textView4 = this.p;
        aqyp aqypVar5 = this.c;
        if ((aqypVar5.b & 16) != 0) {
            aqygVar4 = aqypVar5.g;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        textView4.setText(ajcq.b(aqygVar4));
        TextView textView5 = this.q;
        aqyp aqypVar6 = this.c;
        if ((aqypVar6.b & 32) != 0) {
            aqygVar5 = aqypVar6.h;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        whu.G(textView5, ajcq.b(aqygVar5));
        ajjz ajjzVar3 = this.g;
        ImageView imageView3 = this.r;
        avgg avggVar3 = this.c.l;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        ajjzVar3.h(imageView3, avggVar3);
        TextView textView6 = this.s;
        aqyp aqypVar7 = this.c;
        if ((aqypVar7.b & 64) != 0) {
            aqygVar6 = aqypVar7.i;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
        } else {
            aqygVar6 = null;
        }
        textView6.setText(ajcq.b(aqygVar6));
        TextView textView7 = this.t;
        aqyp aqypVar8 = this.c;
        if ((aqypVar8.b & 128) != 0) {
            aqygVar7 = aqypVar8.j;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
        } else {
            aqygVar7 = null;
        }
        whu.G(textView7, ajcq.b(aqygVar7));
        if (this.c.k) {
            this.t.setVisibility(8);
            List formfillFieldResults = this.b.getFormfillFieldResults();
            aony aonyVar = this.c.m;
            String g = g(formfillFieldResults, aonyVar);
            if (g != null) {
                this.d.setText(g);
                this.d.setVisibility(0);
            }
            String f = f(formfillFieldResults, aonyVar);
            if (f != null) {
                this.e.setText(f);
                this.e.setVisibility(0);
            }
        }
        aulq aulqVar5 = this.c.n;
        if (aulqVar5 == null) {
            aulqVar5 = aulq.a;
        }
        if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar6 = this.c.n;
            if (aulqVar6 == null) {
                aulqVar6 = aulq.a;
            }
            apmg apmgVar = (apmg) aulqVar6.pX(ButtonRendererOuterClass.buttonRenderer);
            Button button = this.u;
            if ((apmgVar.b & 256) != 0) {
                aqygVar8 = apmgVar.i;
                if (aqygVar8 == null) {
                    aqygVar8 = aqyg.a;
                }
            } else {
                aqygVar8 = null;
            }
            button.setText(ajcq.b(aqygVar8));
        }
        aulq aulqVar7 = this.c.o;
        if (aulqVar7 == null) {
            aulqVar7 = aulq.a;
        }
        if (aulqVar7.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar8 = this.c.o;
            if (aulqVar8 == null) {
                aulqVar8 = aulq.a;
            }
            apmg apmgVar2 = (apmg) aulqVar8.pX(ButtonRendererOuterClass.buttonRenderer);
            Button button2 = this.v;
            if ((apmgVar2.b & 256) != 0 && (aqygVar9 = apmgVar2.i) == null) {
                aqygVar9 = aqyg.a;
            }
            button2.setText(ajcq.b(aqygVar9));
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqyp) obj).p.I();
    }
}
