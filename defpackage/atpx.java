package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpx extends aonm implements aooz {
    public static final atpx a;
    private static volatile aopf j;
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean i;
    public String c = "";
    public String h = "";

    static {
        atpx atpxVar = new atpx();
        a = atpxVar;
        aonm.registerDefaultInstance(atpx.class, atpxVar);
    }

    private atpx() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဇ\u0004\u0006ဌ\u0006\u0007ဋ\u0002\bဈ\u0007\tဇ\b", new Object[]{"b", "c", "d", "f", "g", atnn.q, "e", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atpx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atpx.class) {
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
