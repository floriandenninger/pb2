package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lbd extends bv {
    public static final String ae;
    LinearLayout af;
    LinearLayout ag;
    List ah;
    List ai;
    private auux aj;

    static {
        String canonicalName = lbd.class.getCanonicalName();
        canonicalName.getClass();
        ae = canonicalName;
    }

    public static ammv aF(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("innertube_search_filters")) {
            return amlr.a;
        }
        try {
            return ammv.j((auux) amkq.cj(bundle, "innertube_search_filters", auux.a, aomw.b()));
        } catch (aoob unused) {
            return amlr.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aH(dd ddVar, auux auuxVar) {
        if (auuxVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        aI(bundle, auuxVar);
        lbd lbdVar = new lbd();
        lbdVar.af(bundle);
        lbdVar.qh(ddVar, "FilterDialogFragment");
    }

    private static void aI(Bundle bundle, auux auuxVar) {
        auuxVar.getClass();
        bundle.putParcelable("innertube_search_filters", amkq.cl(auuxVar));
    }

    public final void aG(Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.aj.b);
        Iterator it = this.ah.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Spinner spinner = (Spinner) it.next();
            int intValue = ((Integer) spinner.getTag()).intValue();
            int selectedItemPosition = spinner.getSelectedItemPosition();
            aone builder = ((auuv) arrayList.get(intValue)).toBuilder();
            for (int i = 0; i < ((auuv) builder.instance).c.size(); i++) {
                if (i == selectedItemPosition) {
                    aone builder2 = builder.aQ(i).toBuilder();
                    builder2.copyOnWrite();
                    auuw auuwVar = (auuw) builder2.instance;
                    auuwVar.d = 2;
                    auuwVar.b |= 2;
                    builder.aR(i, builder2);
                } else {
                    int bq = aobq.bq(builder.aQ(i).d);
                    if (bq != 0 && bq == 3) {
                        aone builder3 = builder.aQ(i).toBuilder();
                        builder3.copyOnWrite();
                        auuw auuwVar2 = (auuw) builder3.instance;
                        auuwVar2.d = 1;
                        auuwVar2.b |= 2;
                        builder.aR(i, builder3);
                    }
                }
            }
            arrayList.set(intValue, (auuv) builder.build());
        }
        for (ChipCloudView chipCloudView : this.ai) {
            int intValue2 = ((Integer) chipCloudView.getTag()).intValue();
            aone builder4 = ((auuv) arrayList.get(intValue2)).toBuilder();
            for (int i2 = 0; i2 < ((auuv) builder4.instance).c.size(); i2++) {
                if (chipCloudView.getChildAt(i2).getVisibility() != 8) {
                    if (((gdq) chipCloudView.getChildAt(i2)).f == 1) {
                        aone builder5 = builder4.aQ(i2).toBuilder();
                        builder5.copyOnWrite();
                        auuw auuwVar3 = (auuw) builder5.instance;
                        auuwVar3.d = 2;
                        auuwVar3.b |= 2;
                        builder4.aR(i2, builder5);
                    } else {
                        int bq2 = aobq.bq(builder4.aQ(i2).d);
                        if (bq2 != 0 && bq2 == 3) {
                            aone builder6 = builder4.aQ(i2).toBuilder();
                            builder6.copyOnWrite();
                            auuw auuwVar4 = (auuw) builder6.instance;
                            auuwVar4.d = 1;
                            auuwVar4.b |= 2;
                            builder4.aR(i2, builder6);
                        }
                    }
                }
            }
            arrayList.set(intValue2, (auuv) builder4.build());
        }
        aone createBuilder = auux.a.createBuilder();
        createBuilder.copyOnWrite();
        auux auuxVar = (auux) createBuilder.instance;
        auuxVar.a();
        aolo.addAll((Iterable) arrayList, (List) auuxVar.b);
        aI(bundle, (auux) createBuilder.build());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        aG(bundle);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ammv aF = aF(bundle);
        if (!aF.h()) {
            aF = aF(this.m);
        }
        this.aj = (auux) aF.f();
        ViewGroup viewGroup2 = null;
        View inflate = layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog, (ViewGroup) null);
        this.af = (LinearLayout) inflate.findViewById(R.id.dialog_spinners);
        this.ag = (LinearLayout) inflate.findViewById(R.id.dialog_clouds);
        Context qR = qR();
        this.ah = new ArrayList();
        this.ai = new ArrayList();
        auux auuxVar = this.aj;
        if (auuxVar == null || auuxVar.b.size() == 0) {
            dismiss();
            return inflate;
        }
        Iterator it = this.aj.b.iterator();
        final int i3 = 0;
        int i4 = 0;
        while (true) {
            final int i5 = 1;
            if (!it.hasNext()) {
                inflate.findViewById(R.id.apply).setOnClickListener(new View.OnClickListener(this) { // from class: lbc
                    public final /* synthetic */ lbd a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r7) {
                        /*
                            r6 = this;
                            int r7 = r2
                            if (r7 == 0) goto L57
                            lbd r7 = r6.a
                            android.os.Bundle r0 = new android.os.Bundle
                            r0.<init>()
                            r7.aG(r0)
                            dd r1 = r7.mO()
                            java.lang.String r2 = defpackage.lbd.ae
                            java.util.Map r3 = r1.h
                            java.lang.Object r3 = r3.get(r2)
                            da r3 = (defpackage.da) r3
                            if (r3 == 0) goto L32
                            aoe r4 = defpackage.aoe.STARTED
                            aof r5 = r3.a
                            aom r5 = (defpackage.aom) r5
                            aoe r5 = r5.b
                            boolean r4 = r5.a(r4)
                            if (r4 == 0) goto L32
                            dh r1 = r3.b
                            r1.a(r2, r0)
                            goto L37
                        L32:
                            java.util.Map r1 = r1.g
                            r1.put(r2, r0)
                        L37:
                            r1 = 2
                            boolean r1 = defpackage.dd.W(r1)
                            if (r1 == 0) goto L53
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r3 = "Setting fragment result with key "
                            r1.append(r3)
                            r1.append(r2)
                            java.lang.String r2 = " and result "
                            r1.append(r2)
                            r1.append(r0)
                        L53:
                            r7.dismiss()
                            return
                        L57:
                            lbd r7 = r6.a
                            r7.dismiss()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbc.onClick(android.view.View):void");
                    }
                });
                inflate.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener(this) { // from class: lbc
                    public final /* synthetic */ lbd a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException
                            */
                        /*
                            this = this;
                            int r7 = r2
                            if (r7 == 0) goto L57
                            lbd r7 = r6.a
                            android.os.Bundle r0 = new android.os.Bundle
                            r0.<init>()
                            r7.aG(r0)
                            dd r1 = r7.mO()
                            java.lang.String r2 = defpackage.lbd.ae
                            java.util.Map r3 = r1.h
                            java.lang.Object r3 = r3.get(r2)
                            da r3 = (defpackage.da) r3
                            if (r3 == 0) goto L32
                            aoe r4 = defpackage.aoe.STARTED
                            aof r5 = r3.a
                            aom r5 = (defpackage.aom) r5
                            aoe r5 = r5.b
                            boolean r4 = r5.a(r4)
                            if (r4 == 0) goto L32
                            dh r1 = r3.b
                            r1.a(r2, r0)
                            goto L37
                        L32:
                            java.util.Map r1 = r1.g
                            r1.put(r2, r0)
                        L37:
                            r1 = 2
                            boolean r1 = defpackage.dd.W(r1)
                            if (r1 == 0) goto L53
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r3 = "Setting fragment result with key "
                            r1.append(r3)
                            r1.append(r2)
                            java.lang.String r2 = " and result "
                            r1.append(r2)
                            r1.append(r0)
                        L53:
                            r7.dismiss()
                            return
                        L57:
                            lbd r7 = r6.a
                            r7.dismiss()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbc.onClick(android.view.View):void");
                    }
                });
                return inflate;
            }
            auuv auuvVar = (auuv) it.next();
            int i6 = 3;
            if (auuvVar.d) {
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog_cloud, viewGroup2);
                YouTubeTextView youTubeTextView = (YouTubeTextView) linearLayout.findViewById(R.id.label);
                aqyg aqygVar = auuvVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                youTubeTextView.setText(ajcq.b(aqygVar));
                ChipCloudView chipCloudView = (ChipCloudView) linearLayout.findViewById(R.id.cloud);
                for (auuw auuwVar : auuvVar.c) {
                    aqyg aqygVar2 = auuwVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    String obj = ajcq.b(aqygVar2).toString();
                    int bq = aobq.bq(auuwVar.d);
                    boolean z = bq != 0 && bq == i6;
                    final gdq gdqVar = new gdq(qR);
                    gdqVar.f(yjk.K(qR.getResources().getDisplayMetrics(), 48));
                    aone createBuilder = aptg.a.createBuilder();
                    aqyg g = ajcq.g(obj);
                    createBuilder.copyOnWrite();
                    aptg aptgVar = (aptg) createBuilder.instance;
                    g.getClass();
                    aptgVar.f = g;
                    aptgVar.b |= 2;
                    createBuilder.copyOnWrite();
                    aptg aptgVar2 = (aptg) createBuilder.instance;
                    aptgVar2.b |= 256;
                    aptgVar2.i = z;
                    aone createBuilder2 = apti.a.createBuilder();
                    apth apthVar = apth.STYLE_UNKNOWN;
                    createBuilder2.copyOnWrite();
                    apti aptiVar = (apti) createBuilder2.instance;
                    aptiVar.c = apthVar.p;
                    aptiVar.b |= 1;
                    createBuilder.copyOnWrite();
                    aptg aptgVar3 = (aptg) createBuilder.instance;
                    apti aptiVar2 = (apti) createBuilder2.build();
                    aptiVar2.getClass();
                    aptgVar3.e = aptiVar2;
                    aptgVar3.b |= 1;
                    gdqVar.c((aptg) createBuilder.build());
                    gdqVar.setAccessibilityDelegate(new lbf(gdqVar));
                    gdqVar.setOnClickListener(new View.OnClickListener() { // from class: lbe
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            gdq gdqVar2 = gdq.this;
                            gdqVar2.d(true == gdqVar2.isSelected() ? 2 : 1);
                        }
                    });
                    chipCloudView.addView(gdqVar);
                    i6 = 3;
                }
                chipCloudView.b(Integer.MAX_VALUE);
                this.ag.addView(linearLayout);
                i2 = i4 + 1;
                chipCloudView.setTag(Integer.valueOf(i4));
                this.ai.add(chipCloudView);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog_spinner, (ViewGroup) null);
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) linearLayout2.findViewById(R.id.label);
                aqyg aqygVar3 = auuvVar.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                youTubeTextView2.setText(ajcq.b(aqygVar3));
                Spinner spinner = (Spinner) linearLayout2.findViewById(R.id.spinner);
                Context context = spinner.getContext();
                lbg lbgVar = new lbg(context, context);
                lbgVar.setDropDownViewResource(R.layout.spinner_dropdown_item);
                int i7 = 0;
                for (int i8 = 0; i8 < auuvVar.c.size(); i8++) {
                    auuw auuwVar2 = (auuw) auuvVar.c.get(i8);
                    aqyg aqygVar4 = auuwVar2.c;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                    lbgVar.add(ajcq.b(aqygVar4).toString());
                    int bq2 = aobq.bq(auuwVar2.d);
                    if (bq2 != 0 && bq2 == 3) {
                        i7 = i8;
                    }
                }
                spinner.setAdapter((SpinnerAdapter) lbgVar);
                spinner.setSelection(i7);
                this.af.addView(linearLayout2);
                if (i4 == 0) {
                    i = R.id.spinner_0;
                } else if (i4 == 1) {
                    i = R.id.spinner_1;
                } else if (i4 != 2) {
                    i = i4 != 3 ? View.generateViewId() : R.id.spinner_3;
                } else {
                    i = R.id.spinner_2;
                }
                spinner.setId(i);
                i2 = i4 + 1;
                spinner.setTag(Integer.valueOf(i4));
                this.ah.add(spinner);
            }
            i4 = i2;
            viewGroup2 = null;
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }
}
