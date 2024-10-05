package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhw extends aonm implements aooz {
    public static final arhw a;
    private static volatile aopf r;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public apxf g;
    public asnj h;
    public atdf i;
    public aqyg j;
    public aqyg k;
    public aulq l;
    public aulq m;
    public aony n;
    public arhu o;
    public aulq p;
    public aqyg q;
    private apmn s;
    private aota t;
    private aqyg u;
    private aria v;
    private arhv w;
    private byte x = 2;

    static {
        arhw arhwVar = new arhw();
        a = arhwVar;
        aonm.registerDefaultInstance(arhw.class, arhwVar);
    }

    private arhw() {
        aomf aomfVar = aomf.b;
        this.n = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0001\u0014\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\u000bᐉ\u000b\fᐉ\f\rᐉ\u000e\u000fᐉ\u0001\u0010Л\u0011ᐉ\u0011\u0013ᐉ\u0012\u0014ᐉ\r\u0015ᐉ\u0013\u0016ᐉ\u0010\u0017ᐉ\u000f\u0018ᐉ\u0014", new Object[]{"b", "c", "e", "f", "g", "h", "s", "i", "t", "u", "j", "v", "d", "n", apjt.class, "o", "w", "k", "p", "m", "l", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new arhw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (arhw.class) {
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
