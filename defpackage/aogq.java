package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogq {
    public static final FloatBuffer a = aogs.b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    public static final FloatBuffer b;
    public static final FloatBuffer c;
    public static final FloatBuffer d;
    public static final FloatBuffer e;
    private static final aogp k;
    private static final aogp l;
    private static final aogp m;
    private static final aogp n;
    private static final aogp[] o;
    public int g;
    public int h;
    public int f = 0;
    public final float[] i = new float[16];
    public int j = 0;

    static {
        aogs.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        aogp aogpVar = new aogp(-1.0f, -1.0f);
        k = aogpVar;
        aogp aogpVar2 = new aogp(1.0f, -1.0f);
        l = aogpVar2;
        aogp aogpVar3 = new aogp(-1.0f, 1.0f);
        m = aogpVar3;
        aogp aogpVar4 = new aogp(1.0f, 1.0f);
        n = aogpVar4;
        aogp[] aogpVarArr = {aogpVar, aogpVar2, aogpVar3, aogpVar4};
        o = aogpVarArr;
        b = a(aogpVarArr, 0, 1, 2, 3);
        c = a(aogpVarArr, 2, 0, 3, 1);
        d = a(aogpVarArr, 3, 2, 1, 0);
        e = a(aogpVarArr, 1, 3, 0, 2);
    }

    private static FloatBuffer a(aogp[] aogpVarArr, int i, int i2, int i3, int i4) {
        aogp aogpVar = aogpVarArr[i];
        aogp aogpVar2 = aogpVarArr[i2];
        aogp aogpVar3 = aogpVarArr[i3];
        aogp aogpVar4 = aogpVarArr[i4];
        return aogs.b(aogpVar.a, aogpVar.b, aogpVar2.a, aogpVar2.b, aogpVar3.a, aogpVar3.b, aogpVar4.a, aogpVar4.b);
    }
}
