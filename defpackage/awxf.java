package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxf extends aonm implements aooz {
    public static final awxf a;
    private static volatile aopf f;
    public int b;
    public aoqa d;
    public aoqa e;
    private String g = "";
    public aomf c = aomf.b;

    static {
        awxf awxfVar = new awxf();
        a = awxfVar;
        aonm.registerDefaultInstance(awxf.class, awxfVar);
    }

    private awxf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "g", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awxf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awxf.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
