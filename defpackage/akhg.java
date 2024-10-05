package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class akhg extends bv {
    private apet ae;
    private Future af;
    private aahd ag;
    private View ah;
    public PackageManager ai;
    public acra aj;
    public RecyclerView ak;
    public ypa al;
    public ExecutorService am;
    public aadw an;
    private TextView ao;
    private TextView ap;
    private View aq;
    private TopPeekingScrollView ar;
    private akmp as;

    private final int aF() {
        Resources qX = qX();
        if (qX.getConfiguration().orientation == 1) {
            return qX.getInteger(R.integer.share_panel_portrait_columns);
        }
        return qX.getInteger(R.integer.share_panel_landscape_columns);
    }

    private static List aG(List list, Map map, PackageManager packageManager, apxf apxfVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aurv aurvVar = (aurv) it.next();
            aurt aurtVar = aurvVar.c;
            if (aurtVar == null) {
                aurtVar = aurt.a;
            }
            apxf apxfVar2 = aurtVar.b;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            Iterator it2 = yjj.v(map, akml.a(apxfVar2)).iterator();
            while (it2.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it2.next();
                aurt aurtVar2 = aurvVar.c;
                if (aurtVar2 == null) {
                    aurtVar2 = aurt.a;
                }
                arrayList.add(new akml(packageManager, resolveInfo, apxfVar, aurtVar2.c.I()));
                it2.remove();
            }
        }
        return arrayList;
    }

    public static aurz aK(arla arlaVar) {
        aqfy aqfyVar = arlaVar.c;
        if (aqfyVar == null) {
            aqfyVar = aqfy.a;
        }
        if ((aqfyVar.b & 1) == 0) {
            return null;
        }
        aqfy aqfyVar2 = arlaVar.c;
        if (aqfyVar2 == null) {
            aqfyVar2 = aqfy.a;
        }
        aurz aurzVar = aqfyVar2.c;
        return aurzVar == null ? aurz.a : aurzVar;
    }

    private final List aN() {
        try {
            return (List) this.af.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zga.d("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.ai = C().getPackageManager();
        atej atejVar = this.an.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apet apetVar = atejVar.m;
        if (apetVar == null) {
            apetVar = apet.a;
        }
        this.ae = apetVar;
        apxf b = aahg.b(this.m.getByteArray("navigation_endpoint"));
        acra aJ = aJ();
        this.aj = aJ;
        aurz aurzVar = null;
        aJ.d(acsb.b(10337), b, null);
        this.af = this.am.submit(new Callable() { // from class: akgz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                akhg akhgVar = akhg.this;
                yjk.e();
                return wbs.aF(akhgVar.ai);
            }
        });
        aahd aH = aH();
        aH.getClass();
        this.ag = aH;
        this.as = new akmp(C(), this.ag, this.aj, this, aF(), this.al);
        this.ak.af(new LinearLayoutManager());
        this.ak.ac(this.as.a);
        this.ak.aB(new akhf(C()));
        if (this.m.containsKey("share_panel")) {
            try {
                aurzVar = (aurz) amkq.cj(this.m, "share_panel", aurz.a, aomw.b());
            } catch (aoob e) {
                afsi.c(1, 15, "Failed to parse old share panel from byte array", e);
            }
        }
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = (ShareEndpointOuterClass$ShareEndpoint) b.pX(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
        if (aurzVar == null) {
            if (shareEndpointOuterClass$ShareEndpoint.c.isEmpty()) {
                if (!shareEndpointOuterClass$ShareEndpoint.b.isEmpty()) {
                    String str = shareEndpointOuterClass$ShareEndpoint.b;
                    this.al.d(new fbp());
                    aavj aI = aI();
                    List J2 = ahbx.J(aN(), this.ae);
                    akhc akhcVar = new akhc(this);
                    aavo aavoVar = new aavo(aI.f, aI.a.c(), null, null, null);
                    aavoVar.a = str;
                    aavoVar.b = J2;
                    aI.c(arla.a, aI.b, aatt.s, aavd.c).e(aavoVar, akhcVar);
                    return;
                }
                throw new IllegalArgumentException("Invalid share endpoint provided.");
            }
            arla arlaVar = (arla) adyu.dv(shareEndpointOuterClass$ShareEndpoint.c, arla.a.getParserForType());
            if (arlaVar == null) {
                arlaVar = arla.a;
            }
            aM(aK(arlaVar));
            return;
        }
        aM(aurzVar);
    }

    protected abstract aahd aH();

    protected abstract aavj aI();

    protected abstract acra aJ();

    public final void aL(String str) {
        ci C = C();
        ((ClipboardManager) C.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", str));
        whu.K(C, R.string.share_copy_url_success, 0);
    }

    public final void aM(aurz aurzVar) {
        aqyg aqygVar;
        aurr aurrVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        ypa ypaVar = this.al;
        aurzVar.d.size();
        aurzVar.e.size();
        ypaVar.d(new fbs());
        this.aj.D(new acqx(aurzVar.k));
        TextView textView = this.ao;
        if ((aurzVar.b & 4) != 0) {
            aqygVar = aurzVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((aurzVar.b & 16) != 0) {
            aurs aursVar = aurzVar.h;
            if (aursVar == null) {
                aursVar = aurs.a;
            }
            aurrVar = aursVar.b;
            if (aurrVar == null) {
                aurrVar = aurr.a;
            }
        } else {
            aurrVar = null;
        }
        if (aurrVar == null) {
            TextView textView2 = this.ap;
            if ((aurzVar.b & 8) != 0) {
                aqygVar3 = aurzVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            textView2.setText(ajcq.b(aqygVar3));
            this.ap.setOnClickListener(new akhd(this, aurzVar));
        } else {
            TextView textView3 = this.ap;
            if ((aurrVar.b & 1) != 0) {
                aqygVar2 = aurrVar.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView3.setText(ajcq.b(aqygVar2));
            this.ap.setOnClickListener(new akhe(this, aurrVar));
        }
        this.ap.setVisibility(0);
        HashMap hashMap = new HashMap();
        for (ResolveInfo resolveInfo : aN()) {
            yjj.w(hashMap, resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo);
        }
        apxf apxfVar = aurzVar.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        List aG = aG(aurzVar.d, hashMap, this.ai, apxfVar);
        List aG2 = aG(aurzVar.e, hashMap, this.ai, apxfVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add(new akml(this.ai, (ResolveInfo) it2.next(), apxfVar, aurzVar.j.I()));
            }
        }
        final Collator collator = Collator.getInstance();
        Collections.sort(arrayList, new Comparator() { // from class: akgy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return collator.compare(((akml) obj).b.toString(), ((akml) obj2).b.toString());
            }
        });
        aG2.addAll(arrayList);
        akmp akmpVar = this.as;
        akmpVar.b.clear();
        akmpVar.b.addAll(aG);
        akmpVar.c.clear();
        akmpVar.c.addAll(aG2);
        akmpVar.a();
        this.aj.u(new acqx(aurzVar.k), null);
    }

    @Override // defpackage.bv, defpackage.ce
    public void mD() {
        this.al.d(new fbq());
        super.mD();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, android.R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // defpackage.bv, defpackage.ce
    public void mS() {
        this.al.d(new fbr());
        super.mS();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_panel_fragment, viewGroup, false);
        this.ah = inflate;
        this.ao = (TextView) inflate.findViewById(R.id.title);
        this.ap = (TextView) this.ah.findViewById(R.id.copy_url_button);
        this.aq = this.ah.findViewById(R.id.overlay);
        this.ar = (TopPeekingScrollView) this.ah.findViewById(R.id.content_container);
        this.ak = (RecyclerView) this.ah.findViewById(R.id.share_target_container);
        jw.M(this.aq, new akha(this));
        this.aq.setOnClickListener(new akhb(this));
        this.ar.f(qX().getDimensionPixelSize(R.dimen.share_panel_default_peek_amount));
        TopPeekingScrollView topPeekingScrollView = this.ar;
        topPeekingScrollView.l = this.aq;
        topPeekingScrollView.m = this.ak;
        return this.ah;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        akmp akmpVar = this.as;
        int aF = aF();
        amkq.E(aF > 0);
        if (akmpVar.d == aF) {
            return;
        }
        akmpVar.d = aF;
        akmpVar.a();
    }
}
