package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class own extends aonm implements aooz {
    public static final own a;
    private static volatile aopf k;
    public int e;
    public int h;
    public int i;
    private int l;
    public String b = "";
    public aony c = aonm.emptyProtobufList();
    public String d = "";
    public aony f = aonm.emptyProtobufList();
    public String g = "";
    public aonu j = emptyIntList();

    static {
        own ownVar = new own();
        a = ownVar;
        aonm.registerDefaultInstance(own.class, ownVar);
    }

    private own() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001Ϫ\t\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\bဌ\u0002\n\u001a\u000bဈ\u0003\rင\u0004ϩင\u0005Ϫ\u0016", new Object[]{"l", "b", "c", "d", "e", dvg.n, "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new own();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (own.class) {
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
