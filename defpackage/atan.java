package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atan extends aonm implements aooz {
    public static final atan a;
    private static volatile aopf o;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public aszt g;
    public boolean h;
    public int i;
    public int j;
    public long k;
    public atag l;
    public String m = "";
    public long n;

    static {
        atan atanVar = new atan();
        a = atanVar;
        aonm.registerDefaultInstance(atan.class, atanVar);
    }

    private atan() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004ဂ\u0003\u0006ဇ\u0005\u0007ဉ\u0006\bဇ\u0007\tဌ\b\nင\t\fဂ\u000b\rဉ\f\u000eဈ\r\u000fဂ\u000e", new Object[]{"b", "c", asvv.u, "d", asvv.l, "e", "f", "g", "h", "i", atbi.a(), "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new atan();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (atan.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
