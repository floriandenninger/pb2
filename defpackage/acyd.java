package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyd extends DefaultHandler {
    public String b;
    private boolean h;
    public final Map f = new HashMap();
    private final StringBuilder g = new StringBuilder();
    public int c = -2;
    public Uri a = null;
    public boolean d = true;
    public boolean e = false;

    public final adfs a() {
        String str = (String) this.f.get("deviceId");
        if (str != null) {
            return new adfs(str);
        }
        return null;
    }

    public final Optional b() {
        String str = (String) this.f.get("loungeToken");
        String str2 = (String) this.f.get("loungeTokenRefreshIntervalMs");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Optional.empty();
        }
        return Optional.of(new adgm(str, 7, Duration.ofMillis(Long.decode(str2).longValue())));
    }

    public final String c() {
        return (String) this.f.get("screenId");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.g.append(cArr, i, i2);
    }

    public final String d() {
        String str = (String) this.f.get("theme");
        return str == null ? "cl" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return Boolean.parseBoolean((String) this.f.get("isInAppDial"));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (TextUtils.equals(str2, "state")) {
            String lowerCase = this.g.toString().toLowerCase(Locale.US);
            if (lowerCase.startsWith("installable")) {
                this.c = 0;
                this.a = Uri.parse(lowerCase.replace("installable = ", ""));
                return;
            } else if (TextUtils.equals(lowerCase, "running")) {
                this.c = 1;
                return;
            } else if (TextUtils.equals(lowerCase, "stopped")) {
                this.c = 2;
                return;
            } else {
                if (TextUtils.equals(lowerCase, "hidden")) {
                    this.c = 3;
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals(str2, "additionalData")) {
            this.h = false;
            return;
        }
        if (TextUtils.equals(str2, "discovery")) {
            if (Arrays.asList(this.g.toString().split(",")).contains("CastV2")) {
                this.e = true;
            }
        } else if (this.h) {
            this.f.put(str2, this.g.toString());
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        StringBuilder sb = this.g;
        sb.delete(0, sb.length());
        if (TextUtils.equals(str2, "link")) {
            if (TextUtils.equals(attributes.getValue("", "rel"), "run")) {
                this.b = attributes.getValue("", "href");
            }
        } else if (TextUtils.equals(str2, "options")) {
            this.d = Boolean.parseBoolean(attributes.getValue("", "allowStop"));
        } else if (TextUtils.equals(str2, "additionalData")) {
            this.h = true;
        }
    }
}
