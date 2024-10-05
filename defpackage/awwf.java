package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awwf extends aonm implements aooz {
    public static final awwf a;
    private static volatile aopf p;
    public int b;
    public aqkg c;
    public long d;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public int o;
    public aoot l = aoot.a;
    public aoot m = aoot.a;
    public aoot n = aoot.a;
    public String e = "";

    static {
        awwf awwfVar = new awwf();
        a = awwfVar;
        aonm.registerDefaultInstance(awwf.class, awwfVar);
    }

    private awwf() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0003\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007\tဇ\b\n2\u000b2\f2\rင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", awwc.a, "m", awwd.a, "n", awwe.a, "o"});
            case NEW_MUTABLE_INSTANCE:
                return new awwf();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (awwf.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
