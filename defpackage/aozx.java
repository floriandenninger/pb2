package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozx extends aonm implements aooz {
    public static final aozx a;
    private static volatile aopf e;
    public int b;
    public atnz c;
    public atnc d;
    private byte f = 2;

    static {
        aozx aozxVar = new aozx();
        a = aozxVar;
        aonm.registerDefaultInstance(aozx.class, aozxVar);
    }

    private aozx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ufe1a⌶ﮜ\u2dd7\u0002\u0000\u0000\u0002\ufe1a⌶ᐉ\u0000ﮜ\u2dd7ᐉ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aozx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aozx.class) {
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
