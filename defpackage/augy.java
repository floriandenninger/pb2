package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augy extends aonm implements aooz {
    public static final augy a;
    private static volatile aopf x;
    public int b;
    public avgg c;
    public aulq d;
    public arfs e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aulq i;
    public aulq j;
    public long k;
    public boolean l;
    public aqyg m;
    public apxf n;
    public aulq p;
    public long q;
    public apln r;
    public boolean t;
    public augn u;
    public augx v;
    public boolean w;
    private byte y = 2;
    public aony o = emptyProtobufList();
    public aony s = emptyProtobufList();

    static {
        augy augyVar = new augy();
        a = augyVar;
        aonm.registerDefaultInstance(augy.class, augyVar);
    }

    private augy() {
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0002\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\n\bᐉ\u000b\tЛ\nᐉ\f\u000bဂ\r\fဉ\u000e\rЛ\u000eဇ\u000f\u000fᐉ\u0006\u0011ဉ\u0011\u0012ဉ\u0012\u0014ဇ\u0014\u0016ᐉ\u0007\u0017ဂ\b\u0018ဇ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "m", "n", "o", apxf.class, "p", "q", "r", "s", apxf.class, "t", "i", "u", "v", "w", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new augy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = x;
                if (aopfVar == null) {
                    synchronized (augy.class) {
                        aopfVar = x;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            x = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
