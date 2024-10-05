package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lja implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ VoiceSearchActivity a;

    public lja(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.m = windowInsets.getSystemWindowInsetTop();
        return windowInsets;
    }
}
