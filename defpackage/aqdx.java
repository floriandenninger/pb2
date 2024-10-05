package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdx extends aonm implements aooz {
    public static final aqdx a;
    private static volatile aopf f;
    public int b;
    public aqdy c;
    public aqdw d;
    public aqdz e;
    private byte g = 2;

    static {
        aqdx aqdxVar = new aqdx();
        a = aqdxVar;
        aonm.registerDefaultInstance(aqdx.class, aqdxVar);
    }

    private aqdx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue5ee⮼\ue4e4⮿\u0003\u0000\u0000\u0003\ue5ee⮼ᐉ\u0002︣⮼ᐉ\u0001\ue4e4⮿ᐉ\u0000", new Object[]{"b", "e", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqdx.class) {
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
