package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoiv extends aonm implements aooz {
    public static final aoiv a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();
    public aony e;
    public aoko f;

    static {
        aoiv aoivVar = new aoiv();
        a = aoivVar;
        aonm.registerDefaultInstance(aoiv.class, aoivVar);
    }

    private aoiv() {
        emptyProtobufList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0004\u001b\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", aoil.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoiv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoiv.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
