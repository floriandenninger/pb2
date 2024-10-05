package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apsr extends aonm implements aooz {
    public static final apsr a;
    private static volatile aopf g;
    public int b;
    public avgg c;
    public apxf d;
    public aott e;
    public int f;
    private byte h = 2;

    static {
        apsr apsrVar = new apsr();
        a = apsrVar;
        aonm.registerDefaultInstance(apsr.class, apsrVar);
    }

    private apsr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", apqr.f});
            case NEW_MUTABLE_INSTANCE:
                return new apsr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apsr.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
