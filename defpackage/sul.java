package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sul implements ayrv {
    private final int a;
    private final amrz b;
    private final syv c;

    public sul(int i, amrz amrzVar, syv syvVar) {
        this.a = i;
        this.b = amrzVar;
        this.c = syvVar;
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
            hashMap.put(Integer.valueOf(num.intValue()), new tmw((ammv) entry.getValue()));
        }
        syv syvVar = this.c;
        int i = this.a;
        aomk N = aomk.N(syvVar.f());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aomp aj = aomp.aj(byteArrayOutputStream);
        for (int i2 = 0; i2 < 13; i2++) {
            aj.j((byte) 0);
        }
        while (!N.E()) {
            int n = N.n();
            int a = aoqp.a(n);
            int b = aoqp.b(n);
            if (b == 0) {
                aj.E(a, N.w());
            } else if (b == 1) {
                aj.r(a, N.p());
            } else if (b == 2) {
                tmw tmwVar = (tmw) hashMap.remove(Integer.valueOf(a));
                if (tmwVar == null) {
                    aj.n(a, N.x());
                } else {
                    N.G(n);
                    tmwVar.a(n, aj);
                }
            } else if (b == 5) {
                aj.p(a, N.h());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((tmw) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, aj);
        }
        aj.i();
        int i3 = ((aomm) aj).d - 13;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        aomp aj2 = aomp.aj(byteArrayOutputStream2);
        aj2.B(i, 2);
        aj2.D(i3);
        aj2.i();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int i4 = 13 - length;
        System.arraycopy(byteArray, 0, byteArray2, i4, length);
        return syv.a(ByteBuffer.wrap(byteArray2, i4, i3 + length));
    }
}
