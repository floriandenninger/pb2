package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auco extends aonm implements aooz {
    public static final auco a;
    private static volatile aopf e;
    public int b;
    public aucj c;
    public auci d;
    private aucg f;
    private aucf g;
    private byte h = 2;

    static {
        auco aucoVar = new auco();
        a = aucoVar;
        aonm.registerDefaultInstance(auco.class, aucoVar);
    }

    private auco() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb90▦\ue8d8⮯\u0004\u0000\u0000\u0004\ueb90▦ᐉ\u0000ﶯ✂ᐉ\u0001祉⮎ᐉ\u0003\ue8d8⮯ᐉ\u0002", new Object[]{"b", "f", "g", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new auco();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auco.class) {
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
