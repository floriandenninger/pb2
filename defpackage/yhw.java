package defpackage;

import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yhw implements aaha {
    protected final ci c;
    public final aahd d;
    protected final acqz e;

    public yhw(ci ciVar, aahd aahdVar, acqz acqzVar) {
        this.c = ciVar;
        this.d = aahdVar;
        this.e = acqzVar;
    }

    protected void b(apxf apxfVar, final Map map, final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) {
        yib aH = yib.aH(apxfVar, 0);
        aH.aI(new yia() { // from class: yhv
            @Override // defpackage.yia
            public final void a() {
                yhw yhwVar = yhw.this;
                ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2 = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
                Map map2 = map;
                Iterator it = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.d.iterator();
                while (it.hasNext()) {
                    yhwVar.d.c((apxf) it.next(), map2);
                }
            }
        });
        aH.qi(this.c.getSupportFragmentManager(), "web_view_dialog");
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apxfVar.pX(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            this.e.mM().n(new acqx(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.j));
            b(apxfVar, map, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand);
        }
    }
}
