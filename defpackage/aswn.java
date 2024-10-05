package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswn extends aonm implements aooz {
    public static final aswn a;
    private static volatile aopf e;
    public int b;
    public arnd c;
    public apxf d;
    private aqzg f;
    private byte g = 2;

    static {
        aswn aswnVar = new aswn();
        a = aswnVar;
        aonm.registerDefaultInstance(aswn.class, aswnVar);
    }

    private aswn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002̉ᐉ\u0003", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aswn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aswn.class) {
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
