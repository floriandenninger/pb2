package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cz extends aam {
    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                aal aalVar = new aal(intentSenderRequest.a);
                aalVar.a = null;
                aalVar.b(intentSenderRequest.d, intentSenderRequest.c);
                intentSenderRequest = aalVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateIntent created the following intent: ");
            sb.append(intent);
        }
        return intent;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
