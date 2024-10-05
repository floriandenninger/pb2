package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.webview.AdsInlineWebsite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhp implements ajom, xmp {
    public final Context a;
    public final aahd b;
    public final View c;
    public final AdsInlineWebsite d;
    public ajok e;
    public apbt f;
    public acqx g;
    public acqx h;
    public acqx i;
    public acqx j;

    public nhp(Context context, aahd aahdVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aahdVar;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ads_inline_website_view, viewGroup, false);
        this.c = inflate;
        AdsInlineWebsite adsInlineWebsite = (AdsInlineWebsite) inflate.findViewById(R.id.webview);
        this.d = adsInlineWebsite;
        adsInlineWebsite.a = this;
        final int i2 = 1;
        inflate.findViewById(R.id.back).setOnClickListener(new View.OnClickListener(this) { // from class: nho
            public final /* synthetic */ nhp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                if (i3 == 0) {
                    nhp nhpVar = this.a;
                    apbt apbtVar = nhpVar.f;
                    if ((apbtVar.b & 16) != 0) {
                        aahd aahdVar2 = nhpVar.b;
                        apxf apxfVar = apbtVar.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar2.a(apxfVar);
                        nhpVar.e.a.I(3, nhpVar.j, null);
                        return;
                    }
                    return;
                }
                if (i3 == 1) {
                    nhp nhpVar2 = this.a;
                    nhpVar2.d.goBack();
                    nhpVar2.e.a.I(3, nhpVar2.i, null);
                    return;
                }
                nhp nhpVar3 = this.a;
                aone createBuilder = avuo.a.createBuilder();
                String url = nhpVar3.d.getUrl();
                createBuilder.copyOnWrite();
                avuo avuoVar = (avuo) createBuilder.instance;
                url.getClass();
                avuoVar.b = 1 | avuoVar.b;
                avuoVar.c = url;
                avuo avuoVar2 = (avuo) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(UrlEndpointOuterClass.urlEndpoint, avuoVar2);
                nhpVar3.b.a((apxf) aongVar.build());
                nhpVar3.e.a.I(3, nhpVar3.h, null);
            }
        });
        final int i3 = 2;
        inflate.findViewById(R.id.open_in_new).setOnClickListener(new View.OnClickListener(this) { // from class: nho
            public final /* synthetic */ nhp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                if (i32 == 0) {
                    nhp nhpVar = this.a;
                    apbt apbtVar = nhpVar.f;
                    if ((apbtVar.b & 16) != 0) {
                        aahd aahdVar2 = nhpVar.b;
                        apxf apxfVar = apbtVar.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar2.a(apxfVar);
                        nhpVar.e.a.I(3, nhpVar.j, null);
                        return;
                    }
                    return;
                }
                if (i32 == 1) {
                    nhp nhpVar2 = this.a;
                    nhpVar2.d.goBack();
                    nhpVar2.e.a.I(3, nhpVar2.i, null);
                    return;
                }
                nhp nhpVar3 = this.a;
                aone createBuilder = avuo.a.createBuilder();
                String url = nhpVar3.d.getUrl();
                createBuilder.copyOnWrite();
                avuo avuoVar = (avuo) createBuilder.instance;
                url.getClass();
                avuoVar.b = 1 | avuoVar.b;
                avuoVar.c = url;
                avuo avuoVar2 = (avuo) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(UrlEndpointOuterClass.urlEndpoint, avuoVar2);
                nhpVar3.b.a((apxf) aongVar.build());
                nhpVar3.e.a.I(3, nhpVar3.h, null);
            }
        });
        inflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener(this) { // from class: nho
            public final /* synthetic */ nhp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i;
                if (i32 == 0) {
                    nhp nhpVar = this.a;
                    apbt apbtVar = nhpVar.f;
                    if ((apbtVar.b & 16) != 0) {
                        aahd aahdVar2 = nhpVar.b;
                        apxf apxfVar = apbtVar.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar2.a(apxfVar);
                        nhpVar.e.a.I(3, nhpVar.j, null);
                        return;
                    }
                    return;
                }
                if (i32 == 1) {
                    nhp nhpVar2 = this.a;
                    nhpVar2.d.goBack();
                    nhpVar2.e.a.I(3, nhpVar2.i, null);
                    return;
                }
                nhp nhpVar3 = this.a;
                aone createBuilder = avuo.a.createBuilder();
                String url = nhpVar3.d.getUrl();
                createBuilder.copyOnWrite();
                avuo avuoVar = (avuo) createBuilder.instance;
                url.getClass();
                avuoVar.b = 1 | avuoVar.b;
                avuoVar.c = url;
                avuo avuoVar2 = (avuo) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(UrlEndpointOuterClass.urlEndpoint, avuoVar2);
                nhpVar3.b.a((apxf) aongVar.build());
                nhpVar3.e.a.I(3, nhpVar3.h, null);
            }
        });
    }

    public static String d(String str) {
        try {
            URL url = new URL(str);
            String valueOf = String.valueOf(url.getHost());
            String valueOf2 = String.valueOf(url.getFile());
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } catch (MalformedURLException unused) {
        }
        return str;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.loadUrl("about:blank");
        this.d.clearHistory();
        this.e.a.q(this.g, null);
        this.e.a.q(this.i, null);
        this.e.a.q(this.h, null);
        this.e.a.q(this.j, null);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apbt apbtVar = (apbt) obj;
        this.f = apbtVar;
        this.e = ajokVar;
        this.d.loadUrl(apbtVar.d);
        ((TextView) this.c.findViewById(R.id.headline)).setText(this.f.e);
        this.g = new acqx(this.f.c);
        this.h = new acqx(acsb.a(119780));
        this.i = new acqx(acsb.a(119782));
        this.j = new acqx(acsb.a(119781));
        this.e.a.D(this.h);
        this.e.a.D(this.i);
        this.e.a.D(this.j);
        this.e.a.u(this.g, null);
        this.e.a.u(this.h, null);
        this.e.a.u(this.i, null);
        this.e.a.u(this.j, null);
    }
}
