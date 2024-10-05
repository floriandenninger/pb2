package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkl extends aam {
    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Intent intent = new Intent(context, (Class<?>) PhoneVerificationActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, (apxf) obj));
        intent.putExtra("PHONE_VERIFICATION_COMMAND", bundle);
        return intent;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (intent == null || !intent.hasExtra("PHONE_VERIFICATION_RESULT")) {
            return -2;
        }
        return Integer.valueOf(intent.getIntExtra("PHONE_VERIFICATION_RESULT", -2));
    }
}
