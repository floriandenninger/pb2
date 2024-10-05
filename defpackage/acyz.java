package defpackage;

import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyz implements aczh {
    public static final String a;
    private static final amru c = amru.A(0, 1000, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 2000, 5000, 10000, 15000, 20000);
    final acyw b;
    private final yrw d;
    private final azrw e;
    private final adrp f;
    private final anhy g;
    private final int h;
    private final String i;
    private final String j;
    private final String k;
    private final amru l;

    static {
        String valueOf = String.valueOf(acyz.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public acyz(adht adhtVar, yrw yrwVar, azrw azrwVar, int i, adrp adrpVar, anhy anhyVar, String str, String str2, acun acunVar) {
        this.d = yrwVar;
        this.e = azrwVar;
        this.f = adrpVar;
        this.g = anhyVar;
        this.h = i;
        this.i = str;
        this.j = str2;
        if (TextUtils.isEmpty("")) {
            this.k = "package:com.google.android.youtube";
        } else {
            this.k = "";
        }
        if (acunVar.W.isEmpty()) {
            this.l = c;
        } else {
            this.l = acunVar.W;
        }
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        handlerThread.start();
        this.b = new acyw(handlerThread.getLooper(), adhtVar, this.l);
    }

    @Override // defpackage.aczh
    public final void a() {
        this.b.removeMessages(1);
    }

    @Override // defpackage.aczh
    public final void b(Uri uri) {
        String uri2 = uri.toString();
        ysj a2 = ysk.a();
        a2.c = 4;
        a2.a = uri2;
        a2.c("Origin", "package:com.google.android.youtube");
        adyu.w(this.d, a2.a(), new acyv(0));
    }

    @Override // defpackage.aczh
    public final void c(Uri uri, adle adleVar, String str, String str2, adny adnyVar) {
        adgn adgnVar = new adgn(UUID.randomUUID().toString());
        ysj c2 = ysk.c(uri.toString());
        c2.c("Content-Type", "text/plain; charset=\"utf-8\"");
        c2.c("Origin", this.k);
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("pairingCode", adgnVar.c);
        builder.appendQueryParameter("theme", str);
        if (this.h == 1) {
            builder.appendQueryParameter("rUrl", this.f.g());
            builder.appendQueryParameter("rId", (String) ynm.g(this.g, 1L, TimeUnit.SECONDS, ""));
            this.f.d(new acyy(adnyVar, this.b, str2));
        }
        if (adleVar.g()) {
            builder.appendQueryParameter("dialLaunch", "watch");
        } else {
            builder.appendQueryParameter("dialLaunch", "browse");
        }
        StringBuilder sb = new StringBuilder(builder.build().toString().replaceFirst("\\?", ""));
        sb.append(((adts) this.e.get()).i);
        if (!TextUtils.isEmpty(this.i)) {
            String str3 = this.i;
            if (str3.length() != 0) {
                "Using receiverLoader: ".concat(str3);
            }
            sb.append(this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            String str4 = this.j;
            if (str4.length() != 0) {
                "Using additionalParams: ".concat(str4);
            }
            sb.append("&");
            sb.append(this.j);
        }
        try {
            String sb2 = sb.toString();
            String str5 = true == TextUtils.isEmpty("UTF-8") ? "ISO-8859-1" : "UTF-8";
            c2.b = ysi.e(sb2.getBytes(str5), str5.length() != 0 ? "text/plain; charset=".concat(str5) : new String("text/plain; charset="));
            adyu.w(this.d, c2.a(), new acyu(this, adgnVar, adnyVar));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error setting body for request", e);
        }
    }
}
