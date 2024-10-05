package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpp implements akpr {
    public final Executor a;
    public final List b;
    public String c;
    private final aaxn d;

    public akpp(aaxn aaxnVar, Executor executor, List list, byte[] bArr, byte[] bArr2) {
        this.d = aaxnVar;
        this.a = executor;
        this.b = list;
    }

    public final anhy a(String str, boolean z) {
        aaxn aaxnVar = this.d;
        abcc abccVar = new abcc(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abccVar.a = str;
        abccVar.c = z;
        abccVar.b = this.c;
        aaxn aaxnVar2 = this.d;
        anhy b = aaxnVar2.b.b(abccVar, this.a);
        final akpo akpoVar = new akpo(str, this.b);
        return anfq.h(b, new amml() { // from class: akpl
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                akpo akpoVar2 = akpo.this;
                akps akpsVar = new akps((asac) obj);
                Iterator it = akpoVar2.b.iterator();
                while (it.hasNext()) {
                    ((akpf) it.next()).b(akpoVar2.a, akpsVar);
                }
                return akpsVar;
            }
        }, this.a);
    }
}
