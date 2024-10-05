package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxb extends aonm implements aooz {
    public static final aoxb a;
    private static volatile aopf e;
    public String b = "";
    public int c;
    public aowz d;
    private int f;

    static {
        aoxb aoxbVar = new aoxb();
        a = aoxbVar;
        aonm.registerDefaultInstance(aoxb.class, aoxbVar);
    }

    private aoxb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", "c", apac.a(), "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoxb.class) {
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
