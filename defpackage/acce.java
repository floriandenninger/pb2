package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acce implements Runnable {
    public final /* synthetic */ ScreencastHostService a;
    private final /* synthetic */ int b;

    public /* synthetic */ acce(ScreencastHostService screencastHostService, int i) {
        this.b = i;
        this.a = screencastHostService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            ScreencastHostService screencastHostService = this.a;
            if (screencastHostService.o.e()) {
                return;
            }
            screencastHostService.g.execute(new acce(screencastHostService, i2));
            return;
        }
        if (i == 1) {
            ScreencastHostService screencastHostService2 = this.a;
            screencastHostService2.m.g(false);
            screencastHostService2.m.j(acdm.ERROR, screencastHostService2.getString(R.string.screencast_pause_error));
            return;
        }
        int i3 = 2;
        if (i == 2) {
            ScreencastHostService screencastHostService3 = this.a;
            screencastHostService3.m.g(true);
            screencastHostService3.m.j(acdm.ERROR, screencastHostService3.getString(R.string.screencast_resume_error));
        } else {
            ScreencastHostService screencastHostService4 = this.a;
            if (screencastHostService4.o.g()) {
                return;
            }
            screencastHostService4.g.execute(new acce(screencastHostService4, i3));
        }
    }
}
