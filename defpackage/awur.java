package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awur extends aonm implements aooz {
    public static final awur a;
    private static volatile aopf f;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        awur awurVar = new awur();
        a = awurVar;
        aonm.registerDefaultInstance(awur.class, awurVar);
    }

    private awur() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဈ\u0001\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awur();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awur.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
