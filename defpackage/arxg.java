package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxg extends aonm implements aooz {
    public static final arxg a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public aqyg e;
    private byte g = 2;
    public aony d = emptyProtobufList();

    static {
        arxg arxgVar = new arxg();
        a = arxgVar;
        aonm.registerDefaultInstance(arxg.class, arxgVar);
    }

    private arxg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"b", "c", "d", aulq.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arxg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arxg.class) {
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
