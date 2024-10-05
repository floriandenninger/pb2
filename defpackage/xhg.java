package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhg implements aikh {
    private final azrw b;

    public xhg(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.aikh
    public final int a() {
        return !TextUtils.isEmpty(((xhf) this.b.get()).a.l) ? R.layout.ad_notification : R.layout.ad_notification_no_title;
    }

    @Override // defpackage.aikh
    public final int b() {
        return R.id.byline;
    }

    @Override // defpackage.aikh
    public final int c() {
        return R.id.title;
    }

    @Override // defpackage.aikh
    public final boolean d() {
        return Build.VERSION.SDK_INT > 23;
    }
}
