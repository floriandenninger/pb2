package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atnv extends aonm implements aooz {
    public static final atnv a;
    private static volatile aopf p;
    public int b;
    public Object d;
    public avgg e;
    public avgg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public apxf j;
    public int k;
    public aomf l;
    public String m;
    public aulq n;
    public apxf o;
    private aqyg q;
    private aqyg r;
    private aota s;
    private apxf t;
    public int c = 0;
    private byte u = 2;

    static {
        atnv atnvVar = new atnv();
        a = atnvVar;
        aonm.registerDefaultInstance(atnv.class, atnvVar);
    }

    private atnv() {
        emptyProtobufList();
        this.l = aomf.b;
        this.m = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0001\u0001\u0001\u001d\u0011\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\nᐉ\u0007\u000bᐼ\u0000\fᐉ\r\rည\u000e\u000eᐉ\u000f\u000fᐉ\u0003\u0013ဈ\u0012\u0018ᐼ\u0000\u001bᐉ\u0014\u001cဌ\t\u001dᐉ\u0015", new Object[]{"d", "c", "b", "e", "f", "q", "g", "h", "i", "j", atdf.class, "s", "l", "t", "r", "m", apxf.class, "n", "k", atmj.g, "o"});
            case NEW_MUTABLE_INSTANCE:
                return new atnv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (atnv.class) {
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
