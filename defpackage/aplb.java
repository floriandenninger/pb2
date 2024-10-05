package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplb extends aonm implements aooz {
    private static final aplb a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;

    static {
        aplb aplbVar = new aplb();
        a = aplbVar;
        aonm.registerDefaultInstance(aplb.class, aplbVar);
    }

    private aplb() {
    }

    public static apla a() {
        return (apla) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(apky apkyVar) {
        this.d = apkyVar.e;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(apkz apkzVar) {
        this.e = apkzVar.d;
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", apky.a(), "e", apkz.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aplb();
            case NEW_BUILDER:
                return new apla();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aplb.class) {
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
