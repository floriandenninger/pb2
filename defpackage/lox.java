package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lox extends aonm implements aooz {
    public static final lox a;
    private static volatile aopf r;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        lox loxVar = new lox();
        a = loxVar;
        aonm.registerDefaultInstance(lox.class, loxVar);
    }

    private lox() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\n\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u000e\u000fဇ\t", new Object[]{"b", "c", avzr.a(), "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new lox();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (lox.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
