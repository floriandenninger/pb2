package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andz extends aonm implements aooz {
    public static final andz a;
    private static volatile aopf k;
    public int b;
    public int c;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public String d = "";
    public String f = "";
    public String j = "";

    static {
        andz andzVar = new andz();
        a = andzVar;
        aonm.registerDefaultInstance(andz.class, andzVar);
    }

    private andz() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"b", "c", ancx.c, "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new andz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (andz.class) {
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
