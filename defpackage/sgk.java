package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgk extends aonm implements aooz {
    private static final sgk a;
    private static volatile aopf b;
    private int c;
    private int d;
    private long e;

    static {
        sgk sgkVar = new sgk();
        a = sgkVar;
        aonm.registerDefaultInstance(sgk.class, sgkVar);
    }

    private sgk() {
    }

    public static sgj a() {
        return (sgj) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(edt edtVar) {
        this.d = edtVar.getNumber();
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        this.c |= 2;
        this.e = j;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", edt.b(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new sgk();
            case NEW_BUILDER:
                return new sgj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (sgk.class) {
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
