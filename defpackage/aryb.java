package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryb extends aonm implements aooz {
    public static final aryb a;
    private static volatile aopf k;
    public int b;
    public long d;
    public long e;
    public boolean g;
    public boolean h;
    public arya j;
    public String c = "";
    public String f = "";
    public aomf i = aomf.b;

    static {
        aryb arybVar = new aryb();
        a = arybVar;
        aonm.registerDefaultInstance(aryb.class, arybVar);
    }

    private aryb() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bည\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aryb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aryb.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
