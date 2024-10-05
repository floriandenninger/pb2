package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arug extends aonm implements aooz {
    public static final arug a;
    private static volatile aopf f;
    public Object c;
    public arnd d;
    private int g;
    private aota h;
    private aqzg i;
    public int b = 0;
    private byte j = 2;
    public aomf e = aomf.b;

    static {
        arug arugVar = new arug();
        a = arugVar;
        aonm.registerDefaultInstance(arug.class, arugVar);
    }

    private arug() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0004\u0005ည\u0005\u0006ᐼ\u0000̉ᐉ\u0006", new Object[]{"c", "b", "g", "d", aruh.class, "h", "e", apxf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arug();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arug.class) {
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
