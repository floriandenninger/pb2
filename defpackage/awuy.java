package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awuy extends aonm implements aooz {
    public static final awuy a;
    private static volatile aopf l;
    public int b;
    public int g;
    public long h;
    public awvc i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        awuy awuyVar = new awuy();
        a = awuyVar;
        aonm.registerDefaultInstance(awuy.class, awuyVar);
    }

    private awuy() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဃ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", awnx.r, "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new awuy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (awuy.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
