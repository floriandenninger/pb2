package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsq extends aonm implements aooz {
    private static final awsq a;
    private static volatile aopf b;
    private int c;
    private String d = "";

    static {
        awsq awsqVar = new awsq();
        a = awsqVar;
        aonm.registerDefaultInstance(awsq.class, awsqVar);
    }

    private awsq() {
    }

    public static awsp a() {
        return (awsp) a.createBuilder();
    }

    public static /* synthetic */ void c(awsq awsqVar, String str) {
        awsqVar.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awsq();
            case NEW_BUILDER:
                return new awsp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awsq.class) {
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
