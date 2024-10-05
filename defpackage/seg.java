package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class seg implements sep {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/web/WebViewWebInterface");
    public WebView b;
    public seo c;

    public seg(Context context) {
        see seeVar = new see(context);
        this.b = seeVar;
        seeVar.getSettings().setJavaScriptEnabled(true);
        this.b.setWebViewClient(new sef());
        this.b.setBackgroundColor(0);
        this.b.addJavascriptInterface(this, "ytArAdsAndroidBridge");
    }

    @JavascriptInterface
    public void postMessage(String str) {
        awer awerVar;
        awep awepVar;
        seo seoVar = this.c;
        if (seoVar == null) {
            ((amxh) ((amxh) a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebViewWebInterface", "postMessage", 37, "WebViewWebInterface.java")).q("Received message before handler is initialized.");
            return;
        }
        if (str == null) {
            return;
        }
        int i = 2;
        try {
            awek awekVar = (awek) aonm.parseFrom(awek.a, Base64.decode(str, 2), aomw.b());
            sev sevVar = ((sea) seoVar).d;
            if (sevVar == null) {
                ((amxh) ((amxh) sea.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 97, "WebBridge.java")).q("handleMessageFromWeb before context initialized.");
                return;
            }
            int i2 = awekVar.b;
            if (i2 == 0) {
                i = 8;
            } else if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = i2 != 3 ? i2 != 7 ? i2 != 8 ? i2 != 14 ? i2 != 18 ? 0 : 7 : 6 : 5 : 4 : 3;
            }
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                    sbv sbvVar = sevVar.e;
                    sbvVar.a.a(sbvVar.b.a());
                    ((sea) seoVar).d.e.a.f(sex.ASSET_SWITCH);
                    if (awekVar.b == 1) {
                        awerVar = (awer) awekVar.c;
                    } else {
                        awerVar = awer.a;
                    }
                    String str2 = awerVar.b;
                    sev sevVar2 = ((sea) seoVar).d;
                    if (sevVar2 != null) {
                        sfb c = sevVar2.e.c();
                        final List singletonList = Collections.singletonList(str2);
                        sev sevVar3 = ((sdy) c).k;
                        if (sevVar3 != null) {
                            final SettableFuture settableFuture = ((scb) sevVar3.e.a()).d;
                            ((sdy) c).k.e.a.f(sex.RENDER_INIT);
                            final sdy sdyVar = (sdy) c;
                            anaf.Y(((sdy) c).j.b(new sfg() { // from class: sdr
                                @Override // defpackage.sfg
                                public final anhy a() {
                                    final sdy sdyVar2 = sdy.this;
                                    final anhy anhyVar = settableFuture;
                                    final List list = singletonList;
                                    return anaf.K(sdyVar2.c, sdyVar2.d, anhyVar).b(new anfy() { // from class: sdt
                                        @Override // defpackage.anfy
                                        public final anhy a() {
                                            sdy sdyVar3 = sdy.this;
                                            anhy anhyVar2 = anhyVar;
                                            final List list2 = list;
                                            if (((Boolean) anaf.W(anhyVar2)).booleanValue()) {
                                                final sde sdeVar = (sde) anaf.W(sdyVar3.c);
                                                final awys awysVar = (awys) anaf.W(sdyVar3.d);
                                                return aci.c(new aeu() { // from class: sdd
                                                    @Override // defpackage.aeu
                                                    public final Object a(aes aesVar) {
                                                        sde sdeVar2 = sde.this;
                                                        List list3 = list2;
                                                        awys awysVar2 = awysVar;
                                                        ExperienceJni experienceJni = sdeVar2.a;
                                                        experienceJni.nativeActivateItems(experienceJni.b, list3, awysVar2.e.get() ? awysVar2.d : 0L, NativeCallback.a(scy.a(aesVar)));
                                                        return "Experience.activateItems";
                                                    }
                                                });
                                            }
                                            return anaf.N(new RuntimeException("GPU not supported."));
                                        }
                                    }, sdyVar2.i);
                                }
                            }), new sdx((sdy) c, singletonList), ((sdy) c).k.c);
                            return;
                        }
                        return;
                    }
                    ((amxh) ((amxh) sea.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "setEffect", 133, "WebBridge.java")).q("Cannot set effect when faceViewerContext is null.");
                    return;
                case 1:
                    ((amxh) ((amxh) sea.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 108, "WebBridge.java")).q("handle log");
                    return;
                case 2:
                    sew a2 = sevVar.e.a();
                    ((scb) a2).f = true;
                    ((scb) a2).f();
                    return;
                case 3:
                    ((amxh) ((amxh) sea.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 111, "WebBridge.java")).q("handle open link");
                    sew a3 = ((sea) seoVar).d.e.a();
                    if (awekVar.b == 7) {
                        awepVar = (awep) awekVar.c;
                    } else {
                        awepVar = awep.a;
                    }
                    String str3 = awepVar.b;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str3));
                    ((scb) a3).b.startActivity(intent);
                    return;
                case 4:
                    ((sea) seoVar).c.o(true);
                    return;
                case 5:
                    sew a4 = sevVar.e.a();
                    ((scb) a4).f = false;
                    if (((scb) a4).e.a.a()) {
                        sea seaVar = ((sec) ((scb) a4).e.e.d()).b;
                        aone createBuilder = awel.a.createBuilder();
                        awem awemVar = awem.a;
                        createBuilder.copyOnWrite();
                        awel awelVar = (awel) createBuilder.instance;
                        awemVar.getClass();
                        awelVar.c = awemVar;
                        awelVar.b = 13;
                        seaVar.a((awel) createBuilder.build());
                    }
                    ((scb) a4).e.e.c().e();
                    return;
                case 6:
                    sew a5 = sevVar.e.a();
                    ((scb) a5).f = true;
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", ((scb) a5).b.getPackageName(), null));
                    ((scb) a5).b.startActivity(intent2);
                    return;
                default:
                    return;
            }
        } catch (aoob e) {
            ((amxh) ((amxh) ((amxh) sea.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessage", '9', "WebBridge.java")).q("Unable to parse protocol buffer from Web Message");
        }
    }
}
