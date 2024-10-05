package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqza extends aonm implements aooz {
    public static final aqza a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();

    static {
        aqza aqzaVar = new aqza();
        a = aqzaVar;
        aonm.registerDefaultInstance(aqza.class, aqzaVar);
    }

    private aqza() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", aqyv.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqza();
            case NEW_BUILDER:
                return new aone((short[][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqza.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
