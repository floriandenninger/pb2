package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acco {
    final /* synthetic */ ScreencastHostService a;

    public acco(ScreencastHostService screencastHostService) {
        this.a = screencastHostService;
    }

    public final boolean a() {
        return this.a.m.c.I;
    }

    public final void b(String str) {
        ScreencastHostService screencastHostService = this.a;
        ((viz) screencastHostService.j.g.get()).b(str);
        if (str.equals("SUCCESS") || screencastHostService.r.g() <= 0) {
            return;
        }
        screencastHostService.k();
        screencastHostService.m.i(R.string.screencast_capture_active_error);
    }
}
