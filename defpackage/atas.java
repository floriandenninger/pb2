package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atas extends aonm implements aooz {
    public static final atas a;
    private static volatile aopf m;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public aszt f;
    public boolean g;
    public int h;
    public atag i;
    public String j = "";
    public long k;
    public atag l;

    static {
        atas atasVar = new atas();
        a = atasVar;
        aonm.registerDefaultInstance(atas.class, atasVar);
    }

    private atas() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007ဌ\u0006\bဉ\u0007\tဈ\b\nဂ\t\u000bဉ\n", new Object[]{"b", "c", asvv.u, "d", asvv.l, "e", "f", "g", "h", atbj.a(), "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atas();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atas.class) {
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
