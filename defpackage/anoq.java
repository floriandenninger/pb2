package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anoq extends aonm implements aooz {
    public static final anoq a;
    private static volatile aopf j;
    public int b;
    public anor c;
    public aomf d = aomf.b;
    public aomf e = aomf.b;
    public aomf f = aomf.b;
    public aomf g = aomf.b;
    public aomf h = aomf.b;
    public aomf i = aomf.b;

    static {
        anoq anoqVar = new anoq();
        a = anoqVar;
        aonm.registerDefaultInstance(anoq.class, anoqVar);
    }

    private anoq() {
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
                return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new anoq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (anoq.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
