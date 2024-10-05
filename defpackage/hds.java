package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hds {
    public final Context a;
    public final YouTubeTextView b;
    public final EditorButtonView c;
    public final jqr d;

    public hds(Context context, YouTubeTextView youTubeTextView, EditorButtonView editorButtonView, jqr jqrVar, byte[] bArr) {
        this.a = context;
        youTubeTextView.getClass();
        this.b = youTubeTextView;
        this.c = editorButtonView;
        jqrVar.getClass();
        this.d = jqrVar;
    }

    public static void a(final YouTubeTextView youTubeTextView, String str, Context context) {
        youTubeTextView.setText(str);
        youTubeTextView.setVisibility(0);
        if (Build.VERSION.SDK_INT < 26 ? Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f : !ValueAnimator.areAnimatorsEnabled()) {
            youTubeTextView.setAlpha(1.0f);
            youTubeTextView.postDelayed(new Runnable() { // from class: hdq
                @Override // java.lang.Runnable
                public final void run() {
                    YouTubeTextView.this.setAlpha(0.0f);
                }
            }, 1000L);
        } else {
            youTubeTextView.setAlpha(0.0f);
            youTubeTextView.animate().setStartDelay(0L).alpha(1.0f).setDuration(100L).setListener(new hdr(youTubeTextView));
        }
    }
}
