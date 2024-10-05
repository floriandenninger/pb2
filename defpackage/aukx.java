package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aukx extends aonm implements aooz {
    public static final aukx a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public apxf d;
    public arfs e;
    public auky f;
    private aota i;
    private byte j = 2;
    public aomf g = aomf.b;

    static {
        aukx aukxVar = new aukx();
        a = aukxVar;
        aonm.registerDefaultInstance(aukx.class, aukxVar);
    }

    private aukx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ည\u0005\u0005ᐉ\u0006\u0006ᐉ\u0003\u0007ဉ\u0004", new Object[]{"b", "c", "d", "g", "i", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aukx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aukx.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
