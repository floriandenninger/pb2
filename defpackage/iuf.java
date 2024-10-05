package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.function.Function;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iuf implements Callable {
    public final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuf(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            String T = whu.T(this.a.s());
            if (T != null && T.startsWith("FEsfv")) {
                r1 = true;
            }
            return Boolean.valueOf(!r1);
        }
        ivj ivjVar = this.a;
        final gak gakVar = ivjVar.bA() ? gak.DARK : gak.ACTIVITY_DEFAULT;
        gaj gajVar = ivjVar.bA() ? gaj.DARK : gaj.ACTIVITY_DEFAULT;
        apxf apxfVar = ivjVar.ai;
        r1 = apxfVar == null || !((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEvideo_picker");
        gah a = gai.a();
        a.b(r1);
        a.c(gajVar);
        gah gahVar = (gah) new Function() { // from class: iuo
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                boolean z = r1;
                gak gakVar2 = gakVar;
                gah gahVar2 = (gah) obj;
                int i = ivj.cs;
                if (z) {
                    gahVar2.d(gakVar2);
                }
                return gahVar2;
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }.apply(a);
        gahVar.getClass();
        return gahVar.a();
    }
}
