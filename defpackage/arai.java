package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arai extends aonm implements aooz {
    public static final arai a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aqyg e;
    private aqyg f;
    private arat g;
    private atco h;
    private aulq i;
    private byte j = 2;

    static {
        arai araiVar = new arai();
        a = araiVar;
        aonm.registerDefaultInstance(arai.class, araiVar);
    }

    private arai() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0013\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\rᐉ\b\u0013ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arai();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arai.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
