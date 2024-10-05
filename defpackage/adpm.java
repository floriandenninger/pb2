package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.mdx.smartremote.BitmapSoundLevelsView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpm extends Handler {
    public volatile boolean a;
    private final BitmapSoundLevelsView b;

    public adpm(BitmapSoundLevelsView bitmapSoundLevelsView) {
        this.b = bitmapSoundLevelsView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            this.b.invalidate();
            sendMessageDelayed(obtainMessage(0), 10L);
        }
    }
}
