package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoka extends aonm implements aooz {
    public static final aoka a;
    private static volatile aopf h;
    public int f;
    private int i;
    public String b = "";
    public String c = "";
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        aoka aokaVar = new aoka();
        a = aokaVar;
        aonm.registerDefaultInstance(aoka.class, aokaVar);
    }

    private aoka() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002\u0006\u001b", new Object[]{"i", "b", "c", "d", aoki.class, "e", aojx.class, "f", aoib.o, "g", aoki.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoka();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aoka.class) {
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
