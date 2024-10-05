package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancq extends aonh implements aoni {
    public static final ancq a;
    private static volatile aopf k;
    public int b;
    public ando c;
    public int e;
    public int f;
    public int g;
    public ance j;
    private byte m = 2;
    public int d = -1;
    public int h = -1;
    public aony i = emptyProtobufList();

    static {
        ancq ancqVar = new ancq();
        a = ancqVar;
        aonm.registerDefaultInstance(ancq.class, ancqVar);
    }

    private ancq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", ancr.class, "j", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ancq();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (ancq.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
