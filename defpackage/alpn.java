package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.review.ReviewInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alpn extends alow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpn(alpo alpoVar, alsf alsfVar) {
        super(alpoVar, alsfVar);
        new ammr("OnRequestInstallCallback", (char[]) null);
    }

    @Override // defpackage.alow
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.a.b(ReviewInfo.c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
