package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlj extends aonm implements aooz {
    public static final arlj a;
    private static volatile aopf m;
    public int b;
    public int c;
    public int d;
    public aqyg e;
    public apxf f;
    public arlk g;
    public apmh h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    private aqyg n;
    private apxf o;
    private byte p = 2;

    static {
        arlj arljVar = new arlj();
        a = arljVar;
        aonm.registerDefaultInstance(arlj.class, arljVar);
    }

    private arlj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0006\u0001ဌ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bဌ\b\tဂ\t\nᐉ\u0005\fဇ\u000b\rဇ\f", new Object[]{"b", "c", argn.t, "d", argn.s, "e", "n", "o", "g", "h", "i", apyk.a(), "j", "f", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new arlj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arlj.class) {
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
