package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apiq extends aonm implements aooz {
    public static final apiq a;
    private static volatile aopf d;
    public avgg b;
    private int e;
    private apxf f;
    private aota g;
    private byte h = 2;
    public aomf c = aomf.b;

    static {
        apiq apiqVar = new apiq();
        a = apiqVar;
        aonm.registerDefaultInstance(apiq.class, apiqVar);
    }

    private apiq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ည\u0005\u0004ᐉ\u0002", new Object[]{"e", "b", "g", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apiq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apiq.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
