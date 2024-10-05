package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyn implements udb {
    public final Optional a;
    private final aear b;

    public afyn(Optional optional, aear aearVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = optional;
        this.b = aearVar;
    }

    @Override // defpackage.udb
    public final void a(aojx aojxVar) {
        Optional optional = (Optional) twy.a(aojxVar).b(new afyf(2)).d(advx.s);
        if (!optional.isPresent()) {
            zga.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zga.b("Endpoint resolver is missing.");
        } else {
            optional.filter(nty.j).map(acxx.q).ifPresent(new afyl((aahd) this.a.get(), 0));
            optional.filter(nty.k).map(acxx.r).ifPresent(new Consumer() { // from class: afym
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    afyn afynVar = afyn.this;
                    apxf apxfVar = (apxf) obj;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", apxfVar.c.I());
                    ((aahd) afynVar.a.get()).c(apxfVar, hashMap);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.udb
    public final void b(List list) {
        Optional aa = aear.aa(list);
        if (!aa.isPresent()) {
            zga.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zga.b("Endpoint resolver is missing.");
        } else {
            aa.filter(nty.i).map(acxx.t).ifPresent(new afyl((aahd) this.a.get(), 0));
        }
    }

    @Override // defpackage.udb
    public final void c(List list) {
        Optional aa = aear.aa(list);
        if (!aa.isPresent()) {
            zga.b("Could not get the YouTube custom payload.");
        } else if (!this.a.isPresent()) {
            zga.b("Endpoint resolver is missing.");
        } else {
            aa.filter(nty.h).map(acxx.s).ifPresent(new afyl((aahd) this.a.get(), 0));
        }
    }
}
