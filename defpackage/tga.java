package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tga {
    public final aomu a;
    public final Object b;

    private tga(aomu aomuVar, Object obj, byte[] bArr) {
        boolean z = false;
        if (aomuVar.a() >= 200000000 && aomuVar.a() < 300000000) {
            z = true;
        }
        amkq.E(z);
        this.a = aomuVar;
        this.b = obj;
    }

    public static tga a(aomu aomuVar, Object obj) {
        return new tga(aomuVar, obj);
    }

    public static tga b(aomu aomuVar, Object obj) {
        return new tga(aomuVar, obj, null);
    }

    private tga(aomu aomuVar, Object obj) {
        boolean z = false;
        if (aomuVar.a() >= 100000000 && aomuVar.a() < 200000000) {
            z = true;
        }
        amkq.E(z);
        this.a = aomuVar;
        this.b = obj;
    }
}
