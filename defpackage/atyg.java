package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyg extends aonm implements aooz {
    public static final atyg a;
    private static volatile aopf v;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public apex o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private int w;
    private int x;

    static {
        atyg atygVar = new atyg();
        a = atygVar;
        aonm.registerDefaultInstance(atyg.class, atygVar);
    }

    private atyg() {
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0002\u0002\uf119觉\u0014\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0012ဂ\u0011\u0019င\u0016\u001fဇ\u001c ဇ\u001d$ဇ )ဇ$.ဇ)/ဇ*1ဇ,7ဇ2?ဇ9@ဇ:\uf119觉ဉ&", new Object[]{"w", "x", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new atyg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (atyg.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
