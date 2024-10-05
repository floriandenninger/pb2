package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhp extends aonh implements aoni {
    public static final awhp a;
    private static volatile aopf d;
    public aqyg c;
    private int e;
    private aota f;
    private byte g = 2;
    public aomf b = aomf.b;

    static {
        awhp awhpVar = new awhp();
        a = awhpVar;
        aonm.registerDefaultInstance(awhp.class, awhpVar);
    }

    private awhp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ည\u0000\u0004ᐉ\u0004\u0005ᐉ\u0006", new Object[]{"e", "b", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awhp();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awhp.class) {
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
