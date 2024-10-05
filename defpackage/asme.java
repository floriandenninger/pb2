package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asme extends aonm implements aooz {
    public static final asme a;
    private static volatile aopf m;
    public int b;
    public String c = "";
    public String d = "";
    public long e;
    public long f;
    public asmm g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;

    static {
        asme asmeVar = new asme();
        a = asmeVar;
        aonm.registerDefaultInstance(asme.class, asmeVar);
    }

    private asme() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007\tဂ\b\nဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", asje.d});
            case NEW_MUTABLE_INSTANCE:
                return new asme();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asme.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
