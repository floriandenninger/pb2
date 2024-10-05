package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcn extends aonm implements aooz {
    public static final awcn a;
    private static volatile aopf p;
    public int b;
    public avgg c;
    public apxf d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apkd h;
    public awbw j;
    public aulq k;
    public awby m;
    public aott n;
    private avrx q;
    private aota r;
    private byte s = 2;
    public aony i = emptyProtobufList();
    public String l = "";
    public aomf o = aomf.b;

    static {
        awcn awcnVar = new awcn();
        a = awcnVar;
        aonm.registerDefaultInstance(awcn.class, awcnVar);
    }

    private awcn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\f\u0007ည\r\bᐉ\u0006\tЛ\nᐉ\u0007\u000bᐉ\n\fဉ\u000b\rᐉ\u0005\u000eᐉ\b\u000fဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "r", "o", "h", "i", avfv.class, "j", "m", "n", "q", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new awcn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (awcn.class) {
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
