package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnr extends aonm implements aooz {
    public static final arnr a;
    private static volatile aopf m;
    public int b;
    public int f;
    public arnn g;
    public boolean h;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";
    public String j = "";

    static {
        arnr arnrVar = new arnr();
        a = arnrVar;
        aonm.registerDefaultInstance(arnr.class, arnrVar);
    }

    private arnr() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဌ\u0004\u0006ဉ\u0006\u0007ဇ\u0007\bဈ\b\tဈ\t\nဇ\n\u000bဈ\u0003\rဌ\f", new Object[]{"b", "c", "d", "f", aufb.d, "g", "h", "i", "j", "k", "e", "l", asaq.o});
            case NEW_MUTABLE_INSTANCE:
                return new arnr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arnr.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
