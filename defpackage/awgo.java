package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awgo extends aonm implements aooz {
    public static final awgo a;
    private static volatile aopf e;
    public int b;
    public awgl d;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        awgo awgoVar = new awgo();
        a = awgoVar;
        aonm.registerDefaultInstance(awgo.class, awgoVar);
    }

    private awgo() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001Л\u0003ᐉ\u0000", new Object[]{"b", "c", awgp.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awgo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awgo.class) {
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
