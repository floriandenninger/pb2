package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asav extends aonm implements aooz {
    public static final asav a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public asat e;
    private aqzg g;
    private byte h = 2;
    public aony d = emptyProtobufList();

    static {
        asav asavVar = new asav();
        a = asavVar;
        aonm.registerDefaultInstance(asav.class, asavVar);
    }

    private asav() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0003Л\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"b", "c", "d", apxf.class, "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asav();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asav.class) {
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
