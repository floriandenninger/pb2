package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awss extends aonm implements aooz {
    private static final awss a;
    private static volatile aopf b;
    private int c;
    private awsn d;
    private awrt e;
    private byte f = 2;

    static {
        awss awssVar = new awss();
        a = awssVar;
        aonm.registerDefaultInstance(awss.class, awssVar);
    }

    private awss() {
    }

    public static awsr a() {
        return (awsr) a.createBuilder();
    }

    public static /* synthetic */ void c(awss awssVar, awsn awsnVar) {
        awssVar.e(awsnVar);
    }

    public static /* synthetic */ void d(awss awssVar, awrt awrtVar) {
        awssVar.f(awrtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(awsn awsnVar) {
        this.d = awsnVar;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(awrt awrtVar) {
        this.e = awrtVar;
        this.c |= 2;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awss();
            case NEW_BUILDER:
                return new awsr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awss.class) {
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
