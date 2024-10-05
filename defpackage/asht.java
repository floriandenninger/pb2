package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asht extends aonm implements aooz {
    private static volatile aopf I;
    public static final asht a;
    public ashn A;
    public asil B;
    public asim C;
    public aqah D;
    public asic E;
    public ashw F;
    public asid G;
    public asio H;
    public int b;
    public int c;
    public ashp d;
    public ashu e;
    public aony f = emptyProtobufList();
    public asir g;
    public ashx h;
    public ashy i;
    public ashz j;
    public ashr k;
    public ashm l;
    public ashk m;
    public ashq n;
    public ashs o;
    public ashg p;
    public asib q;
    public ashj r;
    public ashh s;
    public ashd t;
    public ashi u;
    public asia v;
    public ashl w;
    public asin x;
    public asis y;
    public asho z;

    static {
        asht ashtVar = new asht();
        a = ashtVar;
        aonm.registerDefaultInstance(asht.class, ashtVar);
    }

    private asht() {
    }

    public final void a() {
        aony aonyVar = this.f;
        if (aonyVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u0001?\u001f\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\nဉ\r\u000bဉ\u000e\fဉ\u000f\u000eဉ\u0011\u0017ဉ\u001a\u001dဉ\u001e\u001fဉ \"ဉ\"$ဉ$+ဉ*-ဉ+.ဉ,/ဉ-0ဉ.1ဉ/2ဉ03ဉ26ဉ57ဉ18ဉ69ဉ7=ဉ9>ဉ:?ဉ;", new Object[]{"b", "c", "d", "e", "f", asiq.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "B", "C", "A", "D", "E", "F", "G", "H"});
            case NEW_MUTABLE_INSTANCE:
                return new asht();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = I;
                if (aopfVar == null) {
                    synchronized (asht.class) {
                        aopfVar = I;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            I = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
