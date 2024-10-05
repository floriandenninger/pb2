package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsm extends aonm implements aooz {
    private static final awsm a;
    private static volatile aopf b;
    private int c;
    private awsn d;
    private String e = "";

    static {
        awsm awsmVar = new awsm();
        a = awsmVar;
        aonm.registerDefaultInstance(awsm.class, awsmVar);
    }

    private awsm() {
    }

    public static awsl a() {
        return (awsl) a.createBuilder();
    }

    public static /* synthetic */ awsm b() {
        return a;
    }

    public void e(awsn awsnVar) {
        awsnVar.getClass();
        this.d = awsnVar;
        this.c |= 1;
    }

    public void f(String str) {
        str.getClass();
        this.c |= 2;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awsm();
            case NEW_BUILDER:
                return new awsl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awsm.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
