package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.youtube.player.ui.mediasession.MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aiwe implements azrw {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiwe(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.azrw
    public final Object get() {
        if (this.b != 0) {
            return this.a.getSharedPreferences("DelayedEventMetricsStore.prefs", 0);
        }
        Context context = this.a;
        return new hn(context, "YouTube playerlib", new ComponentName(context.getPackageName(), MediaButtonIntentReceiverProvider$DefaultMediaButtonIntentReceiver.class.getName()), null);
    }
}
