package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoit extends aonm implements aooz {
    public static final aoit a;
    private static volatile aopf f;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();
    public aoko e;

    static {
        aoit aoitVar = new aoit();
        a = aoitVar;
        aonm.registerDefaultInstance(aoit.class, aoitVar);
    }

    private aoit() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"b", "c", "d", aois.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoit();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoit.class) {
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
