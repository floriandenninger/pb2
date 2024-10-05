package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajfs extends ajfh {
    public ajfs(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajfh
    public final /* bridge */ /* synthetic */ aqrf a(Object obj) {
        aulq aulqVar = (aulq) obj;
        if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
            return (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
        }
        return null;
    }
}
