package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asas extends aonm implements aooz {
    public static final asas a;
    private static volatile aopf u;
    public int b;
    public int c;
    public int d;
    public int f;
    public asao h;
    public asar j;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public String t;
    public String e = "";
    public aonu g = emptyIntList();
    public String i = "";
    public aony k = emptyProtobufList();

    static {
        asas asasVar = new asas();
        a = asasVar;
        aonm.registerDefaultInstance(asas.class, asasVar);
    }

    private asas() {
        emptyProtobufList();
        this.s = "";
        this.t = "";
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001*\u0012\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003ဉ\u0005\u0004ဈ\u0006\u0005ဉ\b\u0006\u001b\tဋ\r\nဋ\u000e\u000bဋ\u000f\u0013ဋ\u0012\u0014ဋ\u0013\u0015ဈ\u0014\u0017ဌ\u0004\u001dဌ\u0001\u001f\u001e%ဋ\n&ဇ\t*ဈ\u0016", new Object[]{"b", "c", asaq.d, "e", "h", "i", "j", "k", asar.class, "n", "o", "p", "q", "r", "s", "f", asaq.a, "d", asaq.b, "g", asap.a(), "m", "l", "t"});
            case NEW_MUTABLE_INSTANCE:
                return new asas();
            case NEW_BUILDER:
                return new aone((short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (asas.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
