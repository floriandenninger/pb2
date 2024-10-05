package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovu extends aonm implements aooz {
    public static final ovu a;
    private static volatile aopf h;
    public int b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public String c = "";
    private String i = "";

    static {
        ovu ovuVar = new ovu();
        a = ovuVar;
        aonm.registerDefaultInstance(ovu.class, ovuVar);
    }

    private ovu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0000\bဇ\u0006", new Object[]{"b", "i", "d", "e", "f", "c", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ovu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (ovu.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
