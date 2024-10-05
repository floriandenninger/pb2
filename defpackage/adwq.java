package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwq extends aonm implements aooz {
    public static final adwq a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aonu d = emptyIntList();

    static {
        adwq adwqVar = new adwq();
        a = adwqVar;
        aonm.registerDefaultInstance(adwq.class, adwqVar);
    }

    private adwq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"b", "c", "d", ovw.b()});
            case NEW_MUTABLE_INSTANCE:
                return new adwq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (adwq.class) {
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
