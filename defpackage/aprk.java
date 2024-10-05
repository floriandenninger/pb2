package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aprk extends aonm implements aooz {
    public static final aprk a;
    private static volatile aopf k;
    public int b;
    public aprm c;
    public aprm d;
    public apro e;
    public apro f;
    public apro g;
    public aqyg h;
    public aqyg j;
    private byte l = 2;
    public aony i = emptyProtobufList();

    static {
        aprk aprkVar = new aprk();
        a = aprkVar;
        aonm.registerDefaultInstance(aprk.class, aprkVar);
    }

    private aprk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0015\b\u0000\u0001\b\u0001ᐉ\u0000\u000eᐉ\u0002\u000fᐉ\u0004\u0010ᐉ\u0005\u0011Л\u0012ᐉ\u0006\u0013ᐉ\u0001\u0015ᐉ\u0003", new Object[]{"b", "c", "e", "g", "h", "i", aprj.class, "j", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aprk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aprk.class) {
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
