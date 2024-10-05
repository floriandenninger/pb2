package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rte extends ce {
    private rtd a;
    private rsv b;
    private amru c;
    private amru d;
    private String e;

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        amru g;
        super.mR(bundle);
        al(true);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        try {
            aopf parserForType = aobn.a.getParserForType();
            amrp f = amru.f();
            byte[] byteArray = bundle2.getByteArray("android_app_flip_list");
            if (byteArray == null) {
                g = f.g();
            } else {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                while (true) {
                    Object g2 = parserForType.g(byteArrayInputStream, aomw.b());
                    if (g2 == null) {
                        break;
                    } else {
                        f.h(g2);
                    }
                }
                g = f.g();
            }
            this.c = g;
            String[] stringArray = bundle2.getStringArray("SCOPE");
            stringArray.getClass();
            this.d = amru.p(stringArray);
            String string = bundle2.getString("google_client_id");
            string.getClass();
            this.e = string;
            this.a = (rtd) eq.c(C()).a(rtd.class);
            rsv rsvVar = (rsv) eq.c(C()).a(rsv.class);
            this.b = rsvVar;
            rsvVar.g(aorv.STATE_APP_FLIP);
            Intent intent = (Intent) rui.a(qR().getPackageManager(), this.c, this.d, this.e).c();
            this.b.f(aoru.EVENT_APP_FLIP_3P_APP_SUPPORTED);
            startActivityForResult(intent, 1);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot parse List<AndroidAppFlip> from argument bundle", e);
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        rtc b;
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("AUTHORIZATION_CODE");
                    if (stringExtra == null) {
                        this.b.f(aoru.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        this.b.j(5, 6, 0, null);
                        b = rtc.b(15);
                    } else {
                        this.b.f(aoru.EVENT_APP_FLIP_FLOW_SUCCESS);
                        this.b.j(3, 0, 0, null);
                        b = rtc.a(2, stringExtra);
                    }
                    this.a.a(b);
                }
                i2 = -1;
            }
            if (i2 == 0) {
                this.b.f(aoru.EVENT_APP_FLIP_FLOW_CANCELED);
                this.b.j(4, 0, 0, null);
                b = rtc.b(14);
            } else if (i2 != -2 || intent == null) {
                this.b.f(aoru.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                this.b.j(5, 6, 0, null);
                b = rtc.b(15);
            } else {
                int intExtra = intent.getIntExtra("ERROR_TYPE", 1);
                int intExtra2 = intent.getIntExtra("ERROR_CODE", 15);
                String stringExtra2 = intent.getStringExtra("ERROR_DESCRIPTION");
                if (intExtra == 2) {
                    if (intExtra2 == 13) {
                        this.b.f(aoru.EVENT_APP_FLIP_3P_CONSENT_REJECTED);
                        this.b.j(4, 4, 13, stringExtra2);
                    } else {
                        this.b.f(aoru.EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE);
                        this.b.j(5, 4, intExtra2, stringExtra2);
                    }
                    b = rtc.c(2, intExtra2);
                } else if (intExtra == 3) {
                    this.b.f(aoru.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.b.j(5, 5, intExtra2, stringExtra2);
                    b = rtc.b(intExtra2);
                } else {
                    this.b.f(aoru.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.b.j(4, 0, 0, null);
                    this.b.j(5, 3, intExtra2, stringExtra2);
                    b = rtc.b(intExtra2);
                }
            }
            this.a.a(b);
        }
    }
}
