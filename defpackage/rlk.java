package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlk extends aonm implements aooz {
    public static final rlk a;
    private static volatile aopf d;
    public aony b = emptyProtobufList();
    public rli c;
    private int e;

    static {
        rlk rlkVar = new rlk();
        a = rlkVar;
        aonm.registerDefaultInstance(rlk.class, rlkVar);
    }

    private rlk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"e", "b", rll.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new rlk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (rlk.class) {
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
