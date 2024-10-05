package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmr extends aonm implements aooz {
    public static final awmr a;
    private static volatile aopf f;
    public int d;
    private int g;
    public String b = "";
    public String c = "";
    public aony e = aonm.emptyProtobufList();

    static {
        awmr awmrVar = new awmr();
        a = awmrVar;
        aonm.registerDefaultInstance(awmr.class, awmrVar);
    }

    private awmr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u001a", new Object[]{"g", "b", "c", "d", aweb.p, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awmr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awmr.class) {
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
