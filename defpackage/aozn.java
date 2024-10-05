package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozn extends aonm implements aooz {
    public static final aozn a;
    private static volatile aopf c;
    private int d;
    private apmh e;
    private aqyg f;
    private aota g;
    private byte h = 2;
    public aomf b = aomf.b;

    static {
        aozn aoznVar = new aozn();
        a = aoznVar;
        aonm.registerDefaultInstance(aozn.class, aoznVar);
    }

    private aozn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"d", "e", "f", "b", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aozn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aozn.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
