package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzi extends aonm implements aooz {
    public static final aqzi a;
    private static volatile aopf f;
    public int b;
    public aulq c;
    public long d;
    public aowz e;
    private byte g = 2;

    static {
        aqzi aqziVar = new aqzi();
        a = aqziVar;
        aonm.registerDefaultInstance(aqzi.class, aqziVar);
    }

    private aqzi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဂ\u0001", new Object[]{"b", "c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqzi.class) {
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
