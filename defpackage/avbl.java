package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbl extends aonm implements aooz {
    public static final avbl a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public int e;
    public avbn f;
    private aqyg h;
    private byte i = 2;
    public aony d = emptyProtobufList();

    static {
        avbl avblVar = new avbl();
        a = avblVar;
        aonm.registerDefaultInstance(avbl.class, avblVar);
    }

    private avbl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဋ\u0003\u0005ဉ\u0005", new Object[]{"b", "c", "h", "d", aqyg.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avbl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avbl.class) {
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
