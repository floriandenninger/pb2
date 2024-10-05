package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aobt extends aonm implements aooz {
    public static final aobt a;
    private static volatile aopf f;
    public aocq b;
    public aocb c;
    public aobs d;
    public String e;

    static {
        aobt aobtVar = new aobt();
        a = aobtVar;
        aonm.registerDefaultInstance(aobt.class, aobtVar);
    }

    private aobt() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006Ȉ", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aobt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aobt.class) {
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
