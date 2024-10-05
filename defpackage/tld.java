package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tld extends aonm implements aooz {
    public static final tld a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        tld tldVar = new tld();
        a = tldVar;
        aonm.registerDefaultInstance(tld.class, tldVar);
    }

    private tld() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new tld();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (tld.class) {
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
