package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anmt extends aonm implements aooz {
    public static final anmt a;
    private static volatile aopf e;
    public int b;
    public aomf c = aomf.b;
    public anmv d;

    static {
        anmt anmtVar = new anmt();
        a = anmtVar;
        aonm.registerDefaultInstance(anmt.class, anmtVar);
    }

    private anmt() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new anmt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (anmt.class) {
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
