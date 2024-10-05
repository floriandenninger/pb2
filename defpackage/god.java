package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class god {
    public final Uri a;
    public final String b;
    public boolean c;
    public boolean d;
    public double e;
    public double f;
    public double g;
    public int h;
    public int i;

    public god(String str, atdc atdcVar, String str2) {
        this.i = 1;
        zhq.m(str);
        this.b = str;
        atdcVar.getClass();
        this.a = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
        this.i = 1;
        this.e = 0.0d;
        this.f = 0.0d;
        this.g = 0.0d;
    }

    public final double a() {
        return ((this.e + this.f) + this.g) / 3.0d;
    }

    public final void b() {
        this.d = true;
    }

    public final void c(akzp akzpVar) {
        this.h = 0;
        int l = akwg.l(akzpVar.c);
        if (l == 0) {
            l = 1;
        }
        int i = l - 1;
        if (i != 0) {
            if (i == 1) {
                this.f = 1.0d;
                return;
            } else {
                if (i != 3) {
                    return;
                }
                this.c = true;
                return;
            }
        }
        avtq b = avtq.b(akzpVar.d);
        if (b == null) {
            b = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI) {
            this.h = 1;
            return;
        }
        avtq b2 = avtq.b(akzpVar.d);
        if (b2 == null) {
            b2 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b2 == avtq.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK) {
            this.h = 2;
        }
    }
}
