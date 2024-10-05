package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogn implements ohb {
    public final aahd a;
    public final String b;
    public final acra c;
    public final acrt d;
    public final nqp e;
    public WatchNextResponseModel f;
    public Runnable g;
    private final ogx h;
    private final azrw i;
    private final azrw j;
    private final oip k;
    private final View l;
    private final ahqr m;
    private final ahqp n;
    private final ohi o;
    private final fgq p;
    private ayqx q;
    private ogw r;
    private nto s;
    private ofm t;
    private String u;
    private String v;
    private int w;
    private ahqo x = ahqo.NEW;
    private final ahey y;

    public ogn(aahd aahdVar, ogx ogxVar, azrw azrwVar, azrw azrwVar2, ahey aheyVar, acra acraVar, nqp nqpVar, fgq fgqVar, gpe gpeVar, ahqr ahqrVar, acrt acrtVar, oip oipVar, View view, String str, byte[] bArr, byte[] bArr2) {
        this.a = aahdVar;
        this.c = acraVar;
        this.d = acrtVar;
        this.m = ahqrVar;
        this.h = ogxVar;
        this.i = azrwVar;
        this.j = azrwVar2;
        this.y = aheyVar;
        this.k = oipVar;
        this.l = view;
        this.e = nqpVar;
        this.p = fgqVar;
        this.b = str;
        ogk ogkVar = new ogk(this);
        this.n = ogkVar;
        ogl oglVar = new ogl(this);
        this.o = oglVar;
        ahqrVar.h(ogkVar);
        aheyVar.e(oglVar);
        aypn n = gpeVar.d.n();
        final ogm ogmVar = new ogm(this);
        this.q = n.Y(new ayrs() { // from class: ogi
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ogm ogmVar2 = ogm.this;
                ogmVar2.a.h(((Integer) obj).intValue());
            }
        }, nua.q);
    }

    public static aqts b(WatchNextResponseModel watchNextResponseModel, String str) {
        aubs aubsVar = watchNextResponseModel.g;
        aone createBuilder = aqts.b.createBuilder();
        createBuilder.copyOnWrite();
        aqts aqtsVar = (aqts) createBuilder.instance;
        aqtsVar.d = 1;
        aqtsVar.e = str;
        aong aongVar = (aong) asuh.b.createBuilder();
        aone createBuilder2 = awau.a.createBuilder();
        createBuilder2.copyOnWrite();
        awau awauVar = (awau) createBuilder2.instance;
        awauVar.b |= 1;
        awauVar.c = 3L;
        aongVar.copyOnWrite();
        asuh asuhVar = (asuh) aongVar.instance;
        awau awauVar2 = (awau) createBuilder2.build();
        awauVar2.getClass();
        asuhVar.e = awauVar2;
        asuhVar.c |= 2;
        aomf aomfVar = aubsVar.t;
        aongVar.copyOnWrite();
        asuh asuhVar2 = (asuh) aongVar.instance;
        aomfVar.getClass();
        asuhVar2.c |= 1;
        asuhVar2.d = aomfVar;
        asuh asuhVar3 = (asuh) aongVar.build();
        createBuilder.copyOnWrite();
        aqts aqtsVar2 = (aqts) createBuilder.instance;
        asuhVar3.getClass();
        aqtsVar2.x = asuhVar3;
        aqtsVar2.c |= 2097152;
        createBuilder.copyOnWrite();
        aqts aqtsVar3 = (aqts) createBuilder.instance;
        aqtsVar3.c |= 1048576;
        aqtsVar3.w = 111059;
        createBuilder.copyOnWrite();
        aqts aqtsVar4 = (aqts) createBuilder.instance;
        aqtsVar4.k = 1;
        aqtsVar4.c |= 1024;
        aone createBuilder3 = aqtp.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqtp aqtpVar = (aqtp) createBuilder3.instance;
        aqtpVar.c = 1;
        aqtpVar.b |= 1;
        createBuilder.copyOnWrite();
        aqts aqtsVar5 = (aqts) createBuilder.instance;
        aqtp aqtpVar2 = (aqtp) createBuilder3.build();
        aqtpVar2.getClass();
        aqtsVar5.i = aqtpVar2;
        aqtsVar5.c |= 64;
        createBuilder.copyOnWrite();
        aqts aqtsVar6 = (aqts) createBuilder.instance;
        aqtsVar6.c |= 131072;
        aqtsVar6.t = true;
        aone createBuilder4 = aqtr.a.createBuilder();
        aubs aubsVar2 = aubs.a;
        createBuilder4.copyOnWrite();
        aqtr aqtrVar = (aqtr) createBuilder4.instance;
        aubsVar2.getClass();
        aqtrVar.c = aubsVar2;
        aqtrVar.b = 50631000;
        createBuilder.copyOnWrite();
        aqts aqtsVar7 = (aqts) createBuilder.instance;
        aqtr aqtrVar2 = (aqtr) createBuilder4.build();
        aqtrVar2.getClass();
        aqtsVar7.f = aqtrVar2;
        aqtsVar7.c |= 8;
        aone createBuilder5 = aqtq.a.createBuilder();
        aone createBuilder6 = auov.a.createBuilder();
        aone createBuilder7 = auoy.a.createBuilder();
        aubs aubsVar3 = aubs.a;
        createBuilder7.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder7.instance;
        aubsVar3.getClass();
        auoyVar.aO = aubsVar3;
        auoyVar.d |= 8388608;
        createBuilder6.aN(createBuilder7);
        createBuilder5.copyOnWrite();
        aqtq aqtqVar = (aqtq) createBuilder5.instance;
        auov auovVar = (auov) createBuilder6.build();
        auovVar.getClass();
        aqtqVar.c = auovVar;
        aqtqVar.b = 49399797;
        createBuilder.copyOnWrite();
        aqts aqtsVar8 = (aqts) createBuilder.instance;
        aqtq aqtqVar2 = (aqtq) createBuilder5.build();
        aqtqVar2.getClass();
        aqtsVar8.g = aqtqVar2;
        aqtsVar8.c |= 16;
        return (aqts) createBuilder.build();
    }

    private final ntj k() {
        nqg b = this.e.b(this.b);
        if (b != null && (b.b() instanceof ntj)) {
            return (ntj) b.b();
        }
        return null;
    }

    private final void l(String str, String str2) {
        if (TextUtils.equals(this.u, str)) {
            if (TextUtils.equals(this.v, str2) || str2 == null) {
                return;
            }
            ogw ogwVar = this.r;
            if (ogwVar != null) {
                ogwVar.i = (Integer) ogwVar.e.get(str2);
                ogwVar.c();
                ogwVar.d();
                ogwVar.b();
                m(k());
            }
            nto ntoVar = this.s;
            if (ntoVar != null && ntoVar.m && !amkq.b(ntoVar.p, str2)) {
                ntoVar.m(str2);
                Integer num = (Integer) ntoVar.f.get(str2);
                if (num != null && num.intValue() >= 0 && num.intValue() < ntoVar.d.size()) {
                    Object obj = ntoVar.d.get(num.intValue());
                    if ((obj instanceof mwf) || (obj instanceof mkj)) {
                        ntoVar.l(num.intValue(), true);
                    }
                }
            }
        } else {
            c();
            this.f = null;
        }
        this.u = str;
        this.v = str2;
    }

    private final void m(ntj ntjVar) {
        ogw ogwVar;
        if (ntjVar == null || (ogwVar = this.r) == null) {
            return;
        }
        ntjVar.o(ogwVar.f.getText());
    }

    @Override // defpackage.ohb
    public final void d() {
        Object obj = this.q;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.q = null;
        }
        ogw ogwVar = this.r;
        if (ogwVar != null) {
            ogwVar.b.i(ogwVar.d);
        }
        this.m.o(this.n);
        ahey aheyVar = this.y;
        aheyVar.a.remove(this.o);
    }

    @Override // defpackage.ohb
    public final void e(WatchNextResponseModel watchNextResponseModel) {
        aubs aubsVar;
        String str;
        if (TextUtils.isEmpty(watchNextResponseModel.b) || (str = this.v) == null || str.length() <= 0 || this.v.equals(watchNextResponseModel.b)) {
            this.f = watchNextResponseModel;
            if (this.u == null) {
                String str2 = null;
                if (watchNextResponseModel != null && (aubsVar = watchNextResponseModel.g) != null) {
                    str2 = aubsVar.k;
                }
                this.u = str2;
            }
            i();
        }
    }

    public final void f(ahqo ahqoVar, Runnable runnable) {
        Runnable runnable2;
        this.x = ahqoVar;
        this.g = runnable;
        if (!ahqoVar.a(ahqo.LOGGED_ATTACH_WATCH_NEXT) || (runnable2 = this.g) == null) {
            return;
        }
        runnable2.run();
        this.g = null;
    }

    public final void g() {
        ntj k;
        CharSequence charSequence;
        Spanned spanned;
        arfs arfsVar;
        if (this.s == null) {
            this.s = (nto) this.i.get();
        }
        WatchNextResponseModel watchNextResponseModel = this.f;
        if (watchNextResponseModel != null) {
            nto ntoVar = this.s;
            aubs aubsVar = watchNextResponseModel.g;
            if (aubsVar != null) {
                ntoVar.h.c(aubsVar);
            }
        }
        WatchNextResponseModel watchNextResponseModel2 = this.f;
        if (watchNextResponseModel2 == null || (k = k()) == null) {
            return;
        }
        aubs aubsVar2 = watchNextResponseModel2.g;
        apkc apkcVar = null;
        if (aubsVar2 == null) {
            k.k(null);
            k.j(null);
            k.o(null);
            k.n(null);
            k.q(null);
        } else {
            int i = aubsVar2.c;
            if ((i & 2) != 0) {
                aqyg aqygVar = aubsVar2.h;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                charSequence = ajcq.b(aqygVar);
            } else {
                charSequence = (i & 1) != 0 ? aubsVar2.g : null;
            }
            k.k(charSequence);
            if ((aubsVar2.c & 2048) != 0) {
                aqyg aqygVar2 = aubsVar2.q;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                spanned = ajcq.b(aqygVar2);
            } else {
                spanned = null;
            }
            k.j(spanned);
            if ((aubsVar2.d & 1) != 0) {
                arfsVar = aubsVar2.B;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
            } else {
                arfsVar = null;
            }
            k.n(arfsVar);
            Iterator it = aubsVar2.x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                apjt apjtVar = (apjt) it.next();
                if ((apjtVar.b & 256) != 0) {
                    apkcVar = apjtVar.e;
                    if (apkcVar == null) {
                        apkcVar = apkc.a;
                    }
                }
            }
            k.q(apkcVar);
        }
        m(k);
        WatchNextResponseModel watchNextResponseModel3 = this.f;
        if (watchNextResponseModel3 != null) {
            if (this.t == null) {
                this.t = (ofm) this.j.get();
            }
            this.t.a(watchNextResponseModel3.g, watchNextResponseModel3.h);
        }
    }

    public final void h(int i) {
        int i2;
        this.w = i;
        ntj k = k();
        if (k == null) {
            return;
        }
        int i3 = R.attr.ytTextAppearanceDisplay1;
        if (i == 1) {
            i = 1;
            i2 = R.attr.ytTextAppearanceDisplay1;
        } else {
            i2 = R.attr.ytTextAppearanceTitle2;
        }
        int i4 = R.dimen.yt_text_style_display1_line_height;
        int i5 = i == 1 ? R.dimen.yt_text_style_display1_line_height : R.dimen.playlist_ep_title_line_height;
        int i6 = i == 1 ? 0 : R.dimen.playlist_ep_title_text_size;
        k.e = i2;
        k.c = i6;
        k.d = i5;
        k.s();
        if (i != 1) {
            i3 = R.attr.ytTextAppearanceTitle2;
        }
        if (i != 1) {
            i4 = R.dimen.yt_text_style_title2_line_height;
        }
        k.p(i3, i4);
        k.r(i == 1 ? R.attr.ytTextAppearanceBody2a : R.attr.ytTextAppearanceBody1a, i == 1 ? R.dimen.yt_text_style_body2a_line_height : R.dimen.yt_text_style_body1a_line_height);
    }

    public final void i() {
        aubs aubsVar;
        WatchNextResponseModel watchNextResponseModel;
        WatchNextResponseModel watchNextResponseModel2 = this.f;
        if (watchNextResponseModel2 == null || (aubsVar = watchNextResponseModel2.g) == null || adtt.a(aubsVar.k) || !this.y.g()) {
            c();
            return;
        }
        if (this.r == null) {
            this.l.setOnClickListener(new View.OnClickListener() { // from class: ogh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ogn ognVar = ogn.this;
                    ognVar.c.I(3, new acqx(acsb.c(105291)), null);
                    if (ognVar.e.w(ognVar.b)) {
                        aahd aahdVar = ognVar.a;
                        String str = ognVar.b;
                        aone createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                        createBuilder.copyOnWrite();
                        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = str;
                        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.build();
                        aong aongVar = (aong) apxf.a.createBuilder();
                        aongVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                        aonk aonkVar = atmb.b;
                        aone createBuilder2 = atmc.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        atmc atmcVar = (atmc) createBuilder2.instance;
                        atmcVar.b |= 2;
                        atmcVar.d = 105291;
                        aongVar.e(aonkVar, (atmc) createBuilder2.build());
                        aahdVar.a((apxf) aongVar.build());
                    }
                }
            });
            ogx ogxVar = this.h;
            oip oipVar = this.k;
            View view = this.l;
            PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = (PlaybackLoopShuffleMonitor) ogxVar.a.get();
            playbackLoopShuffleMonitor.getClass();
            akbv akbvVar = (akbv) ogxVar.b.get();
            akbvVar.getClass();
            gni gniVar = (gni) ogxVar.c.get();
            gniVar.getClass();
            acra acraVar = (acra) ogxVar.d.get();
            acraVar.getClass();
            this.r = new ogw(playbackLoopShuffleMonitor, akbvVar, gniVar, acraVar, oipVar, view);
        }
        ogw ogwVar = this.r;
        if (ogwVar != null && (watchNextResponseModel = this.f) != null) {
            ogwVar.a(watchNextResponseModel.g);
            this.k.h(16);
            this.c.n(new acqx(acsb.c(105291)));
        }
        if (!this.e.w(this.b)) {
            WatchNextResponseModel watchNextResponseModel3 = this.f;
            if (watchNextResponseModel3 != null) {
                this.e.p(b(watchNextResponseModel3, this.b));
                ntj k = k();
                if (k != null) {
                    if (this.t == null) {
                        this.t = (ofm) this.j.get();
                    }
                    k.a = this.t.i;
                    if (k.b) {
                        k.b = false;
                        nqr nqrVar = k.f;
                        if (nqrVar != null) {
                            nqrVar.a(false);
                        }
                    }
                    h(this.w);
                }
            }
            g();
            return;
        }
        f(this.x, new Runnable() { // from class: ogj
            @Override // java.lang.Runnable
            public final void run() {
                ogn ognVar = ogn.this;
                WatchNextResponseModel watchNextResponseModel4 = ognVar.f;
                if (watchNextResponseModel4 != null) {
                    nqp nqpVar = ognVar.e;
                    aqts b = ogn.b(watchNextResponseModel4, ognVar.b);
                    acrt acrtVar = ognVar.d;
                    String str = ognVar.b;
                    aomf aomfVar = ognVar.f.a.t;
                    aone createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = str;
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.build();
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                    aongVar.copyOnWrite();
                    apxf apxfVar = (apxf) aongVar.instance;
                    aomfVar.getClass();
                    apxfVar.b |= 1;
                    apxfVar.c = aomfVar;
                    nqpVar.r(b, null, true, acrtVar.h((apxf) aongVar.build()), false);
                }
                ognVar.g();
            }
        });
    }

    @Override // defpackage.ohb
    public final void j(fnt fntVar) {
        if (fntVar == null) {
            if (this.p.g() == fhg.NONE) {
                l(null, null);
            }
        } else {
            PlaybackStartDescriptor a = fntVar.a();
            l(a.k(), a.l());
        }
    }

    @Override // defpackage.ohi
    public final void pg(boolean z) {
        i();
    }

    @Override // defpackage.ohb
    public final void c() {
        nto ntoVar = this.s;
        if (ntoVar != null && ntoVar.m) {
            ntoVar.l.c();
            ntoVar.d.clear();
            ntoVar.c.d(null);
            oiz oizVar = ntoVar.j;
            if (oizVar != null) {
                oizVar.B();
            }
            ntoVar.f.clear();
            ntoVar.o = true;
        }
        ogw ogwVar = this.r;
        if (ogwVar != null) {
            ogwVar.a(null);
        }
        ofm ofmVar = this.t;
        if (ofmVar != null) {
            ofmVar.a(null, null);
            ofmVar.c.m(ofmVar);
        }
        if (this.e.w(this.b)) {
            aahd aahdVar = this.a;
            String str = this.b;
            aong aongVar = (aong) apxf.a.createBuilder();
            aonk aonkVar = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
            aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            createBuilder.copyOnWrite();
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
            aongVar.e(aonkVar, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build());
            aahdVar.a((apxf) aongVar.build());
        }
        this.g = null;
        this.k.e(16);
    }
}
