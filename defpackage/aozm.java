package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozm extends aonm implements aooz {
    public static final aozm a;
    private static volatile aopf c;
    private int d;
    private aqyg e;
    private aota f;
    private byte g = 2;
    public aomf b = aomf.b;

    static {
        aozm aozmVar = new aozm();
        a = aozmVar;
        aonm.registerDefaultInstance(aozm.class, aozmVar);
    }

    private aozm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"d", "e", "f", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aozm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aozm.class) {
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
