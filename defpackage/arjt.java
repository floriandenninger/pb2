package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjt extends aonh implements aoni {
    public static final arjt a;
    private static volatile aopf t;
    public int b;
    public arnb c;
    public atnd h;
    public boolean i;
    public arjp j;
    public aqej k;
    public boolean m;
    public int p;
    public aqkg q;
    public arju r;
    public atbc s;
    private aryo u;
    private byte v = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aonu n = emptyIntList();
    public aony o = emptyProtobufList();

    static {
        arjt arjtVar = new arjt();
        a = arjtVar;
        aonm.registerDefaultInstance(arjt.class, arjtVar);
    }

    private arjt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001%\u0011\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဈ\u0004\nᐉ\t\u000bဈ\u0003\u000fဇ\r\u0012ဉ\u0010\u0017ဉ\u0015\u0019ဇ\u0016\u001aဉ\u000b\u001b\u0016\u001c\u001b\u001dဌ\u0017 ဉ\u001a!ဉ\u001b%ဉ\u001d", new Object[]{"b", "c", "d", "e", "g", "u", "f", "i", "j", "k", "m", "h", "n", "o", auix.class, "p", argn.i, "q", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new arjt();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (arjt.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
