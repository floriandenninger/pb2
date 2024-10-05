package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoha extends aonm implements aooz {
    public static final aoha a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;

    static {
        aoha aohaVar = new aoha();
        a = aohaVar;
        aonm.registerDefaultInstance(aoha.class, aohaVar);
    }

    private aoha() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002", new Object[]{"b", "c", "d", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoha();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aoha.class) {
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
