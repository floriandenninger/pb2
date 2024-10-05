package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrt extends aonm implements aooz {
    public static final atrt a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public aonu f = emptyIntList();

    static {
        atrt atrtVar = new atrt();
        a = atrtVar;
        aonm.registerDefaultInstance(atrt.class, atrtVar);
    }

    private atrt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003\u0016\u0006ဇ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atrt();
            case NEW_BUILDER:
                return new aone((float[][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atrt.class) {
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
