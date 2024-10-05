package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlj extends aonm implements aooz {
    public static final rlj a;
    private static volatile aopf d;
    public String b = "";
    public aony c = emptyProtobufList();
    private int e;

    static {
        rlj rljVar = new rlj();
        a = rljVar;
        aonm.registerDefaultInstance(rlj.class, rljVar);
    }

    private rlj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", rll.class});
            case NEW_MUTABLE_INSTANCE:
                return new rlj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (rlj.class) {
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
