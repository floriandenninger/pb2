package defpackage;

import com.google.android.libraries.elements.interfaces.MissingResourceHandler;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.android.libraries.elements.interfaces.SecurityVerifier;
import com.youtube.android.libraries.elements.StatusOr;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagq implements aagm {
    public final aafq a;
    public final syq b;
    public final azrw c;
    public final azrw d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final azrs f = azrl.e().aT();
    public final Map g = new ConcurrentHashMap();
    private final amnv h = amkq.x(new amnv() { // from class: aagn
        @Override // defpackage.amnv
        public final Object get() {
            final aagq aagqVar = aagq.this;
            aagqVar.b.a().registerMissingResourceHandler((MissingResourceHandler) aagqVar.c.get());
            aagqVar.b.a().registerVerifier("datapush", StatusOr.fromValue((SecurityVerifier) aagqVar.d.get()));
            aagqVar.a.d(awmq.b).ax(new ayrs() { // from class: aago
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    final aagq aagqVar2 = aagq.this;
                    final aafx aafxVar = (aafx) obj;
                    Iterator it = aafxVar.d(awmq.b).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        for (awmr awmrVar : ((awmq) it.next()).c) {
                            String str = awmrVar.b;
                            if (!aagqVar2.g.containsKey(str)) {
                                aagqVar2.g.put(str, new aagl(aafxVar, awmrVar));
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        ((azrh) ConcurrentMap.EL.computeIfAbsent(aagqVar2.e, aafxVar.c(), new Function() { // from class: aagp
                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function andThen(Function function) {
                                return Function.CC.$default$andThen(this, function);
                            }

                            @Override // j$.util.function.Function
                            public final Object apply(Object obj2) {
                                aagq aagqVar3 = aagq.this;
                                aagqVar3.f.c(aafxVar);
                                return azrh.e();
                            }

                            @Override // j$.util.function.Function
                            public final /* synthetic */ Function compose(Function function) {
                                return Function.CC.$default$compose(this, function);
                            }
                        })).c(aafxVar);
                    }
                }
            });
            return null;
        }
    });

    public aagq(aafq aafqVar, syq syqVar, azrw azrwVar, azrw azrwVar2) {
        this.a = aafqVar;
        this.b = syqVar;
        this.c = azrwVar;
        this.d = azrwVar2;
    }

    @Override // defpackage.aagm
    public final ResourcePreloader a() {
        return this.b.a().getPreloader();
    }

    @Override // defpackage.aagm
    public final aagl b(String str) {
        return (aagl) this.g.get(str);
    }

    @Override // defpackage.aagm
    public final aypy c() {
        this.h.get();
        return aypy.aa(aypy.Z(this.e.values()), this.f);
    }

    @Override // defpackage.aagm
    public final boolean d(String str) {
        return this.g.containsKey(str);
    }
}
