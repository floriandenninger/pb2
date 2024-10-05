package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aruo extends aonm implements aooz {
    public static final aruo a;
    private static volatile aopf c;
    public arnd b;
    private int d;
    private assq e;
    private arup f;
    private byte g = 2;

    static {
        aruo aruoVar = new aruo();
        a = aruoVar;
        aonm.registerDefaultInstance(aruo.class, aruoVar);
    }

    private aruo() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"d", "b", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aruo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aruo.class) {
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
