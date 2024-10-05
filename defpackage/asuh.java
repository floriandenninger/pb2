package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asuh extends aonh implements aoni {
    public static final aonv a = new uct(20);
    public static final asuh b;
    private static volatile aopf j;
    public int c;
    public awau e;
    public arbe f;
    public apvd h;
    public awxj i;
    private byte k = 2;
    public aomf d = aomf.b;
    public aonu g = emptyIntList();

    static {
        asuh asuhVar = new asuh();
        b = asuhVar;
        aonm.registerDefaultInstance(asuh.class, asuhVar);
    }

    private asuh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0001\u0001ည\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u001e\u0007ဉ\u0003\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", asum.a(), "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asuh();
            case NEW_BUILDER:
                return new aong(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asuh.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
