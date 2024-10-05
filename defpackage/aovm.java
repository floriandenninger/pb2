package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aovm extends aonm implements aooz {
    public static final aovm a;
    private static volatile aopf e;
    public aqyg b;
    public aqyg c;
    public aqrh d;
    private int f;
    private aqyg g;
    private aulq h;
    private byte i = 2;

    static {
        aovm aovmVar = new aovm();
        a = aovmVar;
        aonm.registerDefaultInstance(aovm.class, aovmVar);
    }

    private aovm() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"f", "g", "b", "c", "h", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aovm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aovm.class) {
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
