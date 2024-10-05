package defpackage;

import android.accounts.Account;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ezu implements ayrv {
    public final /* synthetic */ ezw a;
    private final /* synthetic */ int b;

    public /* synthetic */ ezu(ezw ezwVar, int i) {
        this.b = i;
        this.a = ezwVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.b == 0) {
            final ezw ezwVar = this.a;
            WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint = (WebviewEndpointOuterClass$WebviewEndpoint) obj;
            if (!webviewEndpointOuterClass$WebviewEndpoint.c) {
                return ayqj.F(webviewEndpointOuterClass$WebviewEndpoint.b);
            }
            String str = webviewEndpointOuterClass$WebviewEndpoint.b;
            int i = 1;
            return ayqj.C(new Callable() { // from class: ezv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ezw ezwVar2 = ezw.this;
                    return ammv.i(ezwVar2.f.a(ezwVar2.b.c()));
                }
            }).L(amlr.a).h(eng.i).x(eoe.f).x(new fjx(str, i)).s(new ezu(ezwVar, i)).S(str);
        }
        ezw ezwVar2 = this.a;
        ammw ammwVar = (ammw) obj;
        return afsu.a(ezwVar2.a, (Account) ammwVar.b, (String) ammwVar.a).G(azre.b(ezwVar2.c)).z(azre.b(ezwVar2.d)).F((String) ammwVar.a);
    }
}
