package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotm extends aonm implements aooz {
    public static final aotm a;
    private static volatile aopf d;
    public anbj b;
    private int e;
    private aota f;
    private byte g = 2;
    public aomf c = aomf.b;

    static {
        aotm aotmVar = new aotm();
        a = aotmVar;
        aonm.registerDefaultInstance(aotm.class, aotmVar);
    }

    private aotm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"e", "b", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aotm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aotm.class) {
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
