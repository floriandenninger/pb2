package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnv implements Runnable {
    public final /* synthetic */ adob a;
    private final /* synthetic */ int b;

    public /* synthetic */ adnv(adob adobVar, int i) {
        this.b = i;
        this.a = adobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppStatus a;
        String str;
        int i = this.b;
        if (i == 0) {
            adob adobVar = this.a;
            adobVar.g.f();
            adobVar.aE();
            return;
        }
        if (i == 1) {
            adob adobVar2 = this.a;
            try {
                adobVar2.g.e(adobVar2.o);
                return;
            } catch (IOException e) {
                zga.f(adob.a, "Failed to start Web Socket Server", e);
                return;
            }
        }
        if (i == 2) {
            this.a.az();
            return;
        }
        if (i != 3) {
            adob adobVar3 = this.a;
            Uri uri = adobVar3.m.b;
            if (uri == null) {
                String str2 = adob.a;
                String valueOf = String.valueOf(adobVar3.m);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Missing app URL to launch YouTube on DIAL device ");
                sb.append(valueOf);
                zga.c(str2, sb.toString());
                adobVar3.ao(adkw.UNKNOWN, atbi.MDX_SESSION_DISCONNECT_REASON_DIAL_MISSING_URL);
                return;
            }
            adobVar3.c.c(uri, adobVar3.aj, adobVar3.i, adobVar3.m.d, new adny(adobVar3));
            return;
        }
        adob adobVar4 = this.a;
        Uri uri2 = adobVar4.l;
        if (uri2 == null) {
            Uri uri3 = adobVar4.m.b;
            if (uri3 != null && (a = adobVar4.d.a(uri3, adobVar4.m.n())) != null) {
                AutoValue_AppStatus autoValue_AppStatus = (AutoValue_AppStatus) a;
                if (autoValue_AppStatus.a == 1 && (str = autoValue_AppStatus.c) != null) {
                    uri2 = uri3.buildUpon().appendPath(str).build();
                }
            }
            uri2 = null;
        }
        if (uri2 != null) {
            String str3 = adob.a;
            String valueOf2 = String.valueOf(uri2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Sending stop request to ");
            sb2.append(valueOf2);
            zga.h(str3, sb2.toString());
            adobVar4.c.b(uri2);
        }
        adobVar4.aD();
    }
}
