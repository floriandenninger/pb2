package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.RecentlyUsedStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageSelectorRendererOuterClass;
import com.google.protos.youtube.api.innertube.UnicodeEmojiStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iac extends hzh {
    private View aA;
    private View aB;
    private LocationSearchView aC;
    private ViewGroup aD;
    public abdo aj;
    public hzu ak;
    public ibe al;
    public ibq am;
    public Executor an;
    public iaf ao;
    public iba ap;
    public gni aq;
    public FrameLayout ar;
    public RtlAwareViewPager as;
    public auxz at;
    public auyd au;
    public DefaultTabsBar av;
    public iaa aw;
    public boolean ax;
    public int ay;
    public boolean az = true;

    private final void aN(int i, int i2, int i3) {
        Context qR = qR();
        if (this.aq.a() == gng.DARK) {
            i2 = i3;
        }
        LayoutInflater.from(new ContextThemeWrapper(qR, i2)).inflate(i, (ViewGroup) this.ar, true);
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        this.ak.g.b(i, strArr, iArr);
    }

    @Override // defpackage.hys
    protected final View aF() {
        return this.as;
    }

    @Override // defpackage.hys
    protected final View aG() {
        return this.aA;
    }

    @Override // defpackage.ian
    public final void aL(boolean z) {
        this.aB.setVisibility(true != z ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aM(int i) {
        abdo abdoVar = this.aj;
        abdn abdnVar = new abdn(abdoVar.f, abdoVar.a.c(), null, null, null);
        abdnVar.i = aaec.b(abdoVar.c);
        abdnVar.a = i;
        abdnVar.b = this.az;
        abdnVar.k();
        ynm.l(this.aj.b.a(abdnVar), this.an, new ynk() { // from class: hzw
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                iac iacVar = iac.this;
                zga.d("Failed to get multi page sticker", th);
                Toast.makeText(iacVar.C(), R.string.reel_generic_error_message, 1).show();
            }
        }, new ynl() { // from class: hzx
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                final iac iacVar = iac.this;
                final arrt arrtVar = (arrt) obj;
                iacVar.an.execute(new Runnable() { // from class: hzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        aulq aulqVar;
                        final iac iacVar2 = iac.this;
                        arrt arrtVar2 = arrtVar;
                        if (etx.S(iacVar2) && arrtVar2 != null) {
                            boolean z = iacVar2.az;
                            iacVar2.ay = z ? arrtVar2.h : iacVar2.ay;
                            if (z) {
                                iacVar2.az = false;
                            }
                            iaa iaaVar = iacVar2.aw;
                            int i2 = iaaVar.a;
                            int i3 = arrtVar2.g;
                            if (i2 != i3) {
                                iaaVar.a = i3;
                                iaaVar.m();
                                iacVar2.as.l(iacVar2.ay);
                            }
                            final iao iaoVar = (iao) iacVar2.aw.o(iacVar2.as.a());
                            if (iaoVar == null || !etx.S(iaoVar)) {
                                return;
                            }
                            iai iaiVar = iaoVar.a;
                            iaiVar.s = iacVar2;
                            iaiVar.v = iacVar2.ai;
                            if (!iacVar2.ax && (arrtVar2.b & 2) != 0) {
                                aulq aulqVar2 = arrtVar2.d;
                                if (aulqVar2 == null) {
                                    aulqVar2 = aulq.a;
                                }
                                iacVar2.at = (auxz) aulqVar2.pX(StickerCatalogHeaderRendererOuterClass.stickerCatalogHeaderRenderer);
                                auxz auxzVar = iacVar2.at;
                                aqyg aqygVar = null;
                                if ((auxzVar.b & 2) != 0) {
                                    aulqVar = auxzVar.d;
                                    if (aulqVar == null) {
                                        aulqVar = aulq.a;
                                    }
                                } else {
                                    aulqVar = null;
                                }
                                auxz auxzVar2 = iacVar2.at;
                                if ((auxzVar2.b & 1) != 0 && (aqygVar = auxzVar2.c) == null) {
                                    aqygVar = aqyg.a;
                                }
                                FrameLayout frameLayout = iacVar2.ar;
                                if (aulqVar != null) {
                                    ImageView imageView = (ImageView) frameLayout.findViewById(R.id.sticker_catalog_close);
                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: hyp
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            hys.this.aI();
                                        }
                                    });
                                    imageView.setVisibility(0);
                                }
                                if (aqygVar != null) {
                                    ((TextView) frameLayout.findViewById(R.id.sticker_catalog_title)).setText(ajcq.b(aqygVar));
                                }
                                iacVar2.ax = true;
                            }
                            if ((arrtVar2.b & 4) != 0) {
                                aulq aulqVar3 = arrtVar2.e;
                                if (aulqVar3 == null) {
                                    aulqVar3 = aulq.a;
                                }
                                if (aulqVar3.pY(StickerPageRendererOuterClass.stickerPageRenderer)) {
                                    auyc auycVar = (auyc) aulqVar3.pX(StickerPageRendererOuterClass.stickerPageRenderer);
                                    int i4 = auycVar.c;
                                    if (i4 > 0) {
                                        iaoVar.o(i4);
                                    }
                                    if (auycVar.b.size() > 0) {
                                        iaoVar.p(auycVar.b);
                                    }
                                    iaf.a(iacVar2.af, auycVar.b);
                                } else if (aulqVar3.pY(RecentlyUsedStickerPageRendererOuterClass.recentlyUsedStickerPageRenderer)) {
                                    final iaf iafVar = iacVar2.ao;
                                    iaoVar.o(((auiz) aulqVar3.pX(RecentlyUsedStickerPageRendererOuterClass.recentlyUsedStickerPageRenderer)).b);
                                    ynm.n(iaoVar, iafVar.b.g(iaoVar), hue.j, new zfi() { // from class: iae
                                        @Override // defpackage.zfi
                                        public final void a(Object obj2) {
                                            iaf iafVar2 = iaf.this;
                                            iao iaoVar2 = iaoVar;
                                            List list = (List) obj2;
                                            if (list != null) {
                                                iaf.a(iafVar2.a, list);
                                                iaoVar2.a.u = true;
                                                iaoVar2.p(list);
                                            }
                                        }
                                    });
                                } else if (aulqVar3.pY(UnicodeEmojiStickerPageRendererOuterClass.unicodeEmojiStickerPageRenderer)) {
                                    final iba ibaVar = iacVar2.ap;
                                    final avlq avlqVar = (avlq) aulqVar3.pX(UnicodeEmojiStickerPageRendererOuterClass.unicodeEmojiStickerPageRenderer);
                                    amru amruVar = ibaVar.a.c;
                                    if (amruVar.isEmpty()) {
                                        ibaVar.b.post(new Runnable() { // from class: iay
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ian.this.aL(false);
                                            }
                                        });
                                    } else {
                                        final ArrayList arrayList = new ArrayList(amruVar.size());
                                        for (int i5 = 0; i5 < amruVar.size(); i5++) {
                                            String str = (String) amruVar.get(i5);
                                            aone createBuilder = auya.a.createBuilder();
                                            aqyg g = ajcq.g(str);
                                            createBuilder.copyOnWrite();
                                            auya auyaVar = (auya) createBuilder.instance;
                                            g.getClass();
                                            auyaVar.d = g;
                                            auyaVar.b |= 2;
                                            createBuilder.copyOnWrite();
                                            auya auyaVar2 = (auya) createBuilder.instance;
                                            auyaVar2.c = 3;
                                            auyaVar2.b |= 1;
                                            auya auyaVar3 = (auya) createBuilder.build();
                                            aong aongVar = (aong) aulq.a.createBuilder();
                                            aongVar.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, auyaVar3);
                                            arrayList.add((aulq) aongVar.build());
                                        }
                                        ibaVar.b.post(new Runnable() { // from class: iaz
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                iba ibaVar2 = iba.this;
                                                List list = arrayList;
                                                iao iaoVar2 = iaoVar;
                                                avlq avlqVar2 = avlqVar;
                                                ian ianVar = iacVar2;
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    ibaVar2.c.mM().D(etx.E((auya) ((aulq) it.next()).pX(StickerCatalogRendererOuterClass.dynamicStickerRenderer)));
                                                }
                                                iaoVar2.o(avlqVar2.b);
                                                ianVar.aL(false);
                                                iaoVar2.p(list);
                                            }
                                        });
                                    }
                                }
                            }
                            if ((arrtVar2.b & 8) != 0) {
                                aulq aulqVar4 = arrtVar2.f;
                                if (aulqVar4 == null) {
                                    aulqVar4 = aulq.a;
                                }
                                iacVar2.au = (auyd) aulqVar4.pX(StickerPageSelectorRendererOuterClass.stickerPageSelectorRenderer);
                                if (iacVar2.av.j() == 0 && iacVar2.au.b.size() > 0) {
                                    final int i6 = 0;
                                    for (aulq aulqVar5 : iacVar2.au.b) {
                                        if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
                                            apmg apmgVar = (apmg) aulqVar5.pX(ButtonRendererOuterClass.buttonRenderer);
                                            if ((apmgVar.b & 65536) != 0) {
                                                DefaultTabsBar defaultTabsBar = iacVar2.av;
                                                aots aotsVar = apmgVar.r;
                                                if (aotsVar == null) {
                                                    aotsVar = aots.a;
                                                }
                                                String str2 = aotsVar.c;
                                                defaultTabsBar.r(str2, str2);
                                            }
                                            iacVar2.av.k(i6).setOnClickListener(new View.OnClickListener() { // from class: hzv
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    iac iacVar3 = iac.this;
                                                    int i7 = i6;
                                                    iacVar3.as.l(i7);
                                                    ((iao) iacVar3.aw.o(i7)).c.ak(0);
                                                }
                                            });
                                        }
                                        i6++;
                                    }
                                }
                                if (iacVar2.av.j() == 0 || arrtVar2.h >= iacVar2.av.j()) {
                                    return;
                                }
                                iacVar2.av.m(arrtVar2.h, false);
                            }
                        }
                    }
                });
            }
        }, anij.a);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("pages", this.aw.a());
        bundle.putInt("position", this.as.a());
        super.mQ(bundle);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af.mM().d(acsb.b(37168), null, null);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.multi_page_sticker_catalog_fragment, viewGroup, false);
        this.ar = frameLayout;
        this.aA = frameLayout.findViewById(R.id.sticker_catalog_container);
        RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) this.ar.findViewById(R.id.sticker_catalog_page);
        this.as = rtlAwareViewPager;
        if (rtlAwareViewPager.d != 2) {
            rtlAwareViewPager.d = 2;
            rtlAwareViewPager.h();
        }
        this.aw = new iaa(this, mN());
        this.as.e(new iab(this));
        DefaultTabsBar defaultTabsBar = (DefaultTabsBar) this.ar.findViewById(R.id.sticker_page_tab_bar);
        this.av = defaultTabsBar;
        this.as.e(defaultTabsBar);
        this.av.setVisibility(0);
        this.aB = this.ar.findViewById(R.id.spinner);
        if (bundle != null) {
            this.aw.e(bundle.getParcelable("pages"), getClass().getClassLoader());
            this.ay = bundle.getInt("position");
        }
        this.as.k(this.aw);
        aL(true);
        hzz hzzVar = new hzz(this);
        this.ah = true;
        this.d.setOnKeyListener(this);
        Display defaultDisplay = ((WindowManager) qR().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.y;
        this.ag = i;
        this.aA.setTranslationY(i);
        this.as.setTranslationY(this.ag);
        this.as.setTranslationY(this.ag);
        aH(true, hzzVar);
        aN(R.layout.location_search_view_layout, R.style.ReelTheme_NoActionBar_FullScreen_Light, R.style.ReelTheme_NoActionBar_FullScreen_Dark);
        LocationSearchView locationSearchView = (LocationSearchView) this.ar.findViewById(R.id.location_search_view);
        this.aC = locationSearchView;
        hzu hzuVar = this.ak;
        hyq hyqVar = this.ai;
        acra mM = this.af.mM();
        hzuVar.h = locationSearchView;
        hzuVar.n = hyqVar;
        hzuVar.j = this;
        hzuVar.k = mM;
        hzuVar.i = hzuVar.o.d(locationSearchView, hzuVar);
        hzuVar.g = hzuVar.c();
        aN(R.layout.user_mention_search_view, R.style.Theme_YouTube_Light, R.style.Theme_YouTube_Dark);
        ViewGroup viewGroup2 = (ViewGroup) this.ar.findViewById(R.id.user_mention_search_view);
        this.aD = viewGroup2;
        ibe ibeVar = this.al;
        hyq hyqVar2 = this.ai;
        acra mM2 = this.af.mM();
        ibeVar.g = viewGroup2;
        ibeVar.m = hyqVar2;
        FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.results_view);
        ibeVar.l = new hbg();
        ibeVar.l.c(frameLayout2);
        UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint = UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint);
        ibeVar.k = (apxf) aongVar.build();
        jgp jgpVar = ibeVar.n;
        avuu avuuVar = avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
        apxf apxfVar = ibeVar.k;
        Context context = (Context) jgpVar.a.get();
        context.getClass();
        jlb jlbVar = (jlb) jgpVar.b.get();
        jlbVar.getClass();
        viewGroup2.getClass();
        mM2.getClass();
        avuuVar.getClass();
        apxfVar.getClass();
        ibeVar.h = new ipa(context, jlbVar, viewGroup2, ibeVar, mM2, avuuVar, apxfVar, null, null);
        ibq ibqVar = this.am;
        ibqVar.i = this.ai;
        ibqVar.g = this.af.mM();
        return this.ar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // defpackage.hys, android.content.DialogInterface.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
        /*
            r3 = this;
            r4 = 0
            r0 = 4
            r1 = 1
            if (r5 != r0) goto Lf
            int r5 = r6.getAction()
            if (r5 != r1) goto Le
            r5 = 4
            r2 = 1
            goto L10
        Le:
            r5 = 4
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L31
            com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView r2 = r3.aC
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L29
            android.view.ViewGroup r2 = r3.aD
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L23
            goto L31
        L23:
            ibe r4 = r3.al
            r4.d()
            return r1
        L29:
            com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView r4 = r3.aC
            r5 = 8
            r4.setVisibility(r5)
            return r1
        L31:
            if (r5 != r0) goto L3d
            int r5 = r6.getAction()
            if (r5 != r1) goto L3d
            r3.aI()
            return r1
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iac.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }
}
