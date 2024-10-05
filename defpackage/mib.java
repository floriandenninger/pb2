package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mib extends Handler {
    final WeakReference a;

    public mib(InlinePlaybackController inlinePlaybackController) {
        this.a = new WeakReference(inlinePlaybackController);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InlinePlaybackController inlinePlaybackController = (InlinePlaybackController) this.a.get();
        if (inlinePlaybackController == null || message.what != 1) {
            return;
        }
        inlinePlaybackController.a.g();
        fhg fhgVar = fhg.NONE;
    }
}
