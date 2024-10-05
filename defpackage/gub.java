package defpackage;

import com.google.protos.youtube.api.innertube.MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gub implements aaha {
    public static final /* synthetic */ int b = 0;
    public final shf a;
    private final aahv c;

    public gub(aahv aahvVar, shf shfVar) {
        this.c = aahvVar;
        this.a = shfVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand)) {
            MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand markBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand = (MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand) apxfVar.pX(MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand);
            final aahu c = this.c.c();
            c.f(markBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.b).g(argl.class).l(ggc.d).c(new ayrv() { // from class: gua
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    gub gubVar = gub.this;
                    aakv aakvVar = c;
                    argl arglVar = (argl) obj;
                    if (arglVar == null) {
                        afsi.b(2, 1, "Survey entity is null in onSuccess on display");
                        return ayph.f();
                    }
                    aaio c2 = ((aaih) aakvVar).c();
                    argj e = arglVar.e();
                    Long valueOf = Long.valueOf(gubVar.a.c());
                    aone aoneVar = e.a;
                    long longValue = valueOf.longValue();
                    aoneVar.copyOnWrite();
                    argi argiVar = (argi) aoneVar.instance;
                    argi argiVar2 = argi.a;
                    argiVar.b = 2 | argiVar.b;
                    argiVar.d = longValue;
                    c2.k(e);
                    return c2.b();
                }
            }).q(ggk.h).Q();
        }
    }
}
