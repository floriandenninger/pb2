package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcl extends aonm implements aooz {
    public static final awcl a;
    private static volatile aopf o;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apxf h;
    public int k;
    public atdf l;
    private avrx p;
    private aulq q;
    private aota r;
    private byte s = 2;
    public aony i = emptyProtobufList();
    public aony j = emptyProtobufList();
    public String m = "";
    public aomf n = aomf.b;

    static {
        awcl awclVar = new awcl();
        a = awclVar;
        aonm.registerDefaultInstance(awcl.class, awclVar);
    }

    private awcl() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\r\u0007ည\u000e\tЛ\nЛ\u000bဌ\b\fᐉ\t\rဈ\n\u000eᐉ\u0003\u000fᐉ\u0005\u0010ᐉ\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "r", "n", "i", avfv.class, "j", awci.class, "k", avya.r, "l", "m", "f", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new awcl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (awcl.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
