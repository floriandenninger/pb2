package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfv {
    public adft a;
    public String b;
    public adgg c;
    public adgn d;
    public adgn e;
    private Optional f;
    private String g;
    private ScreenId h;
    private adfs i;

    public adfv(adfw adfwVar) {
        this();
        this.c = adfwVar.d;
        this.d = adfwVar.h;
        this.g = adfwVar.e;
        this.h = adfwVar.f;
        this.i = adfwVar.g;
        this.e = adfwVar.i;
    }

    public final adfw a() {
        String str;
        ScreenId screenId;
        adfs adfsVar;
        adgg adggVar = this.c;
        if (adggVar == null || (str = this.g) == null || (screenId = this.h) == null || (adfsVar = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" pairingInfo");
            }
            if (this.g == null) {
                sb.append(" name");
            }
            if (this.h == null) {
                sb.append(" screenId");
            }
            if (this.i == null) {
                sb.append(" loungeDeviceId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        adfw adfwVar = new adfw(adggVar, this.d, str, screenId, adfsVar, this.e);
        adfwVar.a = this.a;
        adfwVar.b = this.f;
        adfwVar.c = this.b;
        return adfwVar;
    }

    public final void b(adfs adfsVar) {
        if (adfsVar == null) {
            throw new NullPointerException("Null loungeDeviceId");
        }
        this.i = adfsVar;
    }

    public final void c(ScreenId screenId) {
        if (screenId == null) {
            throw new NullPointerException("Null screenId");
        }
        this.h = screenId;
    }

    public final void d(adgm adgmVar) {
        this.f = Optional.of(adgmVar);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.g = str;
    }

    public adfv() {
        this.f = Optional.empty();
    }
}
