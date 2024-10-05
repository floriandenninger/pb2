package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awvj extends aonm implements aooz {
    public static final awvj a;
    private static volatile aopf h;
    public int b;
    public long c;
    public long d;
    public aonu e = emptyIntList();
    public aonu f = emptyIntList();
    public long g;

    static {
        awvj awvjVar = new awvj();
        a = awvjVar;
        aonm.registerDefaultInstance(awvj.class, awvjVar);
    }

    private awvj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u0016\u0004\u0016\u0005ဂ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awvj();
            case NEW_BUILDER:
                return new aone((byte[]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awvj.class) {
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
