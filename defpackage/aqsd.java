package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsd extends aonm implements aooz {
    private static final aqsd a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private String f = "";
    private String g = "";

    static {
        aqsd aqsdVar = new aqsd();
        a = aqsdVar;
        aonm.registerDefaultInstance(aqsd.class, aqsdVar);
    }

    private aqsd() {
    }

    public static aqsc a() {
        return (aqsc) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(aqsa aqsaVar) {
        this.e = aqsaVar.e;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(aqsb aqsbVar) {
        this.d = aqsbVar.i;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", aqsb.a(), "e", aqsa.a(), "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqsd();
            case NEW_BUILDER:
                return new aqsc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqsd.class) {
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
