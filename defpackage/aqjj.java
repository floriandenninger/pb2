package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjj extends aonm implements aooz {
    public static final aqjj a;
    private static volatile aopf g;
    public boolean b;
    public aqji c;
    public aqji d;
    public aqji e;
    public aqji f;
    private int h;

    static {
        aqjj aqjjVar = new aqjj();
        a = aqjjVar;
        aonm.registerDefaultInstance(aqjj.class, aqjjVar);
    }

    private aqjj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001Ɛ\u0005\u0000\u0000\u0000\u0001ဇ\u0000dဉ\u0001Èဉ\u0002Ĭဉ\u0003Ɛဉ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqjj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqjj.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
