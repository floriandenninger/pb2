package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.cms;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {
    private ResultReceiver a;
    private ResultReceiver b;
    private boolean c;

    private final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L71
            cmn r6 = defpackage.cms.c(r8, r2)
            int r6 = r6.a
            r3 = -1
            if (r7 != r3) goto L1a
            if (r6 == 0) goto L18
            r7 = -1
            goto L1a
        L18:
            r6 = 0
            goto L38
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 85
            r3.<init>(r4)
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            defpackage.cms.f(r2, r7)
        L38:
            android.os.ResultReceiver r7 = r5.a
            if (r7 == 0) goto L47
            if (r8 != 0) goto L3f
            goto L43
        L3f:
            android.os.Bundle r0 = r8.getExtras()
        L43:
            r7.send(r6, r0)
            goto La3
        L47:
            android.content.Intent r6 = r5.a()
            if (r8 == 0) goto L6d
            android.os.Bundle r7 = r8.getExtras()
            if (r7 == 0) goto L5b
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L6d
        L5b:
            java.lang.String r7 = "Got null bundle!"
            defpackage.cms.f(r2, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
        L6d:
            r5.sendBroadcast(r6)
            goto La3
        L71:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L88
            int r6 = defpackage.cms.i(r8)
            android.os.ResultReceiver r7 = r5.b
            if (r7 == 0) goto La3
            if (r8 != 0) goto L80
            goto L84
        L80:
            android.os.Bundle r0 = r8.getExtras()
        L84:
            r7.send(r6, r0)
            goto La3
        L88:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 69
            r7.<init>(r8)
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.cms.f(r2, r6)
        La3:
            r5.c = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle == null) {
            int i2 = cms.a;
            try {
                if (getIntent().hasExtra("BUY_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i = 101;
                        this.c = true;
                        startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                        return;
                    }
                    pendingIntent = null;
                }
                this.c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                cms.g("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a = a();
                        a.putExtra("RESPONSE_CODE", 6);
                        a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a);
                    }
                }
                this.c = false;
                finish();
                return;
            }
            i = 100;
        } else {
            int i3 = cms.a;
            this.c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.c) {
            Intent a = a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
    }
}
