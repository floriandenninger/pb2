package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apct extends aonm implements aooz {
    public static final apct a;
    private static volatile aopf e;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        apct apctVar = new apct();
        a = apctVar;
        aonm.registerDefaultInstance(apct.class, apctVar);
    }

    private apct() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apct();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apct.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
