package defpackage;

import android.net.Uri;
import android.util.Xml;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.io.InputStream;
import org.xml.sax.ContentHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyg {
    public static final String a = zga.a("MDX.discovery");
    public final ysl b;
    public final String c;
    private final yrw d;

    public acyg(yrw yrwVar, ysl yslVar, String str) {
        this.d = yrwVar;
        this.b = yslVar;
        this.c = str;
    }

    public static final void b(InputStream inputStream, ContentHandler contentHandler) {
        Xml.parse(inputStream, Xml.Encoding.UTF_8, contentHandler);
    }

    public final AppStatus a(Uri uri, boolean z) {
        if (uri == null) {
            zga.c(a, "URI to request App Status from is null.");
            return AppStatus.d(-2);
        }
        ysj b = ysk.b(uri.toString());
        b.c("Origin", "package:com.google.android.youtube");
        ysk a2 = b.a();
        acyf acyfVar = new acyf(this, a2.a, z);
        adyu.w(this.d, a2, acyfVar);
        return acyfVar.a;
    }
}
