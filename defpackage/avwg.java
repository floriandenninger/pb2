package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avwg extends aonh implements aoni {
    public static final avwg a;
    private static volatile aopf t;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apxf h;
    public apkd i;
    public apkd j;
    public apkd k;
    public avrx m;
    public avwf n;
    public aony o;
    public atdf p;
    public avwh q;
    public avwi r;
    public aomf s;
    private aovx u;
    private aota v;
    private byte w = 2;

    static {
        avwg avwgVar = new avwg();
        a = avwgVar;
        aonm.registerDefaultInstance(avwg.class, avwgVar);
    }

    private avwg() {
        emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        emptyProtobufList();
        this.s = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002\u0019\u0012\u0000\u0001\u000f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\t\tᐉ\n\nᐉ\u000b\u000bᐉ\r\fЛ\u000eᐉ\u000f\u0010ᐉ\u0013\u0011ည\u0014\u0012ᐉ\f\u0014ဉ\u0010\u0015ဉ\u0011\u0019ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "o", avfv.class, "p", "v", "s", "m", "q", "r", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new avwg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (avwg.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
