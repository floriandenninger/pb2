package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbw extends aonm implements aooz {
    public static final aqbw a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public Object f;
    public aqyg g;
    public aqyg h;
    public aqby i;
    public aqbx j;
    public aqbt k;
    public aqbu l;
    public aomf m;
    private apjt o;
    private aqyg p;
    private aota q;
    public int c = 0;
    public int e = 0;
    private byte r = 2;

    static {
        aqbw aqbwVar = new aqbw();
        a = aqbwVar;
        aonm.registerDefaultInstance(aqbw.class, aqbwVar);
    }

    private aqbw() {
        emptyProtobufList();
        this.m = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0002\u0001\u0001\u0017\u0011\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐼ\u0000\u0005ᐼ\u0001\u0006ᐼ\u0001\u0007ᐉ\u0013\bည\u0014\nᐉ\u0003\u000bᐉ\u0004\rဉ\r\u000eᐼ\u0001\u0010ᐼ\u0000\u0011ဉ\u000f\u0012ဉ\u0010\u0014ᐼ\u0001\u0017ᐼ\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", apxf.class, aqyg.class, aqyg.class, "q", "m", "o", "p", "j", aqbv.class, apxf.class, "k", "l", arfs.class, aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqbw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aqbw.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
