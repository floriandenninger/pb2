package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arec extends aonm implements aooz {
    public static final arec a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public boolean e;
    public aqyg f;
    public aqyg g;
    public float i;
    public areb j;
    public areb k;
    private aota m;
    public int c = 0;
    private byte n = 2;
    public aomf h = aomf.b;

    static {
        arec arecVar = new arec();
        a = arecVar;
        aonm.registerDefaultInstance(arec.class, arecVar);
    }

    private arec() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ည\u0005\u0005ᐉ\u0002\u0006ခ\u0007\u0007ᐉ\b\bᐉ\t\tဇ\u0000\u000bဿ\u0000\fြ\u0000\rြ\u0000", new Object[]{"d", "c", "b", "f", "m", "h", "g", "i", "j", "k", "e", aqze.n, apkv.class, avfc.class});
            case NEW_MUTABLE_INSTANCE:
                return new arec();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arec.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
