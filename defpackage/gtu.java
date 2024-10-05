package defpackage;

import com.google.protos.youtube.api.innertube.AppBrowserPrewarmAndPreconnectCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtu implements aaha {
    private final ajcw a;

    public gtu(ajcw ajcwVar) {
        this.a = ajcwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        anhy a;
        if (apxfVar == null || !apxfVar.pY(AppBrowserPrewarmAndPreconnectCommandOuterClass.appBrowserPrewarmAndPreconnectCommand) || (a = this.a.a()) == null) {
            return;
        }
        a.isCancelled();
    }
}
