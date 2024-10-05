package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvh extends yhw implements aaha {
    public final nne a;
    public final nnd b;
    private final Handler f;
    private final ainy g;
    private final oja h;
    private final giv i;

    public gvh(ci ciVar, aahd aahdVar, nne nneVar, nnd nndVar, acqz acqzVar, ainy ainyVar, oja ojaVar, giv givVar) {
        super(ciVar, aahdVar, acqzVar);
        this.a = nneVar;
        this.b = nndVar;
        this.g = ainyVar;
        this.h = ojaVar;
        this.i = givVar;
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.yhw
    protected final void b(apxf apxfVar, final Map map, final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) {
        ojb ojbVar;
        oan oanVar;
        int L = awxr.L(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.i);
        if (L == 0 || L != 3) {
            final boolean z = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.g;
            if (z) {
                this.f.post(new Runnable() { // from class: gvg
                    @Override // java.lang.Runnable
                    public final void run() {
                        gvh.this.a.r(1, 1);
                    }
                });
            } else {
                this.f.post(new gkr(this.g, 5));
            }
            int i = 0;
            if (z && (ojbVar = this.h.a) != null && (oanVar = ((DefaultWatchPanelViewController) ojbVar).j) != null) {
                i = ((oad) oanVar).f;
            }
            yib aH = yib.aH(apxfVar, i);
            aH.aI(new yia() { // from class: gvf
                @Override // defpackage.yia
                public final void a() {
                    gvh gvhVar = gvh.this;
                    ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2 = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
                    Map map2 = map;
                    boolean z2 = z;
                    Iterator it = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.d.iterator();
                    while (it.hasNext()) {
                        gvhVar.d.c((apxf) it.next(), map2);
                    }
                    if (z2) {
                        gvhVar.b.q();
                    }
                }
            });
            aH.qi(this.c.getSupportFragmentManager(), "web_view_dialog");
            return;
        }
        giv givVar = this.i;
        Bundle bundle = new Bundle();
        bundle.putByteArray("show_webview_dialog_command", apxfVar.toByteArray());
        givVar.d(PaneDescriptor.c(gvk.class, apxfVar, bundle));
    }
}
