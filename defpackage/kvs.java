package defpackage;

import com.google.protos.youtube.api.innertube.ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvs implements aaha {
    public static final /* synthetic */ int a = 0;
    private final aahv b;

    public kvs(aahv aahvVar) {
        this.b = aahvVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand)) {
            ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand) apxfVar.pX(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand);
            int i = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.b;
            if ((i & 1) == 0 || (i & 2) == 0) {
                return;
            }
            String str = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.c;
            String str2 = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.d;
            aahu c = this.b.c();
            c.f(str).g(athw.class).x(new fjx(str2, 7)).j(amru.r(str2)).c(new kvr(c, str, 0)).Q();
        }
    }
}
