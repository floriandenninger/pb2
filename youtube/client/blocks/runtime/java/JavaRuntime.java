package youtube.client.blocks.runtime.java;

import defpackage.amkq;
import defpackage.barx;
import defpackage.bary;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class JavaRuntime {
    public static final JavaRuntime a = new JavaRuntime();
    public final Map b = amkq.aN();
    public final Map c = amkq.aI();

    private JavaRuntime() {
    }

    private native void nativeRegisterContainerManifest(byte[] bArr);

    public final barx a(String str) {
        return (barx) this.b.get(str);
    }

    public final void b(Integer num, bary baryVar) {
        Map map = (Map) Map.EL.getOrDefault(this.c, 385812508, amkq.aI());
        map.put(num, baryVar);
        this.c.put(385812508, map);
        nativeRegister(385812508, num.intValue());
    }

    public native void nativeRegister(int i, int i2);
}
