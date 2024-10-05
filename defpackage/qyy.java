package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qyy {
    public final Activity a;
    private final amnv b;

    public qyy(final Activity activity) {
        this.a = activity;
        this.b = new amnv() { // from class: qyw
            @Override // defpackage.amnv
            public final Object get() {
                return qza.a(activity);
            }
        };
    }

    public final void a(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int b = qnm.b(this.a, 11925000);
        if (b == 0) {
            Object obj = this.b.get();
            qzn qznVar = (qzn) obj;
            qip.an(qznVar.a);
            qof qofVar = ((qob) obj).D;
            qzi qziVar = new qzi(qofVar, intent, new WeakReference(qznVar.a));
            qofVar.a(qziVar);
            qar.i(qziVar);
            return;
        }
        final Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (b == 7) {
            b = 7;
        } else if (this.a.getPackageManager().queryIntentActivities(data, 0).size() > 0) {
            new amcc(Looper.getMainLooper(), (byte[]) null).post(new Runnable() { // from class: qyx
                @Override // java.lang.Runnable
                public final void run() {
                    qyy qyyVar = qyy.this;
                    qyyVar.a.startActivity(data);
                }
            });
            return;
        }
        Activity activity = this.a;
        if (true == qnm.f(activity, b)) {
            b = 18;
        }
        qmy.a.f(activity, b, 0, null);
    }
}
