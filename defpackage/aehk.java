package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehk extends aonm implements aooz {
    public static final aehk a;
    private static volatile aopf h;
    public int b;
    public int f;
    private int i;
    public String c = "";
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;
    public String g = "";

    static {
        aehk aehkVar = new aehk();
        a = aehkVar;
        aonm.registerDefaultInstance(aehk.class, aehkVar);
    }

    private aehk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0001\u0000\u0002ဍ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ည\u0003\u0006ဍ\u0004\u0007ဈ\u0005", new Object[]{"i", "b", "c", "d", aegl.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aehk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aehk.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
