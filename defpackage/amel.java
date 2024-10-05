package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amel extends axps {
    private amel(Activity activity) {
        super(activity);
    }

    public static amel a(Activity activity) {
        return new amel(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axps
    public final Object b() {
        amkq.T(this.a.getApplication() instanceof amei, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", this.a.getClass().getSimpleName(), this.a.getApplication().getClass().getSimpleName());
        return super.b();
    }
}
