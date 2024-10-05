package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awry extends aonm implements aooz {
    public static final awry a;
    private static volatile aopf e;
    public int b;
    public awrs d;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        awry awryVar = new awry();
        a = awryVar;
        aonm.registerDefaultInstance(awry.class, awryVar);
    }

    private awry() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "c", awrx.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awry();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awry.class) {
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
