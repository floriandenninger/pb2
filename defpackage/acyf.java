package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.io.IOException;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyf implements adtu, afri {
    public AppStatus a = AppStatus.d(-2);
    final /* synthetic */ acyg b;
    private final String c;
    private final boolean d;

    public acyf(acyg acygVar, String str, boolean z) {
        this.b = acygVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        String str = acyg.a;
        String str2 = this.c;
        zga.f(str, str2.length() != 0 ? "Failed getting app status from ".concat(str2) : new String("Failed getting app status from "), iOException);
    }

    @Override // defpackage.afri
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AppStatus b(cnh cnhVar) {
        int i = cnhVar.a;
        if (i == 404) {
            AppStatus d = AppStatus.d(-1);
            this.a = d;
            return d;
        }
        if (i != 200) {
            String str = acyg.a;
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(str2.length() + 61);
            sb.append("Request for TV app status from ");
            sb.append(str2);
            sb.append(" got response code ");
            sb.append(i);
            zga.c(str, sb.toString());
            AppStatus d2 = AppStatus.d(-2);
            this.a = d2;
            return d2;
        }
        byte[] bArr = cnhVar.b;
        if (bArr.length == 0) {
            String str3 = acyg.a;
            this.c.length();
            return this.a;
        }
        acyd acydVar = new acyd();
        try {
            acyg.b(aomf.x(bArr).m(), acydVar);
            int i2 = acydVar.c;
            if (i2 < 0) {
                AppStatus d3 = AppStatus.d(-2);
                this.a = d3;
                return d3;
            }
            adfs adfsVar = null;
            ScreenId screenId = (acydVar.c() == null || !acydVar.d().equals(this.b.c)) ? null : new ScreenId(acydVar.c());
            if (acydVar.a() != null && acydVar.d().equals(this.b.c)) {
                adfsVar = acydVar.a();
            }
            adfq c = AppStatus.c();
            c.e(i2);
            c.a = acydVar.a;
            c.d = acydVar.b;
            c.b = screenId;
            c.c = adfsVar;
            c.f(acydVar.d);
            c.d(acydVar.e());
            c.c(acydVar.e);
            c.b(acydVar.f);
            c.e = acydVar.b();
            AppStatus a = c.a();
            this.a = a;
            return a;
        } catch (IOException | SAXException e) {
            String str4 = acyg.a;
            String str5 = this.c;
            zga.f(str4, str5.length() != 0 ? "Failed getting app status from ".concat(str5) : new String("Failed getting app status from "), e);
            return this.a;
        }
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        int i = ysqVar.a;
        if (i == 404) {
            this.a = AppStatus.d(-1);
            return;
        }
        if (i != 200 && (!this.d || i != 0)) {
            String str = acyg.a;
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(str2.length() + 61);
            sb.append("Request for TV app status from ");
            sb.append(str2);
            sb.append(" got response code ");
            sb.append(i);
            zga.c(str, sb.toString());
            this.a = AppStatus.d(-2);
            return;
        }
        yso ysoVar = ysqVar.d;
        if (ysoVar == null) {
            String str3 = acyg.a;
            this.c.length();
            return;
        }
        acyd acydVar = new acyd();
        try {
            acyg.b(ysoVar.b(), acydVar);
            int i2 = acydVar.c;
            if (i2 < 0) {
                this.a = AppStatus.d(-2);
                return;
            }
            adfs adfsVar = null;
            ScreenId screenId = (acydVar.c() == null || !acydVar.d().equals(this.b.c)) ? null : new ScreenId(acydVar.c());
            if (acydVar.a() != null && acydVar.d().equals(this.b.c)) {
                adfsVar = acydVar.a();
            }
            adfq c = AppStatus.c();
            c.e(i2);
            c.a = acydVar.a;
            c.d = acydVar.b;
            c.b = screenId;
            c.c = adfsVar;
            c.f(acydVar.d);
            c.d(acydVar.e());
            c.c(acydVar.e);
            c.b(acydVar.f);
            c.e = acydVar.b();
            this.a = c.a();
        } catch (IOException | SAXException e) {
            String str4 = acyg.a;
            String str5 = this.c;
            zga.f(str4, str5.length() != 0 ? "Failed getting app status from ".concat(str5) : new String("Failed getting app status from "), e);
        }
    }
}
