package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnd extends aonm implements aooz {
    public static final asnd a;
    private static volatile aopf j;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private int k;

    static {
        asnd asndVar = new asnd();
        a = asndVar;
        aonm.registerDefaultInstance(asnd.class, asndVar);
    }

    private asnd() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0012\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0006ဇ\u0005\fဇ\n\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဇ\u0010", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asnd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asnd.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
