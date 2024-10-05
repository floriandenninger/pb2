package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmb extends aonm implements aooz {
    private static final apmb a;
    private static volatile aopf b;
    private int c;
    private int e;
    private boolean g;
    private String d = "";
    private String f = "";

    static {
        apmb apmbVar = new apmb();
        a = apmbVar;
        aonm.registerDefaultInstance(apmb.class, apmbVar);
    }

    private apmb() {
    }

    public static apma a() {
        return (apma) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        this.c |= 2;
        this.e = i;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apmb();
            case NEW_BUILDER:
                return new apma();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apmb.class) {
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
