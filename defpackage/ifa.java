package defpackage;

import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import j$.util.function.Consumer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifa implements aaha {
    public static final /* synthetic */ int a = 0;
    private final iip b;
    private final /* synthetic */ int c;

    public ifa(iip iipVar, int i) {
        this.c = i;
        this.b = iipVar;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        if (this.c == 0) {
            this.b.a().ifPresent(gfd.k);
        } else {
            this.b.a().ifPresent(new Consumer() { // from class: iey
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    apxf apxfVar2 = apxf.this;
                    int i = ifa.a;
                    ((iiq) obj).q(((FlagVideoEndpointOuterClass$FlagVideoEndpoint) apxfVar2.pX(FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint)).b);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
