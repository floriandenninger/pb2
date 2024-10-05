package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arky extends aonm implements aooz {
    public static final arky a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public aulp d;
    public aomf e;
    private aqfv g;
    private avyh h;
    private byte i = 2;

    static {
        arky arkyVar = new arky();
        a = arkyVar;
        aonm.registerDefaultInstance(arky.class, arkyVar);
    }

    private arky() {
        emptyProtobufList();
        this.e = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ည\u0004", new Object[]{"b", "c", "g", "h", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arky();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arky.class) {
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
