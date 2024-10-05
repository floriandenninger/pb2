package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjd extends aonm implements aooz {
    public static final aqjd a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public asuu d;
    public aqjg e;
    public boolean f;

    static {
        aqjd aqjdVar = new aqjd();
        a = aqjdVar;
        aonm.registerDefaultInstance(aqjd.class, aqjdVar);
    }

    private aqjd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqjd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqjd.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
