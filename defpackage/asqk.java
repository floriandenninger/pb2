package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqk extends aonm implements aooz {
    public static final asqk a;
    private static volatile aopf r;
    public int b;
    public apxf d;
    public long e;
    public avgg f;
    public aqyg g;
    public int h;
    public int i;
    public int j;
    public aqyg k;
    public String l;
    public aqyg m;
    public aqyg n;
    public avgg o;
    public int p;
    public int q;
    private aqyg s;
    private aqyg t;
    private aota u;
    private aulq v;
    private byte w = 2;
    public String c = "";

    static {
        asqk asqkVar = new asqk();
        a = asqkVar;
        aonm.registerDefaultInstance(asqk.class, asqkVar);
    }

    private asqk() {
        emptyProtobufList();
        emptyProtobufList();
        this.l = "";
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0000\u000b\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ဃ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bဈ\u000b\tᐉ\f\u000bᐉ\u000f\rᐉ\r\u000eᐉ\u0012\u000fᐉ\u0013\u0011ဋ\t\u0012ᐉ\n\u0013င\u0010\u0014င\u0011\u0016ဋ\u0007\u0017ဋ\u0006\u0018ᐉ\u0014\u001aᐉ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "l", "m", "o", "n", "s", "t", "j", "k", "p", "q", "i", "h", "u", "v"});
            case NEW_MUTABLE_INSTANCE:
                return new asqk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (asqk.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
