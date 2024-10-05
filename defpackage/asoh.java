package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asoh extends aonm implements aooz {
    private static final asoh a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;

    static {
        asoh asohVar = new asoh();
        a = asohVar;
        aonm.registerDefaultInstance(asoh.class, asohVar);
    }

    private asoh() {
    }

    public static asog a() {
        return (asog) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(asoi asoiVar) {
        this.e = asoiVar.e;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(asoj asojVar) {
        this.d = asojVar.g;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", asoj.a(), "e", asoi.a()});
            case NEW_MUTABLE_INSTANCE:
                return new asoh();
            case NEW_BUILDER:
                return new asog();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asoh.class) {
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
