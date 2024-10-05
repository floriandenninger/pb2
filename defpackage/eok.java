package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eok extends aonm implements aooz {
    public static final eok a;
    private static volatile aopf n;
    public int b;
    public boolean c;
    public int d = 1380;
    public int e = 300;
    public boolean f = true;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;

    static {
        eok eokVar = new eok();
        a = eokVar;
        aonm.registerDefaultInstance(eok.class, eokVar);
    }

    private eok() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b\nဇ\t\u000bင\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new eok();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (eok.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
