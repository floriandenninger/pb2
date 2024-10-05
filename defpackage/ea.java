package defpackage;

import android.content.res.Resources;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ea {
    protected dy b;
    CharSequence c;
    CharSequence d;
    boolean e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return null;
    }

    public void b(dt dtVar) {
        throw null;
    }

    public final void f(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.b.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f = resources.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round(((1.0f - f2) * dimensionPixelSize) + (f2 * dimensionPixelSize2)), 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.RemoteViews g(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea.g(int, boolean):android.widget.RemoteViews");
    }

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public RemoteViews j() {
        return null;
    }
}
