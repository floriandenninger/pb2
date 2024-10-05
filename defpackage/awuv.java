package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awuv extends aonm implements aooz {
    public static final awuv a;
    private static volatile aopf h;
    public int b;
    public boolean f;
    public long c = -1;
    public aomf d = aomf.b;
    public long e = -1;
    public long g = 10000;

    static {
        awuv awuvVar = new awuv();
        a = awuvVar;
        aonm.registerDefaultInstance(awuv.class, awuvVar);
    }

    private awuv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awuv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awuv.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
