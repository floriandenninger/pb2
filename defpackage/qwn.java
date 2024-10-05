package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwn extends qsg {
    public final Context a;

    public qwn(Context context, Looper looper, qod qodVar, qoe qoeVar, qrz qrzVar) {
        super(context, looper, 29, qrzVar, qodVar, qoeVar);
        this.a = context;
        rse.b(context);
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof qwq) {
            return (qwq) queryLocalInterface;
        }
        return new qwq(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return qwc.b;
    }

    public final void k(FeedbackOptions feedbackOptions) {
        String str;
        aone createBuilder = qzr.a.createBuilder();
        String str2 = feedbackOptions.g;
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            qzr qzrVar = (qzr) createBuilder.instance;
            str2.getClass();
            qzrVar.b |= 2;
            qzrVar.d = str2;
        } else {
            String packageName = this.a.getApplicationContext().getPackageName();
            createBuilder.copyOnWrite();
            qzr qzrVar2 = (qzr) createBuilder.instance;
            packageName.getClass();
            qzrVar2.b |= 2;
            qzrVar2.d = packageName;
        }
        try {
            str = this.a.getPackageManager().getPackageInfo(((qzr) createBuilder.instance).d, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            qzr qzrVar3 = (qzr) createBuilder.instance;
            qzrVar3.c |= 2;
            qzrVar3.k = str;
        }
        String str3 = feedbackOptions.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            createBuilder.copyOnWrite();
            qzr qzrVar4 = (qzr) createBuilder.instance;
            num.getClass();
            qzrVar4.b |= 4;
            qzrVar4.e = num;
        }
        String str4 = feedbackOptions.n;
        if (str4 != null) {
            createBuilder.copyOnWrite();
            qzr qzrVar5 = (qzr) createBuilder.instance;
            qzrVar5.b |= 64;
            qzrVar5.g = str4;
        }
        createBuilder.copyOnWrite();
        qzr qzrVar6 = (qzr) createBuilder.instance;
        qzrVar6.b |= 16;
        qzrVar6.f = "feedback.android";
        int i = qmy.b;
        createBuilder.copyOnWrite();
        qzr qzrVar7 = (qzr) createBuilder.instance;
        qzrVar7.b |= 1073741824;
        qzrVar7.j = i;
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        qzr qzrVar8 = (qzr) createBuilder.instance;
        qzrVar8.b |= 16777216;
        qzrVar8.i = currentTimeMillis;
        if (feedbackOptions.m != null || feedbackOptions.f != null) {
            createBuilder.copyOnWrite();
            qzr qzrVar9 = (qzr) createBuilder.instance;
            qzrVar9.c |= 16;
            qzrVar9.n = true;
        }
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = feedbackOptions.b.size();
            createBuilder.copyOnWrite();
            qzr qzrVar10 = (qzr) createBuilder.instance;
            qzrVar10.c |= 4;
            qzrVar10.l = size;
        }
        List list = feedbackOptions.h;
        if (list != null && !list.isEmpty()) {
            int size2 = feedbackOptions.h.size();
            createBuilder.copyOnWrite();
            qzr qzrVar11 = (qzr) createBuilder.instance;
            qzrVar11.c |= 8;
            qzrVar11.m = size2;
        }
        aone builder = ((qzr) createBuilder.build()).toBuilder();
        builder.copyOnWrite();
        qzr qzrVar12 = (qzr) builder.instance;
        qzrVar12.h = 164;
        qzrVar12.b |= 256;
        qzr qzrVar13 = (qzr) builder.build();
        Context context = this.a;
        if (TextUtils.isEmpty(qzrVar13.d)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (TextUtils.isEmpty(qzrVar13.g)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (TextUtils.isEmpty(qzrVar13.f)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (qzrVar13.j <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (qzrVar13.i <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int a = awxt.a(qzrVar13.h);
        if (a == 0 || a == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", qzrVar13.toByteArray()));
    }
}
