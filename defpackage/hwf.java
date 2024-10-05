package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPickerItemRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwf extends vw {
    public final aahd d;
    public ArrayList e;
    public String f;
    public hvw g;
    public hwd h;
    List i;
    private final Context j;
    private final ajjs k;
    private final ajut l;

    public hwf(Context context, ajjs ajjsVar, ajut ajutVar, aahd aahdVar) {
        this.j = context;
        this.k = ajjsVar;
        this.l = ajutVar;
        this.d = aahdVar;
    }

    public static final String w(aujv aujvVar) {
        aqyg aqygVar = aujvVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        if (!aujvVar.e.isEmpty()) {
            String valueOf = String.valueOf(b);
            String str = aujvVar.e;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            return sb.toString();
        }
        return b.toString();
    }

    @Override // defpackage.vw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new hwe(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.reel_saved_stories_item, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        final hwe hweVar = (hwe) wvVar;
        if (hweVar.t.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = hweVar.t.getLayoutParams();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.j).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            double d = displayMetrics.widthPixels;
            Double.isNaN(d);
            layoutParams.width = (int) (d * 0.22d);
        }
        aqyg aqygVar = null;
        if (((aulq) this.e.get(i)).pY(ReelPickerItemRendererOuterClass.reelPickerItemRenderer)) {
            final aujv aujvVar = (aujv) ((aulq) this.e.get(i)).pX(ReelPickerItemRendererOuterClass.reelPickerItemRenderer);
            hweVar.u.setVisibility(8);
            hweVar.v.setVisibility(0);
            hweVar.v.setImageDrawable(null);
            if ((aujvVar.b & 1) != 0) {
                ajkj ajkjVar = new ajkj(new ajjr(this.k), new yzw(), hweVar.v, false);
                avgg avggVar = aujvVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajkjVar.k(avggVar);
            }
            if (this.i.contains(w(aujvVar))) {
                hweVar.w.setVisibility(0);
            } else {
                hweVar.w.setVisibility(8);
            }
            aqyg aqygVar2 = aujvVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar2);
            if (b != null) {
                hweVar.x.setText(b.toString());
            }
            hweVar.t.setOnClickListener(new View.OnClickListener() { // from class: hwc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    hwf hwfVar = hwf.this;
                    aujv aujvVar2 = aujvVar;
                    hwe hweVar2 = hweVar;
                    String w = hwf.w(aujvVar2);
                    if ((aujvVar2.b & 2) != 0) {
                        aqyg aqygVar3 = aujvVar2.d;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        str = ajcq.b(aqygVar3).toString();
                    } else {
                        str = null;
                    }
                    if (hwfVar.i.contains(w)) {
                        hwfVar.i.remove(w);
                        hwd hwdVar = hwfVar.h;
                        String str2 = aujvVar2.e;
                        hvc hvcVar = (hvc) hwdVar;
                        hur hurVar = hvcVar.ai;
                        if (str2 == null || !hurVar.k.contains(str2)) {
                            if (hurVar.l.contains(str)) {
                                hurVar.l.remove(str);
                            }
                        } else {
                            hurVar.k.remove(str2);
                        }
                        if (hurVar.k.isEmpty() && hurVar.l.isEmpty()) {
                            hurVar.n(R.drawable.ic_add_stories_white_24dp);
                        }
                        hvcVar.aj.d();
                        hvcVar.bf();
                        hweVar2.w.setVisibility(8);
                    } else {
                        hwfVar.i.add(w);
                        hwd hwdVar2 = hwfVar.h;
                        String str3 = aujvVar2.e;
                        hvc hvcVar2 = (hvc) hwdVar2;
                        hur hurVar2 = hvcVar2.ai;
                        if (str3 != null) {
                            hurVar2.k.add(str3);
                        } else {
                            hurVar2.l.add(str);
                        }
                        if (!hurVar2.k.isEmpty() || !hurVar2.l.isEmpty()) {
                            hurVar2.n(R.drawable.quantum_ic_add_circle_white_24);
                        }
                        hvcVar2.aj.d();
                        hvcVar2.bf();
                        hweVar2.w.setVisibility(0);
                    }
                    hwfVar.mw();
                }
            });
        }
        if (((aulq) this.e.get(i)).pY(ButtonRendererOuterClass.buttonRenderer)) {
            final apmg apmgVar = (apmg) ((aulq) this.e.get(i)).pX(ButtonRendererOuterClass.buttonRenderer);
            hweVar.v.setVisibility(8);
            hweVar.w.setVisibility(8);
            hweVar.u.setVisibility(0);
            TextView textView = hweVar.x;
            if ((apmgVar.b & 256) != 0 && (aqygVar = apmgVar.i) == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            ajut ajutVar = this.l;
            arfs arfsVar = apmgVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            hweVar.u.setImageResource(ajutVar.a(b2));
            hweVar.w.setVisibility(8);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.f);
            hashMap.put("callback_key", this.g);
            hweVar.t.setOnClickListener(new View.OnClickListener() { // from class: hwb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hwf hwfVar = hwf.this;
                    apmg apmgVar2 = apmgVar;
                    Map map = hashMap;
                    view.setEnabled(false);
                    aahd aahdVar = hwfVar.d;
                    apxf apxfVar = apmgVar2.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, map);
                    view.postDelayed(new hgc(view, 3), 1000L);
                }
            });
        }
    }
}
