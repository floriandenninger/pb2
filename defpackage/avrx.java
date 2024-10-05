package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avrx extends aonm implements aooz {
    public static final avrx a;
    private static volatile aopf d;
    public long b;
    public aqyg c;
    private int e;
    private byte f = 2;

    static {
        avrx avrxVar = new avrx();
        a = avrxVar;
        aonm.registerDefaultInstance(avrx.class, avrxVar);
    }

    private avrx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဃ\u0000\u0003ᐉ\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avrx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avrx.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
