package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdt extends aonm implements aooz {
    public static final aqdt a;
    private static volatile aopf v;
    public int b;
    public aqyg c;
    public avgg d;
    public arfs e;
    public apmh h;
    public apmh i;
    public aota j;
    public aqyg m;
    public aomf n;
    public aony o;
    public aqyg p;
    public aqyg q;
    public apxf r;
    public apxf s;
    public apxf t;
    public aqyg u;
    private aqyg w;
    private apxf x;
    private byte y = 2;
    public String f = "";
    public aony g = emptyProtobufList();
    public aony k = emptyProtobufList();
    public aony l = emptyProtobufList();

    static {
        aqdt aqdtVar = new aqdt();
        a = aqdtVar;
        aonm.registerDefaultInstance(aqdt.class, aqdtVar);
    }

    private aqdt() {
        emptyProtobufList();
        this.n = aomf.b;
        this.o = emptyProtobufList();
        emptyProtobufList();
    }

    public final void a() {
        aony aonyVar = this.g;
        if (aonyVar.c()) {
            return;
        }
        this.g = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u001f\u0015\u0000\u0004\u0013\u0001ᐉ\u0000\u0002ᐉ\u001a\u0003ᐉ\u0015\u0004ᐉ\u0016\u0005ᐉ\u0017\u0006ᐉ\n\u0007ည\u0012\bЛ\tᐉ\u0018\nᐉ\u0019\fᐉ\u0005\rᐉ\u0006\u000eᐉ\u0001\u0010ᐉ\u0003\u0012ဈ\u0004\u0017Л\u0018Л\u0019Л\u001cᐉ\r\u001eᐉ\u000e\u001fᐉ\u000f", new Object[]{"b", "c", "u", "p", "q", "r", "j", "n", "g", aqyg.class, "s", "t", "h", "i", "d", "e", "f", "o", apxf.class, "k", apxf.class, "l", apxf.class, "w", "x", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdt();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (aqdt.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
