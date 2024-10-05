package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpg extends aonm implements aooz {
    public static final avpg a;
    private static volatile aopf b;
    private apxf A;
    private byte B = 2;
    private int c;
    private int d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private atdf i;
    private apxf j;
    private avpf k;
    private apjt l;
    private aota m;
    private apjt n;
    private avrd o;
    private aqyg p;
    private aqyg q;
    private aqyg r;
    private aqyg s;
    private aqyg t;
    private aqyg u;
    private aqyg v;
    private aqyg w;
    private aqyg x;
    private aqyg y;
    private aqyg z;

    static {
        avpg avpgVar = new avpg();
        a = avpgVar;
        aonm.registerDefaultInstance(avpg.class, avpgVar);
    }

    private avpg() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0003(\u0017\u0000\u0000\u0017\u0003ᐉ\u0012\u0004ᐉ\u0005\u0007ᐉ\u0016\bᐉ\u0017\tᐉ\u0018\nᐉ\u0019\u000bᐉ\u001a\fᐉ\u001d\rᐉ\u001e\u000eᐉ\u001f\u000fᐉ \u0010ᐉ\u0011\u0013ᐉ\u001b\u0014ᐉ\u001c\u0016ᐉ\u000e\u001bᐉ\u0007\u001dᐉ\u0015\u001fᐉ\u0001 ᐉ\u0003!ᐉ\u0004\"ᐉ\u000b'ᐉ\f(ᐉ\u0002", new Object[]{"c", "d", "o", "i", "q", "r", "s", "t", "u", "x", "y", "z", "A", "n", "v", "w", "m", "j", "p", "e", "g", "h", "k", "l", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avpg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpg.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
