package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aorf extends aonm implements aooz {
    public static final aorf a;
    private static volatile aopf d;
    public aonu b = emptyIntList();
    public aony c = emptyProtobufList();

    static {
        aorf aorfVar = new aorf();
        a = aorfVar;
        aonm.registerDefaultInstance(aorf.class, aorfVar);
    }

    private aorf() {
    }

    public static aone a() {
        return a.createBuilder();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"b", aokr.d, "c", aore.class});
            case NEW_MUTABLE_INSTANCE:
                return new aorf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aorf.class) {
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
