package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyd extends aonm implements aooz {
    public static final aoyd a;
    private static volatile aopf d;
    public aony b = emptyProtobufList();
    public aoyc c;
    private int e;

    static {
        aoyd aoydVar = new aoyd();
        a = aoydVar;
        aonm.registerDefaultInstance(aoyd.class, aoydVar);
    }

    private aoyd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"e", "b", asus.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aoyd.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
