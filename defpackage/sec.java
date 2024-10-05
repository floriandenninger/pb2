package defpackage;

import android.webkit.WebView;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sec implements seu, sfc {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/web/WebManager");
    public final sea b;
    private final sep c;
    private sev d;

    public sec(sep sepVar) {
        this.c = sepVar;
        this.b = new sea(sepVar);
    }

    @Override // defpackage.sfc
    public final void a() {
        sea seaVar = this.b;
        aone createBuilder = awel.a.createBuilder();
        aweo aweoVar = aweo.a;
        createBuilder.copyOnWrite();
        awel awelVar = (awel) createBuilder.instance;
        aweoVar.getClass();
        awelVar.c = aweoVar;
        awelVar.b = 16;
        seaVar.a((awel) createBuilder.build());
    }

    @Override // defpackage.seu
    public final void b() {
        seg segVar = (seg) this.c;
        segVar.b.destroy();
        segVar.b = null;
    }

    @Override // defpackage.seu
    public final void c(sev sevVar) {
        this.d = sevVar;
        sep sepVar = this.c;
        ansu ansuVar = sevVar.a.a;
        String str = (ansuVar.e == 5 ? (anst) ansuVar.f : anst.a).c;
        WebView webView = ((seg) sepVar).b;
        if (webView != null) {
            webView.loadUrl(str);
        }
        this.b.d = sevVar;
        String languageTag = Locale.getDefault().toLanguageTag();
        aone createBuilder = awew.a.createBuilder();
        createBuilder.copyOnWrite();
        awew awewVar = (awew) createBuilder.instance;
        languageTag.getClass();
        int i = 1;
        awewVar.b |= 1;
        awewVar.c = languageTag;
        if (this.d.a.b == 2) {
            createBuilder.copyOnWrite();
            awew awewVar2 = (awew) createBuilder.instance;
            awewVar2.b |= 2;
            awewVar2.d = "dark";
        }
        final awew awewVar3 = (awew) createBuilder.build();
        sev sevVar2 = this.d;
        anhy d = sevVar2.e.c().d();
        SettableFuture settableFuture = ((scb) sevVar2.e.a()).d;
        final anhy a2 = anaf.K(d, settableFuture).a(new alyu(d, settableFuture, i), sevVar2.c);
        anaf.K(a2, this.b.c).c(new Runnable() { // from class: seb
            @Override // java.lang.Runnable
            public final void run() {
                sec secVar = sec.this;
                awew awewVar4 = awewVar3;
                anhy anhyVar = a2;
                if (awewVar4 != null) {
                    sea seaVar = secVar.b;
                    aone createBuilder2 = awel.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    awel awelVar = (awel) createBuilder2.instance;
                    awelVar.c = awewVar4;
                    awelVar.b = 2;
                    seaVar.a((awel) createBuilder2.build());
                }
                try {
                    awev awevVar = (awev) anaf.W(anhyVar);
                    if (awevVar != null) {
                        sea seaVar2 = secVar.b;
                        aone createBuilder3 = awel.a.createBuilder();
                        createBuilder3.copyOnWrite();
                        awel awelVar2 = (awel) createBuilder3.instance;
                        awelVar2.c = awevVar;
                        awelVar2.b = 1;
                        seaVar2.a((awel) createBuilder3.build());
                        return;
                    }
                    ((amxh) ((amxh) sec.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebManager", "lambda$sendContextAndConfig$0", 69, "WebManager.java")).q("Error getting Web config. Null returned.");
                } catch (ExecutionException e) {
                    ((amxh) ((amxh) ((amxh) sec.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/web/WebManager", "lambda$sendContextAndConfig$0", 'H', "WebManager.java")).q("Exception getting Web config.");
                }
            }
        }, this.d.c);
    }
}
