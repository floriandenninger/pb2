package defpackage;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.cast.CastDevice;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adee {
    public static final String a = zga.a("MDX.MediaRoutes");
    public final anib b;
    public final adbu c;
    private final Executor d;

    public adee(Executor executor, anib anibVar, adbu adbuVar) {
        this.d = executor;
        this.b = anibVar;
        this.c = adbuVar;
    }

    public static boolean b(CastDevice castDevice) {
        return (castDevice == null || castDevice.d(1) || !castDevice.d(4)) ? false : true;
    }

    public static CastDevice c(bpv bpvVar) {
        Bundle bundle;
        if (bpvVar == null || (bundle = bpvVar.q) == null) {
            return null;
        }
        return CastDevice.a(bundle);
    }

    public static boolean d(bpv bpvVar) {
        return b(c(bpvVar));
    }

    public static boolean e(bpv bpvVar) {
        return c(bpvVar) != null;
    }

    public final anhy a(final amru amruVar) {
        return anfq.i(anaf.S(new Callable() { // from class: adeb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Map) Collection.EL.stream(amru.this).collect(Collectors.toMap(acxx.c, acxx.g));
            }
        }, this.d), new anfz() { // from class: adea
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final adee adeeVar = adee.this;
                List list = (List) Collection.EL.stream(((Map) obj).entrySet()).map(new Function() { // from class: aded
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        adee adeeVar2 = adee.this;
                        final Map.Entry entry = (Map.Entry) obj2;
                        if (((Optional) entry.getValue()).isPresent()) {
                            final Bundle bundle = (Bundle) ((Optional) entry.getValue()).get();
                            return anfq.h(adeeVar2.c.a.submit(new Callable() { // from class: adbt
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Optional.ofNullable(CastDevice.a(bundle));
                                }
                            }), new amml() { // from class: addz
                                @Override // defpackage.amml
                                public final Object apply(Object obj3) {
                                    return new Pair((bpv) entry.getKey(), (Optional) obj3);
                                }
                            }, adeeVar2.b);
                        }
                        return anaf.O(new Pair((bpv) entry.getKey(), Optional.empty()));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList());
                return anaf.H(list).a(new adec(list, 0), adeeVar.b);
            }
        }, this.b);
    }
}
