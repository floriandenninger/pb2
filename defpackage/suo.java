package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class suo implements ayrv {
    private final amrz a;
    private final awoi b;

    public suo(amrz amrzVar, awoi awoiVar) {
        this.a = amrzVar;
        this.b = awoiVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aone createBuilder = awoi.a.createBuilder(this.b);
        amxd listIterator = ((amrz) obj).entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            String str = (String) this.a.get(entry.getKey());
            str.getClass();
            aone createBuilder2 = awoj.a.createBuilder();
            aomf x = aomf.x((byte[]) entry.getValue());
            createBuilder2.copyOnWrite();
            awoj awojVar = (awoj) createBuilder2.instance;
            awojVar.b = 5;
            awojVar.c = x;
            createBuilder.bb(str, (awoj) createBuilder2.build());
        }
        return (awoi) createBuilder.build();
    }
}
