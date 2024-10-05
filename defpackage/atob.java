package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atob extends aonm implements aooz {
    public static final atob a;
    private static volatile aopf e;
    public boolean b;
    public long c;
    public long d;
    private int f;

    static {
        atob atobVar = new atob();
        a = atobVar;
        aonm.registerDefaultInstance(atob.class, atobVar);
    }

    private atob() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atob();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atob.class) {
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
