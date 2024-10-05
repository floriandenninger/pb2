package defpackage;

import com.google.protos.youtube.api.innertube.SubmitSurveyCommandOuterClass$SubmitSurveyCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gur implements aaha {
    public static final /* synthetic */ int d = 0;
    public final shf a;
    public final xhi b;
    public final xbs c;
    private final aahv e;
    private final azrw f;
    private final azrw g;

    public gur(aahv aahvVar, shf shfVar, xho xhoVar, xbq xbqVar, azrw azrwVar, azrw azrwVar2) {
        this.e = aahvVar;
        this.a = shfVar;
        this.b = xhoVar.b(new guq(0));
        this.c = xbqVar.a();
        this.f = azrwVar;
        this.g = azrwVar2;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand)) {
            final SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand = (SubmitSurveyCommandOuterClass$SubmitSurveyCommand) apxfVar.pX(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand);
            xls xlsVar = (xls) this.f.get();
            yjk.f();
            if (xlsVar.d != null) {
                xlsVar.d.y();
            }
            this.e.c().f(submitSurveyCommandOuterClass$SubmitSurveyCommand.c).g(argl.class).o(new ayrs() { // from class: gup
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    gur gurVar = gur.this;
                    SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand2 = submitSurveyCommandOuterClass$SubmitSurveyCommand;
                    argl arglVar = (argl) obj;
                    if (arglVar == null) {
                        afsi.b(2, 1, "Null survey entity on submit");
                        return;
                    }
                    xgp xgpVar = new xgp(null, gurVar.a);
                    if (submitSurveyCommandOuterClass$SubmitSurveyCommand2.d) {
                        xgpVar.d();
                        xgpVar.f();
                    } else if (submitSurveyCommandOuterClass$SubmitSurveyCommand2.e) {
                        xgpVar.d();
                        xgpVar.c = true;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < arglVar.getIsSelected().size(); i++) {
                            if (((Boolean) arglVar.getIsSelected().get(i)).booleanValue()) {
                                arrayList.add(Integer.valueOf(i));
                            }
                        }
                        xgpVar.e(arrayList);
                    }
                    xgpVar.b = arglVar.getDisplayTime().longValue();
                    auze auzeVar = submitSurveyCommandOuterClass$SubmitSurveyCommand2.b;
                    if (auzeVar == null) {
                        auzeVar = auze.a;
                    }
                    for (Map.Entry entry : xgpVar.b(auzeVar)) {
                        gurVar.b.d((aoye) entry.getKey(), (List) entry.getValue(), true, gurVar.c);
                    }
                }
            }).m(ggk.k).l(ggc.f).T();
            ((wqb) this.g.get()).a();
        }
    }
}
