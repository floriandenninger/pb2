package defpackage;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssx implements sym {
    private static final String a = "ssx";
    private static final AtomicInteger b = new AtomicInteger();
    private final syd c;
    private final Map d;
    private final Map e;

    public ssx(Map map, Map map2, syd sydVar) {
        this.c = sydVar;
        amrw amrwVar = new amrw();
        for (Map.Entry entry : ((amrz) map).entrySet()) {
            amrwVar.g(Integer.valueOf(((srr) entry.getValue()).a()), (srr) entry.getValue());
        }
        amrw amrwVar2 = new amrw();
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : ((amrz) map2).entrySet()) {
                amrwVar2.g(Integer.valueOf(((srs) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
            }
        }
        this.d = amrwVar.c();
        this.e = amrwVar2.c();
    }

    @Override // defpackage.sym
    public final int a() {
        return 322066057;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        axox axoxVar = new axox();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axoxVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axoxVar;
    }

    @Override // defpackage.syn
    public final /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        Pair pair;
        axox axoxVar = (axox) obj;
        AtomicReference atomicReference = sxcVar.w;
        if (atomicReference == null) {
            this.c.b(28, "scrollStrategyListenerHolder is unavailable");
            return;
        }
        aoam aoamVar = new aoam();
        String str2 = a;
        int incrementAndGet = b.incrementAndGet();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 11);
        sb.append(str2);
        sb.append(incrementAndGet);
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int b2 = axoxVar.b(4);
            if (i < (b2 != 0 ? axoxVar.d(b2) : 0)) {
                int b3 = axoxVar.b(4);
                if (b3 != 0) {
                    aoamVar.f(axoxVar.a(axoxVar.c(b3) + (i * 4)), axoxVar.b);
                }
                IntersectionObserver intersectionObserver = null;
                if (aoamVar.U() == 1) {
                    srr srrVar = (srr) this.d.get(Integer.valueOf(aoamVar.T()));
                    if (srrVar != null) {
                        aoam c = srrVar.c(aoamVar);
                        sws a2 = swu.a();
                        a2.f = sxsVar;
                        a2.b(sxcVar);
                        a2.h = sxcVar.u;
                        intersectionObserver = srrVar.b(c, a2.a());
                    } else {
                        int T = aoamVar.T();
                        StringBuilder sb3 = new StringBuilder(41);
                        sb3.append("Unknown Flatbuffer extension: ");
                        sb3.append(T);
                        throw new syf(sb3.toString());
                    }
                } else if (aoamVar.U() == 2 && (pair = (Pair) this.e.get(Integer.valueOf(aoamVar.T()))) != null) {
                    try {
                        srs srsVar = (srs) pair.first;
                        rwh.ac(aoamVar.V(), (aopf) pair.second);
                        sws a3 = swu.a();
                        a3.f = sxsVar;
                        a3.b(sxcVar);
                        a3.h = sxcVar.u;
                        a3.a();
                        intersectionObserver = srsVar.b();
                    } catch (aoob e) {
                        syd sydVar = this.c;
                        int T2 = aoamVar.T();
                        StringBuilder sb4 = new StringBuilder(111);
                        sb4.append("Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter. Extension id: ");
                        sb4.append(T2);
                        sydVar.a(26, sb4.toString(), sxcVar, e);
                    }
                }
                if (intersectionObserver != null) {
                    arrayList.add(intersectionObserver);
                }
                i++;
            } else {
                if (arrayList.isEmpty()) {
                    return;
                }
                ssw sswVar = new ssw(atomicReference, arrayList, sb2, this.c);
                sxsVar.p(sswVar);
                sxsVar.j(sswVar);
                sxsVar.g(sswVar);
                return;
            }
        }
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
    }
}
