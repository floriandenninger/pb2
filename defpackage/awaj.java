package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awaj extends aonm implements aooz {
    public static final awaj a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    public aqyg d;
    private aqyg f;
    private aqyg g;
    private byte h = 2;

    static {
        awaj awajVar = new awaj();
        a = awajVar;
        aonm.registerDefaultInstance(awaj.class, awajVar);
    }

    private awaj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "g", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awaj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awaj.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
