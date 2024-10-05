package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qwk {
    public final Bundle a;
    public String b;
    public String c;
    public boolean d;
    ApplicationErrorReport e;
    private Bitmap f;
    private String g;
    private final List h;
    private boolean i;
    private String j;
    private oba k;

    @Deprecated
    public qwk() {
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        this.j = oba.K();
    }

    public FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.f;
        feedbackOptions.f = null;
        feedbackOptions.a = this.g;
        feedbackOptions.c = this.b;
        feedbackOptions.b = this.a;
        feedbackOptions.e = this.c;
        feedbackOptions.h = this.h;
        feedbackOptions.i = this.d;
        feedbackOptions.j = null;
        feedbackOptions.k = null;
        feedbackOptions.l = this.i;
        feedbackOptions.q = this.k;
        feedbackOptions.n = this.j;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        return feedbackOptions;
    }

    public final void b(boolean z) {
        if ((!this.a.isEmpty() || !this.h.isEmpty()) && this.i != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.i = z;
    }

    public final void c() {
        this.g = "anonymous";
    }

    public final void d(Bitmap bitmap) {
        if (this.d && axti.a.get().a()) {
            throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
        }
        this.f = bitmap;
    }

    public final void e(oba obaVar) {
        b(false);
        this.k = obaVar;
    }

    public qwk(Context context) {
        String K;
        rse.b(context);
        this.a = new Bundle();
        this.h = new ArrayList();
        this.e = new ApplicationErrorReport();
        try {
            if (((Boolean) qwr.b.a()).booleanValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                long abs = Math.abs(new SecureRandom().nextLong());
                StringBuilder sb = new StringBuilder(41);
                sb.append(currentTimeMillis);
                sb.append("_");
                sb.append(abs);
                K = sb.toString();
            } else {
                K = oba.K();
            }
            this.j = K;
        } catch (SecurityException unused) {
            this.j = oba.K();
        }
    }
}
