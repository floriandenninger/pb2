package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class suh implements ayrv {
    private final int a;
    private final amrz b;
    private final sui c;

    public suh(int i, amrz amrzVar, sui suiVar) {
        this.a = i;
        this.b = amrzVar;
        this.c = suiVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        amrz amrzVar = this.b;
        HashMap hashMap = new HashMap();
        amxd listIterator = ((amrz) obj).entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Integer num = (Integer) amrzVar.get(entry.getKey());
            num.getClass();
            int intValue = num.intValue();
            final byte[] bArr = (byte[]) entry.getValue();
            hashMap.put(Integer.valueOf(intValue), new Object() { // from class: suf
                public final void a(int i, aomp aompVar) {
                    aompVar.m(aoqp.a(i), bArr);
                }
            });
        }
        aomk O = aomk.O(this.c.a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aomp aj = aomp.aj(byteArrayOutputStream);
        while (!O.E()) {
            int n = O.n();
            int a = aoqp.a(n);
            int b = aoqp.b(n);
            if (b == 0) {
                aj.E(a, ((aomg) O).s());
            } else if (b == 1) {
                aj.r(a, ((aomg) O).r());
            } else if (b == 2) {
                suf sufVar = (suf) hashMap.remove(Integer.valueOf(a));
                if (sufVar == null) {
                    aj.n(a, O.x());
                } else {
                    O.G(n);
                    sufVar.a(n, aj);
                }
            } else if (b == 5) {
                aj.p(a, ((aomg) O).j());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((suf) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, aj);
        }
        aj.i();
        return new sui(byteArrayOutputStream.toByteArray()).b(this.a);
    }
}
