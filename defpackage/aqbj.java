package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbj extends aonh implements aoni {
    public static final aqbj a;
    private static volatile aopf o;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public apxf g;
    public aqbk h;
    public atdf k;
    public aomf m;
    public aulq n;
    private aqyg p;
    private auzs q;
    private aota r;
    private arar s;
    private byte t = 2;
    public aony i = emptyProtobufList();
    public aony j = emptyProtobufList();

    static {
        aqbj aqbjVar = new aqbj();
        a = aqbjVar;
        aonm.registerDefaultInstance(aqbj.class, aqbjVar);
    }

    private aqbj() {
        emptyProtobufList();
        this.m = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0002\u000e\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\u0003\nᐉ\f\u000bᐉ\b\fЛ\rЛ\u000eည\r\u0011ᐉ\u000f\u0013ᐉ\t\u0015ᐉ\u0011", new Object[]{"b", "c", "p", "e", "f", "g", "q", "d", "r", "h", "i", apjt.class, "j", apjt.class, "m", "s", "k", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqbj.class) {
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
