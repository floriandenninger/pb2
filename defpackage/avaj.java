package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avaj extends aonm implements aooz {
    public static final avaj a;
    private static volatile aopf g;
    public int b;
    public aqyg d;
    public long e;
    private aota h;
    private apmh i;
    private byte j = 2;
    public aomf c = aomf.b;
    public String f = "";

    static {
        avaj avajVar = new avaj();
        a = avajVar;
        aonm.registerDefaultInstance(avaj.class, avajVar);
    }

    private avaj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"b", "h", "c", "d", "i", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avaj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avaj.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
