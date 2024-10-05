package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrs extends aonm implements aooz {
    public static final aqrs a;
    private static volatile aopf e;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        aqrs aqrsVar = new aqrs();
        a = aqrsVar;
        aonm.registerDefaultInstance(aqrs.class, aqrsVar);
    }

    private aqrs() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0018\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0006ဇ\u0003\u0018ဇ\u0006", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqrs.class) {
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
