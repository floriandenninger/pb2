package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abvy implements abso {
    public final /* synthetic */ abwy a;
    public final /* synthetic */ abwq b;
    private final /* synthetic */ int c;

    public /* synthetic */ abvy(abwy abwyVar, abwq abwqVar, int i) {
        this.c = i;
        this.a = abwyVar;
        this.b = abwqVar;
    }

    @Override // defpackage.abso
    public final void a(int i) {
        if (this.c == 0) {
            abwy abwyVar = this.a;
            abwq abwqVar = this.b;
            if (i != 0) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Capture resume error: ");
                sb.append(i);
                zga.b(sb.toString());
                if (abwyVar.S) {
                    abwyVar.f.d(2, abwyVar.N, abwyVar.t.getString(R.string.lc_error_pause_resume_failed), false);
                }
            }
            ScreencastHostService screencastHostService = ((accn) abwqVar).a;
            if (i == 0) {
                screencastHostService.m.j(acdm.DEFAULT, screencastHostService.getString(R.string.screencast_stream_resumed));
                screencastHostService.p.b = false;
                return;
            } else {
                screencastHostService.m.g(true);
                screencastHostService.m.j(acdm.ERROR, screencastHostService.getString(R.string.screencast_resume_error));
                return;
            }
        }
        abwy abwyVar2 = this.a;
        abwq abwqVar2 = this.b;
        if (i != 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Capture pause error: ");
            sb2.append(i);
            zga.b(sb2.toString());
            if (abwyVar2.S) {
                abwyVar2.f.d(2, abwyVar2.N, abwyVar2.t.getString(R.string.lc_error_pause_resume_failed), false);
            }
        }
        ScreencastHostService screencastHostService2 = ((accn) abwqVar2).a;
        if (i == 0) {
            screencastHostService2.m.j(acdm.DEFAULT, screencastHostService2.getString(R.string.screencast_stream_paused));
            screencastHostService2.p.b = true;
        } else {
            screencastHostService2.m.g(false);
            screencastHostService2.m.j(acdm.ERROR, screencastHostService2.getString(R.string.screencast_pause_error));
        }
    }
}
