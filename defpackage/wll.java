package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wll implements wlx {
    private final Activity a;

    public wll(Activity activity) {
        this.a = activity;
    }

    private static final Intent a(int i) {
        Intent intent = new Intent();
        intent.putExtra("PHONE_VERIFICATION_RESULT", i);
        return intent;
    }

    @Override // defpackage.wlx
    public final void h() {
        this.a.setResult(0, a(0));
        this.a.finish();
    }

    @Override // defpackage.wlx
    public final void i() {
        this.a.setResult(0, a(-1));
        this.a.finish();
    }

    @Override // defpackage.wlx
    public final void u() {
        this.a.setResult(-1, a(1));
        this.a.finish();
    }
}
